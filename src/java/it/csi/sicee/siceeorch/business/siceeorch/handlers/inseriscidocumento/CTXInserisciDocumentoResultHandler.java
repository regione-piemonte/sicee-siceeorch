package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R551428730) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [inserisciDocumentoResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXInserisciDocumentoResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXInserisciDocumentoResultHandler::getTransformedObject]-START ");
		java.lang.String outVal = (java.lang.String) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [nodeUid]
		it.doqui.index.ecmengine.dto.Node slot_nodeUid = (it.doqui.index.ecmengine.dto.Node) inputs.get("SLOT_nodeUid");

		/*PROTECTED REGION ID(R452557605) ENABLED START*/
		/// inserire qui la logica di trasformazione
		outVal = slot_nodeUid.getUid();
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXInserisciDocumentoResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
