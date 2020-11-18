package it.csi.sicee.siceeorch.business.siceeorch.handlers.getdettaglioace;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1225643176) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.Converter;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [getDettaglioAceResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXGetDettaglioAceResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXGetDettaglioAceResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [array]
		it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] slot_array = (it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[]) inputs
				.get("SLOT_array");

		/*PROTECTED REGION ID(R-121631049) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (getLogger(null).isDebugEnabled())
			getLogger(null).debug("TRASFORMO - ricevuto: slot_array: " + slot_array);

		if (slot_array != null) {
			int size = slot_array.length;
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[size];
			for (int i = 0; i < size; i++) {

				outVal[i] = Converter.convertTo(slot_array[i]);
			}

		}

		if (getLogger(null).isDebugEnabled())
			getLogger(null).debug("TRASFORMO - ricevuto: outVal: " + outVal);

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXGetDettaglioAceResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
