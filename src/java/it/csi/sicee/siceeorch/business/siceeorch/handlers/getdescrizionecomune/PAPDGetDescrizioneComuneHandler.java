package it.csi.sicee.siceeorch.business.siceeorch.handlers.getdescrizionecomune;

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
 * - servizio [TAVT]
 * - operation [selComuneByCodIstat]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetDescrizioneComuneHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione selComuneByCodIstat del servizio TAVT
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetDescrizioneComuneHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.tavt.interf.TavtInterface pd = (it.csi.tavt.interf.TavtInterface) ServiceLocator.getInstance()
					.getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetDescrizioneComuneHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: codIstatComune
			java.lang.String slot_codIstatComune = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_codIstatComune", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetDescrizioneComuneHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "selComuneByCodIstat");
			it.csi.tavt.dto.Comune result = pd.selComuneByCodIstat(slot_codIstatComune);

			LOGGER.debug("[PAPDGetDescrizioneComuneHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_comune)

			LOGGER.debug(
					"[PAPDGetDescrizioneComuneHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_comune");
			DataSlotHelper.setDataSlotValue("SLOT_comune", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetDescrizioneComuneHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
