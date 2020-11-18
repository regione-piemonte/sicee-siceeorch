package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * Classe base per l'implementazione delle trasformazioni dichiarative
 * N.B. Al momento uqesto tipo di trasformazione non e' ancora implementata.
 * @generated
 */
public abstract class DeclTransformBaseHandler extends CustomTransformBaseHandler {

	/**
	 * il prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * il logger
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * N.B: al momento non implementata
	 * @generated
	 */
	public abstract Object getTransformedObject(Map<String, Object> inputs);

}
