package it.csi.sicee.siceeorch.business.siceeorch.handlers.insertlogaccesso;

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
 * - operation [insertLogAccesso]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDInsertLogAccessoHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione insertLogAccesso del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDInsertLogAccessoHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDInsertLogAccessoHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: codiceFiscale
			java.lang.String slot_codiceFiscale = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_codiceFiscale", ps);

			// slot: nome
			java.lang.String slot_nome = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_nome", ps);

			// slot: cognome
			java.lang.String slot_cognome = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_cognome", ps);

			// slot: ruolo
			java.lang.String slot_ruolo = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_ruolo", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDInsertLogAccessoHandler::eseguiFunctionHandler]-richiamo del metodo  " + "insertLogAccesso");
			// binding dei parametri e richiamo del servizio 

			LOGGER.debug(
					"[PAPDInsertLogAccessoHandler::eseguiFunctionHandler]-richiamo del metodo  " + "insertLogAccesso");
			pd.insertLogAccesso(slot_codiceFiscale, slot_nome, slot_cognome, slot_ruolo);
			LOGGER.debug("[PAPDInsertLogAccessoHandler::eseguiFunctionHandler]-richiamo ok  ");

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDInsertLogAccessoHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
