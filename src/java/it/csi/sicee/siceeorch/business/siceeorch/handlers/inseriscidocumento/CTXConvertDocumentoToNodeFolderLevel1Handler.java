package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-370361907) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertDocumentoToNodeFolderLevel1].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertDocumentoToNodeFolderLevel1Handler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertDocumentoToNodeFolderLevel1Handler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.Node outVal = (it.doqui.index.ecmengine.dto.Node) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [folder0Uid]
		java.lang.String slot_folder0Uid = (java.lang.String) inputs.get("SLOT_folder0Uid");

		/*PROTECTED REGION ID(R1941818930) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (getLogger(null).isDebugEnabled())
			getLogger(null).debug("UID NODE FOLFER N.0: " + slot_folder0Uid);

		outVal = new it.doqui.index.ecmengine.dto.Node();
		outVal.setUid(slot_folder0Uid);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentoToNodeFolderLevel1Handler::getTransformedObject]-END ");
		return outVal;
	}
}
