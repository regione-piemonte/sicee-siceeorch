
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R482785785) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Regione.
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
public class Regione implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.String cod = null;

	/**
	 * Imposta il valore della property [cod]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCod(java.lang.String val) {
		cod = val;
	}

	////{PROTECTED REGION ID(R-1174054689) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo cod. 
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
	public java.lang.String getCod() {
		return cod;
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

	////{PROTECTED REGION ID(R-2035628910) ENABLED START////}
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

	/*PROTECTED REGION ID(R1264907050) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
