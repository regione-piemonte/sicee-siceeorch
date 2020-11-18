package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * classe base di implementazione del nodo WSCall.
 * @generated
 */
public abstract class WSCallBaseHandler implements FunctionProvider {

	/**
	 * prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * 
	 * @generated
	 */
	public final static String WSCLIENT_PARAM = "wscall.client";

	/**
	 * @generated
	 */
	protected String wsClientName = null;

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
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public void execute(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		this.initFunctionHandler(transientVars, args, ps);

		this.eseguiFunctionHandler(transientVars, args, ps);

		this.releaseFunctionHandler(transientVars, args, ps);
	}

	/**
	 * inizializzazione dell'handler.
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[WSCallBaseHandler::initFunctionHandler]-START ");
		wsClientName = (String) args.get(WSCLIENT_PARAM);
		if (wsClientName == null || wsClientName.length() == 0) {
			throw new WorkflowException("Errore nella inizializzazione dell'handler WSCall: "
					+ "occorre configurare il client tramite il " + "parametro " + WSCLIENT_PARAM);
		}

		getLogger(null).debug("[WSCallBaseHandler::initFunctionHandler]-wsClientName:" + wsClientName + " ");
		// reset dello slot destinato a contenere un eventuale errore
		DataSlotHelper.setLastError(null, ps);
		getLogger(null).debug("[WSCallBaseHandler::initFunctionHandler]-END ");
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
