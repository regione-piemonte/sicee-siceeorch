
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R-1951592963) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Impianto.
 * Consigli:
 * <ul>
 * <li> Descrivere il "concetto" rappresentato dall'entita' (qual'&egrave; l'oggetto
 *      del dominio del servizio rappresentato)
 * <li> Se necessario indicare se questo concetto &egrave; mantenuto sugli archivi di
 *      una particolare applicazione
 * <li> Se l'oggetto ha un particolare ciclo di vita (stati, es. creato, da approvare, 
 *      approvato, respinto, annullato.....) si pu&ograve; decidere di descrivere
 *      la state machine qui o nella documentazione dell'interfaccia del servizio
 *      che manipola quest'oggetto
 * </ul>
 * @generated
 */
////{PROTECTED REGION END////}
public class Impianto implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.Integer codiceImpianto = null;

	/**
	 * Imposta il valore della property [codiceImpianto]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCodiceImpianto(java.lang.Integer val) {
		codiceImpianto = val;
	}

	////{PROTECTED REGION ID(R-1012350603) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo codiceImpianto. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.Integer getCodiceImpianto() {
		return codiceImpianto;
	}

	/**
	 * @generated
	 */
	private java.lang.String stato = null;

	/**
	 * Imposta il valore della property [stato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setStato(java.lang.String val) {
		stato = val;
	}

	////{PROTECTED REGION ID(R-1648890690) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo stato. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getStato() {
		return stato;
	}

	/**
	 * @generated
	 */
	private java.util.Date dtAssegnazione = null;

	/**
	 * Imposta il valore della property [dtAssegnazione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDtAssegnazione(java.util.Date val) {
		dtAssegnazione = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-1628037458) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dtAssegnazione. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.util.Date getDtAssegnazione() {
		return (dtAssegnazione == null ? null : new java.util.Date(dtAssegnazione.getTime()));
	}

	/**
	 * @generated
	 */
	private java.util.Date dtDismissione = null;

	/**
	 * Imposta il valore della property [dtDismissione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDtDismissione(java.util.Date val) {
		dtDismissione = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-902021798) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dtDismissione. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.util.Date getDtDismissione() {
		return (dtDismissione == null ? null : new java.util.Date(dtDismissione.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String motivoDisimissione = null;

	/**
	 * Imposta il valore della property [motivoDisimissione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setMotivoDisimissione(java.lang.String val) {
		motivoDisimissione = val;
	}

	////{PROTECTED REGION ID(R1758140513) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo motivoDisimissione. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getMotivoDisimissione() {
		return motivoDisimissione;
	}

	/**
	 * @generated
	 */
	private java.lang.String indirizzo = null;

	/**
	 * Imposta il valore della property [indirizzo]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setIndirizzo(java.lang.String val) {
		indirizzo = val;
	}

	////{PROTECTED REGION ID(R1152202769) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo indirizzo. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getIndirizzo() {
		return indirizzo;
	}

	/**
	 * @generated
	 */
	private java.lang.String civico = null;

	/**
	 * Imposta il valore della property [civico]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCivico(java.lang.String val) {
		civico = val;
	}

	////{PROTECTED REGION ID(R-43614206) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo civico. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getCivico() {
		return civico;
	}

	/**
	 * @generated
	 */
	private java.lang.String descComune = null;

	/**
	 * Imposta il valore della property [descComune]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDescComune(java.lang.String val) {
		descComune = val;
	}

	////{PROTECTED REGION ID(R-569788551) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo descComune. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getDescComune() {
		return descComune;
	}

	/**
	 * @generated
	 */
	private java.lang.String siglaProv = null;

	/**
	 * Imposta il valore della property [siglaProv]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setSiglaProv(java.lang.String val) {
		siglaProv = val;
	}

	////{PROTECTED REGION ID(R-1429611214) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo siglaProv. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getSiglaProv() {
		return siglaProv;
	}

	/**
	 * @generated
	 */
	private java.lang.String denomResponsabile = null;

	/**
	 * Imposta il valore della property [denomResponsabile]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDenomResponsabile(java.lang.String val) {
		denomResponsabile = val;
	}

	////{PROTECTED REGION ID(R1243630507) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo denomResponsabile. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getDenomResponsabile() {
		return denomResponsabile;
	}

	/**
	 * @generated
	 */
	private java.lang.String cfResponsabile = null;

	/**
	 * Imposta il valore della property [cfResponsabile]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCfResponsabile(java.lang.String val) {
		cfResponsabile = val;
	}

	////{PROTECTED REGION ID(R-880409347) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo cfResponsabile. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getCfResponsabile() {
		return cfResponsabile;
	}

	/**
	 * @generated
	 */
	private java.lang.String denom3Responsabile = null;

	/**
	 * Imposta il valore della property [denom3Responsabile]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDenom3Responsabile(java.lang.String val) {
		denom3Responsabile = val;
	}

	////{PROTECTED REGION ID(R1350763906) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo denom3Responsabile. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getDenom3Responsabile() {
		return denom3Responsabile;
	}

	/**
	 * @generated
	 */
	private java.lang.String cf3Responsabile = null;

	/**
	 * Imposta il valore della property [cf3Responsabile]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCf3Responsabile(java.lang.String val) {
		cf3Responsabile = val;
	}

	////{PROTECTED REGION ID(R-69962128) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo cf3Responsabile. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getCf3Responsabile() {
		return cf3Responsabile;
	}

	/**
	 * @generated
	 */
	private it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[] rifCatastale = null;

	/**
	 * Imposta il valore della property [rifCatastale]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setRifCatastale(it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[] val) {
		if (val == null) {
			rifCatastale = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			rifCatastale = new it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				rifCatastale[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R1909047644) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo rifCatastale. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[] getRifCatastale() {
		if (rifCatastale == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[] copy = new it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[rifCatastale.length];
			for (int i = 0; i < rifCatastale.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = rifCatastale[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
	}

	/**
	 * @generated
	 */
	private java.util.Date dtUltAggLibretto = null;

	/**
	 * Imposta il valore della property [dtUltAggLibretto]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDtUltAggLibretto(java.util.Date val) {
		dtUltAggLibretto = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-826072248) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dtUltAggLibretto. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.util.Date getDtUltAggLibretto() {
		return (dtUltAggLibretto == null ? null : new java.util.Date(dtUltAggLibretto.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String uidIndexLibretto = null;

	/**
	 * Imposta il valore della property [uidIndexLibretto]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setUidIndexLibretto(java.lang.String val) {
		uidIndexLibretto = val;
	}

	////{PROTECTED REGION ID(R-1439873034) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo uidIndexLibretto. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getUidIndexLibretto() {
		return uidIndexLibretto;
	}

	/**
	 * @generated
	 */
	private it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[] rappControllo = null;

	/**
	 * Imposta il valore della property [rappControllo]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setRappControllo(it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[] val) {
		if (val == null) {
			rappControllo = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			rappControllo = new it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				rappControllo[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R-1784789740) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo rappControllo. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessit&agrave;
	 *          di corrispondenza con una particolare codifica, che pu&ograve; essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[] getRappControllo() {
		if (rappControllo == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[] copy = new it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[rappControllo.length];
			for (int i = 0; i < rappControllo.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = rappControllo[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
	}

	/*PROTECTED REGION ID(R-1898970100) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
