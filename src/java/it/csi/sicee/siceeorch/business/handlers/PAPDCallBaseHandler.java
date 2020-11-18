package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * Classse base di implementazione del nodo PAPDCall.
 * @generated
 */
public abstract class PAPDCallBaseHandler implements FunctionProvider {

	/**
	 * prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * logger da utilizzare per il log delle operazioni dell'handler
	 * @param subsystem
	 * @return il logger
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * nome della risorsa che contiene il file del selettore
	 * @generated
	 */
	protected String selectorRes = null;

	/**
	 * nome della risorsa che contiene il file della PD locale
	 * @generated
	 */
	protected String localPDRes = null;

	/**
	 * nome del parametro di configurazione dell'handler che contiene la risorsa del
	 * selettore
	 * @generated
	 */
	public final static String SELECTORPD_PARAM = "selectorPD";

	/**
	 * nome del parametro di configurazione dell'handler che contiene la risorsa della
	 * PD locale
	 * @generated
	 */
	public final static String SERVICEPD_PARAM = "servicePD";

	/**
	 * @generated
	 */
	public void execute(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		this.initFunctionHandler(transientVars, args, ps);

		this.eseguiFunctionHandler(transientVars, args, ps);

		this.releaseFunctionHandler(transientVars, args, ps);
	}

	/**
	 * Inizializzazione del function handler. 
	 * Legge dalla configurazione dell'handler il percorso di:
	 * - selettore
	 * - local PD
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[PAPDCallBaseHandler::initFunctionHandler]-START ");
		selectorRes = (String) args.get(SELECTORPD_PARAM);
		if (selectorRes == null || selectorRes.length() == 0) {
			throw new WorkflowException("Errore nella inizializzazione dell' handler PDPACall: "
					+ "occorre configurare il percorso del file del selettore tramite il " + "parametro "
					+ SELECTORPD_PARAM);
		} else
			selectorRes = "/" + selectorRes;

		localPDRes = (String) args.get(SERVICEPD_PARAM);
		if (localPDRes == null || localPDRes.length() == 0) {
			throw new WorkflowException("Errore nella inizializzazione dell' handler PDPACall: "
					+ "occorre configurare il percorso del file della PD Locale tramite il " + "parametro "
					+ SERVICEPD_PARAM);
		} else
			localPDRes = "/" + localPDRes;
		getLogger(null).debug("[PAPDCallBaseHandler::initFunctionHandler]-selector:" + selectorRes + " ");
		getLogger(null).debug("[PAPDCallBaseHandler::initFunctionHandler]-localPD:" + localPDRes + " ");
		// reset dello slot destinato a contenere un eventuale errore
		DataSlotHelper.setLastError(null, ps);
		getLogger(null).debug("[PAPDCallBaseHandler::initFunctionHandler]-END ");
	}

	/**
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
	}

	/**
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public abstract void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException;

}
