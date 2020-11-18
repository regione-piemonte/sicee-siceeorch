package it.csi.sicee.siceeorch.business.siceeorch.handlers.ricercadocumento;

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
 * - operation [getContentMetadata]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetContentMetadataHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione getContentMetadata del servizio INDEX_MNGMT
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetContentMetadataHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface pd = (it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetContentMetadataHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: nodeRic
			it.doqui.index.ecmengine.dto.Node slot_nodeRic = (it.doqui.index.ecmengine.dto.Node) DataSlotHelper
					.getDataSlotValue("SLOT_nodeRic", ps);

			// slot: operationContextRic
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContextRic = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContextRic", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetContentMetadataHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "getContentMetadata");
			it.doqui.index.ecmengine.dto.engine.search.ResultContent result = pd.getContentMetadata(slot_nodeRic,
					slot_operationContextRic);

			LOGGER.debug("[PAPDGetContentMetadataHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_resultContentRic)

			LOGGER.debug(
					"[PAPDGetContentMetadataHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_resultContentRic");
			DataSlotHelper.setDataSlotValue("SLOT_resultContentRic", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetContentMetadataHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
