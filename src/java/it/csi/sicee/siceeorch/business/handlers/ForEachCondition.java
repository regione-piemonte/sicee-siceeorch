package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.Condition;
import com.opensymphony.workflow.WorkflowException;

/**
 * Implementa la condizione di permanenz/uscita nel/dal loop.
 * La stessa classe e' utilizzata sia per determinare la condizione di permanenza
 * (configurando il parametro BRANCH_PARAM_NAME (for.each.branch) a STAY (stay) )
 * sia per determinare la condizione di uscita (configurando il parametro BRANCH_PARAM_NAME
 * (for.each.branch) a EXIT (exit)).
 * @generated
 */
public class ForEachCondition implements Condition {

	/**
	 * il prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * il logger da utilizzare per loggare le operazioni dell'handler
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * 
	 * @generated
	 */
	public final static String BRANCH_PARAM_NAME = "for.each.branch";

	/**
	 * @generated
	 */
	public final static String STAY = "stay";

	/**
	 * @generated
	 */
	public final static String EXIT = "exit";

	/**
	 * determina se la condizione e' da considerarsi verificata o meno.
	 * Permette di determinare se il flusso prosegue con la logica del loop
	 * o con la logica successiva al loop.
	 * @generated
	 */
	public boolean passesCondition(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[ForEachCondition::passesCondition]-START ");
		// nome dello slot che contiene la collectoin su cui il ForEach deve iterare
		String collSN = (String) args.get(ForEachBaseHandler.COLLECTION_SLOT_NAME_PARAM_NAME);
		if (collSN == null) {
			// non e' stato configurato il nome dello slot che contiene la collection
			// => errore
			throw new WorkflowException(
					"errore nella configurazione della condizione del for each: occorre configurare " + "il parametro "
							+ ForEachBaseHandler.COLLECTION_SLOT_NAME_PARAM_NAME
							+ " valorizzandolo coerentemente con il nodo for each corrispondente.");
		}
		String branch = (String) args.get(BRANCH_PARAM_NAME);
		getLogger(null).debug("[ForEachCondition::passesCondition]-branch:" + branch + " ");
		// gl iunici valori ammessi per il parametro BRANCH_PARAM _NAME sono STAY o EXIT
		if (branch == null || (!branch.equals(STAY) && !branch.equals(EXIT))) {
			throw new WorkflowException(
					"errore nella configurazione della condizione del for each: occorre configurare " + "il parametro "
							+ BRANCH_PARAM_NAME + " valorizzandolo con '" + STAY + "' o '" + EXIT + "'");
		}
		// La presenza di ulteriori elementi su cui iterare e' determinata dal valore di uno slot interno 
		Boolean continueFlag = (Boolean) DataSlotHelper
				.getDataSlotValue(collSN + ForEachBaseHandler.MORE_ELEMENTS_SLOT_NAME_SUFFIX, ps);
		if (continueFlag == null) {
			// se lo slot non e' stato impostato suppongo che non si debba continuare
			continueFlag = Boolean.FALSE;
		}
		if (branch.equals(STAY)) {
			getLogger(null).debug("[ForEachCondition::passesCondition]-END ");
			// se la condizione e' utilizzata per determinare la condizione di permanenza allora
			// la condizione e' vera se lo e' anche il flag
			return continueFlag.booleanValue();
		} else {
			getLogger(null).debug("[ForEachCondition::passesCondition]-END ");
			// se la condizione e' utilizzata per determinare la condizione di uscita allora
			// la condizione e' vera se il flag e' falso
			return !continueFlag.booleanValue();
		}

	}
}
