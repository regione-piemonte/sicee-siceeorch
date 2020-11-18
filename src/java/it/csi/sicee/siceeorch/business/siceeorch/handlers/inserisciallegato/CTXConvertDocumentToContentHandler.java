package it.csi.sicee.siceeorch.business.siceeorch.handlers.inserisciallegato;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1751846635) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.doqui.index.ecmengine.dto.engine.management.Aspect;
import it.doqui.index.ecmengine.dto.engine.management.Property;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertDocumentToContent].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertDocumentToContentHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertDocumentToContentHandler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.management.Content outVal = (it.doqui.index.ecmengine.dto.engine.management.Content) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [operationContext]
		it.doqui.index.ecmengine.dto.OperationContext slot_operationContext = (it.doqui.index.ecmengine.dto.OperationContext) inputs
				.get("SLOT_operationContext");
		// slot [doc]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_doc = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_doc");

		/*PROTECTED REGION ID(R2065465322) ENABLED START*/
		/// inserire qui la logica di trasformazione

		String contentName = slot_doc.getNome();

		outVal = new it.doqui.index.ecmengine.dto.engine.management.Content();
		outVal.setPrefixedName("cm:" + contentName);
		outVal.setParentAssocTypePrefixedName("cm:contains");
		outVal.setModelPrefixedName("cm:contentmodel");
		outVal.setTypePrefixedName("cm:content");
		outVal.setContentPropertyPrefixedName("cm:content");
		outVal.setMimeType(slot_doc.getMimeType());
		outVal.setEncoding(slot_doc.getEncoding());

		Property[] authorProps = new Property[1];
		authorProps[0] = new Property();
		authorProps[0].setPrefixedName("cm:author");
		authorProps[0].setDataType("text");
		authorProps[0].setMultivalue(false);
		authorProps[0].setValues(new String[]{slot_operationContext.getUsername()});

		Aspect author = new Aspect();
		author.setPrefixedName("cm:author");
		author.setModelPrefixedName("cm:contentmodel");
		author.setProperties(authorProps);

		Property[] titledProps = new Property[2];

		titledProps[0] = new Property();
		titledProps[0].setPrefixedName("cm:title");
		titledProps[0].setDataType("mltext");
		titledProps[0].setMultivalue(false);
		titledProps[0].setValues(new String[]{contentName});

		titledProps[1] = new Property();
		titledProps[1].setPrefixedName("cm:description");
		titledProps[1].setDataType("mltext");
		titledProps[1].setMultivalue(false);
		titledProps[1].setValues(new String[]{"Contenuto aggiunto da client SICEE."});

		Property[] props = new Property[2];
		props[0] = new Property();
		props[0].setPrefixedName("sicee:tipologiaAllegato");
		props[0].setDataType("text");
		props[0].setMultivalue(false);
		props[0].setValues(new String[]{slot_doc.getTipologia()});

		props[1] = new Property();
		props[1].setPrefixedName("sicee:idCertificatore");
		props[1].setDataType("text");
		props[1].setMultivalue(false);
		props[1].setValues(new String[]{slot_doc.getIdCertificatore()});

		Aspect titled = new Aspect();
		titled.setPrefixedName("cm:titled");
		titled.setModelPrefixedName("cm:contentmodel");
		titled.setProperties(titledProps);

		outVal.setProperties(props);
		outVal.setAspects(new Aspect[]{author, titled});
		outVal.setContent(slot_doc.getDoc());

		outVal.setEncryptionInfo(null);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentToContentHandler::getTransformedObject]-END ");
		return outVal;
	}
}
