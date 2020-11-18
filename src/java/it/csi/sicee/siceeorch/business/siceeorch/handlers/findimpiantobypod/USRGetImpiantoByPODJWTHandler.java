package it.csi.sicee.siceeorch.business.siceeorch.handlers.findimpiantobypod;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1094334876) ENABLED START*/
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.sicee.siceeorch.business.util.ServiziUtil;
import it.csi.sigit.sigitext.ws.service.client.Impianto;
import it.csi.sigit.sigitext.ws.service.client.SigitextSigitext_PortType;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetImpiantoByPODJWTHandler implements FunctionProvider {

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
		getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R234698025) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1175538354) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R234588330) ENABLED START*/
		java.lang.String slot_pod = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_pod", ps);
		java.lang.String slot_tokenJWT = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_tokenJWT", ps);

		it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] impiantiSiceeorch = null;

		try {

			SigitextSigitext_PortType clientSigitext = ServiziUtil.getClientSigitext();

			if (getLogger(null).isDebugEnabled()) {

				getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::eseguiFunctionHandler]- POD : " + slot_pod);
			}

			Impianto[] impiantiSigitext = clientSigitext.getImpiantoByPODJWT(slot_pod, slot_tokenJWT);

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
					.error("[USRGetImpiantoByPODJWTHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ", e);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetImpiantoByPODJWTHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R-1405860709) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
