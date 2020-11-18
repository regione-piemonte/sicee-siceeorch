package it.csi.sicee.siceeorch.business.handlers;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.csi.wrapper.*;
import it.csi.svcflow.orchestrator.handler.*;

/**
 * Classe base dell'handler di stop dell'orchestrazione.
 * Ha il compito di restituire al contesto eventuali errori e valori di ritorno, 
 * prendendoli dagli appositi slot.
 * @generated
 */
public abstract class StopNodeBaseHandler implements FunctionProvider {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

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
	 * @generated
	 */
	public final static String OUTPUT_BINDING_PARAM = "output.binding";

	/**
	 * @generated
	 */
	public final static String EXC_MAP_FROM_PARAM_PREFIX = "exception.mapping.from.";

	/**
	 * @generated
	 */
	public final static String EXC_MAP_TO_PARAM_PREFIX = "exception.mapping.to.";

	/**
	 * @generated
	 */
	public final static String EXC_MAP_MSG_PARAM_PREFIX = "exception.mapping.msg.";

	/**
	 * @generated
	 */
	public final static String RETURN_ATTRIBUTE_NAME = "result";

	/**
	 * @generated
	 */
	protected String _outputbindingName;

	/**
	 * @generated
	 */
	Map<Class, Class> excMap = null;

	/**
	 * @generated
	 */
	Map<Class, String> excMapMsg = null;

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
	 * inizializza il mapping delle eccezioni, prendendolo dai parametri di configurazione dell'
	 * handler.
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		// se il parametro non e' valorizzato l'operazione viene considerata void
		_outputbindingName = (String) args.get(OUTPUT_BINDING_PARAM);

		// mapping eccezioni
		excMap = new HashMap<Class, Class>();
		excMapMsg = new HashMap<Class, String>();

		// delego alla sottoclasse il popolamento delle mappe degli errori
		try {
			fillErrorMaps(args, excMap, excMapMsg);
		} catch (WorkflowException e) {
			getLogger(null)
					.error("[StopNodeBaseHandler::initFunctionHandler]-Errore nell'inizializzaizone dell handler: ", e);
			throw e;
		}

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
	 * Ricopia il valore del dataSlot di output nell'attributo "result", che
	 * sar&agrave; utilizzato nel metodo di orchestrazione come fonte del valore
	 * di ritorno (se _outputbindingname==null => void)
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[StopNodeBaseHandler::eseguiFunctionHandler]-START ");
		// verifica se c'e' un errore pendente
		if (DataSlotHelper.getLastError(ps) != null) {
			Exception e = DataSlotHelper.getLastError(ps);
			getLogger(null).debug(
					"[StopNodeBaseHandler::eseguiFunctionHandler]-rilevato errore al termine dell'orchestrazione ");
			Class srcExcCl = e.getClass();
			Class trgExcCl = excMap.get(srcExcCl);
			if (trgExcCl != null) {
				/// mapping eccezione messaggio
				String msg = "";
				java.lang.reflect.Constructor exCtr;
				try {
					exCtr = trgExcCl.getConstructor(String.class, Throwable.class);
					setExceptionToThrow(msg, e, exCtr, ps);

				} catch (SecurityException e1) {
					throw new WorkflowException("errore nell'impostazione del valore dello slot di eccezione", e1);
				} catch (NoSuchMethodException e1) {
					throw new WorkflowException("errore nell'impostazione del valore dello slot di eccezione", e1);
				}

			} else if (isCSIGenericException(e)) {
				// se l'eccezione e' una delle eccezioni base di CSI
				// viene restituita as-is
				DataSlotHelper.setDataSlotValue(RETURN_ATTRIBUTE_NAME, e, ps);
			} else {
				DataSlotHelper.setDataSlotValue(RETURN_ATTRIBUTE_NAME,
						new it.csi.csi.wrapper.UnrecoverableException("internal error: " + e + " not mapped"), ps);
			}
		} else if (_outputbindingName != null) {
			getLogger(null)
					.debug("[StopNodeBaseHandler::eseguiFunctionHandler]-impostazione valore di ritorno dallo slot "
							+ _outputbindingName + " ");
			Object retVal = DataSlotHelper.getDataSlotValue(_outputbindingName, ps);
			if (retVal != null)
				DataSlotHelper.setDataSlotValue(RETURN_ATTRIBUTE_NAME, retVal, ps);
		}
		getLogger(null).debug("[StopNodeBaseHandler::eseguiFunctionHandler]-END ");
	}

	/**
	 * imposta nello slot di errore l'eccezione da rilanciare
	 * @param msg il messaggio di errore
	 * @param e l'eccezione originaria
	 * @param exCtr costruttore dell'eccezione
	 * @param ps
	 */
	protected void setExceptionToThrow(String msg, Exception e, java.lang.reflect.Constructor exCtr, PropertySet ps)
			throws WorkflowException {
		CSIException eToThrow;
		try {
			eToThrow = (CSIException) exCtr.newInstance(msg, e);
			DataSlotHelper.setDataSlotValue(RETURN_ATTRIBUTE_NAME, eToThrow, ps);
		} catch (IllegalArgumentException e1) {
			throw new WorkflowException("errore nell'impostazione del valore dello slot di eccezione", e1);
		} catch (InstantiationException e1) {
			throw new WorkflowException("errore nell'impostazione del valore dello slot di eccezione", e1);
		} catch (IllegalAccessException e1) {
			throw new WorkflowException("errore nell'impostazione del valore dello slot di eccezione", e1);
		} catch (java.lang.reflect.InvocationTargetException e1) {
			throw new WorkflowException("errore nell'impostazione del valore dello slot di eccezione", e1);
		}
	}

	/**
	 * verifica se l'eccezione e' una eccezione base di CSI.
	 */
	private boolean isCSIGenericException(Exception e) {
		return e.getClass().getPackage().getName().contains("it.csi.csi.wrapper");
	}

	/**
	 * Determina la modalit&agrave; di popolamento delle mappe degli errori.
	 * @param args mappa contenente la configurazione del workflow
	 * @param excMap rimappa le eccezioni interne con quelle restituibili dal servizio orchestrato
	 * @param excMapMsg rimappa i messaggi di errore
	 * @throws Exception in caso di errore
	 * @generated
	 */
	protected abstract void fillErrorMaps(Map args, Map<Class, Class> excMap, Map<Class, String> excMapMsg)
			throws WorkflowException;

}
