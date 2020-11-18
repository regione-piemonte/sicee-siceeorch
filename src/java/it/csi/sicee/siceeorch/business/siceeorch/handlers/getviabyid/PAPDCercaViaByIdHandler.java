package it.csi.sicee.siceeorch.business.siceeorch.handlers.getviabyid;

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
 * - servizio [TOPETOPO]
 * - operation [cercaViaById]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDCercaViaByIdHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione cercaViaById del servizio TOPETOPO
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDCercaViaByIdHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sitad.tpnm.interf.ToponomasticaInterface pd = (it.csi.sitad.tpnm.interf.ToponomasticaInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDCercaViaByIdHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: idVia
			java.lang.Integer slot_idVia = (java.lang.Integer) DataSlotHelper.getDataSlotValue("SLOT_idVia", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDCercaViaByIdHandler::eseguiFunctionHandler]-richiamo del metodo  " + "cercaViaById");
			it.csi.sitad.tpnm.entity.Via result = pd.cercaViaById(slot_idVia);

			LOGGER.debug("[PAPDCercaViaByIdHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_viaSitad)

			LOGGER.debug("[PAPDCercaViaByIdHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_viaSitad");
			DataSlotHelper.setDataSlotValue("SLOT_viaSitad", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDCercaViaByIdHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
