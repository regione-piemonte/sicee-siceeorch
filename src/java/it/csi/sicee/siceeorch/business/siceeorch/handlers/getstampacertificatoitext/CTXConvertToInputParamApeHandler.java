package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificatoitext;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1613686321) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertToInputParamApe].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToInputParamApeHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertToInputParamApeHandler::getTransformedObject]-START ");
		it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce outVal = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [annoCertificato]
		java.lang.String slot_annoCertificato = (java.lang.String) inputs.get("SLOT_annoCertificato");
		// slot [numCertificatore]
		java.lang.String slot_numCertificatore = (java.lang.String) inputs.get("SLOT_numCertificatore");
		// slot [progrCertificato]
		java.lang.String slot_progrCertificato = (java.lang.String) inputs.get("SLOT_progrCertificato");

		/*PROTECTED REGION ID(R2053467760) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (getLogger(null).isDebugEnabled()) {
			getLogger(null).debug("Stampo slot_annoCertificato: " + slot_annoCertificato);
			getLogger(null).debug("Stampo slot_numCertificatore: " + slot_numCertificatore);
			getLogger(null).debug("Stampo slot_progrCertificato: " + slot_progrCertificato);
		}

		if (slot_annoCertificato != null && slot_numCertificatore != null && slot_progrCertificato != null) {
			outVal = new it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce();
			outVal.setAnno(slot_annoCertificato);
			outVal.setCertificatore(slot_numCertificatore);
			outVal.setNumero(slot_progrCertificato);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToInputParamApeHandler::getTransformedObject]-END ");
		return outVal;
	}
}
