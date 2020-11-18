package it.csi.sicee.siceeorch.business.siceeorch.handlers.getviabyid;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R868762812) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [getViaByIdResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXGetViaByIdResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXGetViaByIdResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Via outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Via) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [viaSitad]
		it.csi.sitad.tpnm.entity.Via slot_viaSitad = (it.csi.sitad.tpnm.entity.Via) inputs.get("SLOT_viaSitad");

		/*PROTECTED REGION ID(R1699979555) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (getLogger(null).isDebugEnabled())
			getLogger(null).debug("slot_viaSitad: " + slot_viaSitad);

		if (slot_viaSitad != null) {

			it.csi.sicee.siceeorch.dto.siceeorch.Via out = new it.csi.sicee.siceeorch.dto.siceeorch.Via();
			out.setId(slot_viaSitad.getIdL2());
			StringBuffer str = new StringBuffer("");
			if (slot_viaSitad.getLocalita() != null) {
				str.append(slot_viaSitad.getIndirizzo().getTipoVia());
				str.append(" ");
				str.append((slot_viaSitad.getIndirizzo().getNomeVia()));

				/*if (!(slot_vie[i].getLocalita().getNome()
						.equals(slot_vie[i].getLocalita().getComune()
								.getToponimo()))) {
					str.append(" (");
					str.append(slot_vie[i].getLocalita().getNome());
					str.append(")");
				}*/
				out.setDenominazione(str.toString());
			}

			out.setSedime(slot_viaSitad.getIndirizzo().getTipoVia().getTipo_via());
			outVal = out;

		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXGetViaByIdResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
