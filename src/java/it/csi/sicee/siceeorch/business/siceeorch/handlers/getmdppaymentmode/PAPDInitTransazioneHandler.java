package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdppaymentmode;

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
 * - servizio [MDPNEW_CORE]
 * - operation [initTransazione]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDInitTransazioneHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione initTransazione del servizio MDPNEW_CORE
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDInitTransazioneHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.mdp.core.interfacecsi.IMdpCoreCsi pd = (it.csi.mdp.core.interfacecsi.IMdpCoreCsi) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDInitTransazioneHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: inApplicationId
			java.lang.String slot_inApplicationId = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_inApplicationId", ps);

			// slot: basketId
			java.lang.String slot_basketId = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_basketId", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDInitTransazioneHandler::eseguiFunctionHandler]-richiamo del metodo  " + "initTransazione");
			it.csi.mdp.core.business.dto.Transazione result = pd.initTransazione(slot_inApplicationId, slot_basketId);

			LOGGER.debug("[PAPDInitTransazioneHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_transazione)

			LOGGER.debug("[PAPDInitTransazioneHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_transazione");
			DataSlotHelper.setDataSlotValue("SLOT_transazione", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDInitTransazioneHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
