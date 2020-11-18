package it.csi.sicee.siceeorch.business.siceeorch.handlers.creaalberatura;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1397368973) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertCodiceToSearchParamsFolderLevel1].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertCodiceToSearchParamsFolderLevel1Handler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertCodiceToSearchParamsFolderLevel1Handler::getTransformedObject]-START ");
		it.doqui.index.ecmengine.dto.engine.search.SearchParams outVal = (it.doqui.index.ecmengine.dto.engine.search.SearchParams) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [idCertificatore]
		java.lang.String slot_idCertificatore = (java.lang.String) inputs.get("SLOT_idCertificatore");

		/*PROTECTED REGION ID(R169370956) ENABLED START*/
		/// inserire qui la logica di trasformazione
		String certificatore = slot_idCertificatore;

		outVal = new it.doqui.index.ecmengine.dto.engine.search.SearchParams();
		outVal.setLimit(1);
		String path = "/app:company_home/cm:sicee/cm:" + certificatore;
		outVal.setXPathQuery(path);
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertCodiceToSearchParamsFolderLevel1Handler::getTransformedObject]-END ");
		return outVal;
	}
}
