package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmimetypeinfo;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-969957844) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [createResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXCreateResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXCreateResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo outVal = (it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [fileFormatInfo]
		it.doqui.index.ecmengine.dto.engine.management.FileFormatInfo[] slot_fileFormatInfo = (it.doqui.index.ecmengine.dto.engine.management.FileFormatInfo[]) inputs
				.get("SLOT_fileFormatInfo");

		/*PROTECTED REGION ID(R534214067) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_fileFormatInfo != null && slot_fileFormatInfo.length > 0) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo();
			outVal.setMimeType(slot_fileFormatInfo[0].getMimeType());
			outVal.setDataIdentificazione(slot_fileFormatInfo[0].getIdentificationDate());
			outVal.setDescrizione(slot_fileFormatInfo[0].getDescription());
			outVal.setFormatoVersione(slot_fileFormatInfo[0].getFormatVersion());
			outVal.setTipoCodice(slot_fileFormatInfo[0].getTypeCode());
			outVal.setTipoDescrizione(slot_fileFormatInfo[0].getTypeDescription());
			outVal.setWarning(slot_fileFormatInfo[0].getWarning());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXCreateResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
