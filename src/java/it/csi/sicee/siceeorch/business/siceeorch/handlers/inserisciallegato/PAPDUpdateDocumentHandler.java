package it.csi.sicee.siceeorch.business.siceeorch.handlers.inserisciallegato;

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
 * - servizio [INDEX_MNGMT]
 * - operation [updateContentData]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDUpdateDocumentHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione updateContentData del servizio INDEX_MNGMT
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDUpdateDocumentHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface pd = (it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDUpdateDocumentHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: uid
			it.doqui.index.ecmengine.dto.Node slot_uid = (it.doqui.index.ecmengine.dto.Node) DataSlotHelper
					.getDataSlotValue("SLOT_uid", ps);

			// slot: contentDoc
			it.doqui.index.ecmengine.dto.engine.management.Content slot_contentDoc = (it.doqui.index.ecmengine.dto.engine.management.Content) DataSlotHelper
					.getDataSlotValue("SLOT_contentDoc", ps);

			// slot: operationContext
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContext = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContext", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDUpdateDocumentHandler::eseguiFunctionHandler]-richiamo del metodo  " + "updateContentData");
			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDUpdateDocumentHandler::eseguiFunctionHandler]-richiamo del metodo  " + "updateContentData");
			pd.updateContentData(slot_uid, slot_contentDoc, slot_operationContext);
			LOGGER.debug("[PAPDUpdateDocumentHandler::eseguiFunctionHandler]-richiamo ok  ");

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDUpdateDocumentHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
