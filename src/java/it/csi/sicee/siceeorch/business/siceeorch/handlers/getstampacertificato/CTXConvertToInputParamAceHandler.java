package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificato;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R14800490) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertToInputParamAce].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToInputParamAceHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertToInputParamAceHandler::getTransformedObject]-START ");
		it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce outVal = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [annoCertificato]
		java.lang.String slot_annoCertificato = (java.lang.String) inputs.get("SLOT_annoCertificato");
		// slot [numCertificatore]
		java.lang.String slot_numCertificatore = (java.lang.String) inputs.get("SLOT_numCertificatore");
		// slot [progrCertificato]
		java.lang.String slot_progrCertificato = (java.lang.String) inputs.get("SLOT_progrCertificato");

		/*PROTECTED REGION ID(R996951349) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_annoCertificato != null && slot_numCertificatore != null && slot_progrCertificato != null) {
			outVal = new it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce();
			outVal.setAnno(slot_annoCertificato);
			outVal.setCertificatore(slot_numCertificatore);
			outVal.setNumero(slot_progrCertificato);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToInputParamAceHandler::getTransformedObject]-END ");
		return outVal;
	}
}
