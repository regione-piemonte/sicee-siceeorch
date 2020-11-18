package it.csi.sicee.siceeorch.business.siceeorch.handlers.findacefiltro;

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
 * - operation [findAceFiltro]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDFindAceFiltroHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione findAceFiltro del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDFindAceFiltroHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDFindAceFiltroHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: inputPd
			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce slot_inputPd = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce) DataSlotHelper
					.getDataSlotValue("SLOT_inputPd", ps);

			// slot: idCertificatore
			java.lang.String slot_idCertificatore = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_idCertificatore", ps);

			// slot: flgPregresso
			java.lang.Boolean slot_flgPregresso = (java.lang.Boolean) DataSlotHelper
					.getDataSlotValue("SLOT_flgPregresso", ps);

			// slot: flgSostituzione
			java.lang.Boolean slot_flgSostituzione = (java.lang.Boolean) DataSlotHelper
					.getDataSlotValue("SLOT_flgSostituzione", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDFindAceFiltroHandler::eseguiFunctionHandler]-richiamo del metodo  " + "findAceFiltro");
			it.csi.sicee.siceesrv.dto.siceesrv.Ace[] result = pd.findAceFiltro(slot_inputPd, slot_idCertificatore,
					slot_flgPregresso, slot_flgSostituzione);

			LOGGER.debug("[PAPDFindAceFiltroHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_ace)

			LOGGER.debug("[PAPDFindAceFiltroHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_ace");
			DataSlotHelper.setDataSlotValue("SLOT_ace", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDFindAceFiltroHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
