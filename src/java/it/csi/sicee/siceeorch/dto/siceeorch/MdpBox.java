
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R148829770) ENABLED START////}
/**
 * Inserire qui la documentazione della classe MdpBox.
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
public class MdpBox implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private it.csi.sicee.siceeorch.dto.siceeorch.Transazione transazione = null;

	/**
	 * Imposta il valore della property [transazione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setTransazione(it.csi.sicee.siceeorch.dto.siceeorch.Transazione val) {
		transazione = val;
	}

	////{PROTECTED REGION ID(R-813359820) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo transazione. 
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
	public it.csi.sicee.siceeorch.dto.siceeorch.Transazione getTransazione() {
		return transazione;
	}

	/**
	 * @generated
	 */
	private it.csi.sicee.siceeorch.dto.siceeorch.Gateway[] gateways = null;

	/**
	 * Imposta il valore della property [gateways]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setGateways(it.csi.sicee.siceeorch.dto.siceeorch.Gateway[] val) {
		if (val == null) {
			gateways = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			gateways = new it.csi.sicee.siceeorch.dto.siceeorch.Gateway[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				gateways[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R-1948283143) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo gateways. 
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
	public it.csi.sicee.siceeorch.dto.siceeorch.Gateway[] getGateways() {
		if (gateways == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			it.csi.sicee.siceeorch.dto.siceeorch.Gateway[] copy = new it.csi.sicee.siceeorch.dto.siceeorch.Gateway[gateways.length];
			for (int i = 0; i < gateways.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = gateways[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
	}

	/*PROTECTED REGION ID(R1216650079) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
