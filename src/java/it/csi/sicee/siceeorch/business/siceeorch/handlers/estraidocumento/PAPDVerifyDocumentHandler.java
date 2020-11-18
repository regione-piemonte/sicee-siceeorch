package it.csi.sicee.siceeorch.business.siceeorch.handlers.estraidocumento;

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
 * - servizio [INDEX_SECURITY]
 * - operation [extractDocumentFromEnvelope]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDVerifyDocumentHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione extractDocumentFromEnvelope del servizio INDEX_SECURITY
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDVerifyDocumentHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.security.EcmEngineSecurityInterface pd = (it.doqui.index.ecmengine.interfacecsi.security.EcmEngineSecurityInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDVerifyDocumentHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: node
			it.doqui.index.ecmengine.dto.engine.security.EnvelopedContent slot_node = (it.doqui.index.ecmengine.dto.engine.security.EnvelopedContent) DataSlotHelper
					.getDataSlotValue("SLOT_node", ps);

			// slot: operationContext
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContext = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContext", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDVerifyDocumentHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "extractDocumentFromEnvelope");
			it.doqui.index.ecmengine.dto.engine.security.Document result = pd.extractDocumentFromEnvelope(slot_node,
					slot_operationContext);

			LOGGER.debug("[PAPDVerifyDocumentHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_document)

			LOGGER.debug("[PAPDVerifyDocumentHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_document");
			DataSlotHelper.setDataSlotValue("SLOT_document", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDVerifyDocumentHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
