package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R576664888) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.Constants;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertDocumentoToOperationContext].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertDocumentoToOperationContextHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertDocumentoToOperationContextHandler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.OperationContext outVal = (it.doqui.index.ecmengine.dto.OperationContext) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [docIns]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_docIns = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_docIns");

		/*PROTECTED REGION ID(R1234878503) ENABLED START*/
		/// inserire qui la logica di trasformazione
		outVal = new it.doqui.index.ecmengine.dto.OperationContext();
		outVal.setFruitore("SICEE");
		outVal.setNomeFisico("Client SICEE");
		outVal.setUsername(Constants.INDEX_TENANT_USERNAME);
		outVal.setPassword(Constants.INDEX_TENANT_PASSWORD);
		outVal.setRepository("primary");
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentoToOperationContextHandler::getTransformedObject]-END ");
		return outVal;
	}
}
