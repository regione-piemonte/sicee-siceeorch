package it.csi.sicee.siceeorch.business.siceeorch.handlers.cancelladocumento;

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
 * - operation [deleteContent]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDDeleteContentHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione deleteContent del servizio INDEX_MNGMT
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDDeleteContentHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface pd = (it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDDeleteContentHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: nodeCan
			it.doqui.index.ecmengine.dto.Node slot_nodeCan = (it.doqui.index.ecmengine.dto.Node) DataSlotHelper
					.getDataSlotValue("SLOT_nodeCan", ps);

			// slot: operationContextCan
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContextCan = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContextCan", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDDeleteContentHandler::eseguiFunctionHandler]-richiamo del metodo  " + "deleteContent");
			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDDeleteContentHandler::eseguiFunctionHandler]-richiamo del metodo  " + "deleteContent");
			pd.deleteContent(slot_nodeCan, slot_operationContextCan);
			LOGGER.debug("[PAPDDeleteContentHandler::eseguiFunctionHandler]-richiamo ok  ");

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDDeleteContentHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
