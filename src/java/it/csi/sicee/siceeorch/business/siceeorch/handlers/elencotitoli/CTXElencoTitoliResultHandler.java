package it.csi.sicee.siceeorch.business.siceeorch.handlers.elencotitoli;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-2014763846) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [elencoTitoliResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXElencoTitoliResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXElencoTitoliResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Titolo[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Titolo[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [titoli]
		it.csi.sicee.siceesrv.dto.siceesrv.Titolo[] slot_titoli = (it.csi.sicee.siceesrv.dto.siceesrv.Titolo[]) inputs
				.get("SLOT_titoli");

		/*PROTECTED REGION ID(R-1790000923) ENABLED START*/
		/// inserire qui la logica di trasformazione

		if (slot_titoli != null) {
			int size = slot_titoli.length;
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Titolo[size];
			for (int i = 0; i < size; i++) {
				it.csi.sicee.siceesrv.dto.siceesrv.Titolo titolo = slot_titoli[i];
				outVal[i] = new it.csi.sicee.siceeorch.dto.siceeorch.Titolo();
				outVal[i].setDescrizione(titolo.getDescrizione());
				outVal[i].setIdTitolo(titolo.getIdTitolo());
			}

		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXElencoTitoliResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
