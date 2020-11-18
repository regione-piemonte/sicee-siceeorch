package it.csi.sicee.siceeorch.business.siceeorch.handlers.findcertificatore;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-56099764) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.Converter;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findCertificatoriResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindCertificatoriResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindCertificatoriResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Certificatore outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Certificatore) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [certificatore]
		it.csi.sicee.siceesrv.dto.siceesrv.Certificatore slot_certificatore = (it.csi.sicee.siceesrv.dto.siceesrv.Certificatore) inputs
				.get("SLOT_certificatore");

		/*PROTECTED REGION ID(R-1200956525) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_certificatore != null) {
			outVal = Converter.convertTo(slot_certificatore);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindCertificatoriResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
