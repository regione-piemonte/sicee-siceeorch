package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmimetypeinfo;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R658262169) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [createFileInfo].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXCreateFileInfoHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXCreateFileInfoHandler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.management.FileInfo outVal = (it.doqui.index.ecmengine.dto.engine.management.FileInfo) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [doc]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_doc = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_doc");

		/*PROTECTED REGION ID(R-530573082) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_doc != null) {
			outVal = new it.doqui.index.ecmengine.dto.engine.management.FileInfo();
			//			if (GenericUtil.isNullOrEmpty(slot_doc.getNome())) {
			//				
			//			}
			//			if (GenericUtil.isNullOrEmpty(slot_doc.getDoc())) {
			//				
			//			}
			outVal.setName(slot_doc.getNome());
			outVal.setContents(slot_doc.getDoc());
			outVal.setStore(false);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXCreateFileInfoHandler::getTransformedObject]-END ");
		return outVal;
	}
}
