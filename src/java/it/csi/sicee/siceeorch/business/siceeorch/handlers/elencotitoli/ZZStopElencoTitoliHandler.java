package it.csi.sicee.siceeorch.business.siceeorch.handlers.elencotitoli;

import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/**
 * Implementazione dello stop node [stopElencoTitoli].
 * @generated
 */
public class ZZStopElencoTitoliHandler extends StopNodeBaseHandler {

	/**
	 * Determina la modalit&agrave; di popolamento delle mappe degli errori.
	 * @param args mappa contenente la configurazione del workflow
	 * @param excMap viene riempita con i mapping delle eccezioni interne con quelle restituibili 
	          dal servizio orchestrato
	 * @param excMapMsg viene riempita con i mapping tra eccezioni e messaggi di errore
	 * @throws Exception in caso di errore
	 * @generated
	 */
	protected void fillErrorMaps(Map args, Map<Class, Class> excMap, Map<Class, String> excMapMsg)
			throws WorkflowException {

		// itera sui parametri per cercare quelli che determinano
		// il mapping delle eccezioni
		Iterator<String> key_it = args.keySet().iterator();
		while (key_it.hasNext()) {
			String currK = (String) key_it.next();
			if (currK.startsWith(EXC_MAP_FROM_PARAM_PREFIX)) {
				// eccezione di partenza
				String currFrom = (String) args.get(currK);
				String index = currK.substring(currK.lastIndexOf(".") + 1);
				// eccezione in cui deve essere rimappata l'eccezione di partenza
				String currTo = (String) args.get(EXC_MAP_TO_PARAM_PREFIX + index);
				// messaggio da inserire dopo aver effettuato il remapping
				String currMsg = (String) args.get(EXC_MAP_MSG_PARAM_PREFIX + index);
				try {
					Class fromClass = Class.forName(currFrom);
					Class toClass = Class.forName(currTo);
					excMap.put(fromClass, toClass);
					excMapMsg.put(fromClass, currMsg);
				} catch (Exception e) {
					getLogger(null).error(
							"[StopNodeBaseHandler::initFunctionHandler]-Errore nell'inizializzaizone dell handler: ",
							e);
					throw new WorkflowException("Errore nell'inizializzazione dell'handler:" + e);
				}
			}
		}

	}
}
