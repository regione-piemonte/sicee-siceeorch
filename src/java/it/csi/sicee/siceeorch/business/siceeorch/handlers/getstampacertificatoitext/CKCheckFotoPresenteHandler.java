package it.csi.sicee.siceeorch.business.siceeorch.handlers.getstampacertificatoitext;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R686455480) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class CKCheckFotoPresenteHandler extends CheckConditionBaseHandler {

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
		getLogger(null).debug("[CKCheckFotoPresenteHandler::evalCondition]-START ");
		try {
			/// valore degli input slot

			java.lang.String slot_uidFoto = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_uidFoto", ps);

			/*PROTECTED REGION ID(R1493368005) ENABLED START*///
			/// inserire qui la logica del check. 
			/// verra' preservata per successive rigenerazioni

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null).debug("Stampo CKCheckFotoPresenteHandler - slot_uidFoto: " + slot_uidFoto);
				getLogger(null).debug("Stampo CKCheckFotoPresenteHandler: " + !GenericUtil.isNullOrEmpty(slot_uidFoto));
			}

			return !GenericUtil.isNullOrEmpty(slot_uidFoto);
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			getLogger(null).error("[CKCheckFotoPresenteHandler::evalCondition]-errore durante l'esecuzione del check ",
					e);
			throw new WorkflowException("Errore durante l'esecuzione del check:" + e);
		} finally {
			getLogger(null).debug("[CKCheckFotoPresenteHandler::eseguiFunctionHandler]-END ");
		}
	}
}
