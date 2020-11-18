package it.csi.sicee.siceeorch.business.siceeorch.handlers.getmdpnewiuv;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1274001980) ENABLED START*/
// inserire qui eventuali import aggiuntive
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.csi.mdp.core.business.dto.Transazione;
import it.csi.mdp.core.business.dto.TransazioneExtraAttribute;
import it.csi.mdp.core.interfacecxf.IMdpCoreCxf;
import it.csi.mdpnew.mdpiuvsrv.webservice.MdpiuvWSInterface;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import it.csi.sicee.siceeorch.business.siceeorch.util.NodoConstants;
import it.csi.sicee.siceeorch.business.util.Constants;
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.sicee.siceeorch.dto.siceeorch.DettaglioPagamento;

/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetIdentificativoUnivocoVersamentoHandler implements FunctionProvider {

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
		getLogger(null).debug("[USRGetIdentificativoUnivocoVersamentoHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1844521097) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetIdentificativoUnivocoVersamentoHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetIdentificativoUnivocoVersamentoHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-541227538) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetIdentificativoUnivocoVersamentoHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetIdentificativoUnivocoVersamentoHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1844411402) ENABLED START*/
		// Recupero il numero transazione
		DettaglioPagamento dettaglioPagamento = (DettaglioPagamento) DataSlotHelper
				.getDataSlotValue("SLOT_dettaglioPagamento", ps);

		try {

			// Questo oggetto contiene tutti i parametri del metodo
			it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] parameters = (it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[]) DataSlotHelper
					.getDataSlotValue("SLOT_elencoParamSrv", ps);

			String applicationId = null;

			String codVersamento = null;

			for (it.csi.sicee.siceesrv.dto.siceesrv.LabelValue parameter : parameters) {

				if (parameter.getLabel().equalsIgnoreCase(Constants.COD_APPLICATION_ID)) {
					applicationId = parameter.getValue();
				} else if (parameter.getLabel().equalsIgnoreCase(Constants.COD_VERSAMENTO)) {
					codVersamento = parameter.getValue();
				}
			}

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("Stampo l'applicationId NEW: " + applicationId);

			if (getLogger(null).isDebugEnabled())
				getLogger(null).debug("Stampo il codVersamento NEW: " + codVersamento);

			JaxWsProxyFactoryBean factiuv = new JaxWsProxyFactoryBean();
			factiuv.setServiceClass(MdpiuvWSInterface.class);
			String mdpIUVServiceAddress = Constants.MDPNEW_IUV_URL;
			factiuv.setAddress(mdpIUVServiceAddress);
			factiuv.getInInterceptors().add(new LoggingInInterceptor());
			factiuv.getOutInterceptors().add(new LoggingOutInterceptor());

			MdpiuvWSInterface clientcxfmdpiuv = (MdpiuvWSInterface) factiuv.create();

			//Richiesta IUV indicando application id e codice versamento qui posto uguale alla stringa "TEST"
			//anche il codice versamento va concordato con l'Ente in base al censimento delle entrate
			String iuv = clientcxfmdpiuv.getSingleIUV(applicationId, codVersamento);

			DataSlotHelper.setDataSlotValue("SLOT_result", iuv, ps);
		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente
			DataSlotHelper.setLastError(e, ps);

			getLogger(null).error(
					"[USRGetIdentificativoUnivocoVersamentoHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ",
					e);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetIdentificativoUnivocoVersamentoHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R-131147781) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
