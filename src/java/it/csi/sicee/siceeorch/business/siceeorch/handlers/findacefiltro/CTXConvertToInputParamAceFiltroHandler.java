package it.csi.sicee.siceeorch.business.siceeorch.handlers.findacefiltro;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1354476141) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [convertToInputParamAceFiltro].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXConvertToInputParamAceFiltroHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject]-START ");
		it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce outVal = (it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [input]
		it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce slot_input = (it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce) inputs
				.get("SLOT_input");

		/*PROTECTED REGION ID(R-422776430) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_input != null) {
			outVal = new it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce();
			outVal.setCodProv(slot_input.getCodProv());
			outVal.setCodComune(slot_input.getCodComune());
			outVal.setDescComune(slot_input.getDescComune());
			outVal.setDescIndirizzo(slot_input.getDescIndirizzo());
			outVal.setNumCivico(slot_input.getNumCivico());
			outVal.setSezione(slot_input.getSezione());
			outVal.setFoglio(slot_input.getFoglio());
			outVal.setParticella(slot_input.getParticella());
			outVal.setSubalterno(slot_input.getSubalterno());
			outVal.setStato(slot_input.getStato());

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getCodProv: "
						+ slot_input.getCodProv());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getCodComune: "
						+ slot_input.getCodComune());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getDescComune: "
						+ slot_input.getDescComune());
				getLogger(null)
						.debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getDescIndirizzo: "
								+ slot_input.getDescIndirizzo());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getNumCivico: "
						+ slot_input.getNumCivico());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getSezione: "
						+ slot_input.getSezione());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getFoglio: "
						+ slot_input.getFoglio());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getParticella: "
						+ slot_input.getParticella());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getSubalterno: "
						+ slot_input.getSubalterno());
				getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject] - getStato: "
						+ slot_input.getStato());
			}

		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXConvertToInputParamAceFiltroHandler::getTransformedObject]-END ");
		return outVal;
	}
}
