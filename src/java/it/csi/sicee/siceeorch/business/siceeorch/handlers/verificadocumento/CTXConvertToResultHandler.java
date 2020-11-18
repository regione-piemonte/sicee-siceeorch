package it.csi.sicee.siceeorch.business.siceeorch.handlers.verificadocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-887281431) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import java.util.ArrayList;
import it.csi.sicee.siceeorch.business.util.Constants;
import it.csi.sicee.siceeorch.business.util.GenericUtil;

/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertToResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToResultHandler extends CustomTransformBaseHandler {

	/**
	 * il prefisso dei logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * il logger utilizzato dall'handler
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * Logica effettiva di trasformazione degli slot di input nel valore da inseirire
	 * nello slot di output.
	 * La logica e' codificata in java.
	 * @param inputs mappa contenente gli input (nome dello slot e valore)
	 * @return l'oggetto risultante dalla trasformazione degli input e che dovra' essere
	 *         inserito nello sloti di output 
	 */
	public Object getTransformedObject(Map<String, Object> inputs) {
		getLogger(null).debug("[CTXConvertToResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport outVal = (it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [result]
		it.doqui.index.ecmengine.dto.engine.security.VerifyReport slot_result = (it.doqui.index.ecmengine.dto.engine.security.VerifyReport) inputs
				.get("SLOT_result");

		/*PROTECTED REGION ID(R-1197784426) ENABLED START*/
		// / inserire qui la logica di trasformazione
		if (slot_result != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport();
			Integer[] errorCodes = null;
			ArrayList<Integer> codes = new ArrayList<Integer>();

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null).debug("getConformitaParametriInput: " + slot_result.getConformitaParametriInput());
				getLogger(null).debug("getFormatoFirma: " + slot_result.getFormatoFirma());
				getLogger(null).debug("getTipoFirma: " + slot_result.getTipoFirma());
				getLogger(null).debug("getNumCertificatiFirma: " + slot_result.getNumCertificatiFirma());
				getLogger(null).debug("getNumCertificatiMarca: " + slot_result.getNumCertificatiMarca());
			}

			if (slot_result.getConformitaParametriInput() == 0) {
				codes.add(Constants.ERROR_CODE91);
			}
			if (slot_result.getFormatoFirma() != 1) {
				codes.add(Constants.ERROR_CODE92);
			}
			if (slot_result.getTipoFirma() != 0) {
				//codes.add(Constant.ERROR_CODE93);
			}
			/*if (slot_result.getNumCertificatiFirma() != 1) {
				 codes.add(Constant.ERROR_CODE94);
			}*/
			/*if (slot_result.getNumCertificatiMarca() != 0) {
				 codes.add(Constant.ERROR_CODE95);
			}*/
			errorCodes = new Integer[codes.size()];
			errorCodes = codes.toArray(errorCodes);
			outVal.setErrorCode(errorCodes);
			outVal.setEsito(codes.isEmpty());
			outVal.setConformitaParametriInput(slot_result.getConformitaParametriInput());
			outVal.setFormatoFirma(slot_result.getFormatoFirma());
			outVal.setTipoFirma(slot_result.getTipoFirma());
			outVal.setNumeroCertificatiFirma(slot_result.getNumCertificatiFirma());
			outVal.setNumeroMarche(slot_result.getNumCertificatiMarca());

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("Esito Iniziale: " + outVal.getEsito());

			// BEPPE - verifica - inizio

			ArrayList<it.csi.sicee.siceeorch.dto.siceeorch.Signature> signatureOrch = new ArrayList<it.csi.sicee.siceeorch.dto.siceeorch.Signature>();
			signatureOrch = GenericUtil.recuperaSignatureByVerifyReport(slot_result, signatureOrch);

			it.csi.sicee.siceeorch.dto.siceeorch.Signature[] signatures = new it.csi.sicee.siceeorch.dto.siceeorch.Signature[signatureOrch
					.size()];
			signatureOrch.toArray(signatures);

			outVal.setSignatures(signatures);
			//outVal.setSignatures((it.csi.sicee.siceeorch.dto.siceeorch.Signature[])signatureOrch.toArray());

			for (int i = 0; i < signatureOrch.size(); i++) {

				int codError = signatureOrch.get(i).getCodiceErrore();

				if (getLogger(null).isDebugEnabled())
					getLogger(null).debug("Signature " + i + " error code: " + codError);

				if (codError != 0 && codError != 6 && outVal.getEsito()) {
					outVal.setEsito(false);
				}
			}

			if (getLogger(null).isDebugEnabled())
				GenericUtil.stampaSignatureByList(outVal.getSignatures());

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("Esito Finale: " + outVal.getEsito());

		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
