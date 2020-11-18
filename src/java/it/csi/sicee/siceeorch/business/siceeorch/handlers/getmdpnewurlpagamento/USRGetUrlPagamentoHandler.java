package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewurlpagamento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-751871705) ENABLED START*/
// inserire qui eventuali import aggiuntive
import java.util.ArrayList;
import java.math.BigDecimal;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.csi.mdp.core.business.dto.Transazione;
import it.csi.mdp.core.business.dto.TransazioneExtraAttribute;
import it.csi.mdp.core.business.dto.multicarrello.DatiSingoloVersamentoRPT;
import it.csi.mdp.core.business.dto.multicarrello.DatiVersamentoRPT;
import it.csi.mdp.core.business.dto.multicarrello.ElencoRPT;
import it.csi.mdp.core.business.dto.multicarrello.RPTData;
import it.csi.mdp.core.business.dto.multicarrello.SoggettoPagatore;
import it.csi.mdp.core.business.dto.multicarrello.SoggettoVersante;
import it.csi.mdp.core.business.paymentmanager.local.AppGateway;
import it.csi.mdp.core.interfacecxf.IMdpCoreCxf;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.hibernate.util.GetGeneratedKeysHelper;

import it.csi.sicee.siceeorch.business.siceeorch.util.NodoConstants;
import it.csi.sicee.siceeorch.business.util.Constants;
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.sicee.siceeorch.dto.siceeorch.DettaglioPagamento;

/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetUrlPagamentoHandler implements FunctionProvider {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * @generated
	 */
	public void execute(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		this.initFunctionHandler(transientVars, args, ps);

		this.eseguiFunctionHandler(transientVars, args, ps);

		this.releaseFunctionHandler(transientVars, args, ps);
	}

	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetUrlPagamentoHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1500402690) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetUrlPagamentoHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1629531559) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetUrlPagamentoHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1500512385) ENABLED START*/

		// Recupero il numero transazione
		DettaglioPagamento dettaglioPagamento = (DettaglioPagamento) DataSlotHelper
				.getDataSlotValue("SLOT_dettaglioPagamento", ps);

		try {

			// Questo oggetto contiene tutti i parametri del metodo
			it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] parameters = (it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[]) DataSlotHelper
					.getDataSlotValue("SLOT_elencoParamSrv", ps);

			String applicationId = null;

			String idGatewayNodo = null;

			String idPaymentmodeNodo = null;

			String datiSpecificiRiscos = null;

			for (it.csi.sicee.siceesrv.dto.siceesrv.LabelValue parameter : parameters) {

				if (parameter.getLabel().equalsIgnoreCase(Constants.COD_APPLICATION_ID)) {
					applicationId = parameter.getValue();
				} else if (parameter.getLabel().equalsIgnoreCase(Constants.COD_DATI_SPECIFICI_RISCOSSIONE)) {
					datiSpecificiRiscos = parameter.getValue();
				}
			}

			/*
			//id di test
			String ID_GATEWAY_NODO = "5D15C543-95C5-4B42-9A4C-4E429833F35D";
			
			//id di test
			String ID_PAYMENTMODE_NODO = "F108815E-D0FE-4675-8369-63D700037E5A";
			
			String DATI_SPECIFICI_RISCOSSIONE = "9/0000000123"; // Obbligatorio dato da concordare con l'Ente
			 */

			String AUTENTICAZIONE_SOGGETTO = "OTH"; // Obbligatorio  CNS | USR | OTH | N/A

			String FIRMA_RICEVUTA = "0";

			Transazione t = new Transazione();
			t.setTransactionId(dettaglioPagamento.getNumTransazione());
			t.setApplicationId(applicationId);
			t.setLanguage("ITA");

			String transactionId = t.getTransactionId();

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null)
						.debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- ApplicationId: " + applicationId);
				getLogger(null).debug(
						"[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- Id transazione: " + t.getTransactionId());
			}

			JaxWsProxyFactoryBean fact = new JaxWsProxyFactoryBean();
			fact.setServiceClass(IMdpCoreCxf.class);
			String mdpcoreAddress = Constants.MDPNEW_CORE_URL;
			fact.setAddress(mdpcoreAddress);
			fact.getInInterceptors().add(new LoggingInInterceptor());
			fact.getOutInterceptors().add(new LoggingOutInterceptor());

			IMdpCoreCxf clientcxfmdp = (IMdpCoreCxf) fact.create();

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null).debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- PASSO 1");

				getLogger(null).debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- PASSO 2");
			}

			t.setAmount(dettaglioPagamento.getImportoPagamento());
			t.setCcy("EUR");

			AppGateway[] agList = clientcxfmdp.getModalitaPagamento(t, applicationId);

			if (agList != null) {

				if (getLogger(null).isDebugEnabled())
					getLogger(null).debug("Stampo il primo");
				// Prendo il primo
				AppGateway ag = agList[0];

				idGatewayNodo = ag.getGatewayId();
				idPaymentmodeNodo = ag.getPaymentmodeId();

				if (getLogger(null).isDebugEnabled()) {
					getLogger(null).debug("Stampo idGatewayNodo: " + idGatewayNodo);
					getLogger(null).debug("Stampo idPaymentmodeNodo: " + idPaymentmodeNodo);
				}

			}

			t.setGatewayId(idGatewayNodo);
			t.setGatewaypaymodeid(idPaymentmodeNodo);

			ArrayList<RPTData> listRPTData = new ArrayList<RPTData>();

			RPTData rptData = new RPTData();

			rptData.setAutenticazioneSoggetto(AUTENTICAZIONE_SOGGETTO);
			//rptData.setIdStazioneRichiedente(idStazioneRichiedente);

			SoggettoPagatore soggPagatore = new SoggettoPagatore();

			soggPagatore.setIdentificativoUnivocoPagatore(dettaglioPagamento.getCodiceIdentificativoUnivocoPagatore());

			soggPagatore.setAnagraficaPagatore(dettaglioPagamento.getAnagraficaPagatore());

			soggPagatore
					.setTipoIdentificativoUnivocoPagatore(dettaglioPagamento.getTipoIdentificativoUnivocoPagatore());

			SoggettoVersante soggVersante = new SoggettoVersante();
			soggVersante
					.setTipoIdentificativoUnivocoVersante(dettaglioPagamento.getTipoIdentificativoUnivocoVersante());
			soggVersante.setIdentificativoUnivocoVersante(dettaglioPagamento.getCodiceIdentificativoUnivocoVersante());
			soggVersante.setAnagraficaVersante(dettaglioPagamento.getAnagraficaVersante());

			DatiVersamentoRPT datiVersamento = new DatiVersamentoRPT();
			// Trasformo il double (ImportoPagamento) in string perche' la trasformazione da double a BigDecimal (in alcune circostanze es 10.1) crea un valore anomalo
			String importoPagamento = String.valueOf(dettaglioPagamento.getImportoPagamento());
			datiVersamento.setImportoTotaleDaVersare(new BigDecimal(importoPagamento));

			datiVersamento
					.setIdentificativoUnivocoVersamento(dettaglioPagamento.getCodiceIdentificativoUnivocoVersamento());

			datiVersamento.setFirmaRicevuta(FIRMA_RICEVUTA);

			DatiSingoloVersamentoRPT datiSingoloVersamento = new DatiSingoloVersamentoRPT();
			datiSingoloVersamento.setImportoSingoloVersamento(datiVersamento.getImportoTotaleDaVersare());

			String causale = "/RFB/" + dettaglioPagamento.getCodiceIdentificativoUnivocoVersamento() + "/"
					+ datiVersamento.getImportoTotaleDaVersare() + "/Acquisto credito su SIPEE";

			getLogger(null).debug("Stampo la causale: " + causale);

			datiSingoloVersamento.setCausaleVersamento(causale);
			datiSingoloVersamento.setDatiSpecificiRiscossione(datiSpecificiRiscos);

			ArrayList<DatiSingoloVersamentoRPT> datiSingoloVersamentoList = new ArrayList<DatiSingoloVersamentoRPT>();
			datiSingoloVersamentoList.add(datiSingoloVersamento);
			datiVersamento.setDatiSingoloVersamento(datiSingoloVersamentoList);

			rptData.setDatiVersamento(datiVersamento);
			rptData.setSoggettoPagatore(soggPagatore);

			rptData.setSoggettoVersante(soggVersante);

			listRPTData.add(rptData);

			ElencoRPT elencoRPT = new ElencoRPT();
			elencoRPT.setElenco(listRPTData);

			/*
			ArrayList<TransazioneExtraAttribute> tea = new ArrayList<TransazioneExtraAttribute>();
			//TransazioneExtraAttribute[] tea = new TransazioneExtraAttribute[26];
			
			// AUTENTICAZIONE_SOGGETTO 
			TransazioneExtraAttribute autenticazioneSoggetto = new TransazioneExtraAttribute();
			autenticazioneSoggetto
					.setName(NodoConstants.TEA_AUTENTICAZIONE_SOGGETTO);
			autenticazioneSoggetto.setValue(AUTENTICAZIONE_SOGGETTO);
			autenticazioneSoggetto.setTransactionId(transactionId);
			//tea[0] = autenticazioneSoggetto;
			tea.add(autenticazioneSoggetto);
			
			// DATI VERSANTE
			//*******************************************************
			
			if (dettaglioPagamento.getAnagraficaVersante() != null
					&& !dettaglioPagamento.getAnagraficaVersante().equals("")) {
			
				// ANAGRAFICA VERSANTE
				TransazioneExtraAttribute anagraficaVersante = new TransazioneExtraAttribute();
				anagraficaVersante
						.setName(NodoConstants.TEA_ANAGRAFICA_VERSANTE);
				anagraficaVersante.setValue(dettaglioPagamento
						.getAnagraficaVersante());
				anagraficaVersante.setTransactionId(transactionId);
			
				//tea[1] = anagraficaVersante;
				tea.add(anagraficaVersante);
			
				// INDIRIZZO VERSANTE
				TransazioneExtraAttribute indirizzoVersante = new TransazioneExtraAttribute();
				indirizzoVersante.setName(NodoConstants.TEA_INDIRIZZO_VERSANTE);
				indirizzoVersante.setValue(dettaglioPagamento
						.getIndirizzoVersante());
				indirizzoVersante.setTransactionId(transactionId);
			
				//tea[2] = indirizzoVersante;
				tea.add(indirizzoVersante);
			
				// CIVICO VERSANTE
				TransazioneExtraAttribute civicoVersante = new TransazioneExtraAttribute();
				civicoVersante.setName(NodoConstants.TEA_CIVICO_VERSANTE);
				civicoVersante.setValue(dettaglioPagamento.getCivicoVersante());
				civicoVersante.setTransactionId(transactionId);
				//tea[3] = civicoVersante;
				tea.add(civicoVersante);
			
				// CAP VERSANTE
				TransazioneExtraAttribute capVersante = new TransazioneExtraAttribute();
				capVersante.setName(NodoConstants.TEA_CAP_VERSANTE);
				capVersante.setValue(dettaglioPagamento.getCapVersante());
				capVersante.setTransactionId(transactionId);
				//tea[4] = capVersante;
				tea.add(capVersante);
			
				// LOCALITA VERSANTE
				TransazioneExtraAttribute localitaVersante = new TransazioneExtraAttribute();
				localitaVersante.setName(NodoConstants.TEA_LOCALITA_VERSANTE);
				localitaVersante.setValue(dettaglioPagamento
						.getLocalitaVersante());
				localitaVersante.setTransactionId(transactionId);
				//tea[5] = localitaVersante;
				tea.add(localitaVersante);
			
				// PROVINCIA VERSANTE
				TransazioneExtraAttribute provinciaVersante = new TransazioneExtraAttribute();
				provinciaVersante.setName(NodoConstants.TEA_PROVINCIA_VERSANTE);
				provinciaVersante.setValue(dettaglioPagamento
						.getProvinciaVersante());
				provinciaVersante.setTransactionId(transactionId);
				//tea[6] = provinciaVersante;
				tea.add(provinciaVersante);
			
				// NAZIONE VERSANTE
				TransazioneExtraAttribute nazioneVersante = new TransazioneExtraAttribute();
				nazioneVersante.setName(NodoConstants.TEA_NAZIONE_VERSANTE);
				nazioneVersante.setValue(dettaglioPagamento
						.getNazioneVersante());
				nazioneVersante.setTransactionId(transactionId);
				//tea[7] = nazioneVersante;
				tea.add(nazioneVersante);
			
				if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
						.getEmailVersante())) {
					// EMAIL VERSANTE
					TransazioneExtraAttribute emailVersante = new TransazioneExtraAttribute();
					emailVersante.setName(NodoConstants.TEA_MAIL_VERSANTE);
					emailVersante.setValue(dettaglioPagamento
							.getEmailVersante());
					emailVersante.setTransactionId(transactionId);
					//tea[8] = emailVersante;
					tea.add(emailVersante);
				}
			
				if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
						.getTipoIdentificativoUnivocoVersante())) {
					// TIPO_IDENTIFICATIVO_UNIVOCO VERSANTE
					TransazioneExtraAttribute tipoIdentificativoUnivocoVersante = new TransazioneExtraAttribute();
					tipoIdentificativoUnivocoVersante
							.setName(NodoConstants.TEA_TIPO_IDENTIFICATIVO_UNIVOCO_VERSANTE);
					tipoIdentificativoUnivocoVersante
							.setValue(dettaglioPagamento
									.getTipoIdentificativoUnivocoVersante());
					tipoIdentificativoUnivocoVersante
							.setTransactionId(transactionId);
					//tea[9] = tipoIdentificativoUnivocoVersante;
					tea.add(tipoIdentificativoUnivocoVersante);
				}
			
				if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
						.getCodiceIdentificativoUnivocoVersante())) {
					// CODICE_IDENTIFICATIVO_UNIVOCO_VERSANTE 
					TransazioneExtraAttribute codiceIdentificativoUnivocoVersante = new TransazioneExtraAttribute();
					codiceIdentificativoUnivocoVersante
							.setName(NodoConstants.TEA_CODICE_IDENTIFICATIVO_UNIVOCO_VERSANTE);
					codiceIdentificativoUnivocoVersante
							.setValue(dettaglioPagamento
									.getCodiceIdentificativoUnivocoVersante());
					codiceIdentificativoUnivocoVersante
							.setTransactionId(transactionId);
					//tea[10] = codiceIdentificativoUnivocoVersante;
					tea.add(codiceIdentificativoUnivocoVersante);
				}
			
			}
			
			//*******************************************************
			// DATI PAGATORE
			//*******************************************************
			// ANAGRAFICA PAGATORE
			TransazioneExtraAttribute anagraficaPagatore = new TransazioneExtraAttribute();
			anagraficaPagatore.setName(NodoConstants.TEA_ANAGRAFICA_PAGATORE);
			anagraficaPagatore.setValue(dettaglioPagamento
					.getAnagraficaPagatore());
			anagraficaPagatore.setTransactionId(transactionId);
			//tea[11] = anagraficaPagatore;
			tea.add(anagraficaPagatore);
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// INDIRIZZO PAGATORE
				TransazioneExtraAttribute indirizzoPagatore = new TransazioneExtraAttribute();
				indirizzoPagatore.setName(NodoConstants.TEA_INDIRIZZO_PAGATORE);
				indirizzoPagatore.setValue(dettaglioPagamento
						.getIndirizzoPagatore());
				indirizzoPagatore.setTransactionId(transactionId);
				//tea[12] = indirizzoPagatore;
				tea.add(indirizzoPagatore);
			}
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// CIVICO PAGATORE
				TransazioneExtraAttribute civicoPagatore = new TransazioneExtraAttribute();
				civicoPagatore.setName(NodoConstants.TEA_CIVICO_PAGATORE);
				civicoPagatore.setValue(dettaglioPagamento.getCivicoPagatore());
				civicoPagatore.setTransactionId(transactionId);
				//tea[13] = civicoPagatore;
				tea.add(civicoPagatore);
			}
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// CAP PAGATORE
				TransazioneExtraAttribute capPagatore = new TransazioneExtraAttribute();
				capPagatore.setName(NodoConstants.TEA_CAP_PAGATORE);
				capPagatore.setValue(dettaglioPagamento.getCapPagatore());
				capPagatore.setTransactionId(transactionId);
				//tea[14] = capPagatore;
				tea.add(capPagatore);
			}
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// LOCALITA PAGATORE
				TransazioneExtraAttribute localitaPagatore = new TransazioneExtraAttribute();
				localitaPagatore.setName(NodoConstants.TEA_LOCALITA_PAGATORE);
				localitaPagatore.setValue(dettaglioPagamento
						.getLocalitaPagatore());
				localitaPagatore.setTransactionId(transactionId);
				//tea[15] = localitaPagatore;
				tea.add(localitaPagatore);
			}
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// PROVINCIA PAGATORE
				TransazioneExtraAttribute provinciaPagatore = new TransazioneExtraAttribute();
				provinciaPagatore.setName(NodoConstants.TEA_PROVINCIA_PAGATORE);
				provinciaPagatore.setValue(dettaglioPagamento
						.getProvinciaPagatore());
				provinciaPagatore.setTransactionId(transactionId);
				//tea[16] = provinciaPagatore;
				tea.add(provinciaPagatore);
			}
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// NAZIONE PAGATORE
				TransazioneExtraAttribute nazionePagatore = new TransazioneExtraAttribute();
				nazionePagatore.setName(NodoConstants.TEA_NAZIONE_PAGATORE);
				nazionePagatore.setValue(dettaglioPagamento
						.getNazionePagatore());
				nazionePagatore.setTransactionId(transactionId);
				//tea[17] = nazionePagatore;
				tea.add(nazionePagatore);
			}
			
			if (!GenericUtil.isNullOrEmpty(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersante())) {
				// EMAIL PAGATORE
				TransazioneExtraAttribute emailPagatore = new TransazioneExtraAttribute();
				emailPagatore.setName(NodoConstants.TEA_MAIL_PAGATORE);
				emailPagatore.setValue(dettaglioPagamento.getEmailPagatore());
				emailPagatore.setTransactionId(transactionId);
				//tea[18] = emailPagatore;
				tea.add(emailPagatore);
			}
			
			// TIPO_IDENTIFICATIVO_UNIVOCO PAGATORE
			TransazioneExtraAttribute tipoIdentificativoUnivocoPagatore = new TransazioneExtraAttribute();
			tipoIdentificativoUnivocoPagatore
					.setName(NodoConstants.TEA_TIPO_IDENTIFICATIVO_UNIVOCO_PAGATORE);
			tipoIdentificativoUnivocoPagatore.setValue(dettaglioPagamento
					.getTipoIdentificativoUnivocoPagatore());
			tipoIdentificativoUnivocoPagatore.setTransactionId(transactionId);
			//tea[19] = tipoIdentificativoUnivocoPagatore;
			tea.add(tipoIdentificativoUnivocoPagatore);
			
			// CODICE_IDENTIFICATIVO_UNIVOCO_PAGATORE 
			TransazioneExtraAttribute codiceIdentificativoUnivocoPagatore = new TransazioneExtraAttribute();
			codiceIdentificativoUnivocoPagatore
					.setName(NodoConstants.TEA_CODICE_IDENTIFICATIVO_UNIVOCO_PAGATORE);
			codiceIdentificativoUnivocoPagatore.setValue(dettaglioPagamento
					.getCodiceIdentificativoUnivocoPagatore());
			codiceIdentificativoUnivocoPagatore.setTransactionId(transactionId);
			//tea[20] = codiceIdentificativoUnivocoPagatore;
			tea.add(codiceIdentificativoUnivocoPagatore);
			
			//*******************************************************
			
			// ID INFORMATIVA PSP
			TransazioneExtraAttribute idInformativaPSPTea = new TransazioneExtraAttribute();
			idInformativaPSPTea.setName(NodoConstants.TEA_ID_UNIVOCO_PSP);
			idInformativaPSPTea.setValue(GenericUtil
					.convertToString(dettaglioPagamento.getIdInformativa()));
			idInformativaPSPTea.setTransactionId(transactionId);
			//tea[21] = idInformativaPSPTea;
			tea.add(idInformativaPSPTea);
			
			// Causale versamento
			TransazioneExtraAttribute causaleVersamento = new TransazioneExtraAttribute();
			causaleVersamento.setName(NodoConstants.TEA_CAUSALE_VERSAMENTO);
			causaleVersamento.setValue("transazione test causale");
			causaleVersamento.setTransactionId(transactionId);
			//tea[22] = causaleVersamento;
			tea.add(causaleVersamento);
			
			// IUV
			TransazioneExtraAttribute iuvTea = new TransazioneExtraAttribute();
			iuvTea.setName(NodoConstants.TEA_IDENTIFICATIVO_UNIVOCO_VERSAMENTO);
			iuvTea.setValue(dettaglioPagamento
					.getCodiceIdentificativoUnivocoVersamento());
			
			iuvTea.setTransactionId(transactionId);
			//tea[23] = iuvTea;
			tea.add(iuvTea);
			
			// FIRMA
			TransazioneExtraAttribute firmaRicevuta = new TransazioneExtraAttribute();
			firmaRicevuta.setName(NodoConstants.TEA_FIRMA_RICEVUTA);
			firmaRicevuta.setValue(FIRMA_RICEVUTA);
			firmaRicevuta.setTransactionId(transactionId);
			//tea[24] = firmaRicevuta;
			tea.add(firmaRicevuta);
			
			// DATI SPECFICI RISCOSSIONE
			TransazioneExtraAttribute datiSpecificiRiscossione = new TransazioneExtraAttribute();
			datiSpecificiRiscossione
					.setName(NodoConstants.TEA_DATI_SPECIFICI_RISCOSSIONE);
			datiSpecificiRiscossione.setValue(datiSpecificiRiscos);
			datiSpecificiRiscossione.setTransactionId(transactionId);
			//tea[25] = datiSpecificiRiscossione;
			tea.add(datiSpecificiRiscossione);
			
			
			
			getLogger(null)
					.debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- PRIMA DELLA STAMPA DELLA Transazione");
			GenericUtil.stampa(t, true, 3);
			
			getLogger(null)
					.debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- PRIMA DELLA STAMPA DELLA TransazioneExtraAttribute: "
							+ tea);
			//GenericUtil.stampa(tea, true, 3);
			getLogger(null)
					.debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- DOPO LA STAMPA DELLA TransazioneExtraAttribute");
			
			TransazioneExtraAttribute[] teaA = tea
					.toArray(new TransazioneExtraAttribute[tea.size()]);
			
			// OLD METODO
			//String url = clientcxfmdp.startTransazione(t, teaA);
			
			 */

			//NEW METODO
			String url = clientcxfmdp.startTransazioneCarrello(t, null, elencoRPT);

			if (getLogger(null).isDebugEnabled())
				getLogger(null)
						.debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]- Stampo l'urlPagamento: " + url);

			DataSlotHelper.setDataSlotValue("SLOT_result", url, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);

			getLogger(null)
					.error("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
							+ " nell'apposito slot  ", e);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetUrlPagamentoHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R1491277424) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
