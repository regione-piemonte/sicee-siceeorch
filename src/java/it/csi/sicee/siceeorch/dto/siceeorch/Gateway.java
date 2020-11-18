
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R-792442804) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Gateway.
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
public class Gateway implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.String applicationId = null;

	/**
	 * Imposta il valore della property [applicationId]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setApplicationId(java.lang.String val) {
		applicationId = val;
	}

	////{PROTECTED REGION ID(R-1073705537) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo applicationId. 
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
	public java.lang.String getApplicationId() {
		return applicationId;
	}

	/**
	 * @generated
	 */
	private java.lang.String gatewayDescription = null;

	/**
	 * Imposta il valore della property [gatewayDescription]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setGatewayDescription(java.lang.String val) {
		gatewayDescription = val;
	}

	////{PROTECTED REGION ID(R-270245788) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo gatewayDescription. 
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
	public java.lang.String getGatewayDescription() {
		return gatewayDescription;
	}

	/**
	 * @generated
	 */
	private java.lang.String gatewayId = null;

	/**
	 * Imposta il valore della property [gatewayId]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setGatewayId(java.lang.String val) {
		gatewayId = val;
	}

	////{PROTECTED REGION ID(R-1466164301) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo gatewayId. 
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
	public java.lang.String getGatewayId() {
		return gatewayId;
	}

	/**
	 * @generated
	 */
	private java.lang.String gatewayServiceName = null;

	/**
	 * Imposta il valore della property [gatewayServiceName]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setGatewayServiceName(java.lang.String val) {
		gatewayServiceName = val;
	}

	////{PROTECTED REGION ID(R-474271928) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo gatewayServiceName. 
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
	public java.lang.String getGatewayServiceName() {
		return gatewayServiceName;
	}

	/**
	 * @generated
	 */
	private java.lang.String merchantId = null;

	/**
	 * Imposta il valore della property [merchantId]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setMerchantId(java.lang.String val) {
		merchantId = val;
	}

	////{PROTECTED REGION ID(R579197519) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo merchantId. 
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
	public java.lang.String getMerchantId() {
		return merchantId;
	}

	/**
	 * @generated
	 */
	private java.lang.String paymentmodeDescription = null;

	/**
	 * Imposta il valore della property [paymentmodeDescription]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setPaymentmodeDescription(java.lang.String val) {
		paymentmodeDescription = val;
	}

	////{PROTECTED REGION ID(R-1674107169) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo paymentmodeDescription. 
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
	public java.lang.String getPaymentmodeDescription() {
		return paymentmodeDescription;
	}

	/**
	 * @generated
	 */
	private java.lang.String paymentmodeId = null;

	/**
	 * Imposta il valore della property [paymentmodeId]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setPaymentmodeId(java.lang.String val) {
		paymentmodeId = val;
	}

	////{PROTECTED REGION ID(R2108165848) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo paymentmodeId. 
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
	public java.lang.String getPaymentmodeId() {
		return paymentmodeId;
	}

	/**
	 * @generated
	 */
	private java.lang.Double sogliaMax = null;

	/**
	 * Imposta il valore della property [sogliaMax]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setSogliaMax(java.lang.Double val) {
		sogliaMax = val;
	}

	////{PROTECTED REGION ID(R-1516453185) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo sogliaMax. 
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
	public java.lang.Double getSogliaMax() {
		return sogliaMax;
	}

	/**
	 * @generated
	 */
	private java.lang.Double sogliaMin = null;

	/**
	 * Imposta il valore della property [sogliaMin]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setSogliaMin(java.lang.Double val) {
		sogliaMin = val;
	}

	////{PROTECTED REGION ID(R-1516452947) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo sogliaMin. 
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
	public java.lang.Double getSogliaMin() {
		return sogliaMin;
	}

	/**
	 * @generated
	 */
	private java.lang.String tipoCommissione = null;

	/**
	 * Imposta il valore della property [tipoCommissione]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setTipoCommissione(java.lang.String val) {
		tipoCommissione = val;
	}

	////{PROTECTED REGION ID(R-736771270) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo tipoCommissione. 
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
	public java.lang.String getTipoCommissione() {
		return tipoCommissione;
	}

	/**
	 * @generated
	 */
	private java.lang.Double valoreComm = null;

	/**
	 * Imposta il valore della property [valoreComm]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setValoreComm(java.lang.Double val) {
		valoreComm = val;
	}

	////{PROTECTED REGION ID(R-2067657703) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo valoreComm. 
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
	public java.lang.Double getValoreComm() {
		return valoreComm;
	}

	/**
	 * @generated
	 */
	private java.lang.Double valoreMax = null;

	/**
	 * Imposta il valore della property [valoreMax]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setValoreMax(java.lang.Double val) {
		valoreMax = val;
	}

	////{PROTECTED REGION ID(R-1036520777) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo valoreMax. 
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
	public java.lang.Double getValoreMax() {
		return valoreMax;
	}

	/**
	 * @generated
	 */
	private java.lang.Double valoreMin = null;

	/**
	 * Imposta il valore della property [valoreMin]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setValoreMin(java.lang.Double val) {
		valoreMin = val;
	}

	////{PROTECTED REGION ID(R-1036520539) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo valoreMin. 
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
	public java.lang.Double getValoreMin() {
		return valoreMin;
	}

	/*PROTECTED REGION ID(R1923687927) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
