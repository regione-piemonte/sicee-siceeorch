package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-957167921) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertDocumentoToNodeFolderLevel3].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertDocumentoToNodeFolderLevel3Handler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertDocumentoToNodeFolderLevel3Handler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.Node outVal = (it.doqui.index.ecmengine.dto.Node) (inputs.get(_outputSlotName));

		/// valore degli input slot
		// slot [folder2Uid]
		java.lang.String slot_folder2Uid = (java.lang.String) inputs.get("SLOT_folder2Uid");
		// slot [nodeFolder2Ins]
		it.doqui.index.ecmengine.dto.Node slot_nodeFolder2Ins = (it.doqui.index.ecmengine.dto.Node) inputs
				.get("SLOT_nodeFolder2Ins");

		/*PROTECTED REGION ID(R930701680) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (getLogger(null).isDebugEnabled())
			getLogger(null).debug("UID NODE FOLFER N.2: " + slot_folder2Uid);

		outVal = new it.doqui.index.ecmengine.dto.Node();
		if (slot_folder2Uid != null && !"".equals(slot_folder2Uid)) {
			outVal.setUid(slot_folder2Uid);
		} else if (slot_nodeFolder2Ins != null) {
			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("UID NODE FOLFER N.2: " + slot_nodeFolder2Ins.getUid());

			outVal.setUid(slot_nodeFolder2Ins.getUid());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentoToNodeFolderLevel3Handler::getTransformedObject]-END ");
		return outVal;
	}
}
