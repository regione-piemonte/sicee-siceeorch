package it.csi.sicee.siceeorch.business.siceeorch.handlers.verificadocumentonewdosign;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1886102029) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [preparaInputParams].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXPreparaInputParamsHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXPreparaInputParamsHandler::getTransformedObject]-START ");
		it.doqui.dosign.dosign.dto.parameter.VerifyParameter outVal = (it.doqui.dosign.dosign.dto.parameter.VerifyParameter) (inputs
				.get(_outputSlotName));

		/// valore degli input slot

		/*PROTECTED REGION ID(R-2096451892) ENABLED START*/
		/// inserire qui la logica di trasformazione
		outVal = new it.doqui.dosign.dosign.dto.parameter.VerifyParameter();
		outVal.setVerificationDate(new java.util.Date());
		outVal.setProfileType(1); // Firma digitale qualificata
		outVal.setVerificationType(0); // NO_CRL_VERIFICATION

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXPreparaInputParamsHandler::getTransformedObject]-END ");
		return outVal;
	}
}
