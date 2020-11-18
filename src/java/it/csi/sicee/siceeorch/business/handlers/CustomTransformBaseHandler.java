package it.csi.sicee.siceeorch.business.handlers;

import java.util.*;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * Classe base per la gestione delle trasformazioni custom (hand written).
 * @generated 
 */
public abstract class CustomTransformBaseHandler implements FunctionProvider {

	/**
	 * il prefisso del logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * Il logger da utilizzare per loggare le operazioni dell'handler
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * prefisso dei parametri della configurazione dell'handler dove sono configurati i
	 * nomi degli slot di input alla trasformazione
	 * @generated
	 */
	public static final String INPUT_SLOT_NAME_PARAM_PREFIX = "input.slot.name.";

	/**
	 * prefisso dei parametri della configurazione dell'handler dove sono configurati i
	 * tipi degli slot di input alla trasformazione
	 * @generated
	 */
	public static final String INPUT_SLOT_CLASS_PARAM_PREFIX = "input.slot.class.";

	/**
	 * prefisso dei parametri della configurazione dell'handler dove sono configurati i
	 * nomi degli slot di output alla trasformazione
	 * @generated
	 */
	public static final String OUTPUT_SLOT_NAME_PARAM = "output.slot.name";

	/**
	 * prefisso dei parametri della configurazione dell'handler dove sono configurati i
	 * tipi degli slot di output alla trasformazione
	 * @generated
	 */
	public static final String OUTPUT_SLOT_CLASS_PARAM = "output.slot.class";

	/**
	 * @generated
	 */
	public static final String INIT_OUTPUT_PARAM = "output.slot.init";

	/**
	 * @generated
	 */
	protected ArrayList<String> _inputSlotNames;

	/**
	 * @generated
	 */
	protected String _outputSlotName;

	/**
	 * @generated
	 */
	protected boolean _initOutSlot = false;

	/**
	 * @generated
	 */
	public void execute(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		this.initFunctionHandler(transientVars, args, ps);

		this.eseguiFunctionHandler(transientVars, args, ps);

		this.releaseFunctionHandler(transientVars, args, ps);
	}

	/**
	 * inizializza il function handler leggendo dalla configiurazione i nomi e i tipi
	 * degli slot di input e output
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	protected void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[CustomTransformBaseHandler::initFunctionHandler]-START ");
		// input slots
		_inputSlotNames = new ArrayList<String>();

		Iterator<String> argnames_it = args.keySet().iterator();
		while (argnames_it.hasNext()) {
			String currArgname = argnames_it.next();
			String currArgVal = null;
			if (currArgname.startsWith(INPUT_SLOT_NAME_PARAM_PREFIX)) {
				currArgVal = (String) args.get(currArgname);
				_inputSlotNames.add(currArgVal);
				getLogger(null)
						.debug("[CustomTransformBaseHandler::initFunctionHandler]-input slot::" + currArgVal + " ");
			} else if (currArgname.startsWith(INPUT_SLOT_CLASS_PARAM_PREFIX)) {
				currArgVal = (String) args.get(currArgname);

			}
		}
		// out slot
		String outSlotName = (String) args.get(OUTPUT_SLOT_NAME_PARAM);
		if (outSlotName != null) {
			_outputSlotName = outSlotName.trim();
			getLogger(null).debug("[CustomTransformBaseHandler::initFunctionHandler]-output slot:" + outSlotName + " ");
			String outClassName = (String) args.get(OUTPUT_SLOT_CLASS_PARAM);

		} else
			throw new WorkflowException("Errore interno nell'inizializzazione dell'hanlder: output slot nullo");
		getLogger(null).debug("[CustomTransformBaseHandler::eseguiFunctionHandler]-END ");
	}

	/**
	 * Termina l'esecuzione del funciotn handler
	 * (nessuna operazione)
	 * @param transientVars
	 * @param args
	 * @param ps
	 * throws WorkflowException
	 * @generated
	 */
	protected void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
	}

	/**
	 * Esecuzione della logica di trasformazione (delegata al metodo getTransformedObject()
	 * ridefinito nella sottoclasse.
	 * Prepara i valori degli slot in input e li passa al metodo di trasformazione.
	 * Al termine inserisce nello slot di output il risultato della trasformazione
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[CustomTransformBaseHandler::eseguiFunctionHandler]-START ");
		getLogger(null).debug(
				"[CustomTransformBaseHandler::eseguiFunctionHandler]-lettura degli input della trasformazione dagli slot ");
		Map<String, Object> inputs = new HashMap<String, Object>();

		for (int i = 0; i < _inputSlotNames.size(); i++) {
			String currInSlotName = _inputSlotNames.get(i);
			getLogger(null).debug("[CustomTransformBaseHandler::eseguiFunctionHandler]-input:" + currInSlotName + " ");
			Object currInSlotVal = ps.getObject(currInSlotName);
			inputs.put(currInSlotName, currInSlotVal);
		}
		Object outVal = getTransformedObject(inputs);
		DataSlotHelper.setDataSlotValue(_outputSlotName, outVal, ps);
		getLogger(null).debug("[CustomTransformBaseHandler::eseguiFunctionHandler]-END ");
	}

	/**
	 * Questo metodo deve essere ridefinito nelle sottoclassi specifiche con la logica 
	 * di trasformazione vera e propria.
	 *  
	 * @param inValues mappa contenente i valori dei dataSlot di input. Per trasformazioni
	 * incrementali anche il dataSlot di output puo' essere un dataSlot di input.
	 * @return l'oggetto trasformato, che verr&agrave; rimpiazzato al valore eventualmente precedente
	 * nel context.
	 * @generated
	 */
	public abstract Object getTransformedObject(Map<String, Object> inValues);

}
