
package it.csi.sicee.siceeorch.business.siceeorch;

import it.csi.sicee.siceeorch.dto.siceeorch.*;

import it.csi.sicee.siceeorch.exception.siceeorch.*;

/**
 * Interfaccia remota dell'EJB che implementa il servizio siceeorch.
 * @generated
 */
public interface SiceeorchRemote extends javax.ejb.EJBObject {

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione[] elencoRegioni( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia[] elencoProvince( //NOSONAR  Reason:EIAS

			java.lang.String codIstatRegione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune[] elencoComuni( //NOSONAR  Reason:EIAS

			java.lang.String codIstatProvincia //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Regione getDescrizioneRegione( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Comune getDescrizioneComune( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Provincia getDescrizioneProvincia( //NOSONAR  Reason:EIAS

			java.lang.String codIstat //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Via getViaById( //NOSONAR  Reason:EIAS

			java.lang.Integer idVia //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.ToponomasticaException;

	/**
	 * @generated
	 */
	public java.lang.String inserisciAllegato( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

	/**
	 * @generated
	 */
	public java.lang.String inserisciDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

	/**
	 * @generated
	 */
	public void cancellaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento ricercaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore[] findElencoCertificatori( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaCertificatori filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace findAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Certificatore findCertificatore( //NOSONAR  Reason:EIAS

			java.lang.String matricola //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Titolo[] elencoTitoli( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Notaio findNotaio( //NOSONAR  Reason:EIAS

			java.lang.String email //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.Integer updateInvioLog( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.InvioLog log //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.String getParametro( //NOSONAR  Reason:EIAS

			java.lang.String code //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.MimeTypeInfo getMimeTypeInfo( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.Boolean isProductEnabled( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.Boolean isServiceEnabled( //NOSONAR  Reason:EIAS

			java.lang.String nomeServizio //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.Boolean isUserEnabled( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceSostitutivi( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport verificaDocumentoNewDosign( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.doqui.dosign.dosign.exception.DosignException;

	/**
	 * @generated
	 */
	public java.lang.String startMdpTransaction( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Transazione transaction //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.MdpBox getMdpPaymentMode( //NOSONAR  Reason:EIAS

			java.lang.String idApplication //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Transazione getMdpTransactionState( //NOSONAR  Reason:EIAS

			java.lang.String idTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Ace[] findAceMonitoraggio( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento estraiDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByCodice( //NOSONAR  Reason:EIAS

			java.lang.Integer codImpianto //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPOD( //NOSONAR  Reason:EIAS

			java.lang.String pod //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] findImpiantoByPDR( //NOSONAR  Reason:EIAS

			java.lang.String pdr //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException

			, it.csi.sicee.siceeorch.exception.siceeorch.SigitExcessiveResultsException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.Documento findLibrettoByUID( //NOSONAR  Reason:EIAS

			java.lang.String uid //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewTransazione( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceeorch.dto.siceeorch.InformativaScelta getMdpNewSceltaWisp( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewUrlPagamento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.DettaglioPagamento dettaglioPagamento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewStatoTransazione( //NOSONAR  Reason:EIAS

			java.lang.String numTransazione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public java.lang.String getMdpNewIUV( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.PagamentoException;

	/**
	 * @generated
	 */
	public java.lang.String restoreDocumento( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceeorch.dto.siceeorch.Documento documento //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.DocumentoException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

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
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceeorch.exception.siceeorch.SiceesrvException;

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

}
