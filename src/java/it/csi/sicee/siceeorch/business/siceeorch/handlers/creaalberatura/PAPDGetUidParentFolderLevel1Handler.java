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
 * - servizio [INDEX_SEARCH]
 * - operation [getUid]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetUidParentFolderLevel1Handler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione getUid del servizio INDEX_SEARCH
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetUidParentFolderLevel1Handler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.search.EcmEngineSearchInterface pd = (it.doqui.index.ecmengine.interfacecsi.search.EcmEngineSearchInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetUidParentFolderLevel1Handler::eseguiFunctionHandler]-binding parametri ");
			// slot: searchParamsIns
			it.doqui.index.ecmengine.dto.engine.search.SearchParams slot_searchParamsIns = (it.doqui.index.ecmengine.dto.engine.search.SearchParams) DataSlotHelper
					.getDataSlotValue("SLOT_searchParamsIns", ps);

			// slot: operationContextIns
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContextIns = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContextIns", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDGetUidParentFolderLevel1Handler::eseguiFunctionHandler]-richiamo del metodo  " + "getUid");
			it.doqui.index.ecmengine.dto.Node result = pd.getUid(slot_searchParamsIns, slot_operationContextIns);

			LOGGER.debug("[PAPDGetUidParentFolderLevel1Handler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_nodeFolderLevel1)

			LOGGER.debug(
					"[PAPDGetUidParentFolderLevel1Handler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_nodeFolderLevel1");
			DataSlotHelper.setDataSlotValue("SLOT_nodeFolderLevel1", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error(
					"[PAPDGetUidParentFolderLevel1Handler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ",
					e);
		}
	}

}
