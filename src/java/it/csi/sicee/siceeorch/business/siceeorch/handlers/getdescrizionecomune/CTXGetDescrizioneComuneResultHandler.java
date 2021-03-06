package it.csi.sicee.siceeorch.business.siceeorch.handlers.getdescrizionecomune;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1727953232) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [getDescrizioneComuneResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXGetDescrizioneComuneResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXGetDescrizioneComuneResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Comune outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Comune) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [comune]
		it.csi.tavt.dto.Comune slot_comune = (it.csi.tavt.dto.Comune) inputs.get("SLOT_comune");

		/*PROTECTED REGION ID(R-1488806481) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_comune != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Comune();
			outVal.setCod(slot_comune.getIstatComune());
			outVal.setNome(slot_comune.getDescComune());
			outVal.setCodProv(slot_comune.getProvComune().getIstatProvincia());
			outVal.setNomeProv(slot_comune.getProvComune().getDescProvincia());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXGetDescrizioneComuneResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
