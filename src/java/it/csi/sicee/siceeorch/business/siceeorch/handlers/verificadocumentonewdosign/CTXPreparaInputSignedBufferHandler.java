package it.csi.sicee.siceeorch.business.siceeorch.handlers.verificadocumentonewdosign;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1830451369) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [preparaInputSignedBuffer].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXPreparaInputSignedBufferHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXPreparaInputSignedBufferHandler::getTransformedObject]-START ");
		it.doqui.dosign.dosign.dto.signature.SignedBuffer outVal = (it.doqui.dosign.dosign.dto.signature.SignedBuffer) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [documento]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_documento = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_documento");

		/*PROTECTED REGION ID(R1447553750) ENABLED START*/
		/// inserire qui la logica di trasformazione
		outVal = new it.doqui.dosign.dosign.dto.signature.SignedBuffer();
		try {
			if (slot_documento != null)
				outVal.setBuffer(slot_documento.getDoc());
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Error e) {
			e.printStackTrace();
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXPreparaInputSignedBufferHandler::getTransformedObject]-END ");
		return outVal;
	}
}
