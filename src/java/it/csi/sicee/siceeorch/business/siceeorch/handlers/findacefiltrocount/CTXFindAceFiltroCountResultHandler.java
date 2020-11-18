package it.csi.sicee.siceeorch.business.siceeorch.handlers.findacefiltrocount;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-581257246) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findAceFiltroCountResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindAceFiltroCountResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindAceFiltroCountResultHandler::getTransformedObject]-START ");
		java.lang.Integer outVal = (java.lang.Integer) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [countAce]
		java.lang.Integer slot_countAce = (java.lang.Integer) inputs.get("SLOT_countAce");

		/*PROTECTED REGION ID(R-300969283) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (getLogger(null).isDebugEnabled())
			getLogger(null).debug("VALORE RESTITUITO: " + slot_countAce);

		outVal = slot_countAce;

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindAceFiltroCountResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
