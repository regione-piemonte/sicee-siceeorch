package it.csi.sicee.siceeorch.business.siceeorch.handlers.findprotocollazione;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1360453176) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findProtocollazioneResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindProtocollazioneResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindProtocollazioneResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [protocollazione]
		it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione slot_protocollazione = (it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione) inputs
				.get("SLOT_protocollazione");

		/*PROTECTED REGION ID(R1313760663) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_protocollazione != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione();

			outVal.setNumero(slot_protocollazione.getNumero());
			outVal.setData(slot_protocollazione.getData());
			outVal.setVolume(slot_protocollazione.getVolume());
			outVal.setTipoDoc(slot_protocollazione.getTipoDoc());
			outVal.setMail(slot_protocollazione.getMail());

		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindProtocollazioneResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
