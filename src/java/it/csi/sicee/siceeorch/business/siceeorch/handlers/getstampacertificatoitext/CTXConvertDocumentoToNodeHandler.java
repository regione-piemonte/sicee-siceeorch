package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificatoitext;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R969898440) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertDocumentoToNode].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertDocumentoToNodeHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertDocumentoToNodeHandler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.Node outVal = (it.doqui.index.ecmengine.dto.Node) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [docRic]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_docRic = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_docRic");

		/*PROTECTED REGION ID(R540216727) ENABLED START*/
		/// inserire qui la logica di trasformazione

		//getLogger(null).debug("Stampo slot_docRic: " + slot_docRic);

		outVal = new it.doqui.index.ecmengine.dto.Node();
		outVal.setUid(slot_docRic.getUid());
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentoToNodeHandler::getTransformedObject]-END ");
		return outVal;
	}
}
