package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewsceltawisp;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R157126631) ENABLED START*/
// inserire qui eventuali import aggiuntive
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.csi.mdp.core.business.dto.InformativePSPScelto;
import it.csi.mdp.core.interfacecxf.IMdpCoreCxf;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import it.csi.sicee.siceeorch.business.util.Constants;
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetSceltaWispHandler implements FunctionProvider {

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
		getLogger(null).debug("[USRGetSceltaWispHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1014992190) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetSceltaWispHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R204925209) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetSceltaWispHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1014882495) ENABLED START*/

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

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug(
						"[USRGetSceltaWispHandler::eseguiFunctionHandler]- Verifica scelta WISP per applicationId: "
								+ applicationId);

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug(
						"[USRGetSceltaWispHandler::eseguiFunctionHandler]- Verifica scelta WISP per slot_numTransazione: "
								+ slot_numTransazione);

			InformativePSPScelto informativaScelta = clientcxfmdp.getSceltaWisp(applicationId, slot_numTransazione);

			if (getLogger(null).isDebugEnabled())
				GenericUtil.stampa(informativaScelta, true, 3);

			if (getLogger(null).isDebugEnabled()) {
				getLogger(null)
						.debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]- identificativo informativa PSP: "
								+ informativaScelta.getIdinformativapsp());

				getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]- identificativo PSP: "
						+ informativaScelta.getIdentificativoPSP());

				getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]- ragione sociale PSP: "
						+ informativaScelta.getRagioneSociale());

				getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]- desc servizio: "
						+ informativaScelta.getDescrizioneServizio());
			}

			InformativaScelta informativa = new InformativaScelta();
			informativa.setIdInformativa(informativaScelta.getIdinformativapsp());
			informativa.setIdentificativo(informativaScelta.getIdentificativoPSP());
			informativa.setRagioneSociale(informativaScelta.getRagioneSociale());
			informativa.setDescrizioneServizio(informativaScelta.getDescrizioneServizio());

			DataSlotHelper.setDataSlotValue("SLOT_result", informativa, ps);

		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);

			getLogger(null).error("[USRGetSceltaWispHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
					+ e + " nell'apposito slot  ", e);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetSceltaWispHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R-394545232) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
