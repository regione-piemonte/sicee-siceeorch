package it.csi.sicee.siceeorch.business.siceeorch.handlers.inserisciallegato;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1795798641) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [createDocSearchParams].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXCreateDocSearchParamsHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXCreateDocSearchParamsHandler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.search.SearchParams outVal = (it.doqui.index.ecmengine.dto.engine.search.SearchParams) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [doc]
		it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_doc = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) inputs
				.get("SLOT_doc");

		/*PROTECTED REGION ID(R373319182) ENABLED START*/
		/// inserire qui la logica di trasformazione
		String matricola = slot_doc.getMatricola();

		outVal = new it.doqui.index.ecmengine.dto.engine.search.SearchParams();
		outVal.setLimit(1);
		String path = "/app:company_home/cm:sicee/cm:" + matricola + "/cm:doc";
		outVal.setXPathQuery(path);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXCreateDocSearchParamsHandler::getTransformedObject]-END ");
		return outVal;
	}
}
