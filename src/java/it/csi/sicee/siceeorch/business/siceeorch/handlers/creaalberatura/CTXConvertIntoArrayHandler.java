package it.csi.sicee.siceeorch.business.siceeorch.handlers.creaalberatura;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1682125257) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertIntoArray].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertIntoArrayHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertIntoArrayHandler::getTransformedObject]-START ");
		java.lang.String[] outVal = (java.lang.String[]) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [init]
		java.lang.Integer slot_init = (java.lang.Integer) inputs.get("SLOT_init");
		// slot [end]
		java.lang.Integer slot_end = (java.lang.Integer) inputs.get("SLOT_end");

		/*PROTECTED REGION ID(R1144411574) ENABLED START*/
		/// inserire qui la logica di trasformazione
		int size = slot_end;
		outVal = new String[size];
		for (int i = 0; i < size; i++) {
			String init = "" + (slot_init + i);
			outVal[i] = "0000".substring(0, 4 - init.length()) + init;
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertIntoArrayHandler::getTransformedObject]-END ");
		return outVal;
	}
}
