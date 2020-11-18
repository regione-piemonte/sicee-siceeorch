package it.csi.sicee.siceeorch.business.siceeorch.handlers.getdescrizioneprovincia;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-41034264) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [getDescrizioneProvinciaResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXGetDescrizioneProvinciaResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXGetDescrizioneProvinciaResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Provincia outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Provincia) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [provincia]
		it.csi.tavt.dto.Provincia slot_provincia = (it.csi.tavt.dto.Provincia) inputs.get("SLOT_provincia");

		/*PROTECTED REGION ID(R-733926025) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_provincia != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Provincia();
			outVal.setCod(slot_provincia.getIstatProvincia());
			outVal.setNome(slot_provincia.getDescProvincia());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXGetDescrizioneProvinciaResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
