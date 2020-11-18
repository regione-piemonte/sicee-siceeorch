package it.csi.sicee.siceeorch.business.siceeorch.handlers.startmdptransaction;

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
 * - operation [startTransazione]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDStartTransazioneHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione startTransazione del servizio MDPNEW_CORE
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDStartTransazioneHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.mdp.core.interfacecsi.IMdpCoreCsi pd = (it.csi.mdp.core.interfacecsi.IMdpCoreCsi) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDStartTransazioneHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: attribute
			it.csi.mdp.core.business.dto.TransazioneExtraAttribute[] slot_attribute = (it.csi.mdp.core.business.dto.TransazioneExtraAttribute[]) DataSlotHelper
					.getDataSlotValue("SLOT_attribute", ps);

			// slot: transazione
			it.csi.mdp.core.business.dto.Transazione slot_transazione = (it.csi.mdp.core.business.dto.Transazione) DataSlotHelper
					.getDataSlotValue("SLOT_transazione", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDStartTransazioneHandler::eseguiFunctionHandler]-richiamo del metodo  " + "startTransazione");
			java.lang.String result = pd.startTransazione(slot_transazione, slot_attribute);

			LOGGER.debug("[PAPDStartTransazioneHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_result)

			LOGGER.debug("[PAPDStartTransazioneHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_result");
			DataSlotHelper.setDataSlotValue("SLOT_result", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDStartTransazioneHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
