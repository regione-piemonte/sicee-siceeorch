package it.csi.sicee.siceeorch.business.siceeorch.handlers.getdescrizioneregione;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-35955253) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [getDescrizioneRegioneInput].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXGetDescrizioneRegioneInputHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXGetDescrizioneRegioneInputHandler::getTransformedObject]-START ");
		it.csi.tavt.dto.Regione outVal = (it.csi.tavt.dto.Regione) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [codIstatRegione]
		java.lang.String slot_codIstatRegione = (java.lang.String) inputs.get("SLOT_codIstatRegione");

		/*PROTECTED REGION ID(R-576476684) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_codIstatRegione != null) {
			outVal = new it.csi.tavt.dto.Regione();
			outVal.setIstatRegione(slot_codIstatRegione);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXGetDescrizioneRegioneInputHandler::getTransformedObject]-END ");
		return outVal;
	}
}
