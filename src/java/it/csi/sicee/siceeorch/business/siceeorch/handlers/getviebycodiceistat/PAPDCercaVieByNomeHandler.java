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
 * - servizio [TOPETOPO]
 * - operation [cercaVieByNome]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDCercaVieByNomeHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione cercaVieByNome del servizio TOPETOPO
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDCercaVieByNomeHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sitad.tpnm.interf.ToponomasticaInterface pd = (it.csi.sitad.tpnm.interf.ToponomasticaInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDCercaVieByNomeHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: modalSearch
			java.lang.Integer slot_modalSearch = (java.lang.Integer) DataSlotHelper.getDataSlotValue("SLOT_modalSearch",
					ps);

			// slot: ufficiali
			java.lang.Boolean slot_ufficiali = (java.lang.Boolean) DataSlotHelper.getDataSlotValue("SLOT_ufficiali",
					ps);

			// slot: stato
			java.lang.String slot_stato = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_stato", ps);

			// slot: order
			java.lang.Integer slot_order = (java.lang.Integer) DataSlotHelper.getDataSlotValue("SLOT_order", ps);

			// slot: descrizioneVia
			java.lang.String slot_descrizioneVia = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_descrizioneVia", ps);

			// slot: comuni
			int[] slot_comuni = (int[]) DataSlotHelper.getDataSlotValue("SLOT_comuni", ps);

			// slot: localita
			int[] slot_localita = (int[]) DataSlotHelper.getDataSlotValue("SLOT_localita", ps);

			// slot: province
			int[] slot_province = (int[]) DataSlotHelper.getDataSlotValue("SLOT_province", ps);

			// slot: regioni
			int[] slot_regioni = (int[]) DataSlotHelper.getDataSlotValue("SLOT_regioni", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDCercaVieByNomeHandler::eseguiFunctionHandler]-richiamo del metodo  " + "cercaVieByNome");
			it.csi.sitad.tpnm.entity.Via[] result = pd.cercaVieByNome(slot_descrizioneVia, slot_comuni, slot_localita,
					slot_province, slot_regioni, slot_modalSearch, slot_ufficiali, slot_stato, slot_order);

			LOGGER.debug("[PAPDCercaVieByNomeHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_vie)

			LOGGER.debug("[PAPDCercaVieByNomeHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
					+ "SLOT_vie");
			DataSlotHelper.setDataSlotValue("SLOT_vie", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDCercaVieByNomeHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
					+ " nell'apposito slot  ", e);
		}
	}

}
