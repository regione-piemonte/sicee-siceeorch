package it.csi.sicee.siceeorch.business.siceeorch.handlers.ricercadocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1097326622) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [ricercaDocumentoResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXRicercaDocumentoResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXRicercaDocumentoResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Documento outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [resultContentRic]
		it.doqui.index.ecmengine.dto.engine.search.ResultContent slot_resultContentRic = (it.doqui.index.ecmengine.dto.engine.search.ResultContent) inputs
				.get("SLOT_resultContentRic");
		// slot [arrayDoc]
		byte[] slot_arrayDoc = (byte[]) inputs.get("SLOT_arrayDoc");
		// slot [docRic]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_docRic = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_docRic");

		/*PROTECTED REGION ID(R880749245) ENABLED START*/
		/// inserire qui la logica di trasformazione

		outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Documento();
		outVal.setNome(slot_resultContentRic.getPrefixedName().substring(3));
		outVal.setMimeType(slot_resultContentRic.getMimeType());
		outVal.setEncoding(slot_resultContentRic.getEncoding());
		outVal.setUid(slot_docRic.getUid());
		outVal.setDoc(slot_arrayDoc);

		/*ByteArrayInputStream bis = new ByteArrayInputStream(slot_arrayDoc);
		
		if (bis != null) {
			
		
		
		BufferedImage ioBf = null;
		try {
			ioBf = ImageIO.read(bis);
			if (ioBf != null) {
				
			
			getLogger(null).info("uid: " + slot_docRic.getUid());
			long init = System.currentTimeMillis();				
			BufferedImage bufImage = resize2(ioBf, 216, 85);
			long end = System.currentTimeMillis();
			getLogger(null).info("\t time: " + (end - init));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}*/

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXRicercaDocumentoResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
