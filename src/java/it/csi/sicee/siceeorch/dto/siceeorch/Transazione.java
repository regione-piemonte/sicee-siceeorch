
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R1686750150) ENABLED START////}
/**
 * Inserire qui la documentazione della classe Transazione.
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
public class Transazione implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.Double amount = null;

	/**
	 * Imposta il valore della property [amount]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setAmount(java.lang.Double val) {
		amount = val;
	}

	////{PROTECTED REGION ID(R246917022) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo amount. 
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
	public java.lang.Double getAmount() {
		return amount;
	}

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

	////{PROTECTED REGION ID(R1743587461) ENABLED START////}
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
	private java.lang.String authornumber = null;

	/**
	 * Imposta il valore della property [authornumber]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setAuthornumber(java.lang.String val) {
		authornumber = val;
	}

	////{PROTECTED REGION ID(R1707062106) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo authornumber. 
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
	public java.lang.String getAuthornumber() {
		return authornumber;
	}

	/**
	 * @generated
	 */
	private java.lang.String basketId = null;

	/**
	 * Imposta il valore della property [basketId]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setBasketId(java.lang.String val) {
		basketId = val;
	}

	////{PROTECTED REGION ID(R851773255) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo basketId. 
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
	public java.lang.String getBasketId() {
		return basketId;
	}

	/**
	 * @generated
	 */
	private java.lang.String buyerEmail = null;

	/**
	 * Imposta il valore della property [buyerEmail]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setBuyerEmail(java.lang.String val) {
		buyerEmail = val;
	}

	////{PROTECTED REGION ID(R1887679983) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo buyerEmail. 
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
	public java.lang.String getBuyerEmail() {
		return buyerEmail;
	}

	/**
	 * @generated
	 */
	private java.lang.String buyercodfisc = null;

	/**
	 * Imposta il valore della property [buyercodfisc]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setBuyercodfisc(java.lang.String val) {
		buyercodfisc = val;
	}

	////{PROTECTED REGION ID(R-1795455618) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo buyercodfisc. 
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
	public java.lang.String getBuyercodfisc() {
		return buyercodfisc;
	}

	/**
	 * @generated
	 */
	private java.lang.String buyername = null;

	/**
	 * Imposta il valore della property [buyername]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setBuyername(java.lang.String val) {
		buyername = val;
	}

	////{PROTECTED REGION ID(R2001765816) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo buyername. 
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
	public java.lang.String getBuyername() {
		return buyername;
	}

	/**
	 * @generated
	 */
	private java.lang.String ccy = null;

	/**
	 * Imposta il valore della property [ccy]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCcy(java.lang.String val) {
		ccy = val;
	}

	////{PROTECTED REGION ID(R-1143546221) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo ccy. 
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
	public java.lang.String getCcy() {
		return ccy;
	}

	/**
	 * @generated
	 */
	private java.util.Date changestatedate = null;

	/**
	 * Imposta il valore della property [changestatedate]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setChangestatedate(java.util.Date val) {
		changestatedate = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R1741196681) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo changestatedate. 
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
	public java.util.Date getChangestatedate() {
		return (changestatedate == null ? null : new java.util.Date(changestatedate.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String clientipaddress = null;

	/**
	 * Imposta il valore della property [clientipaddress]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setClientipaddress(java.lang.String val) {
		clientipaddress = val;
	}

	////{PROTECTED REGION ID(R-81699588) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo clientipaddress. 
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
	public java.lang.String getClientipaddress() {
		return clientipaddress;
	}

	/**
	 * @generated
	 */
	private java.lang.Long codStato = null;

	/**
	 * Imposta il valore della property [codStato]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCodStato(java.lang.Long val) {
		codStato = val;
	}

	////{PROTECTED REGION ID(R1683561417) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo codStato. 
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
	public java.lang.Long getCodStato() {
		return codStato;
	}

	/**
	 * @generated
	 */
	private java.lang.Double commissioniApplicate = null;

	/**
	 * Imposta il valore della property [commissioniApplicate]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCommissioniApplicate(java.lang.Double val) {
		commissioniApplicate = val;
	}

	////{PROTECTED REGION ID(R2085444917) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo commissioniApplicate. 
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
	public java.lang.Double getCommissioniApplicate() {
		return commissioniApplicate;
	}

	/**
	 * @generated
	 */
	private java.lang.Boolean commissioniApplicateNull = null;

	/**
	 * Imposta il valore della property [commissioniApplicateNull]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setCommissioniApplicateNull(java.lang.Boolean val) {
		commissioniApplicateNull = val;
	}

	////{PROTECTED REGION ID(R-1352207268) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo commissioniApplicateNull. 
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
	public java.lang.Boolean getCommissioniApplicateNull() {
		return commissioniApplicateNull;
	}

	/**
	 * @generated
	 */
	private java.lang.String errcode = null;

	/**
	 * Imposta il valore della property [errcode]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setErrcode(java.lang.String val) {
		errcode = val;
	}

	////{PROTECTED REGION ID(R-1535078836) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo errcode. 
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
	public java.lang.String getErrcode() {
		return errcode;
	}

	/**
	 * @generated
	 */
	private java.util.Date finishDate = null;

	/**
	 * Imposta il valore della property [finishDate]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setFinishDate(java.util.Date val) {
		finishDate = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-1360022745) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo finishDate. 
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
	public java.util.Date getFinishDate() {
		return (finishDate == null ? null : new java.util.Date(finishDate.getTime()));
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

	////{PROTECTED REGION ID(R919660921) ENABLED START////}
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
	private java.lang.String gatewaypaymodeid = null;

	/**
	 * Imposta il valore della property [gatewaypaymodeid]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setGatewaypaymodeid(java.lang.String val) {
		gatewaypaymodeid = val;
	}

	////{PROTECTED REGION ID(R-1436812632) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo gatewaypaymodeid. 
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
	public java.lang.String getGatewaypaymodeid() {
		return gatewaypaymodeid;
	}

	/**
	 * @generated
	 */
	private java.lang.String incassokoerrormessage = null;

	/**
	 * Imposta il valore della property [incassokoerrormessage]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setIncassokoerrormessage(java.lang.String val) {
		incassokoerrormessage = val;
	}

	////{PROTECTED REGION ID(R-669474231) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo incassokoerrormessage. 
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
	public java.lang.String getIncassokoerrormessage() {
		return incassokoerrormessage;
	}

	/**
	 * @generated
	 */
	private java.util.Date initDate = null;

	/**
	 * Imposta il valore della property [initDate]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setInitDate(java.util.Date val) {
		initDate = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-1459790172) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo initDate. 
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
	public java.util.Date getInitDate() {
		return (initDate == null ? null : new java.util.Date(initDate.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String intestatariocc = null;

	/**
	 * Imposta il valore della property [intestatariocc]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setIntestatariocc(java.lang.String val) {
		intestatariocc = val;
	}

	////{PROTECTED REGION ID(R705531687) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo intestatariocc. 
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
	public java.lang.String getIntestatariocc() {
		return intestatariocc;
	}

	/**
	 * @generated
	 */
	private java.lang.String language = null;

	/**
	 * Imposta il valore della property [language]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setLanguage(java.lang.String val) {
		language = val;
	}

	////{PROTECTED REGION ID(R953626910) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo language. 
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
	public java.lang.String getLanguage() {
		return language;
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

	////{PROTECTED REGION ID(R1525335369) ENABLED START////}
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
	private java.lang.Long mscsorderid = null;

	/**
	 * Imposta il valore della property [mscsorderid]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setMscsorderid(java.lang.Long val) {
		mscsorderid = val;
	}

	////{PROTECTED REGION ID(R-1153613811) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo mscsorderid. 
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
	public java.lang.Long getMscsorderid() {
		return mscsorderid;
	}

	/**
	 * @generated
	 */
	private java.lang.Boolean mscsorderidNull = null;

	/**
	 * Imposta il valore della property [mscsorderidNull]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setMscsorderidNull(java.lang.Boolean val) {
		mscsorderidNull = val;
	}

	////{PROTECTED REGION ID(R1534700340) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo mscsorderidNull. 
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
	public java.lang.Boolean getMscsorderidNull() {
		return mscsorderidNull;
	}

	/**
	 * @generated
	 */
	private java.lang.Long oldstate = null;

	/**
	 * Imposta il valore della property [oldstate]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setOldstate(java.lang.Long val) {
		oldstate = val;
	}

	////{PROTECTED REGION ID(R-1510509424) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo oldstate. 
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
	public java.lang.Long getOldstate() {
		return oldstate;
	}

	/**
	 * @generated
	 */
	private java.lang.String opernumber = null;

	/**
	 * Imposta il valore della property [opernumber]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setOpernumber(java.lang.String val) {
		opernumber = val;
	}

	////{PROTECTED REGION ID(R-2133666979) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo opernumber. 
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
	public java.lang.String getOpernumber() {
		return opernumber;
	}

	/**
	 * @generated
	 */
	private java.lang.String paymentid = null;

	/**
	 * Imposta il valore della property [paymentid]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setPaymentid(java.lang.String val) {
		paymentid = val;
	}

	////{PROTECTED REGION ID(R-2107182949) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo paymentid. 
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
	public java.lang.String getPaymentid() {
		return paymentid;
	}

	/**
	 * @generated
	 */
	private java.lang.String payurl = null;

	/**
	 * Imposta il valore della property [payurl]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setPayurl(java.lang.String val) {
		payurl = val;
	}

	////{PROTECTED REGION ID(R665570061) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo payurl. 
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
	public java.lang.String getPayurl() {
		return payurl;
	}

	/**
	 * @generated
	 */
	private java.lang.String pgresultcode = null;

	/**
	 * Imposta il valore della property [pgresultcode]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setPgresultcode(java.lang.String val) {
		pgresultcode = val;
	}

	////{PROTECTED REGION ID(R1241624455) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo pgresultcode. 
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
	public java.lang.String getPgresultcode() {
		return pgresultcode;
	}

	/**
	 * @generated
	 */
	private java.lang.String providertimestamp = null;

	/**
	 * Imposta il valore della property [providertimestamp]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setProvidertimestamp(java.lang.String val) {
		providertimestamp = val;
	}

	////{PROTECTED REGION ID(R1973928767) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo providertimestamp. 
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
	public java.lang.String getProvidertimestamp() {
		return providertimestamp;
	}

	/**
	 * @generated
	 */
	private java.lang.String rispcomp = null;

	/**
	 * Imposta il valore della property [rispcomp]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setRispcomp(java.lang.String val) {
		rispcomp = val;
	}

	////{PROTECTED REGION ID(R1481584041) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo rispcomp. 
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
	public java.lang.String getRispcomp() {
		return rispcomp;
	}

	/**
	 * @generated
	 */
	private java.util.Date startDate = null;

	/**
	 * Imposta il valore della property [startDate]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setStartDate(java.util.Date val) {
		startDate = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R144523818) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo startDate. 
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
	public java.util.Date getStartDate() {
		return (startDate == null ? null : new java.util.Date(startDate.getTime()));
	}

	/**
	 * @generated
	 */
	private java.lang.String transactionId = null;

	/**
	 * Imposta il valore della property [transactionId]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setTransactionId(java.lang.String val) {
		transactionId = val;
	}

	////{PROTECTED REGION ID(R-1091786093) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo transactionId. 
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
	public java.lang.String getTransactionId() {
		return transactionId;
	}

	/**
	 * @generated
	 */
	private java.lang.String userhaschange = null;

	/**
	 * Imposta il valore della property [userhaschange]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setUserhaschange(java.lang.String val) {
		userhaschange = val;
	}

	////{PROTECTED REGION ID(R-1405746855) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo userhaschange. 
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
	public java.lang.String getUserhaschange() {
		return userhaschange;
	}

	/*PROTECTED REGION ID(R-1713463875) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
