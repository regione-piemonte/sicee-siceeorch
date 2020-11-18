package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewtransazione;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R392850679) ENABLED START*/
// inserire qui eventuali import aggiuntive
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.csi.mdp.core.business.dto.Transazione;
import it.csi.mdp.core.interfacecxf.IMdpCoreCxf;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import it.csi.sicee.siceeorch.business.util.Constants;
import it.csi.sicee.siceeorch.business.util.GenericUtil;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetTransazioneHandler implements FunctionProvider {

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
		getLogger(null).debug("[USRGetTransazioneHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-874888658) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetTransazioneHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetTransazioneHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1490865705) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetTransazioneHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetTransazioneHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-874998353) ENABLED START*/

		try {
			String applicationId = (String) DataSlotHelper.getDataSlotValue("SLOT_valueApplicationId", ps);

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("Stampo l'applicationId NEW: " + applicationId);

			JaxWsProxyFactoryBean fact = new JaxWsProxyFactoryBean();
			fact.setServiceClass(IMdpCoreCxf.class);
			String mdpcoreAddress = Constants.MDPNEW_CORE_URL;
			fact.setAddress(mdpcoreAddress);
			fact.getInInterceptors().add(new LoggingInInterceptor());
			fact.getOutInterceptors().add(new LoggingOutInterceptor());

			IMdpCoreCxf clientcxfmdp = (IMdpCoreCxf) fact.create();

			// Codice di TestAvvioWispCXF.java - inizio
			Transazione t = clientcxfmdp.initTransazione(applicationId, null);

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("Stampo la transazione NEW: " + t.getTransactionId());

			if (getLogger(null).isDebugEnabled())
				GenericUtil.stampa(t, true, 3);

			String idTransazione = t.getTransactionId();

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug(
						"[USRGetTransazioneHandler::eseguiFunctionHandler]- Stampo l'idTransazione: " + idTransazione);

			DataSlotHelper.setDataSlotValue("SLOT_result", idTransazione, ps);
		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);

			getLogger(null)
					.error("[USRGetTransazioneHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione " + e
							+ " nell'apposito slot  ", e);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetTransazioneHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R-1677034336) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
