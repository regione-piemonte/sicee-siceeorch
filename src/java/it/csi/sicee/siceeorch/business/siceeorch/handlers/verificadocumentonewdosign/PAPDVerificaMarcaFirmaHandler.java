package it.csi.sicee.siceeorch.business.siceeorch.handlers.verificadocumentonewdosign;

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
 * - servizio [VERIFICA_MARCA_FIRMA]
 * - operation [verifySignAndCert]
 * il servizio verra' richiamato tramite configurazione locale della PD
 * @generated
 */
public class PAPDVerificaMarcaFirmaHandler extends PAPDCallBaseHandler {

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
	 * Esegue la chiamata all'operazione verifySignAndCert del servizio VERIFICA_MARCA_FIRMA
	 * Tramite Porta Delegata
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		LOGGER.debug("[PAPDVerificaMarcaFirmaHandler::eseguiFunctionHandler]-START ");
		try {

			// la porta delegata viene reperita tramite invocazione al servizio
			// di registry
			it.doqui.dosign.dosign.interfacecsi.dosign.DosignInterface pd = (it.doqui.dosign.dosign.interfacecsi.dosign.DosignInterface) ServiceLocator
					.getInstance().getPD(localPDRes);

			/// valore degli input slot

			LOGGER.debug("[PAPDVerificaMarcaFirmaHandler::eseguiFunctionHandler]-binding parametri ");
			// slot: buffer
			it.doqui.dosign.dosign.dto.signature.SignedBuffer slot_buffer = (it.doqui.dosign.dosign.dto.signature.SignedBuffer) DataSlotHelper
					.getDataSlotValue("SLOT_buffer", ps);

			// slot: params
			it.doqui.dosign.dosign.dto.parameter.VerifyParameter slot_params = (it.doqui.dosign.dosign.dto.parameter.VerifyParameter) DataSlotHelper
					.getDataSlotValue("SLOT_params", ps);

			// binding dei parametri e richiamo del servizio 

			LOGGER.debug("[PAPDVerificaMarcaFirmaHandler::eseguiFunctionHandler]-richiamo del metodo  "
					+ "verifySignAndCert");
			it.doqui.dosign.dosign.dto.signature.VerifySignAndCertReport result = pd.verifySignAndCert(slot_buffer,
					slot_params);

			LOGGER.debug("[PAPDVerificaMarcaFirmaHandler::eseguiFunctionHandler]-richiamo ok  ");

			/// inserimento risultato nello slot apposito (SLOT_serviceResult)

			LOGGER.debug(
					"[PAPDVerificaMarcaFirmaHandler::eseguiFunctionHandler]-inserimento del risultato nello slot   "
							+ "SLOT_serviceResult");
			DataSlotHelper.setDataSlotValue("SLOT_serviceResult", result, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);
			LOGGER.error("[PAPDVerificaMarcaFirmaHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}
	}

}
