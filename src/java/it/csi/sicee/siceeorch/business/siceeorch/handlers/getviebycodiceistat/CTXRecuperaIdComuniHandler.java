package it.csi.sicee.siceeorch.business.siceeorch.handlers.getviebycodiceistat;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1993005717) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [recuperaIdComuni].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXRecuperaIdComuniHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXRecuperaIdComuniHandler::getTransformedObject]-START ");
		int[] outVal = (int[]) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [comune]
		it.csi.sitad.lmam.entity.Comune slot_comune = (it.csi.sitad.lmam.entity.Comune) inputs.get("SLOT_comune");

		/*PROTECTED REGION ID(R-1115498924) ENABLED START*/
		/// inserire qui la logica di trasformazione
		getLogger(null)
				.debug("[CTXRecuperaIdComuniHandler::getTransformedObject] - Stampo slot_comune: " + slot_comune);

		if (slot_comune != null) {
			outVal = new int[1];
			outVal[0] = slot_comune.getIdComune();

			getLogger(null).debug("[CTXRecuperaIdComuniHandler::getTransformedObject] - Stampo outVal: " + outVal);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXRecuperaIdComuniHandler::getTransformedObject]-END ");
		return outVal;
	}
}
