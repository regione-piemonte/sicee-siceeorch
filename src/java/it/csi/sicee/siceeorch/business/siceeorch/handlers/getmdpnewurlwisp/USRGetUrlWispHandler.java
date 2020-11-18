package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewurlwisp;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-2036160777) ENABLED START*/
// inserire qui eventuali import aggiuntive
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.csi.mdp.core.business.dto.ParametriUrlWisp;
import it.csi.mdp.core.business.dto.Transazione;
import it.csi.mdp.core.interfacecxf.IMdpCoreCxf;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import it.csi.sicee.siceeorch.business.util.Constants;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetUrlWispHandler implements FunctionProvider {

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
		getLogger(null).debug("[USRGetUrlWispHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1374730194) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetUrlWispHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetUrlWispHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1363281961) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetUrlWispHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetUrlWispHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1374839889) ENABLED START*/

		// Recupero il numero transazione
		java.lang.String slot_numTransazione = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_numTransazione",
				ps);

		java.lang.Double slot_valore = (java.lang.Double) DataSlotHelper.getDataSlotValue("SLOT_valore", ps);

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

			// Ricreo la transazione
			Transazione t = new Transazione();
			t.setTransactionId(slot_numTransazione);

			t.setApplicationId(applicationId); // Sarà una costante
			t.setLanguage("ITA"); // Sarà una costante
			t.setAmount(slot_valore); // Sarà un parametro

			ParametriUrlWisp parametriUrlWisp = new ParametriUrlWisp();

			parametriUrlWisp.setBolloDigitale("NO");
			parametriUrlWisp.setStornoPagamento("NO");
			parametriUrlWisp.setTerzoModelloPagamento("NO");

			String url = clientcxfmdp.getUrlWisp(applicationId, t, parametriUrlWisp, null);

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("[USRGetUrlWispHandler::eseguiFunctionHandler]- Stampo l'urlWISP: " + url);

			DataSlotHelper.setDataSlotValue("SLOT_result", url, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);

			getLogger(null).error("[USRGetUrlWispHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetUrlWispHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R333021856) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
