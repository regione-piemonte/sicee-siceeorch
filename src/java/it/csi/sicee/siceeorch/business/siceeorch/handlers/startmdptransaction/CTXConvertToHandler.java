package it.csi.sicee.siceeorch.business.siceeorch.handlers.startmdptransaction;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1023699150) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.siceeorch.util.Converter;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertTo].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertToHandler::getTransformedObject]-START ");
		it.csi.mdp.core.business.dto.Transazione outVal = (it.csi.mdp.core.business.dto.Transazione) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [inTransaction]
		it.csi.sicee.siceeorch.dto.siceeorch.Transazione slot_inTransaction = (it.csi.sicee.siceeorch.dto.siceeorch.Transazione) inputs
				.get("SLOT_inTransaction");

		/*PROTECTED REGION ID(R-1131766419) ENABLED START*/
		/// inserire qui la logica di trasformazione
		outVal = Converter.convertTo(slot_inTransaction);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToHandler::getTransformedObject]-END ");
		return outVal;
	}
}
