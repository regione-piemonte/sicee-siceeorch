package it.csi.sicee.siceeorch.business.handlers;

import java.lang.reflect.Array;
import com.opensymphony.module.propertyset.PropertySet;

/**
 * Classe di utilita' per la gestione dei data-slot all'interno del contesto di esecuzione 
 * di osworkflow.
 * @generated
 */
public class DataSlotHelper {

	/**
	 * Nome dello slot implicito utilizzato di default dagli handler per inserire l'ultima
	 * eccezione occorsa.
	 * @generated 
	 */
	public final static String LAST_ERROR_SLOT_NAME = "_lastError";

	/**
	 * Nome dello slot implicito utilizzato di default dagli handler per inserire l'ultima
	 * condizione valutata.
	 * @generated 
	 */
	public final static String LAST_CONDITION_VALUE_SLOT_NAME = "_lastConditionValue";

	/**
	 * restituisce l'eventuale ultimo errore presente nel contesto
	 * @param ps
	 * @return l'eccezione se presente 
	 * @throws Exception
	 * @generated
	 */
	public static Exception getLastError(PropertySet ps) {
		return (Exception) (getDataSlotValue(LAST_ERROR_SLOT_NAME, ps));
	}

	/**
	 * imposta l'ultimo errore nell'apposito slot
	 * @param exc
	 * @param ps
	 * @generated
	 */
	public static void setLastError(Exception exc, PropertySet ps) {
		DataSlotHelper.setDataSlotValue(LAST_ERROR_SLOT_NAME, exc, ps);
	}

	/**
	 * @param ps
	 * @return il valore dell'ultima condizone valutata 
	 * @generated
	 */
	public static Boolean getLastConditionValue(PropertySet ps) {
		return (Boolean) (getDataSlotValue(LAST_CONDITION_VALUE_SLOT_NAME, ps));
	}

	/**
	 * imposta il valore dell'ultima condizione valutata
	 * @param condVal il valore booleano
	 * @param ps
	 * @generated
	 */
	public static void setLastConditionValue(Boolean condVal, PropertySet ps) {
		DataSlotHelper.setDataSlotValue(LAST_CONDITION_VALUE_SLOT_NAME, condVal, ps);
	}

	/**
	 * @param name il nome dello slot di cui si vuole leggere il valore
	 * @param ps
	 * @return il valore
	 * @generated
	 */
	public static Object getDataSlotValue(String name, PropertySet ps) {
		return ps.getObject(name);
	}

	/**
	 * imposta il valore dello slot specificato
	 * @param name il nome dello slot
	 * @param val il valore da impostare
	 * @param ps
	 * @generated
	 */
	public static void setDataSlotValue(String name, Object val, PropertySet ps) {
		if (val != null) {
			ps.setObject(name, val);
		} else {
			ps.remove(name);
		}
	}

	/**
	 * @generated
	 */
	public static Object initDataSlotValue(Class type) {
		try {
			Object ris = type.newInstance();
			return ris;
		} catch (InstantiationException e) {
			throw new IllegalArgumentException("impossibile istanziare lo slot di tipo " + type + ":" + e);
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("impossibile istanziare lo slot di tipo " + type + ":" + e);
		}
	}

	/**
	 * @param clname
	 * @return la classe di nome clname
	 * @throws ClassnotFoundException
	 * @generated
	 */
	public static Class classForName(String clname) throws ClassNotFoundException {
		if (clname.endsWith("[]")) {
			String compName = clname.substring(0, clname.length() - 2);
			Object dummyArr = Array.newInstance(classForName(compName), 0);
			return dummyArr.getClass();
		} else {
			return Class.forName(clname);
		}
	}
}
