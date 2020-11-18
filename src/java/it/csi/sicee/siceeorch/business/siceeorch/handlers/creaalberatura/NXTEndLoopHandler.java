package it.csi.sicee.siceeorch.business.siceeorch.handlers.creaalberatura;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/**
 * Implementazione specifica del nodo di end (uscita) del loop
 * @generated
 */
public class NXTEndLoopHandler extends EndLoopBaseHandler {
	/**
	 * esegue la logica effettiva.
	 * non aggiunge nulla rispetto alla logica generica
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	@Override
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[NXTEndLoopHandler::eseguiFunctionHandler]-START ");
		getLogger(null).debug("[NXTEndLoopHandler::eseguiFunctionHandler]-END ");
	}
}
