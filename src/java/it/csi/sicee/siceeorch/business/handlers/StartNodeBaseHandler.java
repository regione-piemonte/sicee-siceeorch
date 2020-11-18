package it.csi.sicee.siceeorch.business.handlers;

import java.util.*;

import org.apache.log4j.Logger;
import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * Classe base di implementazione del nodo di Start.
 * Ha il compito di reperire dal contesto i valori dei parametri di input
 * dell'operazione e inserirli negli slot corrispondenti.
 * @generated
 */
public abstract class StartNodeBaseHandler implements FunctionProvider {

	/**
	 * il prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * Il logger da utilizzare per loggare le operazioni dell'handler
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
	 * prefisso dei parametri di configurazione dell'handler che determinano l'elenco degli 
	 * slot da utilizzare come deposito dei valori dei parametri di input
	 * @generated
	 */
	public final static String INPUT_BINDING_PARAM_PREFIX = "input.binding.";

	/**
	 * elenco dei binding <nome parametro, nome slot>
	 * @generated
	 */
	protected Map<String, String> _inputNameBindings;

	/**
	 * nome del parametro di configurazione dell'handler in cui viene configurato
	 * il nome dello slot interno utilizzato per contenere un eventuale valorizzazione
	 * del principal (ottenuto se il servizio e' soggetto ad autenticazione)
	 * @generated
	 */
	public final static String CALLER_PRINCIPAL_NAME_SLOT_PARAM = "caller.principal.name.slot";

	/**
	 * slot interno utilizzato per contenere un eventuale valorizzazione
	 * del principal (ottenuto se il servizio e' soggetto ad autenticazione)
	 * @generated
	 */
	protected String _callerPrincipalNameSlot;

	/**
	 * esecuzione della logica dell'handler.
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
	 * inizializzazione delll'handler: dalla configurazione dell'handler vengono letti i
	 * binding <nome-parametro>=<nome_slot> 
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[StartNodeBaseHandler::initFunctionHandler]-START ");
		_inputNameBindings = new HashMap<String, String>();
		Iterator argnames_it = args.keySet().iterator();
		getLogger(null).debug("[StartNodeBaseHandler::initFunctionHandler]-binding dei parametri di input ");
		while (argnames_it.hasNext()) {
			String currArgName = (String) argnames_it.next();
			if (!currArgName.startsWith(INPUT_BINDING_PARAM_PREFIX))
				continue;

			String currArgVal = (String) args.get(currArgName);
			StringTokenizer stok = new StringTokenizer(currArgVal, "=");
			if (stok.countTokens() != 2)
				throw new WorkflowException("Errore nell'inizializzazione del workflow: il formato del parametro "
						+ currArgName + " deve essere <nomeparametro>=<nomedataslot>, invece e' " + currArgVal);
			else {
				String currInput = stok.nextToken();
				String currDS = stok.nextToken();
				_inputNameBindings.put(currInput, currDS);
				getLogger(null).debug("[StartNodeBaseHandler::initFunctionHandler]-parametro:" + currInput + "->slot:"
						+ currDS + " ");
			}
		}

		getLogger(null).debug("[StartNodeBaseHandler::initFunctionHandler]-binding del Principal ");
		if (args.get(CALLER_PRINCIPAL_NAME_SLOT_PARAM) != null) {
			_callerPrincipalNameSlot = (String) args.get(CALLER_PRINCIPAL_NAME_SLOT_PARAM);
		}

		getLogger(null).debug("[StartNodeBaseHandler::initFunctionHandler]-END ");
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
	 * Copia i valori dei parametri di input nei rispettivi DataSlot, 
	 * prendendo le informazioni di mapping da _inputNameBindings
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[StartNodeBaseHandler::eseguiFunctionHandler]-START ");
		getLogger(null).debug("[StartNodeBaseHandler::eseguiFunctionHandler]-inizializzazione slot di input ");
		Iterator<String> paramNames_it = _inputNameBindings.keySet().iterator();
		while (paramNames_it.hasNext()) {
			String currParamName = paramNames_it.next();
			String currDSName = _inputNameBindings.get(currParamName);
			DataSlotHelper.setDataSlotValue(currDSName,
					DataSlotHelper.getDataSlotValue("input.parameter." + currParamName, ps), ps);
		}

		getLogger(null).debug("[StartNodeBaseHandler::eseguiFunctionHandler]-inizializzazione slot del Principal ");
		if (_callerPrincipalNameSlot != null) {
			DataSlotHelper.setDataSlotValue(_callerPrincipalNameSlot,
					DataSlotHelper.getDataSlotValue(CALLER_PRINCIPAL_NAME_SLOT_PARAM, ps), ps);
		}

		getLogger(null).debug("[StartNodeBaseHandler::eseguiFunctionHandler]-END ");
	}

}
