package it.csi.sicee.siceeorch.business.siceeorch.handlers.inseriscidocumento;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R498142481) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.Constants;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class CKVerificaTipoDocumentoHandler extends CheckConditionBaseHandler {

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
		getLogger(null).debug("[CKVerificaTipoDocumentoHandler::evalCondition]-START ");
		try {
			/// valore degli input slot

			it.csi.sicee.siceeorch.dto.siceeorch.Documento slot_docIns = (it.csi.sicee.siceeorch.dto.siceeorch.Documento) DataSlotHelper
					.getDataSlotValue("SLOT_docIns", ps);

			/*PROTECTED REGION ID(R-1861046152) ENABLED START*///
			/// inserire qui la logica del check. 
			/// verra' preservata per successive rigenerazioni
			return ((slot_docIns != null)
					&& (slot_docIns.getTipologia().equalsIgnoreCase(Constants.TIPOLOGIA_ALLEGATO_ACE))) ? true : false;
			/*PROTECTED REGION END*/
		} catch (Exception e) {
			getLogger(null)
					.error("[CKVerificaTipoDocumentoHandler::evalCondition]-errore durante l'esecuzione del check ", e);
			throw new WorkflowException("Errore durante l'esecuzione del check:" + e);
		} finally {
			getLogger(null).debug("[CKVerificaTipoDocumentoHandler::eseguiFunctionHandler]-END ");
		}
	}
}
