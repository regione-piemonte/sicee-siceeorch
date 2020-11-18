package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R2020569629) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class CKVerificaUidFolderLevel2Handler extends CheckConditionBaseHandler {

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
		getLogger(null).debug("[CKVerificaUidFolderLevel2Handler::evalCondition]-START ");
		try {
			/// valore degli input slot

			java.lang.String slot_folder2Uid = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_folder2Uid",
					ps);

			/*PROTECTED REGION ID(R-1602001852) ENABLED START*///
			/// inserire qui la logica del check. 
			/// verra' preservata per successive rigenerazioni
			Exception e = DataSlotHelper.getLastError(ps);
			if (e != null && e instanceof it.doqui.index.ecmengine.exception.publishing.NoDataExtractedException) {
				return true;
			} else {
				return (slot_folder2Uid == null) ? true : false;
			}
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			getLogger(null).error(
					"[CKVerificaUidFolderLevel2Handler::evalCondition]-errore durante l'esecuzione del check ", e);
			throw new WorkflowException("Errore durante l'esecuzione del check:" + e);
		} finally {
			getLogger(null).debug("[CKVerificaUidFolderLevel2Handler::eseguiFunctionHandler]-END ");
		}
	}
}
