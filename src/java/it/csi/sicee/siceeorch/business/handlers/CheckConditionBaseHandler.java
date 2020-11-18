package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * classe base di implementazione del nodo CheckCondition
 * @generated
 */
public abstract class CheckConditionBaseHandler implements FunctionProvider {

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
	 * nome dello slot (interno) in cui deve essere memorizzato l'esito (booleano)
	 * dell'ultima condiizone verificata 
	 * @generated
	 */
	public static final String LAST_CONDITION_VALUE_SLOT = "_lastConditionValue";

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
	 * valuta la condizione (definita nel metodo evalConditon() della sottoclasse e
	 * inserisce il valore risultante nell'apposito slot 
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[CheckConditionBaseHandler::eseguiFunctionHandler]-START ");
		DataSlotHelper.setDataSlotValue(LAST_CONDITION_VALUE_SLOT, null, ps);
		Boolean condVal = evalCondition(ps);
		DataSlotHelper.setDataSlotValue(LAST_CONDITION_VALUE_SLOT, condVal, ps);
		getLogger(null).debug("[CheckConditionBaseHandler::eseguiFunctionHandler]-valore condizione:" + condVal + " ");
		getLogger(null).debug("[CheckConditionBaseHandler::eseguiFunctionHandler]-END ");
	}

	/**
	 * Deve essere implementata nella sottoclasse  a seconda della condizione da verificare
	 * @generated
	 */
	public abstract boolean evalCondition(PropertySet ps) throws WorkflowException;

}
