package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificato;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.csi.wrapper.*;

import it.csi.sicee.siceeorch.business.handlers.*;
import it.csi.sicee.siceeorch.business.integration.*;
import it.csi.sicee.siceeorch.business.siceeorch.*;

/**
 * Implementazione della specifica invocazione al servizio PAPD:
 * - servizio [SICEESRV]
 * - operation [getStampaCertificato]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetStampaCertificatoHandler extends PAPDCallBaseHandler {

	/**
	 * prefisso da utilizzare nei logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * Il logger utilizzato per loggare le operazioni di questo handler
	 * @generated
	 */
	public static final Logger LOGGER = Logger.getLogger(LOGGER_PREFIX);

	/**
	 * Esegue la chiamata all'operazione getStampaCertificato del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetStampaCertificatoHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetStampaCertificatoHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: numCertificatore
			java.lang.String slot_numCertificatore = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_numCertificatore", ps);

			// slot: progrCertificato
			java.lang.String slot_progrCertificato = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_progrCertificato", ps);

			// slot: annoCertificato
			java.lang.String slot_annoCertificato = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_annoCertificato", ps);

			// slot: scrittaSfondo
			java.lang.String slot_scrittaSfondo = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_scrittaSfondo", ps);

			// slot: foto
			byte[] slot_foto = (byte[]) DataSlotHelper.getDataSlotValue("SLOT_foto", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetStampaCertificatoHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "getStampaCertificato");
			byte[] result = pd.getStampaCertificato(slot_numCertificatore, slot_progrCertificato, slot_annoCertificato,
					slot_scrittaSfondo, slot_foto);

			LOGGER.debug("[PAPDGetStampaCertificatoHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_arrayDoc)

			LOGGER.debug(
					"[PAPDGetStampaCertificatoHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_arrayDoc");
			DataSlotHelper.setDataSlotValue("SLOT_arrayDoc", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetStampaCertificatoHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
