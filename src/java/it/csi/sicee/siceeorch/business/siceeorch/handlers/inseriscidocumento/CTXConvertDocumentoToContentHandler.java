package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-773152843) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.doqui.index.ecmengine.dto.engine.management.Aspect;
import it.doqui.index.ecmengine.dto.engine.management.Property;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertDocumentoToContent].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertDocumentoToContentHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertDocumentoToContentHandler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.management.Content outVal = (it.doqui.index.ecmengine.dto.engine.management.Content) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [docIns]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_docIns = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_docIns");
		// slot [operationContextIns]
		it.doqui.index.ecmengine.dto.OperationContext slot_operationContextIns = (it.doqui.index.ecmengine.dto.OperationContext) inputs
				.get("SLOT_operationContextIns");

		/*PROTECTED REGION ID(R-1954765494) ENABLED START*/
		/// inserire qui la logica di trasformazione

		String contentName = slot_docIns.getNome();

		outVal = new it.doqui.index.ecmengine.dto.engine.management.Content();
		outVal.setPrefixedName("cm:" + contentName);
		outVal.setParentAssocTypePrefixedName("cm:contains");
		outVal.setModelPrefixedName("cm:contentmodel");
		outVal.setTypePrefixedName("cm:content");
		outVal.setContentPropertyPrefixedName("cm:content");
		outVal.setMimeType(slot_docIns.getMimeType());
		outVal.setEncoding(slot_docIns.getEncoding());

		Property[] props = new Property[7];
		props[0] = new Property();
		props[0].setPrefixedName("sicee:comune");
		props[0].setDataType("text");
		props[0].setMultivalue(false);
		props[0].setValues(new String[]{slot_docIns.getComune()});

		props[1] = new Property();
		props[1].setPrefixedName("sicee:classeEnergetica");
		props[1].setDataType("text");
		props[1].setMultivalue(false);
		props[1].setValues(new String[]{slot_docIns.getClasseEnergetica()});

		props[2] = new Property();
		props[2].setPrefixedName("sicee:destinazioneUso");
		props[2].setDataType("text");
		props[2].setMultivalue(false);
		props[2].setValues(new String[]{slot_docIns.getDestinazione()});

		props[3] = new Property();
		props[3].setPrefixedName("sicee:tipologiaAllegato");
		props[3].setDataType("text");
		props[3].setMultivalue(false);
		props[3].setValues(new String[]{slot_docIns.getTipologia()});

		props[4] = new Property();
		props[4].setPrefixedName("sicee:idCertificatore");
		props[4].setDataType("text");
		props[4].setMultivalue(false);
		props[4].setValues(new String[]{slot_docIns.getIdCertificatore()});

		props[5] = new Property();
		props[5].setPrefixedName("sicee:progrCertificato");
		props[5].setDataType("text");
		props[5].setMultivalue(false);
		props[5].setValues(new String[]{slot_docIns.getProgrCertificato()});

		props[6] = new Property();
		props[6].setPrefixedName("sicee:annoCertificato");
		props[6].setDataType("text");
		props[6].setMultivalue(false);
		props[6].setValues(new String[]{slot_docIns.getAnnoCertificato()});

		Property[] authorProps = new Property[1];
		authorProps[0] = new Property();
		authorProps[0].setPrefixedName("cm:author");
		authorProps[0].setDataType("text");
		authorProps[0].setMultivalue(false);
		authorProps[0].setValues(new String[]{slot_operationContextIns.getUsername()});

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

		Aspect titled = new Aspect();
		titled.setPrefixedName("cm:titled");
		titled.setModelPrefixedName("cm:contentmodel");
		titled.setProperties(titledProps);

		outVal.setProperties(props);
		outVal.setAspects(new Aspect[]{author, titled});
		outVal.setContent(slot_docIns.getDoc());

		outVal.setEncryptionInfo(null);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertDocumentoToContentHandler::getTransformedObject]-END ");
		return outVal;
	}
}
