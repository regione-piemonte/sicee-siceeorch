package it.csi.sicee.siceeorch.business.siceeorch.handlers.elencoprovince;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1788083008) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import java.util.Arrays;
import it.csi.sicee.siceeorch.business.siceeorch.util.ProvinciaComparator;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [elencoProvinceResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXElencoProvinceResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXElencoProvinceResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Provincia[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Provincia[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [province]
		it.csi.tavt.dto.Provincia[] slot_province = (it.csi.tavt.dto.Provincia[]) inputs.get("SLOT_province");

		/*PROTECTED REGION ID(R134134559) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_province != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Provincia[slot_province.length];
			for (int i = 0; i < slot_province.length; i++) {
				it.csi.sicee.siceeorch.dto.siceeorch.Provincia out = new it.csi.sicee.siceeorch.dto.siceeorch.Provincia();
				it.csi.tavt.dto.Provincia in = slot_province[i];
				out.setCod(in.getIstatProvincia());
				out.setNome(in.getDescProvincia());
				outVal[i] = out;
			}

			Arrays.sort(outVal, new ProvinciaComparator());
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXElencoProvinceResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
