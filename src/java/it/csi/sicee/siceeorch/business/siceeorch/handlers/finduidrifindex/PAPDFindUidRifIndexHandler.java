package it.csi.sicee.siceeorch.business.siceeorch.handlers.finduidrifindex;

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
 * - operation [findUidRifIndex]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDFindUidRifIndexHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione findUidRifIndex del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDFindUidRifIndexHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDFindUidRifIndexHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: numCertificatore
			java.lang.String slot_numCertificatore = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_numCertificatore", ps);

			// slot: progrCertificato
			java.lang.String slot_progrCertificato = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_progrCertificato", ps);

			// slot: annoCertificato
			java.lang.String slot_annoCertificato = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_annoCertificato", ps);

			// slot: idTipoDoc
			java.lang.Integer slot_idTipoDoc = (java.lang.Integer) DataSlotHelper.getDataSlotValue("SLOT_idTipoDoc",
					ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDFindUidRifIndexHandler::eseguiFunctionHandler]-richiamo del metodo  " + "findUidRifIndex");
			java.lang.String result = pd.findUidRifIndex(slot_numCertificatore, slot_progrCertificato,
					slot_annoCertificato, slot_idTipoDoc);

			LOGGER.debug("[PAPDFindUidRifIndexHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_result)

			LOGGER.debug("[PAPDFindUidRifIndexHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_result");
			DataSlotHelper.setDataSlotValue("SLOT_result", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDFindUidRifIndexHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
