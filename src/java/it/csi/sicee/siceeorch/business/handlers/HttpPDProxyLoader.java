/* COOP_JAVA  -  Cooperative Systems Infrastructure
 *
 * Copyright (C) 2008 Regione Piemonte
 * Copyright (C) 2008 Provincia di Torino
 * Copyright (C) 2008 Comune di Torino
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */
package it.csi.sicee.siceeorch.business.handlers;

import it.csi.csi.porte.InfoPortaDelegata;
import it.csi.csi.porte.NameFilePDFactory;
import it.csi.csi.porte.PostLoadConfigHandler;
import it.csi.csi.porte.proxy.PDProxy;
import it.csi.csi.util.log.Categories;
import it.csi.csi.util.xml.PDConfigReader;
import it.csi.csi.wrapper.ConfigException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Category;

/**
 * Classe HttpPDProxyLoader
 * 
 * Questa classe viene configurata tramite blocco static-initializer , al primo
 * richiamo della stessa all'interno del classloader in cui viene caricata , i
 * metodi rilasciati sono tutti statici. Permette la creazione di proxy di porte
 * delegate a partire da file di configurazione reperibili da un servizio di
 * naming/registry realizzato tramite un servizio HTTP che cataloga le porte
 * delegate in base alle seguenti chiavi:
 * <ol>
 * <li>codice ambiente di runtime (produzione, sviluppo, test, test-utente...),
 * <li>codice dell'ente/cliente per cui e' rilasciato il servizio
 * <li>progressivo di installazione nello stesso ambiente (serve per gestire
 * installazioni multiple dello stesso prodotto in un determinato
 * ambiente/cliente
 * <li>codice del prodotto su cui e' basato il rilascio che implementa il
 * servizio,
 * <li>codice del servizio (interfaccia)
 * <li>versione dell'interfaccia di servizio (&lt;maj&gt;.&lt;min&gt;),
 * <li>codice binding (identifica, all'interno di una stessa interfaccia di
 * servizio, modalit&agrave; di fruizione differenti, ad es. per differenti tecnologie
 * o utilizzando differenti canali di comunicazione.
 * <li>finalit&agrave;: (il servizio di naming potrebbe modificare l'interfaccia
 * restituita per particolari finalit&agrave;)
 * <ul>
 * <li>RUNTIME: servizio per operativit&agrave; applicativa (e' il valore utilizzato
 * dai fruitori durante l'operativit&agrave;)
 * <li>MONITOR: servizio per monitoraggio (utilizzato dal test-agent)
 * <li>DIAG: servizio per diagnostica (utilizzato dal framework coop-diag e
 * dalla servlet centralizzata di diagnostica)
 * </ul>
 * <li>flag di staging: serve per permettere ad un test-agent di verificare i
 * binding durante la fase di installazione (mentre il binding e' in fase di
 * "staging").
 * </ol>
 * L'utilizzo di questo loader permette ai fruitori di evitare di incorporare
 * tra i file di configurazione distribuiti anche quello delle porte delegate
 * dei servizi utilizzati, rendendo percio' del tutto trasparente, nella maggior
 * parte dei casi, eventuali migrazioni del servizio. I fruitori con
 * configurazioni personalizate in porta delegata possono inviare
 * l'inforamazioni della stessa tramite inputStream che verr&agrave; integrato con
 * l'informazioni restituite dal naming/registry. Vedere la documentazione del
 * metodo <code>loadProxy</code> per i dettagli circa i parametri da
 * utilizzare per creare il contesto di invocazione con il selettore di
 * servizio. Per permettere una migrazione piu' graduale da un meccanismo basato
 * su configurazioni locali al fruitore, la classe prevede la possibilit&agrave; di
 * elencare una serie di porte delegate per le quali la configurazione non sar&agrave;
 * richiesta al servizio di naming ma verr&agrave; caricata in locale, con le regole
 * della classe {@link it.csi.csi.porte.NameFilePDFactory}.
 * 
 * <h4>Modifiche a runtime della configurazione porta delegata lato fruitore</h4>
 * 
 * Poiche' il file di configurazione e' mantenuto in un repository comune per
 * tutti i fruitori del servizio, alcune impostazioni che possono variare da
 * fruitore a fruitore, o addirittura a runtime, devono essere inserite
 * esplicitamente <b>dopo</b> aver ottenuto la configurazione di PD generica
 * dal servizio di naming. Per fare cio' la factory mette a disposizione un
 * meccanismo di pluggabilit&agrave; apposito che si utilizza:
 * <ol>
 * <li> realizzando una classe che implementa l'interfaccia
 * {@link it.csi.csi.porte.PostLoadConfigHandler} e che contiene le operazioni
 * da effettuare a runtime
 * <li> creando un'istanza di tale classe
 * <li> impostando tale istanza nella factory prima di utilizzarla
 * </ol>
 * La configurazione della factory avviene tramite il metodo
 * <code>configure</code> che verifica properties di sistema e nella , root
 * principale dell'applicazione tramite CLASSLOADER , la presenza di un file di
 * configurazione(opzionale) csinaming.properties personalizzato. Le propriet&agrave;
 * supportate sono le seguenti: <table border="1">
 * <tr>
 * <td><b>nome</b></td>
 * <td><b>significato</b></td>
 * <td><b>note</b></td>
 * </tr>
 * <tr>
 * <td>csinaming.provider.url</td>
 * <td>url http del servizio di naming</td>
 * <td>opzionale; se non e' specificato nessun valore il valore viene desunto
 * dall'environment di sistema (ad esempio potrebbe essere preimpostato negli
 * ambienti di runtime server). Se impostato a livello di sistema puo' essere
 * sovrascritto o meno a seconda del valore della property
 * runtime.environment.policy (v.)</td>
 * </tr>
 * <tr>
 * <td>csinaming.runtime.code</td>
 * <td>ambiente di esecuzione implicito</td>
 * <td>opzionale; nessun valore di default. Se specificato viene utilizzato a
 * seconda del valore della property runtime.policy (v.)</td>
 * </tr>
 * <tr>
 * <td>csinaming.runtime.policy</td>
 * <td>policy di gestione delle impostazioni implicite e relativi controlli.
 * Puo' valere:
 * <ul>
 * <li>implicit-only: i valori delle property csinaming.provider.url e
 * csinaming.runtime.code devono essere presenti nel system environment e non
 * possono essere sovrascritti. Inoltre il runtime code deve coincidere con
 * quello dichiarato nei selettori (pena errore).
 * <li>implicit-overwritable: i valori delle property csinaming.provider.url e
 * csinaming.runtime.core sono utilizzate se sono definite nel system
 * environment. Il provider.url puo' essere inoltre sovrascritto; il codice
 * ambiente, se presente nel system environment, viene confrontato con quello
 * richiesto nel selettore ed una discordanza produce un messaggio di WARN sui
 * log applicativi.
 * </ul>
 * </td>
 * <td>opzionale; default=implicit-overwritable, a meno che non sia impostato a
 * livello di system environment (in questo caso non puo' essere sovrascritto).
 * (v.)</td>
 * </tr>
 * <tr>
 * <td>csinaming.global.timetolive</td>
 * <td>tempo di permanenza in cache di uno stub valido</td>
 * <td>opzionale; default=120 min; viene ignorato da impostazioni piu'
 * specifiche gestite a runtime tramite header restituiti dal servizio di
 * naming.</td>
 * </tr>
 * <tr>
 * <td>csinaming.bypass.list</td>
 * <td>risorsa o percorso del file di configurazione della
 * NameFilePDProxyFactory che contiene l'elenco e il percorso dei file di
 * configurazione PD che devono essere caricati da risorsa e non tramite
 * richiesta al servizio di naming http.</td>
 * <td>opzionale; nessun default: se assente tutte le PD saranno richieste al
 * servizio di naming</td>
 * </tr>
 * </table>
 * 
 * @author DSP-SPG
 * @version 1.0
 */

public class HttpPDProxyLoader {

	private HttpPDProxyLoader() {
	}

	/**
	 * L'url del provider di configurazioni (la servlet InfoPDProviderServlet
	 * {@link it.csi.csi.prodtools.InfoPDProviderServlet}).
	 */
	private static URL providerURL = null;

	private static int timeout = 0;
	private final static int defaultTimeToCache = 120;

	private static String defaultEnvironmentCode = null;

	private static ProxyCache proxies = new ProxyCache();
	//private static Selector selector = new Selector();
	private static PostLoadConfigHandler plch = null;
	private static boolean configSuccessful = false;

	private static String _acn = null;

	private static NameFilePDFactory bypassFactory = null;

	private static String msgError = null;

	static {

		Category _log = Categories.getLogger(getAppContextName(), Categories.CSI_INIT);

		try {
			configure();
		} catch (ConfigException cfE) {
			msgError = cfE.getMessage();
			_log.error("[HttpPDProxyLoader::static initializer] - Errore Configurazione " + cfE.getMessage(), cfE);
		} catch (Exception e) {
			msgError = e.getMessage();
			_log.error("[HttpPDProxyLoader::static initializer] - Errore Generico " + e.getMessage(), e);
		}
	}

	/**
	 * Propriet&agrave; di configurazione della classe
	 * 
	 */

	public static final String PREFIX_SYSTEM_VARIABLE = "coop_java";

	public static final String RUNTIME_POLICY_PROP = "csinaming.runtime.policy";
	public static final String PROVIDER_URL_PROP = "csinaming.provider.url";
	public static final String RUNTIME_CODE_PROP = "csinaming.runtime.code";
	public static final String TIMETOLIVE_PROP = "csinaming.global.timetolive";
	public static final String BYPASS_LIST_PROP = "csinaming.bypass.list";

	/**
	 * ResonseHeader hint-based planned refresh cache
	 */
	public static final String PLANNED_UPDATE_TIME = "csinaming.planned.update.time";

	/**
	 * Valori ammessi propriet&agrave; csinaming.runtime.policy
	 */
	public static final String IMPLICIT_ONLY_RUNTIME_POLICY = "implicit-only";
	public static final String IMPLICIT_OVERWRITABLE_RUNTIME_POLICY = "implicit-overwritable";

	/**
	 * Codifica propriet&agrave; csinaming.runtime.policy
	 */
	protected static final int IMPLICIT_ONLY = 0;
	protected static final int IMPLICIT_OVERWRITABLE = 1;

	/**
	 * Variabile di classe environmentPolicy settaggio default.
	 */
	private static int environmentPolicy = IMPLICIT_OVERWRITABLE;

	/**
	 * Parametri del contesto di invocazione (properties)
	 */
	public static final String ID_SERVIZIO_CALL = "id.servizio";
	public static final String AMBIENTE_CALL = "ambiente";
	public static final String PURPOSE_CALL = "purpose";
	public static final String STAGING_CALL = "statging";
	public static final String CODICE_PRODOTTO_FRUITORE_CALL = "codice.prodotto.fruitore";
	public static final String VERSIONE_PRODOTTO_FRUITORE_CALL = "versione.prodotto.fruitore";
	public static final String CODICE_COMPONENTE_FRUITORE_CALL = "codice.componente.fruitore";
	public static final String CODICE_CLIENTE_FRUITORE_CALL = "codice.cliente.fruitore";
	public static final String CODICE_PRODOTTO_FRUITORE_AS_CALL = "codice.prodotto.fruitore.as";
	public static final String VERSIONE_PRODOTTO_FRUITORE_AS_CALL = "versione.prodotto.fruitore.as";
	public static final String CODICE_COMPONENTE_FRUITORE_AS_CALL = "codice.componente.fruitore.as";
	public static final String CODICE_CLIENTE_FRUITORE_AS_CALL = "codice.cliente.fruitore.as";

	/**
	 * Parametri servlet del Naming in linea con l'oggetto Selector
	 */
	private static final String AMBIENTE_HTTPPAR = "ambiente";
	private static final String CLIENTE_HTTPPAR = "cliente";
	private static final String ISTANZA_HTTPPAR = "istanza";
	private static final String PRODOTTO_HTTPPAR = "prodotto";
	private static final String SERVICE_HTTPPAR = "service";
	private static final String SERVICEVER_HTTPPAR = "servicever";
	private static final String BINDING_HTTPPAR = "binding";
	private static final String PURPOSE_HTTPPAR = "purpose";
	private static final String STAGING_HTTPPAR = "staging";
	private static final String CODICE_PRODOTTO_FRUITORE_HTTPPAR = "codice_prodotto_fruitore";
	private static final String VERSIONE_PRODOTTO_FRUITORE_HTTPPAR = "versione_prodotto_fruitore";
	private static final String CODICE_COMPONENTE_FRUITORE_HTTPPAR = "codice_componente_fruitore";
	private static final String CODICE_CLIENTE_FRUITORE_HTTPPAR = "codice_cliente_fruitore";
	private static final String CODICE_PRODOTTO_FRUITORE_AS_HTTPPAR = "codice_prodotto_fruitore_as";
	private static final String VERSIONE_PRODOTTO_FRUITORE_AS_HTTPPAR = "versione_prodotto_fruitore_as";
	private static final String CODICE_COMPONENTE_FRUITORE_AS_HTTPPAR = "codice_componente_fruitore_as";
	private static final String CODICE_CLIENTE_FRUITORE_AS_HTTPPAR = "codice_cliente_fruitore_as";

	/**
	 * Valori parametro purpose
	 */
	public static final String RUNTIME_VAL = "RUNTIME";
	public static final String MONITOR_VAL = "MONITOR";
	public static final String DIAG_VAL = "DIAG";

	/**
	 * Valori parametro staging
	 */
	public static final String TRUE_VAL = "TRUE";
	public static final String FALSE_VAL = "FALSE";

	/**
	 * Formattatore data/ora.
	 */
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void clearCache() {
		proxies.clear();
	}

	private static void init(String s_providerURL) throws ConfigException {

		if (s_providerURL != null && !s_providerURL.equals("")) {
			Categories.getLogger(getAppContextName(), Categories.CSI_CONFIG).debug(
					"[HttpPDProxyLoader::init] - Inizializzazione Http Proxy Loader (URL=" + s_providerURL + ")");

			try {
				providerURL = new URL(s_providerURL);
				Categories.getLogger(getAppContextName(), Categories.CSI_CONFIG)
						.debug("[HttpPDProxyLoader::init] - Inizializzato Http Proxy Loader.");

			} catch (MalformedURLException ex) {
				Categories.getLogger(getAppContextName(), Categories.CSI_CONFIG).error(
						"[HttpPDProxyLoader::init] -Impossibile inizializzare l'Http Proxy Loader: provider url ["
								+ s_providerURL + "] non ben formato: " + ex.getMessage(),
						ex);
				throw new ConfigException("Impossibile inizializzare l'Http Proxy Loader: provider url ["
						+ s_providerURL + "] non ben formato: " + ex.getMessage(), ex);
			}
		} else {
			Categories.getLogger(getAppContextName(), Categories.CSI_CONFIG).error(
					"[HttpPDProxyLoader::init] - Impossibile inizializzare l'Http Proxy Loader: provider url mancante.");
			throw new ConfigException("Impossibile inizializzare l'Http Proxy Loader: provider url mancante.");
		}
	}

	private static boolean isNullOrEmpty(String s) {
		return (s == null || s.length() == 0);
	}

	/**
	 * Configura il loader con le property previste (vedere documentazione della
	 * classe).
	 * 
	 */

	private static void configure() throws ConfigException {

		Category _log = Categories.getLogger(getAppContextName(), Categories.CSI_CONFIG);
		Properties props = new Properties();

		try {

			_log.debug(
					"[HttpPDProxyLoader::configure] - Verifica presenza file di configurazione personalizzato csinaming.properties...");

			try {
				props.load(HttpPDProxyLoader.class.getClassLoader().getResourceAsStream("csinaming.properties"));
			} catch (Exception e) {
				_log.error(
						"[HttpPDProxyLoader::configure] - File di configurazione csinaming.properties assente in root principale da CLASSLOADER.",
						e);
			}

			_log.debug("[HttpPDProxyLoader::configure] - Verifica policy di gestione runtime...");

			String sEnvironmentPolicy = System.getProperty(PREFIX_SYSTEM_VARIABLE + "." + RUNTIME_POLICY_PROP);

			if (isNullOrEmpty(sEnvironmentPolicy)) {

				_log.debug("[HttpPDProxyLoader::configure] - Runtime Policy gestibile con configurazione locale : "
						+ sEnvironmentPolicy);

				sEnvironmentPolicy = props.getProperty(RUNTIME_POLICY_PROP);

				if (isNullOrEmpty(sEnvironmentPolicy)
						|| sEnvironmentPolicy.equals(IMPLICIT_OVERWRITABLE_RUNTIME_POLICY)) {
					_log.debug("[HttpPDProxyLoader::configure] - Runtime Policy definita in locale sovrascrivibile : "
							+ sEnvironmentPolicy);
					environmentPolicy = IMPLICIT_OVERWRITABLE; // default
				} else if (sEnvironmentPolicy.equals(IMPLICIT_ONLY_RUNTIME_POLICY)) {
					_log.debug(
							"[HttpPDProxyLoader::configure] - Runtime Policy definita in locale ma dichiarata NON sovrascrivibile : "
									+ sEnvironmentPolicy);
					environmentPolicy = IMPLICIT_ONLY;
				} else {
					_log.error("[HttpPDProxyLoader::configure] - Il valore della property runtime policy ["
							+ sEnvironmentPolicy + "] non e' valido.");
					throw new ConfigException(
							"Il valore della property runtime policy [" + sEnvironmentPolicy + "] non e' valido.");
				}

			} else if (sEnvironmentPolicy.equals(IMPLICIT_OVERWRITABLE_RUNTIME_POLICY)) {
				_log.debug(
						"[HttpPDProxyLoader::configure] - Runtime Policy definita a livello di sistema sovrascrivibile : "
								+ sEnvironmentPolicy);
				environmentPolicy = IMPLICIT_OVERWRITABLE;

			} else if (sEnvironmentPolicy.equals(IMPLICIT_ONLY_RUNTIME_POLICY)) {
				_log.debug(
						"[HttpPDProxyLoader::configure] - Runtime Policy definita a livello di sistema NON sovrascrivibile : "
								+ sEnvironmentPolicy);
				environmentPolicy = IMPLICIT_ONLY;

			} else {
				_log.error("[HttpPDProxyLoader::configure] - Il valore della property runtime policy ["
						+ sEnvironmentPolicy + "] non e' valido.");
				throw new ConfigException(
						"Il valore della property runtime policy [" + sEnvironmentPolicy + "] non e' valido.");
			}

			_log.debug("[HttpPDProxyLoader::configure] - verifica provider url in impostazioni di sistema...");
			String sProvider = System.getProperty(PREFIX_SYSTEM_VARIABLE + "." + PROVIDER_URL_PROP);

			if (!isNullOrEmpty(sProvider)) {
				_log.debug(
						"[HttpPDProxyLoader::configure] - provider del servizio di csinaming definito a livello di sistema:"
								+ sProvider);
			} else {
				_log.debug(
						"[HttpPDProxyLoader::configure] - provider del servizio csinaming NON definito a livello di sistema");
			}

			if (environmentPolicy != IMPLICIT_ONLY) {
				String sProvider_loc = props.getProperty(PROVIDER_URL_PROP);
				if (!isNullOrEmpty(sProvider_loc)) {
					_log.debug(
							"[HttpPDProxyLoader::configure] - provider del servizio di naming (ri)definito localmente:"
									+ sProvider_loc);
					sProvider = sProvider_loc;
				}
			}

			String sEnvironmentCode = System.getProperty(PREFIX_SYSTEM_VARIABLE + "." + RUNTIME_CODE_PROP);

			if (environmentPolicy == IMPLICIT_ONLY) {
				if (isNullOrEmpty(sEnvironmentCode)) {
					_log.error(
							"[HttpPDProxyLoader::configure] - impossibile inizializzare il loader: se la policy e' 'implicit-only' e' necessario impostare a livello di sistema la property csinaming.runtime.code");
					throw new ConfigException(
							"impossibile inizializzare: se la policy e' 'implicit-only' e' necessario impostare a livello di sistema la property "
									+ "csinaming.runtime.code");
				} else {
					_log.debug("[HttpPDProxyLoader::configure] - environment di default=" + sEnvironmentCode
							+ " (NON sovrascrivibile)");
				}
			} else { // IMPLICIT-OVERWRITABLE
				if (isNullOrEmpty(sEnvironmentCode)) {
					_log.debug(
							"[HttpPDProxyLoader::configure] - environment di default non impostato a livello di sistema");
				} else {
					_log.debug("[HttpPDProxyLoader::configure] - environment di default impostato a livello di sistema:"
							+ sEnvironmentCode);
				}
				if (!isNullOrEmpty(props.getProperty(RUNTIME_CODE_PROP))) {
					sEnvironmentCode = props.getProperty(RUNTIME_CODE_PROP);
					_log.debug("[HttpPDProxyLoader::configure] - environment di default sovrascritto localmente:"
							+ sEnvironmentCode);
				}
			}

			defaultEnvironmentCode = sEnvironmentCode;

			String sTime2live = props.getProperty(TIMETOLIVE_PROP);
			String sBypassList = props.getProperty(BYPASS_LIST_PROP);

			// lettura option provider.url (obbligatoria)
			if (isNullOrEmpty(sProvider)) {
				_log.error(
						"[HttpPDProxyLoader::configure] - Errore durante la configurazione dell'HttpPDProxyLoader: provider.url non impostato.");
				throw new ConfigException(
						"Errore durante la configurazione dell'HttpPDProxyLoader: provider.url non impostato.");
			} else
				init(sProvider);

			// lettura option timetolive (opzionale)
			if (sTime2live != null && !"".equals(sTime2live))
				try {
					timeout = Integer.parseInt(sTime2live.trim());
					_log.debug("[HttpPDProxyLoader::configure] - impostazione time to live globale della cache:"
							+ timeout + " minuti.");
				} catch (NumberFormatException ex) {
					_log.error("[HttpPDProxyLoader::configure] - "
							+ "Errore durante la configurazione dell'HttpPDProxyLoader: formato del timeout specificato ("
							+ sTime2live + ") non corretto.");
					throw new ConfigException(
							"Errore durante la configurazione dell'HttpPDProxyLoader: formato del timeout specificato ("
									+ sTime2live + ") non corretto.");
				}
			else
				timeout = defaultTimeToCache;

			// lettura option bypass list (opz.)
			if (sBypassList != null && !"".equals(sBypassList)) {
				InputStream is = null;
				if (sBypassList.startsWith("file:") || sBypassList.startsWith("http:")) {
					try {
						is = new URL(sBypassList).openStream();
						bypassFactory = new NameFilePDFactory(is);
						_log.debug("[HttpPDProxyLoader::configure] - "
								+ "configurato loader per la bypass-list mediante il file:" + sBypassList);
					} catch (Exception ex) {
						_log.error("[HttpPDProxyLoader::configure] - "
								+ "Errore durante la configurazione dell'HttpPDProxyLoader: errore nella lettura del file di bypass-list ("
								+ sBypassList + ").", ex);
						throw new ConfigException(
								"Errore durante la configurazione dell'HttpPDProxyLoader: errore nella lettura del file di bypass-list ("
										+ sBypassList + ").",
								ex);
					} finally {
						try {
							is.close();
						} catch (Exception ex) {
							_log.error("[HttpPDProxyLoader::configure] - "
									+ "Errore durante la configurazione dell'HttpPDProxyLoader nella close dello stream di lettura del file di bypass-list",
									ex);
						}
					}
				} else {
					try {
						bypassFactory = new NameFilePDFactory(
								HttpPDProxyLoader.class.getClassLoader().getResourceAsStream(sBypassList.trim()));
						_log.debug("[HttpPDProxyLoader::configure] - "
								+ "configurato loader per la bypass-list mediante la risorsa:" + sBypassList);
					} catch (Exception ex) {
						_log.error("[HttpPDProxyLoader::configure] - "
								+ "Errore durante la configurazione dell'HttpPDProxyLoader: errore nella lettura della risorsa bypass-list ("
								+ sBypassList + ").", ex);
						throw new ConfigException(
								"Errore durante la configurazione dell'HttpPDProxyLoader: errore nella lettura della risorsa bypass-list ("
										+ sBypassList + ").",
								ex);
					}
				}
			}

		} finally {
			_log.debug("[HttpPDProxyLoader::configure] - END");
		}

		configSuccessful = true;

	}

	/**
	 * 
	 * 
	 * <h4>Formato del file di properties (contesto di invocazione)</h4>
	 * Il file conterr&agrave; nell'ordine:
	 * <ol>
	 * <li>id.servizio = Identificatore univoco servizio - serie di codici
	 * separati con pipe :
	 * CODICEPRODOTTO|CLIENTE|SERVIZIO|VERSIONE|ISTANZA|BINDING
	 * <ul>
	 * <li>CODICEPRODOTTO: codice del prodotto su cui e' basato il rilascio che
	 * implementa il servizio.
	 * <li>CLIENTE: codice dell'ente/cliente per cui e' rilasciato il servizio.
	 * <li>SERVIZIO: codice del servizio (interfaccia).
	 * <li>VERSIONE: versione dell'interfaccia di servizio (x.y.z).
	 * <li>ISTANZA: progressivo di installazione nello stesso ambiente (serve
	 * per gestire installazioni multiple dello stesso prodotto in un
	 * determinato ambiente/cliente.
	 * <li>BINDING: codice binding (identifica, all'interno di una stessa
	 * interfaccia di servizio, modalit&agrave; di fruizione differenti, ad es. per
	 * differenti tecnologie o utilizzando differenti canali di comunicazione.
	 * </ul>
	 * <li>ambiente=codice ambiente di runtime (produzione, sviluppo, test,
	 * test-utente...).
	 * <li>purpose= (opzinale) scopo/finalit&agrave; (il servizio di naming potrebbe
	 * modificare l'interfaccia restituita per particolari finalit&agrave;).Default
	 * RUNTIME.
	 * <ul>
	 * <li>RUNTIME: esecuzione appplicativa (default).
	 * <li>MONITOR: operazioni di monitoraggio (testResources, ad utilizzo
	 * test-agent).
	 * <li>DIAG: operazioni di diagnostica (selfCheck, ad utilizzo
	 * diagnostica).
	 * </ul>
	 * <li>staging= (opzionale) flag (TURE/FALSE) utilizzata durante le
	 * operazioni di verifica installazione. L'utilizzo normale e' FALSE.
	 * <li>codice.prodotto.fruitore= (opzionale) codice prodotto fruitore per
	 * verifica contratto.
	 * <li>versione.prodotto.fruitore= (opzionale) versione prodotto fruitore
	 * per verifica contratto.
	 * <li>codice.componente.fruitore= (opzionale) codice componente fruitore
	 * per verifica contratto.
	 * <li>codice.cliente.fruitore= (opzionale) codice cliente/ente fruitore
	 * per verifica contratto.
	 * <li>codice.prodotto.fruitore.as= (opzionale) codice prodotto fruitore
	 * per verifica accordo di servizio.
	 * <li>versione.prodotto.fruitore.as= (opzionale) versione prodotto
	 * fruitore per verifica accordo di servizio.
	 * <li>codice.componente.fruitore.as= (opzionale) codice componente
	 * fruitore per verifica accordo di servizio.
	 * <li>codice.cliente.fruitore.as= (opzionale) codice cliente/ente fruitore
	 * per verifica accordo di servizio.
	 * </ol>
	 * 
	 * <h4>Reperimento della PD </h4>
	 * A fronte della richiesta di una PD fornendo un determinato file di
	 * properties, il comportamento della classe loader e' il seguente:
	 * <ol>
	 * <li>si verifica la correttezza formale della property id.servizio. La
	 * forma &egrave; corretta se:
	 * <ul>
	 * <li>&egrave; composto da 6 componenti separate da '|' ;
	 * <li>la quarta componente (versione servizio) e' nel formato
	 * major.minor.patch;
	 * <li>l'ottava componente ("purpose"), se presente, ha uno dei valori
	 * previsti (|monitor|diag);
	 * <li>la nona componente, se presente, ha uno dei valori previsti
	 * (TRUE|FALSE).
	 * </ul>
	 * <li>si verifica la correttezza formale della property purpose se
	 * presente, ha uno dei valori previsti (RUNTIME|MONITOR|DIAG);
	 * <li>si verifica la correttezza formale della property statging se
	 * presente, ha uno dei valori previsti (TRUE|FALSE);
	 * <li>viene verificata la presenza in cache di una occorrenza ancora
	 * valida della PD selezionata.
	 * <ul>
	 * <li>se l'occorrenza e' valida viene restituita per l'utilizzo del
	 * servizio
	 * <li>se l'occorrenza non e' piu' valida:
	 * <ul>
	 * <li>viene rimossa dalla cache
	 * <li>viene invocato il servizio di csinaming
	 * <li>viene inserita la nuova istanza di PD in cache
	 * <li>viene restituita la nuova istanza di PD per l'utilizzo del servizio
	 * </ul>
	 * </ul>
	 * </ol>
	 * 
	 * <h4>Gestione della cache</h4>
	 * 
	 * Un'istanza di proxy per ciascun valore di selettore viene istanziato la
	 * prima volta e mantenuto in una cache. Le politiche di svecchiamento della
	 * cache sono governate da due meccansimi complementari:
	 * <ol>
	 * <li>un meccansimo basato su un time-to-live definto a livello globale
	 * (impostabile tramite apposita property di configurazione);
	 * <li>un meccansimo piu' complesso, associabile al singolo binding, che puo'
	 * essere comandato mediante direttive server-side
	 * </ol>
	 * <h5>time to live based cache expiry</h5>
	 * Il primo meccanismo prevede che una istanza di PD sia inserita in cache
	 * con associata l'informazione dell' istante in cui e' stata inserita. Al
	 * momento della richiesta di quella PD, se <br>
	 * <code>[tempo-corrente]-[tempo-inserimento] &gt; [time-to-live-globale]</code>
	 * l'istanza viene dichiarata non valida. Il secondo meccanismo, piu'
	 * complesso, prevede la possibilit&agrave; di controllare in modo piu' fine il
	 * ciclo di permanenza della PD in cache.
	 * <h5>hint-based cache expiry</h5>
	 * Il secondo meccanismo di expiry della cache e' basato su un sistema di
	 * <em>hint</em> (suggerimenti) controllabili centralmente sul servizio di
	 * csinaming. Questo meccanismo prevede due tipi di <em>hint</em>:
	 * <ul>
	 * <li>PLANNED_UPDATE_DATE: utilizzato per istruire la factory circa
	 * l'approssimarsi di rilascio previsto del servizio. Se ad esempio e'
	 * previsto un rilascio alle 17:00 del 20/02/2007, nelle ore precedenti
	 * all'installazione si puo' decidere di inviare il corrispondente hint ai
	 * client di quel binding. In questo modo la factory si prepara a invalidare
	 * la cache non appena si supera la data/ora prevista.
	 * </ul>
	 * Gli hint sono restituiti opzionalmente dal servizio di csinaming mediante
	 * appositi header HTTP associati alla risorsa (file di PD); li hint vengono
	 * associati al corrispondente binding nella cache.
	 * 
	 * @param propertiesPathName :
	 *            path del file di properties con le informazioni relative
	 *            all'invocazione del servizio.
	 * @return il proxy selezionato in base al selettore reperito dal parametro
	 *         passato
	 */
	public static Proxy loadProxy(String propertiesPathName) throws ConfigException {

		return loadProxy(propertiesPathName, null);

	}

	/**
	 * @param propertiesPathName :
	 *            path del file di properties con le informazioni relative
	 *            all'invocazione del servizio.
	 * @param streamLocalPD:
	 *            steam dell'eventuale porta delefata locale.
	 * @return il proxy selezionato in base al selettore reperito dal parametro
	 *         passato
	 */
	public static Proxy loadProxy(String propertiesPathName, InputStream streamLocalPD) throws ConfigException {

		Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

		if (!configSuccessful) {
			_log.error(
					"[HttpPDProxyLoader::loadProxy] Classe inizializzata non correttamente impossibile procedere con il metodo loadProxy().");
			throw new ConfigException(
					"[HttpPDProxyLoader::loadProxy] Classe inizializzata non correttamente : " + msgError);
		}

		Proxy currProxy = null;

		// Verifica e caricamento contesto di invocazione tramite classloader
		Selector selector = new Selector();
		selector.makeSelector(propertiesPathName);

		// innazitutto verifico se deve usare la bypass-list
		if (bypassFactory != null) {
			_log.debug("[HttpPDProxyLoader::loadProxy] - BypassList istanziata");
			currProxy = (Proxy) bypassFactory.getPDProxy(selector.keyToString());
			if (currProxy != null)
				return currProxy;
		}

		// non era nella bypass-list: a questo punto cerco nella cache http
		_log.debug("[HttpPDProxyLoader::loadProxy] Elementi in ProxyCache :" + proxies.proxies.size());
		currProxy = (Proxy) (proxies.get(selector, streamLocalPD));

		if (currProxy != null) {
			_log.debug("[HttpPDProxyLoader::loadProxy] - Cache valorizzata");
			return currProxy;
		} else {
			_log.debug("[HttpPDProxyLoader::loadProxy] - PDProxy ottenuto tramite Naming");
			return getRemotely(streamLocalPD, selector);
		}
	}

	/**
	 * @param targetInvocation :
	 *            Properties con le informazioni relative all'invocazione del
	 *            servizio.
	 * @return il proxy selezionato in base al selettore reperito dal parametro
	 *         passato
	 */
	public static Proxy loadProxy(Properties targetInvocation) throws ConfigException {
		return loadProxy(targetInvocation, null);
	}

	/**
	 * @param targetInvocation :
	 *            Properties con le informazioni relative all'invocazione del
	 *            servizio.
	 * @param streamLocalPD:
	 *            steam dell'eventuale porta delegata locale.
	 * @return il proxy selezionato in base al selettore reperito dal parametro
	 *         passato
	 */
	public static Proxy loadProxy(Properties targetInvocation, InputStream streamLocalPD) throws ConfigException {

		Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

		if (!configSuccessful) {
			_log.error(
					"[HttpPDProxyLoader::loadProxy] Classe inizializzata non correttamente impossibile procedere con il metodo loadProxy().");
			throw new ConfigException(
					"[HttpPDProxyLoader::loadProxy] Classe inizializzata non correttamente : " + msgError);
		}

		Proxy currProxy = null;

		// Verifica e caricamento contesto di invocazione tramite classloader
		Selector selector = new Selector();
		selector.makeSelector2(targetInvocation);

		// innazitutto verifico se deve usare la bypass-list
		if (bypassFactory != null) {
			_log.debug("[HttpPDProxyLoader::loadProxy] - BypassList istanziata");
			currProxy = (Proxy) bypassFactory.getPDProxy(selector.keyToString());
			if (currProxy != null)
				return currProxy;
		}

		// non era nella bypass-list: a questo punto cerco nella cache http
		_log.debug("[HttpPDProxyLoader::loadProxy] Elementi in ProxyCache :" + proxies.proxies.size());
		currProxy = (Proxy) (proxies.get(selector, streamLocalPD));

		if (currProxy != null) {
			_log.debug("[HttpPDProxyLoader::loadProxy] - Cache valorizzata");
			return currProxy;
		} else {
			_log.debug("[HttpPDProxyLoader::loadProxy] - PDProxy ottenuto tramite Naming");
			return getRemotely(streamLocalPD, selector);
		}
	}

	/**
	 * 
	 * @param sel
	 * @return la stringa dei parametri da passare al servizio
	 */
	private static String composeQuery(Selector sel) {
		String s = "";

		s += AMBIENTE_HTTPPAR + "=" + sel.ambiente + "&";
		s += CLIENTE_HTTPPAR + "=" + sel.cliente + "&";
		s += ISTANZA_HTTPPAR + "=" + sel.istanza + "&";
		s += PRODOTTO_HTTPPAR + "=" + sel.prodotto + "&";
		s += SERVICE_HTTPPAR + "=" + sel.service + "&";
		s += SERVICEVER_HTTPPAR + "=" + sel.servicever + "&";
		s += BINDING_HTTPPAR + "=" + sel.binding + "&";
		s += PURPOSE_HTTPPAR + "=" + sel.purpose + "&";
		s += STAGING_HTTPPAR + "=" + sel.staging;

		if (sel.codice_prodotto_fruitore != null && sel.codice_prodotto_fruitore.trim().length() > 0)
			s += "&" + CODICE_PRODOTTO_FRUITORE_HTTPPAR + "=" + sel.codice_prodotto_fruitore;
		if (sel.versione_prodotto_fruitore != null && sel.versione_prodotto_fruitore.trim().length() > 0)
			s += "&" + VERSIONE_PRODOTTO_FRUITORE_HTTPPAR + "=" + sel.versione_prodotto_fruitore;
		if (sel.codice_componente_fruitore != null && sel.codice_componente_fruitore.trim().length() > 0)
			s += "&" + CODICE_COMPONENTE_FRUITORE_HTTPPAR + "=" + sel.codice_componente_fruitore;
		if (sel.codice_cliente_fruitore != null && sel.codice_cliente_fruitore.trim().length() > 0)
			s += "&" + CODICE_CLIENTE_FRUITORE_HTTPPAR + "=" + sel.codice_cliente_fruitore;
		if (sel.codice_prodotto_fruitore_as != null && sel.codice_prodotto_fruitore_as.trim().length() > 0)
			s += "&" + CODICE_PRODOTTO_FRUITORE_AS_HTTPPAR + "=" + sel.codice_prodotto_fruitore_as;
		if (sel.versione_prodotto_fruitore_as != null && sel.versione_prodotto_fruitore_as.trim().length() > 0)
			s += "&" + VERSIONE_PRODOTTO_FRUITORE_AS_HTTPPAR + "=" + sel.versione_prodotto_fruitore_as;
		if (sel.codice_componente_fruitore_as != null && sel.codice_componente_fruitore_as.trim().length() > 0)
			s += "&" + CODICE_COMPONENTE_FRUITORE_AS_HTTPPAR + "=" + sel.codice_componente_fruitore_as;
		if (sel.codice_cliente_fruitore_as != null && sel.codice_cliente_fruitore_as.trim().length() > 0)
			s += "&" + CODICE_CLIENTE_FRUITORE_AS_HTTPPAR + "=" + sel.codice_cliente_fruitore_as;

		return s;
	}

	/**
	 * 
	 * @param remotePD,localPD
	 * @return InfoPortaDelegata risultato dell'integrazione dei parametri di
	 *         input
	 */
	private static InfoPortaDelegata integrationInfoPD(InfoPortaDelegata remotePD, InfoPortaDelegata localPD)
			throws Exception {

		Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

		try {

			// Ricerca eventuali properties in pluggable-pd (pd_local) da
			// settare in pd_remote
			Properties localPr = localPD.getPlugins()[0].getProperties();
			Enumeration en = localPr.propertyNames();
			String propertiesKey = null;
			while (en.hasMoreElements()) {
				propertiesKey = (String) en.nextElement();

				if (!remotePD.getPlugins()[0].getProperties().containsKey(propertiesKey)) {
					String propertyValue = localPr.getProperty(propertiesKey);
					remotePD.getPlugins()[0].getProperties().put(propertiesKey, propertyValue);
				}

			}
			// Ricerca eventuali pre.post FH
			if (localPD.getPreFH() != null)
				remotePD.setPreFH(localPD.getPreFH());
			if (localPD.getPostFH() != null)
				remotePD.setPostFH(localPD.getPostFH());
		} catch (Exception e) {
			_log.error("[HttpPDProxyLoader::integrationInfoPD] Errore integrazione PD Local : " + e, e);
			throw e;
		}

		return remotePD;
	}

	/**
	 * 
	 * @param Inputstream
	 *            streamLocalPD
	 * @return Proxy di porta delegata.
	 */
	private static Proxy getRemotely(InputStream streamLocalPD, Selector selector) throws ConfigException {
		Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

		InfoPortaDelegata infoLocalPD = null;
		_log.debug("[HttpPDProxyLoader::getRemotely] - Richiesta PD (" + selector + ") al servizio di naming...");

		// verifico la policy (ambiente di default)
		if (environmentPolicy == IMPLICIT_ONLY) {
			if (defaultEnvironmentCode == null || !defaultEnvironmentCode.equals(selector.ambiente)) {
				_log.error(
						"[HttpPDProxyLoader::getRemotely] - environment policy violata! l'ambiente di esecuzione richiesto ["
								+ selector.ambiente + "] e' differente dall'ambiente di esecuzione di default ["
								+ defaultEnvironmentCode + "]");
				throw new ConfigException("environment policy violata! l'ambiente di esecuzione richiesto ["
						+ selector.ambiente + "] e' differente dall'ambiente di esecuzione di default ["
						+ defaultEnvironmentCode + "]");
			}
		} else {
			if (defaultEnvironmentCode == null || !defaultEnvironmentCode.equals(selector.ambiente)) {
				_log.warn("[HttpPDProxyLoader::getRemotely] - l'ambiente di esecuzione richiesto [" + selector.ambiente
						+ "] e' differente dall'ambiente di esecuzione di default [" + defaultEnvironmentCode
						+ "], ma la environment policy lo consente");
			}
		}

		String actualURL = providerURL.toExternalForm() + "?action=get_pd&" + composeQuery(selector);

		if (_log.isDebugEnabled()) {
			_log.debug("[HttpPDProxyLoader::getRemotely] invio richiesta: " + actualURL);
		}

		PostMethod post = new PostMethod(actualURL);
		post.setHttp11(true);
		post.setRequestHeader("Content-type", "text/html; charset=ISO-8859-1");
		HttpClient httpclient = new HttpClient();
		httpclient.setConnectionTimeout(30000);
		httpclient.setStrictMode(true);

		int result = 0;
		try {
			result = httpclient.executeMethod(post);
		} catch (IOException ex) {
			_log.error("[HttpPDProxyLoader::getRemotely] Errore nell'esecuzione della request POST verso il Naming : "
					+ ex, ex);
		}
		// Display status code
		_log.debug("[HttpPDProxyLoader::getRemotely] Response status code: " + result);

		try {
			if (result == 0 || result == 401 || result == 404 || result == 505 || result == 500) {
				byte[] ris = post.getResponseBody();
				post.releaseConnection();
				_log.error(
						"[HttpPDProxyLoader::getRemotely] Errore nell'invocazione del servizio di naming: HTTP response : "
								+ ris);

				if (streamLocalPD != null) {
					_log.debug(
							"[HttpPDProxyLoader::getRemotely] - Presente porta locale , verr&agrave; delegata alla creazione del Proxy ");
					infoLocalPD = PDConfigReader.read(streamLocalPD);

					if (infoLocalPD != null) {
						return (Proxy) PDProxy.newInstance(infoLocalPD);
					} else {
						_log.debug(
								"[HttpPDProxyLoader::getRemotely] - Il proxy loader restituir&agrave; una PD 'null' , problemi nel reperire l'informazione remota e nel leggere la configurazione locale. ");
						return null;
					}
				} else {
					_log.debug(
							"[HttpPDProxyLoader::getRemotely] - Il proxy loader restituira' una PD 'null' non e' presente o valida la PD locale. ");
					return null;
				}
			} else if (String.valueOf(result).startsWith("4") || String.valueOf(result).startsWith("5")) {

				byte[] ris = post.getResponseBody();
				post.releaseConnection();
				_log.error(
						"[HttpPDProxyLoader::getRemotely] Errore imprevisto nella chiamata al servizio naming: HTTP response : "
								+ new String(ris));

				if (streamLocalPD != null) {
					_log.debug(
							"[HttpPDProxyLoader::getRemotely] - Presente porta locale , verr&agrave; delegata alla creazione del Proxy ");
					infoLocalPD = PDConfigReader.read(streamLocalPD);

					if (infoLocalPD != null) {
						return (Proxy) PDProxy.newInstance(infoLocalPD);
					} else {
						_log.debug(
								"[HttpPDProxyLoader::getRemotely] - Il proxy loader restituir&agrave; una PD 'null' , problemi nel reperire l'informazione remota e nel leggere la configurazione locale. ");
						return null;
					}
				} else {
					_log.debug(
							"[HttpPDProxyLoader::getRemotely] - Il proxy loader restituira' una PD 'null' non e' presente o valida la PD locale. ");
					return null;
				}
			}

		} catch (Exception ex) {
			_log.error(
					"[HttpPDProxyLoader::getRemotely] - Errore nella creazione della PD verr&agrave; restituita PD null : ",
					ex);
			return null;
		}

		InputStream responseInputStream = null;

		try {
			responseInputStream = post.getResponseBodyAsStream();
		} catch (IOException ioe) {
			_log.error("[HttpPDProxyLoader::getRemotely] Errore nel reperimento del Response Body in formato stream :"
					+ ioe.getMessage(), ioe);
			return null;
		}

		Header plannedUpdateDateHdr = post.getResponseHeader(PLANNED_UPDATE_TIME);

		Date plannedUpdDate = null;

		if (plannedUpdateDateHdr != null) {
			String sPlannedUpd = plannedUpdateDateHdr.getValue();
			try {
				plannedUpdDate = sdf.parse(sPlannedUpd);
				_log.debug("[HttpPDProxyLoader::getRemotely] - ricevuta direttiva di PLANNED-UPDATE:" + plannedUpdDate);
			} catch (ParseException pe) {
				_log.warn(
						"[HttpPDProxyLoader::getRemotely] - ricevuta direttiva ERRATA o NON VALORIZZATA di PLANNED-UPDATE:"
								+ sPlannedUpd + " verra' ignorata",
						pe);
			}
		}
		try {
			String versionFilter = selector.servicever;
			InfoPortaDelegata info = PDConfigReader.read(responseInputStream, versionFilter);
			post.releaseConnection();

			if (streamLocalPD != null)
				infoLocalPD = PDConfigReader.read(streamLocalPD);

			if (info == null) {
				if (infoLocalPD != null) {
					return (Proxy) PDProxy.newInstance(infoLocalPD);
				} else
					return null;
			} else {

				if (infoLocalPD != null)
					info = integrationInfoPD(info, infoLocalPD);

				if (plch != null)
					plch.postLoadAction(info);

				Object prx = (PDProxy.newInstance(info));

				if (timeout > 0)
					proxies.put(selector.keyToString(), prx, plannedUpdDate);

				return (Proxy) prx;
			}
		} catch (Exception e) {
			_log.error("[HttpPDProxyLoader::getRemotely] - Errore nell'acquisizione del PDProxy:" + e + ","
					+ e.getMessage(), e);
			return null;
		}
	}

	/**
	 * imposta il nome del contesto di log (prefisso), propagandolo anche alla
	 * NameFilePDFactory utilizzata per realizzare il bypass.
	 * 
	 * @param acn
	 */
	public static void setAppContextName(String acn) {
		_acn = acn;
		if (bypassFactory != null)
			bypassFactory.setAppContextName(acn);
	}

	public static String getAppContextName() {
		return _acn;
	}

	/**
	 * Imposta il Post Load Config Handler. Se e' stata configurata una
	 * bypass-list la configurazione del post load config handler viene
	 * propagata anche alla NameFilePDFactory utilizzata per realizzare il
	 * bypass.
	 * 
	 * @param plch
	 *            il post load config handler da configurare
	 */
	public static void setPostLoadConfigHandler(PostLoadConfigHandler postLoadConfigHandler) {

		Category _log = Categories.getLogger(getAppContextName(), Categories.CSI_CONFIG);

		_log.debug("[HttpPDProxyLoader::setPostLoadConfigHandler] - Impostato PostLoadConfigHandler.");

		plch = postLoadConfigHandler;
		if (bypassFactory != null)
			bypassFactory.setPostLoadConfigHandler(plch);
	}

	private static class ProxyCache {

		private Hashtable<Object, TProxy> proxies = new Hashtable<Object, TProxy>();

		private synchronized void put(Object selector, Object value, Date plannedUpdateDateHint) {
			TProxy t = new TProxy((Proxy) (value), plannedUpdateDateHint);
			proxies.put(selector, t);
		}

		private synchronized Object get(Selector selector, InputStream streamLocalPD) throws ConfigException {
			Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY_CACHE);
			_log.debug("[HttpPDProxyLoader.ProxyCache::get] - PD [" + selector + "] ricerca in cache :");

			TProxy tp = (proxies.get(selector.keyToString()));
			if (tp != null) {
				if (_log.isDebugEnabled()) {
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] - PD [" + selector + "] trovata in cache:");
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] -- inserita il " + tp.getTheTime());
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] -- planned update: " + tp.getPlannedUpdHint());
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] -- time-to-live (in minuti): " + timeout);
				}

				Date d = tp.getTheTime();
				Date now = new Date();

				if (!expired(now, d, tp.getPlannedUpdHint(), _log)) {
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] proxy [" + selector + "] restituito dalla cache");
					return tp.getProxy();
				} else {
					//Vecchio comportamento
					/*
					this.proxies.remove(selector);
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] proxy["+ selector + "] trovato in cache ma troppo vecchio = > rimozione");
					return null;
					*/

					//Nuovo comportamento da requisito di Standard
					//Se la cache e' scaduta, viene ripetuta la chiamata sul Registry.
					//Se il registry e' OK, tale chiamata refresha la cache da se'
					//Se il registry e' KO, viene restituito il Proxy scaduto - DAN
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] proxy [" + selector
							+ "] ****** cache scaduta. Rieffettuo la getRemotly ******");
					getRemotely(streamLocalPD, selector);
					_log.debug("[HttpPDProxyLoader.ProxyCache::get] proxy [" + selector
							+ "] ****** GetRemotly rieseguita ****** ");
					return tp.getProxy();
				}
			} else
				return null;
		}

		private boolean expired(Date timeNow, Date timePD, Date plannedUpdate, Category log) {
			boolean plannedUpdateCrossed = false;
			boolean timeToLiveExpired = false;

			timeToLiveExpired = (timeNow.getTime() - timePD.getTime()) > timeout * 60000;
			if (plannedUpdate != null)
				plannedUpdateCrossed = timeNow.getTime() >= plannedUpdate.getTime();
			if (log.isDebugEnabled()) {
				log.debug("[HttpPDProxyLoader.ProxyCache::expired] - plannedUpdateCrossed=" + plannedUpdateCrossed);
				log.debug("[HttpPDProxyLoader.ProxyCache::expired] - timeToLiveExpired=" + timeToLiveExpired);
			}
			return plannedUpdateCrossed || timeToLiveExpired;
		}

		private synchronized void clear() {
			proxies.clear();
		}
	}

	private static class TProxy {
		Proxy p;

		Date theTime;

		Date plannedUpdHint = null;

		public TProxy(Proxy pr, Date plannedUpdHint) {
			this.p = pr;
			theTime = new Date();
			this.plannedUpdHint = plannedUpdHint;
		}

		public Date getTheTime() {
			return this.theTime;
		}

		public Proxy getProxy() {
			return this.p;
		}

		public Date getPlannedUpdHint() {
			return plannedUpdHint;
		}

		public void setPlannedUpdHint(Date plannedUpdHint) {
			this.plannedUpdHint = plannedUpdHint;
		}

	}

	//DV: TODO: Esiste una inner class simile a questa nel Factory: andrebbe portata fuori e
	//rifattorizzata!
	private static class Selector {

		private String ambiente;
		private String cliente;
		private String istanza;
		private String prodotto;
		private String service;
		private String servicever;
		private String binding;
		private String purpose;
		private String staging;

		private String codice_prodotto_fruitore;
		private String versione_prodotto_fruitore;
		private String codice_componente_fruitore;
		private String codice_cliente_fruitore;
		private String codice_prodotto_fruitore_as;
		private String versione_prodotto_fruitore_as;
		private String codice_componente_fruitore_as;
		private String codice_cliente_fruitore_as;

		private void makeSelector(String invocParamPath) {

			Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

			Properties propInvocation = new Properties();

			try {
				InputStream is = HttpPDProxyLoader.class.getResourceAsStream(invocParamPath);
				_log.debug("[HttpPDProxyLoader.Selector::makeSelector] InputStream is " + is);
				propInvocation.load(is);
				_log.debug("[HttpPDProxyLoader.Selector::makeSelector] Properties file loaded ");
			} catch (Exception e) {
				_log.error(
						"[HttpPDProxyLoader.Selector::makeSelector] Impossibile valorizzare il contesto di invocazione tramite file di properties",
						e);
				throw new IllegalArgumentException(
						"[HttpPDProxyLoader.Selector::makeSelector] Impossibile valorizzare il contesto di invocazione tramite file di properties");
			}

			fillSelector(propInvocation);

		}

		private void makeSelector2(Properties propInvocation) {

			Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

			if (propInvocation == null || propInvocation.isEmpty()) {
				_log.error(
						"[HttpPDProxyLoader.Selector::makeSelector] Impossibile valorizzare il contesto di invocazione tramite l'oggetto Properties passato");
				throw new IllegalArgumentException(
						"[HttpPDProxyLoader.Selector::makeSelector] Impossibile valorizzare il contesto di invocazione tramite l'oggetto Properties passato");
			}

			fillSelector(propInvocation);

		}

		private void fillSelector(Properties propInvocation) {

			Category _log = Categories.getLogger(getAppContextName(), Categories.PD_PROXY);

			// Selettore univoco servizio
			String id_servizio_call = propInvocation.getProperty(ID_SERVIZIO_CALL);
			if (id_servizio_call == null || id_servizio_call.length() == 0) {
				_log.error(
						"[HttpPDProxyLoader.Selector::makeSelector] Identificatore servizio parametro obbligatorio non valorizzato");
				throw new IllegalArgumentException(
						"[HttpPDProxyLoader.Selector::makeSelector] Identificatore servizio parametro obbligatorio non valorizzato");
			}

			StringTokenizer strTokServizio = new StringTokenizer(id_servizio_call, "|");

			int nTokens = strTokServizio.countTokens();
			if (nTokens != 6)
				throw new IllegalArgumentException("il selettore [" + id_servizio_call
						+ "] non rispetta le specifiche: deve avere 6 parametri separati da '|', mentre ne ha "
						+ nTokens + "");

			prodotto = strTokServizio.nextToken();
			cliente = strTokServizio.nextToken();
			service = strTokServizio.nextToken();
			servicever = strTokServizio.nextToken();
			istanza = strTokServizio.nextToken();
			binding = strTokServizio.nextToken();

			ambiente = propInvocation.getProperty(AMBIENTE_CALL);
			if (ambiente == null || ambiente.length() == 0) {
				_log.error(
						"[HttpPDProxyLoader.Selector::makeSelector] Ambiente di chiamata parametro obbligatorio non valorizzato");
				throw new IllegalArgumentException(
						"[HttpPDProxyLoader.Selector::makeSelector] Ambiente di chiamata parametro obbligatorio non valorizzato");
			}

			purpose = propInvocation.getProperty(PURPOSE_CALL);
			staging = propInvocation.getProperty(STAGING_CALL);

			codice_prodotto_fruitore = propInvocation.getProperty(CODICE_PRODOTTO_FRUITORE_CALL, "");
			versione_prodotto_fruitore = propInvocation.getProperty(VERSIONE_PRODOTTO_FRUITORE_CALL, "");
			codice_componente_fruitore = propInvocation.getProperty(CODICE_COMPONENTE_FRUITORE_CALL, "");
			codice_cliente_fruitore = propInvocation.getProperty(CODICE_CLIENTE_FRUITORE_CALL, "");
			codice_prodotto_fruitore_as = propInvocation.getProperty(CODICE_PRODOTTO_FRUITORE_AS_CALL, "");
			versione_prodotto_fruitore_as = propInvocation.getProperty(VERSIONE_PRODOTTO_FRUITORE_AS_CALL, "");
			codice_componente_fruitore_as = propInvocation.getProperty(CODICE_COMPONENTE_FRUITORE_AS_CALL, "");
			codice_cliente_fruitore_as = propInvocation.getProperty(CODICE_CLIENTE_FRUITORE_AS_CALL, "");

			/**
			 * Verifiche formali 1) servicever nel formato x.y.z 2) purpose in
			 * {RUNTIME|MONITOR|DIAG} (se presente) 3) staging in {TRUE|FALSE}
			 * (se presente)
			 */

			checkServicever(servicever, id_servizio_call);
			//Vecchio controllo: Bacato: non accettava versioni tipo 1.10.0. Inoltre avrebbe fatto passare versioni tipo 1.e.3!
			/*
			if (servicever.length() != 5 || servicever.charAt(1) != '.' || servicever.charAt(3) != '.')
			    throw new IllegalArgumentException("Il selettore [" + id_servizio_call + "] contiene un campo versione (" + servicever
			            + ")in formato non valido (deve essere x.y.z)");
			 */
			if (purpose != null && purpose.length() > 0) {
				if (!purpose.equals(RUNTIME_VAL) && !purpose.equals(MONITOR_VAL) && !purpose.equals(DIAG_VAL))
					throw new IllegalArgumentException(
							"Il selettore [" + id_servizio_call + "] contiene un valore del campo 'purpose' (" + purpose
									+ ") non valido (deve essere uno tra RUNTIME,MONITOR,DIAG)");
			} else {
				purpose = RUNTIME_VAL;
			}

			if (staging != null && staging.length() > 0) {
				if (!staging.equals(TRUE_VAL) && !staging.equals(FALSE_VAL))
					throw new IllegalArgumentException(
							"Il selettore [" + id_servizio_call + "] contiene un valore del campo 'staging' (" + staging
									+ ") non valido (deve essere uno tra TRUE,FALSE)");
			} else {
				staging = FALSE_VAL;
			}

		}

		public String toString() {
			String s = "Selettore:{" + "ambiente=" + ambiente + ",cliente=" + cliente + ",istanza=" + istanza
					+ ",prodotto=" + prodotto + ",service=" + service + ",servicever=" + servicever + ",binding="
					+ binding + ",purpose=" + purpose + ",staging=" + staging + ",codice_prodotto_fruitore="
					+ codice_prodotto_fruitore + ",versione_prodotto_fruitore=" + versione_prodotto_fruitore
					+ ",codice_componente_fruitore=" + codice_componente_fruitore + ",codice_cliente_fruitore="
					+ codice_cliente_fruitore + ",codice_prodotto_fruitore_as=" + codice_prodotto_fruitore_as
					+ ",versione_prodotto_fruitore_as=" + versione_prodotto_fruitore_as
					+ ",codice_componente_fruitore_as=" + codice_componente_fruitore_as + ",codice_cliente_fruitore_as="
					+ codice_cliente_fruitore_as + "}";

			return s;
		}

		//N.B. Tale controllo viene anche fatto successivamente qui:
		//HttpProxyLoader.loadProxy
		//HttpProxyLoader.getRemotely(InputStream streamLocalPD,Selector selector)
		//it.csi.csi.util.xml.PDConfigReader.read(InputStream is, String versionFilter)
		//it.csi.csi.util.xml.PDConfigReader.parseOperationMetaData(Element currOpNode, String versionFilter)
		//it.csi.csi.util.xml.PDConfigReader.versionLEQ(String v1, String v2)
		// Mantenuto per coerenza storica - DV
		private void checkServicever(String servicever, String selettore) {
			final String errorMessage = "Il selettore [" + selettore + "] contiene un campo versione (" + servicever
					+ ")in formato non valido. \n"
					+ " Il formato deve essere x.y.z dove x, y, z sono numerici con un numero variabile di cifre";

			StringTokenizer st = new StringTokenizer(servicever, ".");
			if (st.countTokens() == 3) {
				try {
					Integer.parseInt(st.nextToken());
					Integer.parseInt(st.nextToken());
					Integer.parseInt(st.nextToken());
				} catch (NumberFormatException ex) {
					throw new IllegalArgumentException(errorMessage);
				}
			} else {
				throw new IllegalArgumentException(errorMessage);
			}
		}

		private String keyToString() {
			return ambiente + "|" + cliente + "|" + istanza + "|" + prodotto + "|" + service + "|" + servicever + "|"
					+ binding + "|" + purpose + "|" + staging;
		}

	}

}
