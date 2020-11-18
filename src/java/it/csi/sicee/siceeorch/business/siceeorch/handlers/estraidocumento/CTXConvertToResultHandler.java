package it.csi.sicee.siceeorch.business.siceeorch.handlers.estraidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R344787446) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
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
		it.csi.sicee.siceeorch.dto.siceeorch.Documento outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [document]
		it.doqui.index.ecmengine.dto.engine.security.Document slot_document = (it.doqui.index.ecmengine.dto.engine.security.Document) inputs
				.get("SLOT_document");

		/*PROTECTED REGION ID(R-1658354903) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_document != null) {

			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Documento();

			if (slot_document.getBuffer() != null && slot_document.getBuffer().length > 0)
				outVal.setDoc(slot_document.getBuffer());
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
