
package it.csi.sicee.siceeorch.business.siceeorch;

import it.csi.csi.wrapper.*;
import it.csi.svcflow.orchestrator.engine.OswMainEngine;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.dto.siceeorch.*;

import it.csi.sicee.siceeorch.interfacecsi.siceeorch.*;

import it.csi.sicee.siceeorch.exception.siceeorch.*;

import it.csi.coopdiag.api.*;
import it.csi.coopdiag.engine.utils.*;

import javax.sql.DataSource;
import org.apache.log4j.*;

/*PROTECTED REGION ID(R393441536) ENABLED START*/
// aggiungere qui eventuali import aggiuntive.
// verranno preservate in rigenerazioni successive del progetto
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class SiceeorchImpl {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);

	/*PROTECTED REGION ID(R-47908578) ENABLED START*/
	// inserire qui la definizione di varibili locale o costanti dell'implementazione.
	// non verranno sovrascritte da successive rigenerazioni
	/*PROTECTED REGION END*/

	/// Implementazione operazioni esposte dal servizio

	/**
	* @generated
	*/
	public Object eseguiWorkFlow(String workflowDescriptor, java.util.HashMap persistentParams, String methodName,
			String remoteUser) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException {
		//Logger logger = getLogger(null);
		logger.debug("[SiceeorchImpl::methodName] - START");
		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceeorch");
		// inizio misurazione
		watcher.start();

		try {

			// inizializzazione e richiamo del flusso
			OswMainEngine.esecuzioneWorkflow(remoteUser, workflowDescriptor, Integer.valueOf(0), persistentParams);

			Object retVal = persistentParams.get("result");
			// se il valore di ritorno e'un'eccezione occorre rilanciarla (anche se metodo void)
			if (retVal != null && retVal instanceof Exception) {
				logger.error("[SiceeorchImpl::methodName] - Errore occorso nell'esecuzione del flusso\"+retVal+\"",
						(Exception) retVal);
				throw (Exception) retVal;
			}

			else {
				return persistentParams.get("result");
			}

		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceeorchImpl::methodName] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceeorchImpl::methodName] - Errore imprevisto occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceeorchImpl", "methodName()", "invocazione servizio [siceeorch]::[methodName]",
					"(valore input omesso)");
			logger.debug("[SiceeorchImpl::methodName] - END");
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione[] elencoRegioni(

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchElencoRegioni";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "elencoRegioni", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Regione[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia[] elencoProvince(

			java.lang.String codIstatRegione //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchElencoProvince";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codIstatRegione", codIstatRegione);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "elencoProvince", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Provincia[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune[] elencoComuni(

			java.lang.String codIstatProvincia //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchElencoComuni";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codIstatProvincia", codIstatProvincia);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "elencoComuni", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Comune[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione getDescrizioneRegione(

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetDescrizioneRegione";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codIstat", codIstat);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getDescrizioneRegione", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Regione) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune getDescrizioneComune(

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetDescrizioneComune";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codIstat", codIstat);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getDescrizioneComune", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Comune) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia getDescrizioneProvincia(

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetDescrizioneProvincia";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codIstat", codIstat);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getDescrizioneProvincia", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Provincia) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Via[] getVieByCodiceIstat(

			java.lang.String descrizione, //NOSONAR  Reason:EIAS

			java.lang.String codiceIstat //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetVieByCodiceIstat";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.descrizione", descrizione);

		persistentParams.put("input.parameter.codiceIstat", codiceIstat);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getVieByCodiceIstat", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Via[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Via getViaById(

			java.lang.Integer idVia //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetViaById";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.idVia", idVia);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getViaById", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Via) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String inserisciAllegato(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchInserisciAllegato";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "inserisciAllegato", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String inserisciDocumento(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchInserisciDocumento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "inserisciDocumento", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public void cancellaDocumento(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchCancellaDocumento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "cancellaDocumento", remoteUser);

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento ricercaDocumento(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchRicercaDocumento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "ricercaDocumento", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Documento) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public void creaAlberatura(

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String anno, //NOSONAR  Reason:EIAS

			java.lang.Integer progressivoInit, //NOSONAR  Reason:EIAS

			java.lang.Integer progressivoEnd //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchCreaAlberatura";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.idCertificatore", idCertificatore);

		persistentParams.put("input.parameter.anno", anno);

		persistentParams.put("input.parameter.progressivoInit", progressivoInit);

		persistentParams.put("input.parameter.progressivoEnd", progressivoEnd);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "creaAlberatura", remoteUser);

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[] findElencoCertificatori(

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaCertificatori filtro //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindElencoCertificatori";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.filtro", filtro);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findElencoCertificatori", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAce(

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindAce";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.filtro", filtro);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findAce", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Ace) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore findCertificatore(

			java.lang.String matricola //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindCertificatore";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.matricola", matricola);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findCertificatore", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Certificatore) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Titolo[] elencoTitoli(

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchElencoTitoli";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "elencoTitoli", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Titolo[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Notaio findNotaio(

			java.lang.String email //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindNotaio";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.email", email);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findNotaio", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Notaio) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.Integer updateInvioLog(

			it.csi.sicee.siceeorch.dto.siceeorch.InvioLog log //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchUpdateInvioLog";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.log", log);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "updateInvioLog", remoteUser);

		return (java.lang.Integer) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String getParametro(

			java.lang.String code //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetParametro";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.code", code);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getParametro", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumento(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchVerificaDocumento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "verificaDocumento", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo getMimeTypeInfo(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMimeTypeInfo";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMimeTypeInfo", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.Boolean isProductEnabled(

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchIsProductEnabled";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "isProductEnabled", remoteUser);

		return (java.lang.Boolean) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.Boolean isServiceEnabled(

			java.lang.String nomeServizio //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchIsServiceEnabled";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.nomeServizio", nomeServizio);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "isServiceEnabled", remoteUser);

		return (java.lang.Boolean) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.Boolean isUserEnabled(

			java.lang.String codiceFiscale //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchIsUserEnabled";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codiceFiscale", codiceFiscale);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "isUserEnabled", remoteUser);

		return (java.lang.Boolean) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceSostitutivi(

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindAceSostitutivi";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.filtro", filtro);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findAceSostitutivi", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Ace[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public byte[] getStampaCertificato(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.String scrittaSfondo //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetStampaCertificato";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		persistentParams.put("input.parameter.scrittaSfondo", scrittaSfondo);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getStampaCertificato", remoteUser);

		return (byte[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public byte[] getStampaRicevutaInvioAce(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetStampaRicevutaInvioAce";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getStampaRicevutaInvioAce", remoteUser);

		return (byte[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumentoNewDosign(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.doqui.dosign.dosign.exception.DosignException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchVerificaDocumentoNewDosign";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "verificaDocumentoNewDosign", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String startMdpTransaction(

			it.csi.sicee.siceeorch.dto.siceeorch.Transazione transaction //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchStartMdpTransaction";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.transaction", transaction);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "startMdpTransaction", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.MdpBox getMdpPaymentMode(

			java.lang.String idApplication //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpPaymentMode";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.idApplication", idApplication);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpPaymentMode", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.MdpBox) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Transazione getMdpTransactionState(

			java.lang.String idTransazione //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpTransactionState";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.idTransazione", idTransazione);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpTransactionState", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Transazione) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceFiltro(

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindAceFiltro";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.filtro", filtro);

		persistentParams.put("input.parameter.idCertificatore", idCertificatore);

		persistentParams.put("input.parameter.flgPregresso", flgPregresso);

		persistentParams.put("input.parameter.flgSostituzione", flgSostituzione);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findAceFiltro", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Ace[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.Integer findAceFiltroCount(

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindAceFiltroCount";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.filtro", filtro);

		persistentParams.put("input.parameter.idCertificatore", idCertificatore);

		persistentParams.put("input.parameter.flgPregresso", flgPregresso);

		persistentParams.put("input.parameter.flgSostituzione", flgSostituzione);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findAceFiltroCount", remoteUser);

		return (java.lang.Integer) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAceFlgPregresso(

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindAceFlgPregresso";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.filtro", filtro);

		persistentParams.put("input.parameter.flgPregresso", flgPregresso);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findAceFlgPregresso", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Ace) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[] getDettaglioAce(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetDettaglioAce";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getDettaglioAce", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceMonitoraggio(

			java.lang.String idCertificatore //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindAceMonitoraggio";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.idCertificatore", idCertificatore);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findAceMonitoraggio", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Ace[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento estraiDocumento(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchEstraiDocumento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "estraiDocumento", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Documento) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String findUidRifIndex(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.Integer idTipoDoc //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindUidRifIndex";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		persistentParams.put("input.parameter.idTipoDoc", idTipoDoc);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findUidRifIndex", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByCodice(

			java.lang.Integer codImpianto //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindImpiantoByCodice";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codImpianto", codImpianto);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findImpiantoByCodice", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Impianto[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPOD(

			java.lang.String pod //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindImpiantoByPOD";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.pod", pod);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findImpiantoByPOD", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Impianto[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPDR(

			java.lang.String pdr //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindImpiantoByPDR";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.pdr", pdr);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findImpiantoByPDR", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Impianto[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento findLibrettoByUID(

			java.lang.String uid //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindLibrettoByUID";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.uid", uid);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findLibrettoByUID", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Documento) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione findProtocollazione(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchFindProtocollazione";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "findProtocollazione", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewTransazione(

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpNewTransazione";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpNewTransazione", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewUrlWisp(

			java.lang.String numTransazione, //NOSONAR  Reason:EIAS

			java.lang.Double valore //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpNewUrlWisp";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numTransazione", numTransazione);

		persistentParams.put("input.parameter.valore", valore);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpNewUrlWisp", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta getMdpNewSceltaWisp(

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpNewSceltaWisp";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numTransazione", numTransazione);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpNewSceltaWisp", remoteUser);

		return (it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewUrlPagamento(

			it.csi.sicee.siceeorch.dto.siceeorch.DettaglioPagamento dettaglioPagamento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpNewUrlPagamento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.dettaglioPagamento", dettaglioPagamento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpNewUrlPagamento", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewStatoTransazione(

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpNewStatoTransazione";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numTransazione", numTransazione);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpNewStatoTransazione", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewIUV(

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetMdpNewIUV";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getMdpNewIUV", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public java.lang.String restoreDocumento(

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchRestoreDocumento";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.documento", documento);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "restoreDocumento", remoteUser);

		return (java.lang.String) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public byte[] getStampaCertificatoIText(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.Integer idStatoAttestato //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetStampaCertificatoIText";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		persistentParams.put("input.parameter.idStatoAttestato", idStatoAttestato);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getStampaCertificatoIText", remoteUser);

		return (byte[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public byte[] getStampaTarghettaCertificatoIText(

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchGetStampaTarghettaCertificatoIText";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.numCertificatore", numCertificatore);

		persistentParams.put("input.parameter.progrCertificato", progrCertificato);

		persistentParams.put("input.parameter.annoCertificato", annoCertificato);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "getStampaTarghettaCertificatoIText", remoteUser);

		return (byte[]) persistentParams.get("result");

	}

	/**
	 * @generated
	 */
	public void insertLogAccesso(

			java.lang.String codiceFiscale, //NOSONAR  Reason:EIAS

			java.lang.String nome, //NOSONAR  Reason:EIAS

			java.lang.String cognome, //NOSONAR  Reason:EIAS

			java.lang.String ruolo //NOSONAR  Reason:EIAS

	) throws it.csi.csi.wrapper.CSIException, it.csi.csi.wrapper.SystemException,
			it.csi.csi.wrapper.UnrecoverableException

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException {

		String remoteUser = "<???>";
		String workflowDescriptor = "siceeorchInsertLogAccesso";
		java.util.HashMap persistentParams = new java.util.HashMap();

		// inserimento nel context dei parametri del metodo (senza trasformazioni)

		persistentParams.put("input.parameter.codiceFiscale", codiceFiscale);

		persistentParams.put("input.parameter.nome", nome);

		persistentParams.put("input.parameter.cognome", cognome);

		persistentParams.put("input.parameter.ruolo", ruolo);

		// inizializzazione e richiamo del flusso

		eseguiWorkFlow(workflowDescriptor, persistentParams, "insertLogAccesso", remoteUser);

	}

	/// dichiarazione del self checker (utilizzato in monitoraggio e diagnostica)
	/**
	 * @generated
	 */
	String _codS = "sicee"; // e' corretto che sia il codice prodotto?

	/**
	 * @generated
	 */
	String _codR = "siceeorch";

	/**
	 * @generated
	 */
	String[] _suppS = new String[]{
			/*PROTECTED REGION ID(R-1921150447) ENABLED START*/
			// inserire qui i codici sistema dei supplier diretti (se ci sono)
			// es: "Sistema1","Sistema2"
			/*PROTECTED REGION END*/
	};

	/**
	 * @generated
	 */
	String[] _suppR = new String[]{
			/*PROTECTED REGION ID(R-1076678576) ENABLED START*/
			// inserire qui i codici risorsa dei supplier diretti (se ci sono)
			// es: "risorsa1","risorsa2"
			// (corrispondono ai codici servizio dei corrispondenti servizi -
			// vedere documentazione coop-diag)
			/*PROTECTED REGION END*/
	};

	/**
	 * @generated
	 */
	DefaultSelfChecker schk = new DefaultSelfChecker(_codS, _codR, getLogger(null).getName(), _suppS, _suppR,
			"/checked_resources_siceeorch.xml");

	/**
	 * @generated
	 */
	public boolean testResources() throws it.csi.csi.wrapper.CSIException {
		Logger logger = getLogger(null);
		logger.debug("[SiceeorchImpl::testResources()] BEGIN");
		InvocationNode in = new InvocationNode();
		try {
			logger.debug("[SiceeorchImpl::testResources()] END");
			return schk.testResources();
		} catch (CSIException ex) {
			logger.error("[SiceeorchImpl::testResources()] : si e' verificato un errore  " + ex);
			throw ex;
		}
	}

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck(it.csi.coopdiag.api.CalledResource[] alreadyChecked)
			throws it.csi.csi.wrapper.CSIException {
		Logger logger = getLogger(null);
		logger.debug("[SiceeorchImpl::selfCheck] - BEGIN");
		InvocationNode in = new InvocationNode();
		try {
			return schk.selfCheck(alreadyChecked);
		} catch (CSIException ex) {
			logger.error("[SiceeorchImpl::selfCheck()] si e' verificato un errore  " + ex);
		}
		logger.debug("[SiceeorchImpl::selfCheck] - END");
		// restituisco l'invocation node
		return in;
	}

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() throws it.csi.csi.wrapper.CSIException {
		return true;
	}

	/// inizializzazione
	/**
	 * @generated
	 */
	public void init(Object initOptions) {
		/*PROTECTED REGION ID(R270573541) ENABLED START*/
		// inserire qui il codice di inizializzazione della implementazione
		// non verra' sovrascritto da successive rigenerazioni
		/*PROTECTED REGION END*/
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

	/// eventuali metodi aggiuntivi
	/*PROTECTED REGION ID(R-1118897485) ENABLED START*/
	// inserire qui la dichiarazione di eventuali metodi aggiuntivi utili
	// per l'implementazione.
	// non verrà sovrascritto da successive rigenerazioni.
	/*PROTECTED REGION END*/
}
