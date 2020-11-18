package it.csi.sicee.siceeorch.business.siceeorch.handlers.getviebycodiceistat;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-403131384) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [getVieByCodiceIstatResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXGetVieByCodiceIstatResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXGetVieByCodiceIstatResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Via[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Via[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [vie]
		it.csi.sitad.tpnm.entity.Via[] slot_vie = (it.csi.sitad.tpnm.entity.Via[]) inputs.get("SLOT_vie");

		/*PROTECTED REGION ID(R925965143) ENABLED START*/
		/// inserire qui la logica di trasformazione
		getLogger(null).info("[CTXGetVieByCodiceIstatResultHandler::getTransformedObject]- SONO ENTRATO ");

		if (slot_vie != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Via[slot_vie.length];
			for (int i = 0; i < slot_vie.length; i++) {
				it.csi.sicee.siceeorch.dto.siceeorch.Via out = new it.csi.sicee.siceeorch.dto.siceeorch.Via();
				out.setId(slot_vie[i].getIdL2());

				out.setDenominazione(GenericUtil.costruisciDescVia(slot_vie[i]));

				/*
				StringBuffer str = new StringBuffer("");
				if (slot_vie[i].getLocalita() != null) {
					
					GenericUtil.stampa(slot_vie[i], false, 3);
					GenericUtil.stampa(slot_vie[i], true, 3);
					
					str.append(slot_vie[i].getIndirizzo().getTipoVia());
					str.append(" ");
					//str.append((slot_vie[i].getIndirizzo().getNomeVia()));
					str.append(GenericUtil.costruisciDescVia(slot_vie[i]));
				
					GenericUtil.stampa(slot_vie[i], false, 3);
				
					//result.add(MapDto.mapToCodeDescription(leVie[i]));
				
					
					
					
					out.setDenominazione(str.toString());
				}
				*/
				out.setSedime(slot_vie[i].getIndirizzo().getTipoVia().getTipo_via());
				outVal[i] = out;
			}
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXGetVieByCodiceIstatResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
