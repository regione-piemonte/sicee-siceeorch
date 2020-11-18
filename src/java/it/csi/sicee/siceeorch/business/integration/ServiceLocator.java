
package it.csi.sicee.siceeorch.business.integration;

import it.csi.csi.wrapper.ConfigException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * ServiceLocator. 
 * Classe di utilita' utilizzata per localizzare i servizi orchestrati.
 * E' un singleton.
 * @generated
 */

public class ServiceLocator {

	/**
	* il prefisso del logger
	* @generated
	*/
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * il logger utilizzato per loggaqre le operazioni del ServiceLocator
	 * @generated
	 */
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);

	/**
	 * Istanza del singleton
	 * @generated
	 */
	private static ServiceLocator me;

	/**
	 * contiene i servizi gia' caricati in precedenza
	 * @generated
	 */
	private Map cacheMap;

	static {
		try {
			me = new ServiceLocator();
		} catch (Exception se) {
			logger.error(
					"[it.csi.sicee.siceeorch.business.integration.ServiceLocator::methodName] - errore non gestito nell'esecuzione del flusso",
					se);
		}
	}

	/**
	 * costruttore intenzionalmente privato come parte dell'implementazione del pattern
	 * di Singleton
	 * @throws exception
	 * @generated 
	 */
	private ServiceLocator() throws Exception {

		logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::ServiceLocator()]-START  ");

		cacheMap = Collections.synchronizedMap(new HashMap());

		logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::ServiceLocator()]-END  ");

	}

	/**
	 * Restituisce l'istanza del singleton
	 * @return  l'istanza
	 * @generated
	 */
	static public ServiceLocator getInstance() {
		return me;
	}

	/**
	 * @param localPDRes il path della risorsa che identifica il servizio
	 * @return true se per quel servizio e' necessario mantenere
	 * in cache la PD.
	 */
	private boolean mustCachePD(String localPDRes) {
		logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::mustCachePD(" + localPDRes
				+ ")]-START  ");
		boolean mustCache = true;

		if ("/defpd_indexmngmt.xml".equals(localPDRes)) {
			mustCache = false;
		}

		if ("/defpd_indexsearch.xml".equals(localPDRes)) {
			mustCache = false;
		}

		if ("/defpd_indexsecurity.xml".equals(localPDRes)) {
			mustCache = false;
		}

		if ("/defpd_verificamarcafirma.xml".equals(localPDRes)) {
			mustCache = false;
		}

		if ("/defpd_mdpnew.xml".equals(localPDRes)) {
			mustCache = false;
		}

		if ("/defpd_sigitext.xml".equals(localPDRes)) {
			mustCache = false;
		}

		logger.debug(
				"[it.csi.sicee.siceeorch.business.integration.ServiceLocator::mustCachePD]- mustCache? " + mustCache);
		logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::mustCachePD]-END  ");
		return mustCache;
	}

	/**
	 * @param localPDRes la risorsa che contiene la PD locale
	 * @return la PD
	 * @generated
	 */
	public Object getPD(String localPDRes) throws ConfigException {
		logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD]-START  ");

		Object tempPdObject = null;

		logger.debug(
				"[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD]-reperimento PD da risorsa locale:\"+localPDRes+\"");

		// verifica se lo stub del servizio specificato e' gia' in cache
		if (cacheMap.containsKey(localPDRes)) {

			logger.debug(
					"[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD]-PD gia' presente in cache");

			logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD]-END");
			tempPdObject = cacheMap.get(localPDRes);
		} else {

			logger.debug(
					"[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD]-PD non presente in cache");

			java.io.InputStream localPD = this.getClass().getResourceAsStream(localPDRes);

			it.csi.csi.porte.InfoPortaDelegata infoPD;
			try {
				// legge dalla risorsa la PD locale ed istanzia lo stub
				infoPD = it.csi.csi.util.xml.PDConfigReader.read(localPD);
				tempPdObject = it.csi.csi.porte.proxy.PDProxy.newInstance(infoPD);
				// mette in cache lo stub appena istanziato (se necessario)
				if (mustCachePD(localPDRes)) {
					cacheMap.put(localPDRes, tempPdObject);
				}

			} catch (Exception e) {
				logger.error(
						"[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD] - Errore nella lettura della configurazione da "
								+ localPDRes,
						e);
				throw new ConfigException("Errore nella lettura della configurazione da " + localPDRes, e);
			}

			logger.debug("[it.csi.sicee.siceeorch.business.integration.ServiceLocator::getPD]-END");

		}

		return tempPdObject;
	}
}
