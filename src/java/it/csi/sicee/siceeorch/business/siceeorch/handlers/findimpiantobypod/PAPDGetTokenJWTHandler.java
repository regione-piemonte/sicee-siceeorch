package it.csi.sicee.siceeorch.business.siceeorch.handlers.findimpiantobypod;

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
 * - operation [getParametro]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetTokenJWTHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione getParametro del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetTokenJWTHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetTokenJWTHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: codiceParametroTokenJWT
			java.lang.String slot_codiceParametroTokenJWT = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_codiceParametroTokenJWT", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetTokenJWTHandler::eseguiFunctionHandler]-richiamo del metodo  " + "getParametro");
			java.lang.String result = pd.getParametro(slot_codiceParametroTokenJWT);

			LOGGER.debug("[PAPDGetTokenJWTHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_tokenJWT)

			LOGGER.debug("[PAPDGetTokenJWTHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_tokenJWT");
			DataSlotHelper.setDataSlotValue("SLOT_tokenJWT", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetTokenJWTHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
