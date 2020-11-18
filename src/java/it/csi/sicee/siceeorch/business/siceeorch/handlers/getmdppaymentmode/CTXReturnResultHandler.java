package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdppaymentmode;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R305469204) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.siceeorch.util.Converter;
import it.csi.sicee.siceeorch.dto.siceeorch.Gateway;
import it.csi.sicee.siceeorch.dto.siceeorch.Transazione;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [returnResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXReturnResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXReturnResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.MdpBox outVal = (it.csi.sicee.siceeorch.dto.siceeorch.MdpBox) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [gateway]
		it.csi.mdp.core.business.paymentmanager.local.AppGateway[] slot_gateway = (it.csi.mdp.core.business.paymentmanager.local.AppGateway[]) inputs
				.get("SLOT_gateway");
		// slot [transazione]
		it.csi.mdp.core.business.dto.Transazione slot_transazione = (it.csi.mdp.core.business.dto.Transazione) inputs
				.get("SLOT_transazione");

		/*PROTECTED REGION ID(R1417746891) ENABLED START*/
		/// inserire qui la logica di trasformazione
		Transazione tr = Converter.convertTo(slot_transazione);
		Gateway[] array = Converter.convertTo(slot_gateway);
		outVal = new it.csi.sicee.siceeorch.dto.siceeorch.MdpBox();
		outVal.setGateways(array);
		outVal.setTransazione(tr);

		//Gateway
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXReturnResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
