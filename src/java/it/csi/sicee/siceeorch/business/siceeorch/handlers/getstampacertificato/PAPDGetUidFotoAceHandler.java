package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificato;

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
 * - operation [findUidFotoAce]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDGetUidFotoAceHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione findUidFotoAce del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDGetUidFotoAceHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDGetUidFotoAceHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: filtroSrv
			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce slot_filtroSrv = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce) DataSlotHelper
					.getDataSlotValue("SLOT_filtroSrv", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDGetUidFotoAceHandler::eseguiFunctionHandler]-richiamo del metodo  " + "findUidFotoAce");
			java.lang.String result = pd.findUidFotoAce(slot_filtroSrv);

			LOGGER.debug("[PAPDGetUidFotoAceHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_uidFoto)

			LOGGER.debug("[PAPDGetUidFotoAceHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_uidFoto");
			DataSlotHelper.setDataSlotValue("SLOT_uidFoto", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDGetUidFotoAceHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
