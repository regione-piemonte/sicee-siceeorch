package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1936059535) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class CKVerificaUidFolderHandler extends CheckConditionBaseHandler {

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
		getLogger(null).debug("[CKVerificaUidFolderHandler::evalCondition]-START ");
		try {
			/// valore degli input slot

			java.lang.String slot_folderUid = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_folderUid", ps);

			/*PROTECTED REGION ID(R2082968438) ENABLED START*///
			/// inserire qui la logica del check. 
			/// verra' preservata per successive rigenerazioni
			Exception e = DataSlotHelper.getLastError(ps);
			if (e != null && e instanceof it.doqui.index.ecmengine.exception.publishing.NoDataExtractedException) {
				return true;
			} else {
				if (getLogger(null).isDebugEnabled())
					getLogger(null).debug("UID NODE TROVATA:" + slot_folderUid);

				return (slot_folderUid == null) ? true : false;
			}

			/*PROTECTED REGION END*/
		} catch (Exception e) {
			getLogger(null).error("[CKVerificaUidFolderHandler::evalCondition]-errore durante l'esecuzione del check ",
					e);
			throw new WorkflowException("Errore durante l'esecuzione del check:" + e);
		} finally {
			getLogger(null).debug("[CKVerificaUidFolderHandler::eseguiFunctionHandler]-END ");
		}
	}
}
