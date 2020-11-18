
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R619727865) ENABLED START////}
/**
 * Inserire qui la documentazione della classe RappControllo.
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
public class RappControllo implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.String descTipoDoc = null;

	/**
	 * Imposta il valore della property [descTipoDoc]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDescTipoDoc(java.lang.String val) {
		descTipoDoc = val;
	}

	////{PROTECTED REGION ID(R1384411130) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo descTipoDoc. 
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
	public java.lang.String getDescTipoDoc() {
		return descTipoDoc;
	}

	/**
	 * @generated
	 */
	private java.lang.String siglaBollino = null;

	/**
	 * Imposta il valore della property [siglaBollino]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setSiglaBollino(java.lang.String val) {
		siglaBollino = val;
	}

	////{PROTECTED REGION ID(R-1114972208) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo siglaBollino. 
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
	public java.lang.String getSiglaBollino() {
		return siglaBollino;
	}

	/**
	 * @generated
	 */
	private java.lang.String numBollino = null;

	/**
	 * Imposta il valore della property [numBollino]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setNumBollino(java.lang.String val) {
		numBollino = val;
	}

	////{PROTECTED REGION ID(R-396384112) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo numBollino. 
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
	public java.lang.String getNumBollino() {
		return numBollino;
	}

	/**
	 * @generated
	 */
	private java.util.Date dtControllo = null;

	/**
	 * Imposta il valore della property [dtControllo]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDtControllo(java.util.Date val) {
		dtControllo = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R651129687) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dtControllo. 
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
	public java.util.Date getDtControllo() {
		return (dtControllo == null ? null : new java.util.Date(dtControllo.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String apparecchiature = null;

	/**
	 * Imposta il valore della property [apparecchiature]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setApparecchiature(java.lang.String val) {
		apparecchiature = val;
	}

	////{PROTECTED REGION ID(R140374856) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo apparecchiature. 
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
	public java.lang.String getApparecchiature() {
		return apparecchiature;
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

	////{PROTECTED REGION ID(R1049431538) ENABLED START////}
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

	/*PROTECTED REGION ID(R-1255811222) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
