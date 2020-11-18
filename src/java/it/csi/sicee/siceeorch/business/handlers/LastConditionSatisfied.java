package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.Condition;
import com.opensymphony.workflow.WorkflowException;

/**
 * Utilizzata per determinare se, in un nodo CheckCondition, la condizione e' 
 * stata soddisfatta
 * @generated
 */
public class LastConditionSatisfied implements Condition {

	/**
	 * prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * logger da utilizzare per loggare le operazioni dell'handler
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
	 * verifica se la condiizone deve essere considerata soddisfatta o
	 * meno.
	 * La condizione e' soddisfatta se il valore reperito dal contesto tramite
	 * DataSlotHelper.getLastConditionValue() e' true.
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public boolean passesCondition(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[LastConditionSatisfied::passesCondition]-START ");
		Boolean satisfiedFlag = (Boolean) DataSlotHelper.getLastConditionValue(ps);
		if (satisfiedFlag == null) {
			getLogger(null).debug(
					"[LastConditionSatisfied::passesCondition]-lastcondition flag non valorizzato: condizione non soddisfatta ");
			getLogger(null).debug("[LastConditionSatisfied::passesCondition]-END ");
			return false;
		} else {
			getLogger(null)
					.debug("[LastConditionSatisfied::passesCondition]-lastcondition flag:" + satisfiedFlag + " ");
			getLogger(null).debug("[LastConditionSatisfied::passesCondition]-END ");
			return satisfiedFlag.booleanValue();
		}

	}
}
