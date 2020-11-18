package it.csi.sicee.siceeorch.business.siceeorch.handlers.findimpiantobypdr;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-996297330) ENABLED START*/
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.sicee.siceeorch.business.util.ServiziUtil;
import it.csi.sigit.sigitext.ws.service.client.Impianto;
import it.csi.sigit.sigitext.ws.service.client.SigitextSigitext_PortType;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetImpiantoByPDRJWTHandler implements FunctionProvider {

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

	/**
	 * @generated
	 */
	public void execute(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		this.initFunctionHandler(transientVars, args, ps);

		this.eseguiFunctionHandler(transientVars, args, ps);

		this.releaseFunctionHandler(transientVars, args, ps);
	}

	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R2002740599) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1396832832) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R2002630904) ENABLED START*/
		java.lang.String slot_pdr = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_pdr", ps);
		java.lang.String slot_tokenJWT = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_tokenJWT", ps);

		it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] impiantiSiceeorch = null;

		try {

			SigitextSigitext_PortType clientSigitext = ServiziUtil.getClientSigitext();

			if (getLogger(null).isDebugEnabled()) {

				getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::eseguiFunctionHandler]- PDR : " + slot_pdr);
			}

			Impianto[] impiantiSigitext = clientSigitext.getImpiantoByPDRJWT(slot_pdr, slot_tokenJWT);

			if (getLogger(null).isDebugEnabled()) {
				for (Impianto impianto : impiantiSigitext) {
					GenericUtil.stampa(impianto, true, 3);
				}
			}

			if (impiantiSigitext != null) {
				impiantiSiceeorch = GenericUtil.rimappaListImpianto(impiantiSigitext);

			}

			DataSlotHelper.setDataSlotValue("SLOT_result", impiantiSiceeorch, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente

			e = ServiziUtil.handleSigitextExceptions(e);

			DataSlotHelper.setLastError(e, ps);

			getLogger(null)
					.error("[USRGetImpiantoByPDRJWTHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ", e);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetImpiantoByPDRJWTHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R-1790949655) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
