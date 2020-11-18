package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificato;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-317860867) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.dto.siceeorch.Documento;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findUidFotoAceResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindUidFotoAceResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindUidFotoAceResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Documento outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [uidFoto]
		java.lang.String slot_uidFoto = (java.lang.String) inputs.get("SLOT_uidFoto");

		/*PROTECTED REGION ID(R-725616126) ENABLED START*/
		/// inserire qui la logica di trasformazione
		//Documento doc = new Documento();
		if (outVal == null) {
			outVal = new Documento();
		}

		outVal.setUid(slot_uidFoto);

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindUidFotoAceResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
