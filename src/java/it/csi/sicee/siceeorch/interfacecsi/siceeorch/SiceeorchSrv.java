
package it.csi.sicee.siceeorch.interfacecsi.siceeorch;

import it.csi.sicee.siceeorch.dto.siceeorch.*;

import it.csi.sicee.siceeorch.exception.siceeorch.*;

////{PROTECTED REGION ID(R435172056) ENABLED START////}
/**
 * Inserire qui la documentazione dell'interfaccia pubblica del servizio siceeorch.
 * Consigli:
 * <ul>
 * <li> Descrivere qual'è lo scopo generale del servizio
 * <li> Se necessario fornire una overview delle funzioni messe a disposizione
 *      eventualmente raggruppandole logicamente. Il dettaglio dei singoli
 *      metodi va documentato in corrispondenza dei metodi stessi
 * <li> Se necessario descrivere gli scenari di utilizzo più frequenti, ovvero
 *      le "coreografie" (nel caso sia necessario richiamare in una sequenza
 *      particolare i metodi
 * <li> Inserire informazioni quali il livello di securizzazione A0-A3
 * <li> Inserire varie ed eventuali... 
 * </ul>
 * @generated
 */
////{PROTECTED REGION END////}
public interface SiceeorchSrv {

	////{PROTECTED REGION ID(R-2079435647) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo elencoRegioni.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Regione[]
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione[] elencoRegioni( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-335142876) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo elencoProvince.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codIstatRegione [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Provincia[]
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia[] elencoProvince( //NOSONAR  Reason:EIAS

			java.lang.String codIstatRegione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R205646275) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo elencoComuni.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codIstatProvincia [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Comune[]
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune[] elencoComuni( //NOSONAR  Reason:EIAS

			java.lang.String codIstatProvincia //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1159326144) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getDescrizioneRegione.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codIstat [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Regione
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione getDescrizioneRegione( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1768087524) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getDescrizioneComune.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codIstat [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Comune
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune getDescrizioneComune( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1094268348) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getDescrizioneProvincia.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codIstat [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.String
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia getDescrizioneProvincia( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1791703617) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getVieByCodiceIstat.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param descrizione [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param codiceIstat [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Via[]
	 
	 * @throws ToponomasticaException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Via[] getVieByCodiceIstat( //NOSONAR  Reason:EIAS

			java.lang.String descrizione, //NOSONAR  Reason:EIAS

			java.lang.String codiceIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R308322722) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getViaById.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param idVia [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Via
	 
	 * @throws ToponomasticaException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Via getViaById( //NOSONAR  Reason:EIAS

			java.lang.Integer idVia //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-763483732) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo inserisciAllegato.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.String
	 
	 * @throws DocumentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String inserisciAllegato( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1320968927) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo inserisciDocumento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Documento
	 
	 * @throws DocumentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String inserisciDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1693807149) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo cancellaDocumento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return void
	 
	 * @throws DocumentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public void cancellaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R2014937717) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo ricercaDocumento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Documento
	 
	 * @throws DocumentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento ricercaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1554961712) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo creaAlberatura.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codiceAce [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param progressivoInit [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param progressivoEnd [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return void
	 
	 * @throws DocumentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R490256555) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findElencoCertificatori.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param filtro [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[] findElencoCertificatori( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaCertificatori filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1173777970) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findAce.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param filtro [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Ace
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-437103997) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findCertificatore.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param idCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Certificatore
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore findCertificatore( //NOSONAR  Reason:EIAS

			java.lang.String matricola //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R687003425) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo elencoTitoli.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Titolo[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Titolo[] elencoTitoli( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1220415099) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findNotaio.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param email [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Notaio
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Notaio findNotaio( //NOSONAR  Reason:EIAS

			java.lang.String email //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-78637138) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo updateInvioLog.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param log [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.Integer
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.Integer updateInvioLog( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.InvioLog log //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-72428197) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getParametro.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param code [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.String
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getParametro( //NOSONAR  Reason:EIAS

			java.lang.String code //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R903648277) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo verificaDocumento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport
	 
	 * @throws DocumentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1348033542) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMimeTypeInfo.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo getMimeTypeInfo( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1251949068) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo isProductEnabled.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @return java.lang.Boolean
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.Boolean isProductEnabled( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1138319726) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo isServiceEnabled.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param nomeServizio [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.Boolean
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.Boolean isServiceEnabled( //NOSONAR  Reason:EIAS

			java.lang.String nomeServizio //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1432799852) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo isUserEnabled.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param codiceFiscale [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.Boolean
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.Boolean isUserEnabled( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1210656349) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findAceSostitutivi.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E'importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): è importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro è obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param filtro [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Ace[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceSostitutivi( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1535879141) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getStampaCertificato.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param scrittaSfondo [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return byte[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1741799091) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getStampaRicevutaInvioAce.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return byte[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public byte[] getStampaRicevutaInvioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1528946163) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo verificaDocumentoNewDosign.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumentoNewDosign( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.doqui.dosign.dosign.exception.DosignException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-662379889) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo startMdpTransaction.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param transaction [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Transazione
	 
	 * @throws PagamentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String startMdpTransaction( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Transazione transaction //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R131364462) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpPaymentMode.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param idApplication [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Gateway[]
	 
	 * @throws PagamentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.MdpBox getMdpPaymentMode( //NOSONAR  Reason:EIAS

			java.lang.String idApplication //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R942887374) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpTransactionState.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param idTransazione [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Transazione
	 
	 * @throws PagamentoException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Transazione getMdpTransactionState( //NOSONAR  Reason:EIAS

			java.lang.String idTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R894515674) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findAceFiltro.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param filtro [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param idCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Ace
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R829374293) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findAceFiltroCount.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param filtro [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param idCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param dataPregresso [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param flgSostituzione [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return java.lang.Integer
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1219177289) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findAceFlgPregresso.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param filtro [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param flgPregresso [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Ace
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAceFlgPregresso( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-57780586) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getDettaglioAce.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.LabelValue[] getDettaglioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1484577823) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findAceMonitoraggio.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 
	 * @param idCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Ace[]
	 
	 * @throws SiceesrvException
	 
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceMonitoraggio( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1335650920) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo estraiDocumento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport
	 * @throws DocumentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento estraiDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1087537118) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findUidRifIndex.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @param idTipoDoc [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return java.lang.String
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1009482272) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findImpiantoByCodice.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param codImpianto [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Impianto[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByCodice( //NOSONAR  Reason:EIAS

			java.lang.Integer codImpianto //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R120715608) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findImpiantoByPOD.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param pod [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Impianto[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPOD( //NOSONAR  Reason:EIAS

			java.lang.String pod //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R120715281) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findImpiantoByPDR.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param pdr [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Impianto[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPDR( //NOSONAR  Reason:EIAS

			java.lang.String pdr //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-429881807) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findLibrettoByUID.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param uid [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return byte[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento findLibrettoByUID( //NOSONAR  Reason:EIAS

			java.lang.String uid //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1452994073) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo findProtocollazione.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return byte[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.Protocollazione findProtocollazione( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1097459655) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpNewTransazione.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @return java.lang.String
	 * @throws PagamentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getMdpNewTransazione( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R2002592441) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpNewUrlWisp.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param numTransazione [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return java.lang.String
	 * @throws PagamentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getMdpNewUrlWisp( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione, //NOSONAR  Reason:EIAS

			java.lang.Double valore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R2016336024) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpNewSceltaWisp.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @return java.lang.String
	 * @throws PagamentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta getMdpNewSceltaWisp( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1857372) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpNewUrlPagamento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @return java.lang.String
	 * @throws PagamentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getMdpNewUrlPagamento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.DettaglioPagamento dettaglioPagamento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1540672648) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpNewStatoTransazione.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param numTransazione [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return java.lang.String
	 * @throws PagamentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getMdpNewStatoTransazione( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-337423803) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getMdpNewIUV.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @return java.lang.String
	 * @throws PagamentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getMdpNewIUV( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1683152226) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo restoreDocumento.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param documento [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	 	
	 * @return it.csi.sicee.siceeorch.dto.siceeorch.Documento
	 * @throws DocumentoException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public java.lang.String restoreDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-1483281327) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getStampaCertificatoIText.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param idStatoAttestato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @return byte[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R1417672475) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo getStampaTarghettaCertificatoIText.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param numCertificatore [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param progrCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param annoCertificato [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @return byte[]
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
	public byte[] getStampaTarghettaCertificatoIText( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	////{PROTECTED REGION ID(R-991607272) ENABLED START////}
	/**
	 * Inserire qui la documentazione del metodo insertLogAccesso.
	 * Descrivere dettagliatamente:
	 * <ul>
	 * <li>la semantica del metodo (facendo riferimento ai parametri). E' importante 
	 *     elencare casi particolari (dati non trovati, ecc...)
	 * <li> i singoli parametri (nelle sezioni apposite sottostanti): &egrave; importante
	 *      indicare:
	 *      <ul>
	 *      <li>se il parametro &egrave; obbligatorio
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      </ul>
	 * <li> le eccezioni rilanciate (nelle sezioni apposite sottostanti)
	 * <li> il tipo di ritorno
	 * </ul>
	 * @param codiceFiscale [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param nome [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param cognome [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @param ruolo [documentazione del parametro (vedere sopra per consigli sulla documentazione)]
	
	 * @return void
	 * @throws SiceesrvException
	 * @throws CSIException (eccezione base rilanciata dall'infrastruttura di cooperazione)
	 * @throws SystemException in caso di errore di sistema (connessione, comunicazione, ecc.)
	 * @throws UnrecoverableException in caso di errore imprevisto e non recuperabile
	 * @generated
	 */
	////{PROTECTED REGION END////}
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

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean testResources() throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

}
