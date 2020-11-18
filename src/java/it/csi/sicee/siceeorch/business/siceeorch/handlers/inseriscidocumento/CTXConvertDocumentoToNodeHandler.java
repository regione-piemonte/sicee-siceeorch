package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-495182606) ENABLED START*/
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
		// slot [folderUid]
		java.lang.String slot_folderUid = (java.lang.String) inputs.get("SLOT_folderUid");
		// slot [folder3Uid]
		java.lang.String slot_folder3Uid = (java.lang.String) inputs.get("SLOT_folder3Uid");
		// slot [nodeFolder3Ins]
		it.doqui.index.ecmengine.dto.Node slot_nodeFolder3Ins = (it.doqui.index.ecmengine.dto.Node) inputs
				.get("SLOT_nodeFolder3Ins");

		/*PROTECTED REGION ID(R-1927622739) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (getLogger(null).isDebugEnabled()) {
			getLogger(null).debug("Info dati: " + slot_folderUid);
			getLogger(null).debug("Info dati: " + slot_folder3Uid);
			getLogger(null).debug("Info dati: " + slot_nodeFolder3Ins);
		}

		outVal = new it.doqui.index.ecmengine.dto.Node();
		if (slot_folderUid != null && !slot_folderUid.equals("")) {
			outVal.setUid(slot_folderUid);
		} else if (slot_folder3Uid != null && !slot_folder3Uid.equals("")) {
			outVal.setUid(slot_folder3Uid);
		} else if (slot_nodeFolder3Ins != null) {
			outVal.setUid(slot_nodeFolder3Ins.getUid());
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentoToNodeHandler::getTransformedObject]-END ");
		return outVal;
	}
}
