
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R-891930139) ENABLED START////}
/**
 * Inserire qui la documentazione della classe InvioLog.
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
public class InvioLog implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.Long idNotaio = null;

	/**
	 * Imposta il valore della property [idNotaio]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setIdNotaio(java.lang.Long val) {
		idNotaio = val;
	}

	////{PROTECTED REGION ID(R1132164980) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo idNotaio. 
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
	public java.lang.Long getIdNotaio() {
		return idNotaio;
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

	////{PROTECTED REGION ID(R-1613069805) ENABLED START////}
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

	////{PROTECTED REGION ID(R1204366799) ENABLED START////}
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

	////{PROTECTED REGION ID(R701719105) ENABLED START////}
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

	/*PROTECTED REGION ID(R1588805412) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
