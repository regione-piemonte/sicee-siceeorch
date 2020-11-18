package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewtransazione;

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
 * - servizio [SICEESRV]
 * - operation [getParametroMdp]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetApplicationIdHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione getParametroMdp del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetApplicationIdHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetApplicationIdHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: codApplicationId
			java.lang.String slot_codApplicationId = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_codApplicationId", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDGetApplicationIdHandler::eseguiFunctionHandler]-richiamo del metodo  " + "getParametroMdp");
			java.lang.String result = pd.getParametroMdp(slot_codApplicationId);

			LOGGER.debug("[PAPDGetApplicationIdHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_valueApplicationId)

			LOGGER.debug("[PAPDGetApplicationIdHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_valueApplicationId");
			DataSlotHelper.setDataSlotValue("SLOT_valueApplicationId", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetApplicationIdHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
