
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R969863868) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Documento.
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
public class Documento implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private byte[] doc = null;

	/**
	 * Imposta il valore della property [doc]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDoc(byte[] val) {
		if (val == null) {
			doc = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			doc = new byte[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				doc[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R969591036) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo doc. 
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
	public byte[] getDoc() {
		if (doc == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			byte[] copy = new byte[doc.length];
			for (int i = 0; i < doc.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = doc[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
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

	////{PROTECTED REGION ID(R969607188) ENABLED START////}
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

	////{PROTECTED REGION ID(R-7150635) ENABLED START////}
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
	private java.lang.Long dimensione = null;

	/**
	 * Imposta il valore della property [dimensione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDimensione(java.lang.Long val) {
		dimensione = val;
	}

	////{PROTECTED REGION ID(R1911420795) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dimensione. 
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
	public java.lang.Long getDimensione() {
		return dimensione;
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

	////{PROTECTED REGION ID(R-1467500025) ENABLED START////}
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
	private java.lang.String tipologia = null;

	/**
	 * Imposta il valore della property [tipologia]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setTipologia(java.lang.String val) {
		tipologia = val;
	}

	////{PROTECTED REGION ID(R1937235308) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo tipologia. 
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
	public java.lang.String getTipologia() {
		return tipologia;
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

	////{PROTECTED REGION ID(R1403272583) ENABLED START////}
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
	private java.lang.String classeEnergetica = null;

	/**
	 * Imposta il valore della property [classeEnergetica]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setClasseEnergetica(java.lang.String val) {
		classeEnergetica = val;
	}

	////{PROTECTED REGION ID(R-1939225968) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo classeEnergetica. 
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
	public java.lang.String getClasseEnergetica() {
		return classeEnergetica;
	}

	/**
	 * @generated
	 */
	private java.lang.String destinazione = null;

	/**
	 * Imposta il valore della property [destinazione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDestinazione(java.lang.String val) {
		destinazione = val;
	}

	////{PROTECTED REGION ID(R-1484553255) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo destinazione. 
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
	public java.lang.String getDestinazione() {
		return destinazione;
	}

	/**
	 * @generated
	 */
	private java.lang.String attestato = null;

	/**
	 * Imposta il valore della property [attestato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setAttestato(java.lang.String val) {
		attestato = val;
	}

	////{PROTECTED REGION ID(R-1409426949) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo attestato. 
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
	public java.lang.String getAttestato() {
		return attestato;
	}

	/**
	 * @generated
	 */
	private java.lang.String mimeType = null;

	/**
	 * Imposta il valore della property [mimeType]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setMimeType(java.lang.String val) {
		mimeType = val;
	}

	////{PROTECTED REGION ID(R-872127414) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo mimeType. 
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
	public java.lang.String getMimeType() {
		return mimeType;
	}

	/**
	 * @generated
	 */
	private java.lang.String encoding = null;

	/**
	 * Imposta il valore della property [encoding]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setEncoding(java.lang.String val) {
		encoding = val;
	}

	////{PROTECTED REGION ID(R-2063752177) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo encoding. 
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
	public java.lang.String getEncoding() {
		return encoding;
	}

	/**
	 * @generated
	 */
	private java.lang.String matricola = null;

	/**
	 * Imposta il valore della property [matricola]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setMatricola(java.lang.String val) {
		matricola = val;
	}

	////{PROTECTED REGION ID(R-15251524) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo matricola. 
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
	public java.lang.String getMatricola() {
		return matricola;
	}

	/**
	 * @generated
	 */
	private java.lang.String idCertificatore = null;

	/**
	 * Imposta il valore della property [idCertificatore]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setIdCertificatore(java.lang.String val) {
		idCertificatore = val;
	}

	////{PROTECTED REGION ID(R-635195395) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo idCertificatore. 
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
	public java.lang.String getIdCertificatore() {
		return idCertificatore;
	}

	/**
	 * @generated
	 */
	private java.lang.String progrCertificato = null;

	/**
	 * Imposta il valore della property [progrCertificato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setProgrCertificato(java.lang.String val) {
		progrCertificato = val;
	}

	////{PROTECTED REGION ID(R-1934166811) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo progrCertificato. 
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
	public java.lang.String getProgrCertificato() {
		return progrCertificato;
	}

	/**
	 * @generated
	 */
	private java.lang.String annoCertificato = null;

	/**
	 * Imposta il valore della property [annoCertificato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setAnnoCertificato(java.lang.String val) {
		annoCertificato = val;
	}

	////{PROTECTED REGION ID(R2128219095) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo annoCertificato. 
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
	public java.lang.String getAnnoCertificato() {
		return annoCertificato;
	}

	/*PROTECTED REGION ID(R2128179783) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
