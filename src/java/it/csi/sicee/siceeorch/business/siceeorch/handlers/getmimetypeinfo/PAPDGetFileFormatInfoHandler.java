package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmimetypeinfo;

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
 * - operation [getFileFormatInfo]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetFileFormatInfoHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione getFileFormatInfo del servizio INDEX_MNGMT
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetFileFormatInfoHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface pd = (it.doqui.index.ecmengine.interfacecsi.management.EcmEngineManagementInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetFileFormatInfoHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: fileInfo
			it.doqui.index.ecmengine.dto.engine.management.FileInfo slot_fileInfo = (it.doqui.index.ecmengine.dto.engine.management.FileInfo) DataSlotHelper
					.getDataSlotValue("SLOT_fileInfo", ps);

			// slot: operationContext
			it.doqui.index.ecmengine.dto.OperationContext slot_operationContext = (it.doqui.index.ecmengine.dto.OperationContext) DataSlotHelper
					.getDataSlotValue("SLOT_operationContext", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetFileFormatInfoHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "getFileFormatInfo");
			it.doqui.index.ecmengine.dto.engine.management.FileFormatInfo[] result = pd.getFileFormatInfo(slot_fileInfo,
					slot_operationContext);

			LOGGER.debug("[PAPDGetFileFormatInfoHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_fileFormatInfo)

			LOGGER.debug("[PAPDGetFileFormatInfoHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_fileFormatInfo");
			DataSlotHelper.setDataSlotValue("SLOT_fileFormatInfo", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetFileFormatInfoHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
