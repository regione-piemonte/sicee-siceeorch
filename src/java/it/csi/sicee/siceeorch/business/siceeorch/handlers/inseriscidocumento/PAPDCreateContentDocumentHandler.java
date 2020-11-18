package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

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
 * - operation [createContent]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDCreateContentDocumentHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione createContent del servizio INDEX_MNGMT
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDCreateContentDocumentHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface pd = (it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDCreateContentDocumentHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: nodeFolderIns
			it.doqui.index.ecmengine.dto.Node slot_nodeFolderIns = (it.doqui.index.ecmengine.dto.Node) DataSlotHelper
					.getDataSlotValue("SLOT_nodeFolderIns", ps);

			// slot: contentIns
			it.doqui.index.ecmengine.dto.engine.management.Content slot_contentIns = (it.doqui.index.ecmengine.dto.engine.management.Content) DataSlotHelper
					.getDataSlotValue("SLOT_contentIns", ps);

			// slot: operationContextIns
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContextIns = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContextIns", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDCreateContentDocumentHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "createContent");
			it.doqui.index.ecmengine.dto.Node result = pd.createContent(slot_nodeFolderIns, slot_contentIns,
					slot_operationContextIns);

			LOGGER.debug("[PAPDCreateContentDocumentHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_nodeUid)

			LOGGER.debug(
					"[PAPDCreateContentDocumentHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_nodeUid");
			DataSlotHelper.setDataSlotValue("SLOT_nodeUid", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDCreateContentDocumentHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
