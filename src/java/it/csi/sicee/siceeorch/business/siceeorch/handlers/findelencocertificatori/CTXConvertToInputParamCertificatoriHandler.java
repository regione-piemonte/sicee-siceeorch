package it.csi.sicee.siceeorch.business.siceeorch.handlers.findelencocertificatori;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-25795925) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertToInputParamCertificatori].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToInputParamCertificatoriHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertToInputParamCertificatoriHandler::getTransformedObject]-START ");
		it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori outVal = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [input]
		it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaCertificatori slot_input = (it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaCertificatori) inputs
				.get("SLOT_input");

		/*PROTECTED REGION ID(R-261537516) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_input != null) {
			outVal = new it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori();
			outVal.setCognome(slot_input.getCognome());
			outVal.setComune(slot_input.getComune());
			outVal.setNome(slot_input.getNome());
			outVal.setProvincia(slot_input.getProvincia());
			outVal.setRagioneSociale(slot_input.getRagioneSociale());
			outVal.setTitolo(slot_input.getTitolo());
			outVal.setRegione(slot_input.getRegione());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToInputParamCertificatoriHandler::getTransformedObject]-END ");
		return outVal;
	}
}
