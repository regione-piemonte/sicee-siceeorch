
package it.csi.sicee.siceeorch.business.siceeorch;

import it.csi.csi.wrapper.CSIException;
import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UnrecoverableException;

import it.csi.sicee.siceeorch.dto.siceeorch.*;

import it.csi.sicee.siceeorch.interfacecsi.siceeorch.*;

import it.csi.sicee.siceeorch.exception.siceeorch.*;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.apache.log4j.*;

/**
 * @generated
 */
public class SiceeorchBean implements SessionBean {

	// business delegate contenente le implementazioni del servizio
	/**
	 * @generated
	 */
	protected SiceeorchImpl delegate = null;

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);

	/// Operazioni esposte dal servizio

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione[] elencoRegioni( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::elencoRegioni()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Regione[] valueObjRet = delegate.elencoRegioni(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "elencoRegioni()", "invocazione servizio [siceeorch]::[elencoRegioni]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::elencoRegioni()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia[] elencoProvince( //NOSONAR  Reason:EIAS

			java.lang.String codIstatRegione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::elencoProvince()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Provincia[] valueObjRet = delegate.elencoProvince(

					codIstatRegione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "elencoProvince()",
					"invocazione servizio [siceeorch]::[elencoProvince]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::elencoProvince()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune[] elencoComuni( //NOSONAR  Reason:EIAS

			java.lang.String codIstatProvincia //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::elencoComuni()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Comune[] valueObjRet = delegate.elencoComuni(

					codIstatProvincia

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "elencoComuni()", "invocazione servizio [siceeorch]::[elencoComuni]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::elencoComuni()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione getDescrizioneRegione( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getDescrizioneRegione()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Regione valueObjRet = delegate.getDescrizioneRegione(

					codIstat

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getDescrizioneRegione()",
					"invocazione servizio [siceeorch]::[getDescrizioneRegione]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getDescrizioneRegione()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune getDescrizioneComune( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getDescrizioneComune()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Comune valueObjRet = delegate.getDescrizioneComune(

					codIstat

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getDescrizioneComune()",
					"invocazione servizio [siceeorch]::[getDescrizioneComune]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getDescrizioneComune()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia getDescrizioneProvincia( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getDescrizioneProvincia()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Provincia valueObjRet = delegate.getDescrizioneProvincia(

					codIstat

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getDescrizioneProvincia()",
					"invocazione servizio [siceeorch]::[getDescrizioneProvincia]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getDescrizioneProvincia()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Via[] getVieByCodiceIstat( //NOSONAR  Reason:EIAS

			java.lang.String descrizione, //NOSONAR  Reason:EIAS

			java.lang.String codiceIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getVieByCodiceIstat()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Via[] valueObjRet = delegate.getVieByCodiceIstat(

					descrizione,

					codiceIstat

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getVieByCodiceIstat()",
					"invocazione servizio [siceeorch]::[getVieByCodiceIstat]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getVieByCodiceIstat()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Via getViaById( //NOSONAR  Reason:EIAS

			java.lang.Integer idVia //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getViaById()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Via valueObjRet = delegate.getViaById(

					idVia

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getViaById()", "invocazione servizio [siceeorch]::[getViaById]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::getViaById()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String inserisciAllegato( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::inserisciAllegato()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.inserisciAllegato(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "inserisciAllegato()",
					"invocazione servizio [siceeorch]::[inserisciAllegato]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::inserisciAllegato()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String inserisciDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::inserisciDocumento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.inserisciDocumento(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "inserisciDocumento()",
					"invocazione servizio [siceeorch]::[inserisciDocumento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::inserisciDocumento()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public void cancellaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::cancellaDocumento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			delegate.cancellaDocumento(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "cancellaDocumento()",
					"invocazione servizio [siceeorch]::[cancellaDocumento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::cancellaDocumento()] - END");

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento ricercaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::ricercaDocumento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Documento valueObjRet = delegate.ricercaDocumento(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "ricercaDocumento()",
					"invocazione servizio [siceeorch]::[ricercaDocumento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::ricercaDocumento()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public void creaAlberatura( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String anno, //NOSONAR  Reason:EIAS

			java.lang.Integer progressivoInit, //NOSONAR  Reason:EIAS

			java.lang.Integer progressivoEnd //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::creaAlberatura()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			delegate.creaAlberatura(

					idCertificatore,

					anno,

					progressivoInit,

					progressivoEnd

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "creaAlberatura()",
					"invocazione servizio [siceeorch]::[creaAlberatura]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::creaAlberatura()] - END");

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[] findElencoCertificatori( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaCertificatori filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findElencoCertificatori()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[] valueObjRet = delegate.findElencoCertificatori(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findElencoCertificatori()",
					"invocazione servizio [siceeorch]::[findElencoCertificatori]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findElencoCertificatori()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Ace valueObjRet = delegate.findAce(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findAce()", "invocazione servizio [siceeorch]::[findAce]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::findAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore findCertificatore( //NOSONAR  Reason:EIAS

			java.lang.String matricola //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findCertificatore()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Certificatore valueObjRet = delegate.findCertificatore(

					matricola

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findCertificatore()",
					"invocazione servizio [siceeorch]::[findCertificatore]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findCertificatore()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Titolo[] elencoTitoli( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::elencoTitoli()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Titolo[] valueObjRet = delegate.elencoTitoli(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "elencoTitoli()", "invocazione servizio [siceeorch]::[elencoTitoli]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::elencoTitoli()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Notaio findNotaio( //NOSONAR  Reason:EIAS

			java.lang.String email //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findNotaio()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Notaio valueObjRet = delegate.findNotaio(

					email

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findNotaio()", "invocazione servizio [siceeorch]::[findNotaio]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::findNotaio()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.Integer updateInvioLog( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.InvioLog log //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::updateInvioLog()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.Integer valueObjRet = delegate.updateInvioLog(

					log

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "updateInvioLog()",
					"invocazione servizio [siceeorch]::[updateInvioLog]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::updateInvioLog()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getParametro( //NOSONAR  Reason:EIAS

			java.lang.String code //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getParametro()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getParametro(

					code

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getParametro()", "invocazione servizio [siceeorch]::[getParametro]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::getParametro()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::verificaDocumento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport valueObjRet = delegate.verificaDocumento(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "verificaDocumento()",
					"invocazione servizio [siceeorch]::[verificaDocumento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::verificaDocumento()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo getMimeTypeInfo( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMimeTypeInfo()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo valueObjRet = delegate.getMimeTypeInfo(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMimeTypeInfo()",
					"invocazione servizio [siceeorch]::[getMimeTypeInfo]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMimeTypeInfo()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.Boolean isProductEnabled( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::isProductEnabled()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.Boolean valueObjRet = delegate.isProductEnabled(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "isProductEnabled()",
					"invocazione servizio [siceeorch]::[isProductEnabled]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::isProductEnabled()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.Boolean isServiceEnabled( //NOSONAR  Reason:EIAS

			java.lang.String nomeServizio //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::isServiceEnabled()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.Boolean valueObjRet = delegate.isServiceEnabled(

					nomeServizio

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "isServiceEnabled()",
					"invocazione servizio [siceeorch]::[isServiceEnabled]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::isServiceEnabled()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.Boolean isUserEnabled( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::isUserEnabled()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.Boolean valueObjRet = delegate.isUserEnabled(

					codiceFiscale

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "isUserEnabled()", "invocazione servizio [siceeorch]::[isUserEnabled]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::isUserEnabled()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceSostitutivi( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findAceSostitutivi()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Ace[] valueObjRet = delegate.findAceSostitutivi(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findAceSostitutivi()",
					"invocazione servizio [siceeorch]::[findAceSostitutivi]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findAceSostitutivi()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.String scrittaSfondo //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getStampaCertificato()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaCertificato(

					numCertificatore,

					progrCertificato,

					annoCertificato,

					scrittaSfondo

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getStampaCertificato()",
					"invocazione servizio [siceeorch]::[getStampaCertificato]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getStampaCertificato()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaRicevutaInvioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getStampaRicevutaInvioAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaRicevutaInvioAce(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getStampaRicevutaInvioAce()",
					"invocazione servizio [siceeorch]::[getStampaRicevutaInvioAce]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getStampaRicevutaInvioAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumentoNewDosign( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.doqui.dosign.dosign.exception.DosignException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::verificaDocumentoNewDosign()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport valueObjRet = delegate.verificaDocumentoNewDosign(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "verificaDocumentoNewDosign()",
					"invocazione servizio [siceeorch]::[verificaDocumentoNewDosign]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::verificaDocumentoNewDosign()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String startMdpTransaction( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Transazione transaction //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::startMdpTransaction()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.startMdpTransaction(

					transaction

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "startMdpTransaction()",
					"invocazione servizio [siceeorch]::[startMdpTransaction]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::startMdpTransaction()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.MdpBox getMdpPaymentMode( //NOSONAR  Reason:EIAS

			java.lang.String idApplication //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpPaymentMode()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.MdpBox valueObjRet = delegate.getMdpPaymentMode(

					idApplication

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpPaymentMode()",
					"invocazione servizio [siceeorch]::[getMdpPaymentMode]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpPaymentMode()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Transazione getMdpTransactionState( //NOSONAR  Reason:EIAS

			java.lang.String idTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpTransactionState()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Transazione valueObjRet = delegate.getMdpTransactionState(

					idTransazione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpTransactionState()",
					"invocazione servizio [siceeorch]::[getMdpTransactionState]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpTransactionState()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceFiltro( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findAceFiltro()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Ace[] valueObjRet = delegate.findAceFiltro(

					filtro,

					idCertificatore,

					flgPregresso,

					flgSostituzione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findAceFiltro()", "invocazione servizio [siceeorch]::[findAceFiltro]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::findAceFiltro()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.Integer findAceFiltroCount( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findAceFiltroCount()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.Integer valueObjRet = delegate.findAceFiltroCount(

					filtro,

					idCertificatore,

					flgPregresso,

					flgSostituzione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findAceFiltroCount()",
					"invocazione servizio [siceeorch]::[findAceFiltroCount]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findAceFiltroCount()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAceFlgPregresso( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findAceFlgPregresso()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Ace valueObjRet = delegate.findAceFlgPregresso(

					filtro,

					flgPregresso

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findAceFlgPregresso()",
					"invocazione servizio [siceeorch]::[findAceFlgPregresso]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findAceFlgPregresso()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[] getDettaglioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getDettaglioAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[] valueObjRet = delegate.getDettaglioAce(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getDettaglioAce()",
					"invocazione servizio [siceeorch]::[getDettaglioAce]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getDettaglioAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceMonitoraggio( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findAceMonitoraggio()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Ace[] valueObjRet = delegate.findAceMonitoraggio(

					idCertificatore

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findAceMonitoraggio()",
					"invocazione servizio [siceeorch]::[findAceMonitoraggio]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findAceMonitoraggio()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento estraiDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::estraiDocumento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Documento valueObjRet = delegate.estraiDocumento(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "estraiDocumento()",
					"invocazione servizio [siceeorch]::[estraiDocumento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::estraiDocumento()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String findUidRifIndex( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.Integer idTipoDoc //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findUidRifIndex()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.findUidRifIndex(

					numCertificatore,

					progrCertificato,

					annoCertificato,

					idTipoDoc

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findUidRifIndex()",
					"invocazione servizio [siceeorch]::[findUidRifIndex]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findUidRifIndex()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByCodice( //NOSONAR  Reason:EIAS

			java.lang.Integer codImpianto //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findImpiantoByCodice()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] valueObjRet = delegate.findImpiantoByCodice(

					codImpianto

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findImpiantoByCodice()",
					"invocazione servizio [siceeorch]::[findImpiantoByCodice]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findImpiantoByCodice()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPOD( //NOSONAR  Reason:EIAS

			java.lang.String pod //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findImpiantoByPOD()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] valueObjRet = delegate.findImpiantoByPOD(

					pod

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findImpiantoByPOD()",
					"invocazione servizio [siceeorch]::[findImpiantoByPOD]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findImpiantoByPOD()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPDR( //NOSONAR  Reason:EIAS

			java.lang.String pdr //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findImpiantoByPDR()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] valueObjRet = delegate.findImpiantoByPDR(

					pdr

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findImpiantoByPDR()",
					"invocazione servizio [siceeorch]::[findImpiantoByPDR]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findImpiantoByPDR()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento findLibrettoByUID( //NOSONAR  Reason:EIAS

			java.lang.String uid //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findLibrettoByUID()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Documento valueObjRet = delegate.findLibrettoByUID(

					uid

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findLibrettoByUID()",
					"invocazione servizio [siceeorch]::[findLibrettoByUID]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findLibrettoByUID()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione findProtocollazione( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::findProtocollazione()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione valueObjRet = delegate.findProtocollazione(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "findProtocollazione()",
					"invocazione servizio [siceeorch]::[findProtocollazione]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::findProtocollazione()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewTransazione( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpNewTransazione()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getMdpNewTransazione(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpNewTransazione()",
					"invocazione servizio [siceeorch]::[getMdpNewTransazione]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpNewTransazione()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewUrlWisp( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione, //NOSONAR  Reason:EIAS

			java.lang.Double valore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpNewUrlWisp()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getMdpNewUrlWisp(

					numTransazione,

					valore

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpNewUrlWisp()",
					"invocazione servizio [siceeorch]::[getMdpNewUrlWisp]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpNewUrlWisp()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta getMdpNewSceltaWisp( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpNewSceltaWisp()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta valueObjRet = delegate.getMdpNewSceltaWisp(

					numTransazione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpNewSceltaWisp()",
					"invocazione servizio [siceeorch]::[getMdpNewSceltaWisp]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpNewSceltaWisp()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewUrlPagamento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.DettaglioPagamento dettaglioPagamento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpNewUrlPagamento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getMdpNewUrlPagamento(

					dettaglioPagamento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpNewUrlPagamento()",
					"invocazione servizio [siceeorch]::[getMdpNewUrlPagamento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpNewUrlPagamento()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewStatoTransazione( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpNewStatoTransazione()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getMdpNewStatoTransazione(

					numTransazione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpNewStatoTransazione()",
					"invocazione servizio [siceeorch]::[getMdpNewStatoTransazione]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpNewStatoTransazione()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewIUV( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getMdpNewIUV()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getMdpNewIUV(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getMdpNewIUV()", "invocazione servizio [siceeorch]::[getMdpNewIUV]",
					"(valore input omesso)");
			logger.debug("[SiceeorchBean::getMdpNewIUV()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String restoreDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::restoreDocumento()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.restoreDocumento(

					documento

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "restoreDocumento()",
					"invocazione servizio [siceeorch]::[restoreDocumento]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::restoreDocumento()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaCertificatoIText( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.Integer idStatoAttestato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getStampaCertificatoIText()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaCertificatoIText(

					numCertificatore,

					progrCertificato,

					annoCertificato,

					idStatoAttestato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getStampaCertificatoIText()",
					"invocazione servizio [siceeorch]::[getStampaCertificatoIText]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getStampaCertificatoIText()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaTarghettaCertificatoIText( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::getStampaTarghettaCertificatoIText()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaTarghettaCertificatoIText(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "getStampaTarghettaCertificatoIText()",
					"invocazione servizio [siceeorch]::[getStampaTarghettaCertificatoIText]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::getStampaTarghettaCertificatoIText()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public void insertLogAccesso( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale, //NOSONAR  Reason:EIAS

			java.lang.String nome, //NOSONAR  Reason:EIAS

			java.lang.String cognome, //NOSONAR  Reason:EIAS

			java.lang.String ruolo //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceeorchBean::insertLogAccesso()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
			// inizio misurazione
			watcher.start();

			delegate.insertLogAccesso(

					codiceFiscale,

					nome,

					cognome,

					ruolo

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchBean", "insertLogAccesso()",
					"invocazione servizio [siceeorch]::[insertLogAccesso]", "(valore input omesso)");
			logger.debug("[SiceeorchBean::insertLogAccesso()] - END");

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public boolean testResources() throws it.csi.csi.wrapper.CSIException {
		return delegate.testResources();
	}

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck(it.csi.coopdiag.api.CalledResource[] alreadyChecked)
			throws it.csi.csi.wrapper.CSIException {
		return delegate.selfCheck(alreadyChecked);
	}

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() throws it.csi.csi.wrapper.CSIException {
		return delegate.hasSelfCheck();
	}

	/// lifecycle dell EJB

	/**
	 * @generated
	 */
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbCreate() {
	}

	/**
	 * @generated
	 */
	SessionContext ctx = null;

	/**
	 * @generated
	 */
	public void createImpl(Object initOptions) throws EJBException {
		Logger logger = getLogger(null);
		logger.debug("[SiceeorchBean::createImpl] - START");
		try {
			delegate = new SiceeorchImpl();
			delegate.init(initOptions);
		} catch (Exception ie) {
			logger.debug("[SiceeorchBean::createImpl] - ERROR", ie);
			throw new EJBException(
					"Errore nella inizializzazione dell'implementazione del servizio siceeorch:" + ie.getMessage(), ie);
		} finally {
			logger.debug("[SiceeorchBean::createImpl] - END");
		}
	}

	/**
	 * @generated
	 */
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {

		/// META-TODO: forse sarebbe opportuno accodare il nome del servizio al logger...
		Logger logger = getLogger(null);
		logger.debug("[SiceeorchBean::setSessionContext] - START");
		this.ctx = ctx;
		// contiene eventuali oggetti inizializzati nella sezione seguente e che
		// devono essere passati all'oggetto delegate
		Object implInitOptions = null;

		/// Inizializzazione risorse
		/*PROTECTED REGION ID(R544305632) ENABLED START*/
		// inserire qui il codice di inziializzazione risorse:
		// non verrà cancellato dalle successive rignerazioni
		// esempio di cose da fare:
		// -- leggere environment entry o context jndi 
		// -- inizializzare datasource, altre risorse
		// -- inserire le options in 'implInitOptions': saranno poi 
		//    passate al metodo initImpl()
		// NOTA: il contenuto specifico dell'oggetto implInitOptions è
		// specifico di ogni applicazione		
		/*PROTECTED REGION END*/
		/// creazione dell'implementazione
		createImpl(implInitOptions);
		logger.debug("[SiceeorchBean::setSessionContext] - END");
	}

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}
}
