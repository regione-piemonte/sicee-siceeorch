package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewstatotransazione;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-945909721) ENABLED START*/
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
public class USRGetStatoTransazioneHandler implements FunctionProvider {

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
		getLogger(null).debug("[USRGetStatoTransazioneHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1120031998) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetStatoTransazioneHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetStatoTransazioneHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-1585313447) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetStatoTransazioneHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetStatoTransazioneHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1119922303) ENABLED START*/

		// Recupero il numero transazione
		java.lang.String slot_numTransazione = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_numTransazione",
				ps);

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

			Transazione transazione = clientcxfmdp.getStatoTransazione(slot_numTransazione);

			if (getLogger(null).isDebugEnabled())
				GenericUtil.stampa(transazione, true, 3);

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]- Stampo il numero transazione: "
						+ slot_numTransazione);

				getLogger(null)
						.debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]- Stampo lo stato della transazione: "
								+ transazione.getCodStato());
			}
			DataSlotHelper.setDataSlotValue("SLOT_result", transazione.getCodStato(), ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);

			getLogger(null)
					.error("[USRGetStatoTransazioneHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ", e);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetStatoTransazioneHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R-228933776) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
