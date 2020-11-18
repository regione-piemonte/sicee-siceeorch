package it.csi.sicee.siceeorch.business.siceeorch.handlers.findprotocollazione;

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
 * - operation [findProtocollazione]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDFindProtocollazioneHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione findProtocollazione del servizio SICEESRV
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDFindProtocollazioneHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDFindProtocollazioneHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: numCertificatore
			java.lang.String slot_numCertificatore = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_numCertificatore", ps);

			// slot: progrCertificato
			java.lang.String slot_progrCertificato = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_progrCertificato", ps);

			// slot: annoCertificato
			java.lang.String slot_annoCertificato = (java.lang.String) DataSlotHelper
					.getDataSlotValue("SLOT_annoCertificato", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDFindProtocollazioneHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "findProtocollazione");
			it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione result = pd.findProtocollazione(slot_numCertificatore,
					slot_progrCertificato, slot_annoCertificato);

			LOGGER.debug("[PAPDFindProtocollazioneHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_protocollazione)

			LOGGER.debug(
					"[PAPDFindProtocollazioneHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_protocollazione");
			DataSlotHelper.setDataSlotValue("SLOT_protocollazione", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDFindProtocollazioneHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
