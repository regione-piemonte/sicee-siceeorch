
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R1999486603) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Ace.
 * Consigli:
 * <ul>
 * <li> Descrivere il "concetto" rappresentato dall'entita' (qual'è l'oggetto
 *      del dominio del servizio rappresentato)
 * <li> Se necessario indicare se questo concetto è mantenuto sugli archivi di
 *      una particolare applicazione
 * <li> Se l'oggetto ha un particolare ciclo di vita (stati, es. creato, da approvare, 
 *      approvato, respinto, annullato.....) si può decidere di descrivere
 *      la state machine qui o nella documentazione dell'interfaccia del servizio
 *      che manipola quest'oggetto
 * </ul>
 * @generated
 */
////{PROTECTED REGION END////}
public class Ace implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

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

	////{PROTECTED REGION ID(R1202669379) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo indirizzo. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
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
	private java.util.Date dataInvio = null;

	/**
	 * Imposta il valore della property [dataInvio]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDataInvio(java.util.Date val) {
		dataInvio = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R1516713250) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dataInvio. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.util.Date getDataInvio() {
		return (dataInvio == null ? null : new java.util.Date(dataInvio.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String provincia = null;

	/**
	 * Imposta il valore della property [provincia]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setProvincia(java.lang.String val) {
		provincia = val;
	}

	////{PROTECTED REGION ID(R1353296258) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo provincia. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getProvincia() {
		return provincia;
	}

	/**
	 * @generated
	 */
	private java.lang.String comune = null;

	/**
	 * Imposta il valore della property [comune]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setComune(java.lang.String val) {
		comune = val;
	}

	////{PROTECTED REGION ID(R-374820330) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo comune. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getComune() {
		return comune;
	}

	/**
	 * @generated
	 */
	private java.lang.String anno = null;

	/**
	 * Imposta il valore della property [anno]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setAnno(java.lang.String val) {
		anno = val;
	}

	////{PROTECTED REGION ID(R-1779219527) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo anno. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getAnno() {
		return anno;
	}

	/**
	 * @generated
	 */
	private java.lang.String certificatore = null;

	/**
	 * Imposta il valore della property [certificatore]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCertificatore(java.lang.String val) {
		certificatore = val;
	}

	////{PROTECTED REGION ID(R1922623209) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo certificatore. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getCertificatore() {
		return certificatore;
	}

	/**
	 * @generated
	 */
	private java.lang.String numero = null;

	/**
	 * Imposta il valore della property [numero]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setNumero(java.lang.String val) {
		numero = val;
	}

	////{PROTECTED REGION ID(R-54373785) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo numero. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getNumero() {
		return numero;
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

	////{PROTECTED REGION ID(R-380105200) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo civico. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
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
	private java.lang.String uid = null;

	/**
	 * Imposta il valore della property [uid]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setUid(java.lang.String val) {
		uid = val;
	}

	////{PROTECTED REGION ID(R-195922459) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo uid. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getUid() {
		return uid;
	}

	/**
	 * @generated
	 */
	private java.lang.String nome = null;

	/**
	 * Imposta il valore della property [nome]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setNome(java.lang.String val) {
		nome = val;
	}

	////{PROTECTED REGION ID(R-1778831324) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo nome. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getNome() {
		return nome;
	}

	/**
	 * @generated
	 */
	private java.lang.String cognome = null;

	/**
	 * Imposta il valore della property [cognome]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCognome(java.lang.String val) {
		cognome = val;
	}

	////{PROTECTED REGION ID(R1259723305) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo cognome. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getCognome() {
		return cognome;
	}

	/**
	 * @generated
	 */
	private java.util.Date dataUpload = null;

	/**
	 * Imposta il valore della property [dataUpload]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDataUpload(java.util.Date val) {
		dataUpload = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R118574870) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dataUpload. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.util.Date getDataUpload() {
		return (dataUpload == null ? null : new java.util.Date(dataUpload.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.Integer idStato = null;

	/**
	 * Imposta il valore della property [idStato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setIdStato(java.lang.Integer val) {
		idStato = val;
	}

	////{PROTECTED REGION ID(R1956552533) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo idStato. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.Integer getIdStato() {
		return idStato;
	}

	/**
	 * @generated
	 */
	private java.lang.String descStato = null;

	/**
	 * Imposta il valore della property [descStato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDescStato(java.lang.String val) {
		descStato = val;
	}

	////{PROTECTED REGION ID(R-922831265) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo descStato. 
	 * Descrivere:
	 * <ul>
	 *      <li>se l'attributo deve essere sempre valoriuzzato o meno
	 *      <li>se ci sono dei vincoli sulla valorizzazione (es. range numerico,
	 *          dimensioni massime in caso di stringa o tipo array, eventuale necessità
	 *          di corrispondenza con una particolare codifica, che può essere prefissata
	 *          (es. da un elenco predefinito) oppure dinamica (presente su un archivio
	 *          di un'applicazione)
	 *      <li>se ci sono particolari vincoli di valorizzazione relativi al valore di
	 *          altri attributi della stessa classe.
	 *      <li>...
	 *      </ul>
	 * @generated 
	 */
	////{PROTECTED REGION END////}
	public java.lang.String getDescStato() {
		return descStato;
	}

	/**
	 * @generated
	 */
	private java.lang.String uidFoto = null;

	/**
	 * Imposta il valore della property [uidFoto]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setUidFoto(java.lang.String val) {
		uidFoto = val;
	}

	////{PROTECTED REGION ID(R-120816503) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo uidFoto. 
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
	public java.lang.String getUidFoto() {
		return uidFoto;
	}

	/**
	 * @generated
	 */
	private java.lang.String descDatiCat = null;

	/**
	 * Imposta il valore della property [descDatiCat]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDescDatiCat(java.lang.String val) {
		descDatiCat = val;
	}

	////{PROTECTED REGION ID(R1262957448) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo descDatiCat. 
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
	public java.lang.String getDescDatiCat() {
		return descDatiCat;
	}

	/**
	 * @generated
	 */
	private java.lang.String uidIndicatore = null;

	/**
	 * Imposta il valore della property [uidIndicatore]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setUidIndicatore(java.lang.String val) {
		uidIndicatore = val;
	}

	////{PROTECTED REGION ID(R1062337531) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo uidIndicatore. 
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
	public java.lang.String getUidIndicatore() {
		return uidIndicatore;
	}

	/**
	 * @generated
	 */
	private java.util.Date dataScadenza = null;

	/**
	 * Imposta il valore della property [dataScadenza]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDataScadenza(java.util.Date val) {
		dataScadenza = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-181913000) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dataScadenza. 
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
	public java.util.Date getDataScadenza() {
		return (dataScadenza == null ? null : new java.util.Date(dataScadenza.getTime()));
	}

	/*PROTECTED REGION ID(R-2038937640) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
