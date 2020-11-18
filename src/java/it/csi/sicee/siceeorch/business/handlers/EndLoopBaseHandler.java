package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * classe base di implementazione del nodo EndLoop.
 * La logica e' definita totalmente nella sottoclasse specifica.
 * @generated
 */
public abstract class EndLoopBaseHandler implements FunctionProvider {

	/**
	 * prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * logger da utilizzare per loggare le attivita' dell'handler
	 * @param subsystem
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
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

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
