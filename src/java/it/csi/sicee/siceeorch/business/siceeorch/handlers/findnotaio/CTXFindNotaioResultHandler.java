package it.csi.sicee.siceeorch.business.siceeorch.handlers.findnotaio;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R2003103554) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findNotaioResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindNotaioResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindNotaioResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Notaio outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Notaio) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [ret]
		it.csi.sicee.siceesrv.dto.siceesrv.Notaio slot_ret = (it.csi.sicee.siceesrv.dto.siceesrv.Notaio) inputs
				.get("SLOT_ret");

		/*PROTECTED REGION ID(R-1790163107) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_ret != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Notaio();
			outVal.setCodiceFiscale(slot_ret.getCodiceFiscale());
			outVal.setCognome(slot_ret.getCognome());
			outVal.setEmail(slot_ret.getEmail());
			outVal.setId(slot_ret.getId());
			outVal.setNome(slot_ret.getNome());
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindNotaioResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
