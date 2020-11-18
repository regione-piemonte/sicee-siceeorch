package it.csi.sicee.siceeorch.business.siceeorch.handlers.creaalberatura;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1009659784) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.doqui.index.ecmengine.dto.engine.management.Property;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertCodiceToContentFolderLevel3].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertCodiceToContentFolderLevel3Handler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertCodiceToContentFolderLevel3Handler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.management.Content outVal = (it.doqui.index.ecmengine.dto.engine.management.Content) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [progressivo]
		java.lang.String slot_progressivo = (java.lang.String) inputs.get("SLOT_progressivo");

		/*PROTECTED REGION ID(R-696546073) ENABLED START*/
		/// inserire qui la logica di trasformazione

		String name = slot_progressivo;

		outVal = new it.doqui.index.ecmengine.dto.engine.management.Content();
		outVal.setPrefixedName("cm:" + name);
		outVal.setParentAssocTypePrefixedName("cm:contains");
		outVal.setModelPrefixedName("cm:contentmodel");
		outVal.setTypePrefixedName("cm:folder");

		Property[] props = new Property[1];
		props[0] = new Property();
		props[0].setPrefixedName("cm:name");
		props[0].setDataType("text");
		props[0].setMultivalue(false);
		props[0].setValues(new String[]{name});

		outVal.setProperties(props);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertCodiceToContentFolderLevel3Handler::getTransformedObject]-END ");
		return outVal;
	}
}
