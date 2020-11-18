package it.csi.sicee.siceeorch.business.siceeorch.handlers.creaalberatura;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1690771980) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertCodiceToSearchParamsFolderLevel2].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertCodiceToSearchParamsFolderLevel2Handler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertCodiceToSearchParamsFolderLevel2Handler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.search.SearchParams outVal = (it.doqui.index.ecmengine.dto.engine.search.SearchParams) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [anno]
		java.lang.String slot_anno = (java.lang.String) inputs.get("SLOT_anno");
		// slot [idCertificatore]
		java.lang.String slot_idCertificatore = (java.lang.String) inputs.get("SLOT_idCertificatore");

		/*PROTECTED REGION ID(R-336187669) ENABLED START*/
		/// inserire qui la logica di trasformazione

		String anno = slot_anno;
		String certificatore = slot_idCertificatore;

		outVal = new it.doqui.index.ecmengine.dto.engine.search.SearchParams();
		outVal.setLimit(1);
		String path = "/app:company_home/cm:sicee/cm:" + certificatore + "/cm:" + anno;
		outVal.setXPathQuery(path);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertCodiceToSearchParamsFolderLevel2Handler::getTransformedObject]-END ");
		return outVal;
	}
}
