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
 * - servizio [INDEX_SEARCH]
 * - operation [getUid]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetUidHandler extends PAPDCallBaseHandler {

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

		LOGGER.debug("[PAPDGetUidHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.search.EcmEngineSearchInterface pd = (it.doqui.index.ecmengine.interfacecsi.search.EcmEngineSearchInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetUidHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: searchParamsDoc
			it.doqui.index.ecmengine.dto.engine.search.SearchParams slot_searchParamsDoc = (it.doqui.index.ecmengine.dto.engine.search.SearchParams) DataSlotHelper
					.getDataSlotValue("SLOT_searchParamsDoc", ps);

			// slot: operationContext
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContext = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContext", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetUidHandler::eseguiFunctionHandler]-richiamo del metodo  " + "getUid");
			it.doqui.index.ecmengine.dto.Node result = pd.getUid(slot_searchParamsDoc, slot_operationContext);

			LOGGER.debug("[PAPDGetUidHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_uid)

			LOGGER.debug(
					"[PAPDGetUidHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   " + "SLOT_uid");
			DataSlotHelper.setDataSlotValue("SLOT_uid", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetUidHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
