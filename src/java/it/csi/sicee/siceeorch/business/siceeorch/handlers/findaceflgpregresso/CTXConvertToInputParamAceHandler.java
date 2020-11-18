package it.csi.sicee.siceeorch.business.siceeorch.handlers.findaceflgpregresso;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1724646412) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertToInputParamAce].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToInputParamAceHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertToInputParamAceHandler::getTransformedObject]-START ");
		it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce outVal = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [input]
		it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce slot_input = (it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce) inputs
				.get("SLOT_input");

		/*PROTECTED REGION ID(R-1386295061) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_input != null) {
			outVal = new it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce();
			outVal.setAnno(slot_input.getAnno());
			outVal.setCertificatore(slot_input.getCertificatore());
			outVal.setNumero(slot_input.getNumero());
			outVal.setStato(slot_input.getStato());

		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToInputParamAceHandler::getTransformedObject]-END ");
		return outVal;
	}
}
