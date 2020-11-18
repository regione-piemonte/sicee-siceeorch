package it.csi.sicee.siceeorch.business.siceeorch.handlers.elencoregioni;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1924193912) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import java.util.Arrays;
import it.csi.sicee.siceeorch.business.siceeorch.util.RegioneComparator;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [elencoRegioniResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXElencoRegioniResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXElencoRegioniResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Regione[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Regione[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [regioni]
		it.csi.tavt.dto.Regione[] slot_regioni = (it.csi.tavt.dto.Regione[]) inputs.get("SLOT_regioni");

		/*PROTECTED REGION ID(R1017667031) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_regioni != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Regione[slot_regioni.length];
			for (int i = 0; i < slot_regioni.length; i++) {
				it.csi.sicee.siceeorch.dto.siceeorch.Regione out = new it.csi.sicee.siceeorch.dto.siceeorch.Regione();
				it.csi.tavt.dto.Regione in = slot_regioni[i];
				out.setCod(in.getIstatRegione());
				out.setNome(in.getDescRegione());
				outVal[i] = out;
			}
			Arrays.sort(outVal, new RegioneComparator());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXElencoRegioniResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
