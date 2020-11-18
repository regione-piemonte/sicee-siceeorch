package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import java.util.StringTokenizer;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.Condition;
import com.opensymphony.workflow.WorkflowException;

/**
 * condiizone utilizzata per valutare se e' stata sollevata una eccezione. 
 * @generated
 */
public class ExceptionRaisedCondition implements Condition {

	/**
	 * @prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * logger da utilizzare per loggare le operazioni
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
	 * nome del parametro della configurazione che contiene l'elenco delle eccezioni 
	 * gestite
	 * @generated
	 */
	public final static String HANDLED_EXCEPTIONS_PARAM_NAME = "handled.exceptions";

	/**
	 * la condizione si deve ritenere verificata quando nell'apposito slot e' presente
	 * una eccezione compresa tra quelle gestite
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public boolean passesCondition(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[ExceptionRaisedCondition::passesCondition]-START ");
		String hndExcs = (String) args.get(HANDLED_EXCEPTIONS_PARAM_NAME);
		if (hndExcs == null)
			throw new WorkflowException(
					"errore nella configurazione della condizione di verifica eccezioni: occorre configurare "
							+ "il parametro " + HANDLED_EXCEPTIONS_PARAM_NAME
							+ " valorizzandolo con la lista dei f.q.n delle eccezioni gestite, separate da ','.");

		Exception lastError = DataSlotHelper.getLastError(ps);
		if (lastError != null) {
			StringTokenizer strtok = new StringTokenizer(hndExcs, ",");
			while (strtok.hasMoreTokens()) {
				String currExc = strtok.nextToken();
				if (currExc.equals(lastError.getClass().getName())) {
					getLogger(null).debug(
							"[ExceptionRaisedCondition::passesCondition]-rilevata eccezione gestita:" + currExc + " ");
					getLogger(null).debug("[ExceptionRaisedCondition::passesCondition]-END ");
					return true;
				}
			}
			// se arrivo qui non e' stata trovata l'eccezione
			getLogger(null).debug("[ExceptionRaisedCondition::passesCondition]-END ");
			return false;
		} else {
			getLogger(null).debug("[ExceptionRaisedCondition::eseguiFunctionHandler]-END ");
			return false;
		}
	}
}
