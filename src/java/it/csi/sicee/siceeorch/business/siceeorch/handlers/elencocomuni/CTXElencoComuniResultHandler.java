package it.csi.sicee.siceeorch.business.siceeorch.handlers.elencocomuni;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-23339522) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import java.util.Arrays;
import it.csi.sicee.siceeorch.business.siceeorch.util.ComuneComparator;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [elencoComuniResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXElencoComuniResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXElencoComuniResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Comune[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Comune[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [comuni]
		it.csi.tavt.dto.Comune[] slot_comuni = (it.csi.tavt.dto.Comune[]) inputs.get("SLOT_comuni");

		/*PROTECTED REGION ID(R-185389023) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_comuni != null) {

			it.csi.sicee.siceeorch.dto.siceeorch.Comune[] temp = new it.csi.sicee.siceeorch.dto.siceeorch.Comune[slot_comuni.length];
			int size = 0;
			for (int i = 0; i < slot_comuni.length; i++) {
				it.csi.sicee.siceeorch.dto.siceeorch.Comune out = new it.csi.sicee.siceeorch.dto.siceeorch.Comune();
				it.csi.tavt.dto.Comune in = slot_comuni[i];
				out.setCod(in.getIstatComune());
				out.setNome(in.getDescComune());
				out.setCodCatasto(in.getCodCatasto());
				if (in.getDataStop() == null) {
					temp[size++] = out;
				}
			}
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Comune[size];
			for (int i = 0; i < size; i++) {
				outVal[i] = temp[i];
			}
			Arrays.sort(outVal, new ComuneComparator());
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXElencoComuniResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
