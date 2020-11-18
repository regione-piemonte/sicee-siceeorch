package it.csi.sicee.siceeorch.business.handlers;

import java.util.*;
import org.apache.log4j.Logger;
import java.lang.reflect.Array;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.FunctionProvider;
import com.opensymphony.workflow.WorkflowException;

import it.csi.svcflow.orchestrator.handler.*;

/**
 * Classe base di implementazione del nodo ForEach.
 * @generated
 */
public class ForEachBaseHandler implements FunctionProvider {

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
	 * nome del parametro di configurazione dell'handler che contiene il
	 * nome dello slot che contiene la collection su cui e' necessario
	 * iterare
	 * @generated
	 */
	public final static String COLLECTION_SLOT_NAME_PARAM_NAME = "collection.slot.name";

	/**
	 * nome del parametro di configurazione dell'handler che contiene il
	 * nome dello slot in cui deve essere inserito ad ogni iterazione l'elemento
	 * corrente della collezione su cui si sa iterando 
	 * @generated
	 */
	public final static String ITEM_SLOT_NAME_PARAM_NAME = "item.slot.name";

	/**
	 * suffisso utilizzato per determinare il nome dello slot (interno) in cui deve essere 
	 * inserito l'iterator. 
	 * @generated
	 */
	public final static String ITERATOR_SLOT_NAME_SUFFIX = "_for_each_iterator";

	/**
	 * suffisso del nome dello slot interno in cui deve essere inserto il flag che indica se 
	 * ci sono ancora elementi su cui iterare
	 * @generated
	 */
	public final static String MORE_ELEMENTS_SLOT_NAME_SUFFIX = "_has_more_elements";

	/**
	 * nome dello slot contenente la collection su cui si deve iterare
	 * @generated
	 */
	protected String _collectionSlotName;

	/**
	 * nome dello slot in cui ad ogni iterazione viene inserito l'elemento corrente
	 * @generated
	 */
	protected String _itemSlotName;

	/**
	 * esecuzione della logica
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
	 * inizializzazione dell'handler.
	 * vengono reperiti dalla configurazione dell'handler i nomi delgi slot destinati a:
	 * - collection
	 * - item corrente
	 * @param transientVars
	 * @param args
	 * @param ps
	 * @throws WorkflowException
	 * @generated
	 */
	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[ForEachBaseHandler::initFunctionHandler]-START ");
		String collSN = (String) args.get(COLLECTION_SLOT_NAME_PARAM_NAME);
		String itemSN = (String) args.get(ITEM_SLOT_NAME_PARAM_NAME);
		if (collSN == null || collSN.length() == 0)
			throw new WorkflowException(
					"Errore nell'inizializzazione dell handler ForEach: non e' stato impostato il parametro "
							+ COLLECTION_SLOT_NAME_PARAM_NAME);
		if (itemSN == null || itemSN.length() == 0)
			throw new WorkflowException(
					"Errore nell'inizializzazione dell handler ForEach: non e' stato impostato il parametro "
							+ ITEM_SLOT_NAME_PARAM_NAME);
		//
		_collectionSlotName = collSN.trim();
		_itemSlotName = itemSN.trim();
		getLogger(null).debug("[ForEachBaseHandler::initFunctionHandler]-collection slot:" + _collectionSlotName + " ");
		getLogger(null).debug("[ForEachBaseHandler::initFunctionHandler]-item slot:" + _itemSlotName + " ");
		getLogger(null).debug("[ForEachBaseHandler::initFunctionHandler]-END ");
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
	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[ForEachBaseHandler::eseguiFunctionHandler]-START ");
		// e' il primo giro?
		Iterator iterator = (Iterator) DataSlotHelper.getDataSlotValue(_collectionSlotName + ITERATOR_SLOT_NAME_SUFFIX,
				ps);
		if (iterator == null) {
			getLogger(null).debug("[ForEachBaseHandler::eseguiFunctionHandler]-primo giro ");
			// inizializza il loop
			Object collectionVal = DataSlotHelper.getDataSlotValue(_collectionSlotName, ps);
			if (collectionVal == null)
				throw new WorkflowException("Errore nel loop: collezione nulla");

			// la collection dovrebbe essere di tipo array (garantito da check) 
			if (!collectionVal.getClass().isArray())
				throw new WorkflowException("Errore durante iniziualizzazione ForEach: il tipo della collection "
						+ _collectionSlotName + " non e' un typed array ma " + collectionVal.getClass());
			else {
				// ok vai
				ArrayList coll = new ArrayList();
				if (collectionVal != null) {
					int sz = Array.getLength(collectionVal);
					getLogger(null).debug(
							"[ForEachBaseHandler::eseguiFunctionHandler]-la collezione contiene:" + sz + "elementi  ");
					for (Object curr : (Object[]) collectionVal) {
						coll.add(curr);
					}
				}
				iterator = coll.iterator();
				DataSlotHelper.setDataSlotValue(_collectionSlotName + ITERATOR_SLOT_NAME_SUFFIX, iterator, ps);
			}
		}

		// in ogni caso verifica se ci sono ancora elementi e carica il prossimo
		if (iterator.hasNext()) {
			getLogger(null)
					.debug("[ForEachBaseHandler::eseguiFunctionHandler]-caricamento prossimo elemento nello slot "
							+ _itemSlotName + " ");
			Object next = iterator.next();
			// rende disponibile il prossimo elemento nello slot item
			DataSlotHelper.setDataSlotValue(_itemSlotName, next, ps);
			// imposta al condizione di loop a true
			DataSlotHelper.setDataSlotValue(_collectionSlotName + MORE_ELEMENTS_SLOT_NAME_SUFFIX, Boolean.TRUE, ps);
		} else {
			getLogger(null)
					.debug("[ForEachBaseHandler::eseguiFunctionHandler]-non ci sono piu' elementi su cui iterare ");
			// rimuove dal property set l'attributo di iterazione
			DataSlotHelper.setDataSlotValue(_itemSlotName, null, ps);
			DataSlotHelper.setDataSlotValue(_collectionSlotName + ITERATOR_SLOT_NAME_SUFFIX, null, ps);
			DataSlotHelper.setDataSlotValue(_collectionSlotName + MORE_ELEMENTS_SLOT_NAME_SUFFIX, null, ps);
			// imposta la condizione di loop a false
			DataSlotHelper.setDataSlotValue(_collectionSlotName + MORE_ELEMENTS_SLOT_NAME_SUFFIX, Boolean.FALSE, ps);
		}
	}
}
