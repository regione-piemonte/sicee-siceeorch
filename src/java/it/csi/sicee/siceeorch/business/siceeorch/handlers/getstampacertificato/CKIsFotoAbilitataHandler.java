package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificato;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R931245893) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.Constants;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class CKIsFotoAbilitataHandler extends CheckConditionBaseHandler {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	public boolean evalCondition(PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[CKIsFotoAbilitataHandler::evalCondition]-START ");
		try {
			/// valore degli input slot

			java.lang.String slot_value = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_value", ps);

			/*PROTECTED REGION ID(R-1283901652) ENABLED START*///
			/// inserire qui la logica del check. 
			/// verra' preservata per successive rigenerazioni

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("E' abilitata la FOTO: " + slot_value);

			return slot_value.equalsIgnoreCase(Constants.SI);

			/*PROTECTED REGION END*/
		} catch (Exception e) {
			getLogger(null).error("[CKIsFotoAbilitataHandler::evalCondition]-errore durante l'esecuzione del check ",
					e);
			throw new WorkflowException("Errore durante l'esecuzione del check:" + e);
		} finally {
			getLogger(null).debug("[CKIsFotoAbilitataHandler::eseguiFunctionHandler]-END ");
		}
	}
}
