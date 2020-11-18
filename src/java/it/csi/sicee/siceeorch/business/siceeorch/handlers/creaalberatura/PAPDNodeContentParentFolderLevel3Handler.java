package it.csi.sicee.siceeorch.business.siceeorch.handlers.creaalberatura;

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
public class PAPDNodeContentParentFolderLevel3Handler extends PAPDCallBaseHandler {

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

		LOGGER.debug("[PAPDNodeContentParentFolderLevel3Handler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface pd = (it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDNodeContentParentFolderLevel3Handler::eseguiFunctionHandler]-binding parametri ");
			// slot: nodeFolderLevel2
			it.doqui.index.ecmengine.dto.Node slot_nodeFolderLevel2 = (it.doqui.index.ecmengine.dto.Node) DataSlotHelper
					.getDataSlotValue("SLOT_nodeFolderLevel2", ps);

			// slot: contentFolderLevel3
			it.doqui.index.ecmengine.dto.engine.management.Content slot_contentFolderLevel3 = (it.doqui.index.ecmengine.dto.engine.management.Content) DataSlotHelper
					.getDataSlotValue("SLOT_contentFolderLevel3", ps);

			// slot: operationContextIns
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContextIns = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContextIns", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDNodeContentParentFolderLevel3Handler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "createContent");
			it.doqui.index.ecmengine.dto.Node result = pd.createContent(slot_nodeFolderLevel2, slot_contentFolderLevel3,
					slot_operationContextIns);

			LOGGER.debug("[PAPDNodeContentParentFolderLevel3Handler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_nodeFolderLevel3)

			LOGGER.debug(
					"[PAPDNodeContentParentFolderLevel3Handler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_nodeFolderLevel3");
			DataSlotHelper.setDataSlotValue("SLOT_nodeFolderLevel3", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error(
					"[PAPDNodeContentParentFolderLevel3Handler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ",
					e);
		}
	}

}
