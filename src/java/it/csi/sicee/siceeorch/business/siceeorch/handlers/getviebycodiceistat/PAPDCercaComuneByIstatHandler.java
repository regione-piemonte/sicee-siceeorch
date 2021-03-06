package it.csi.sicee.siceeorch.business.siceeorch.handlers.getviebycodiceistat;

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
 * - servizio [TOPELMAMM]
 * - operation [cercaComuneByIstat]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDCercaComuneByIstatHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione cercaComuneByIstat del servizio TOPELMAMM
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDCercaComuneByIstatHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sitad.lmam.interf.LimitiAmministrativiInterface pd = (it.csi.sitad.lmam.interf.LimitiAmministrativiInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDCercaComuneByIstatHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: codiceIstat
			java.lang.String slot_codiceIstat = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_codiceIstat",
					ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDCercaComuneByIstatHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "cercaComuneByIstat");
			it.csi.sitad.lmam.entity.Comune result = pd.cercaComuneByIstat(slot_codiceIstat);

			LOGGER.debug("[PAPDCercaComuneByIstatHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_comune)

			LOGGER.debug(
					"[PAPDCercaComuneByIstatHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_comune");
			DataSlotHelper.setDataSlotValue("SLOT_comune", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDCercaComuneByIstatHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
