
package it.csi.sicee.siceeorch.dto.siceeorch;

////{PROTECTED REGION ID(R1789644293) ENABLED START////}
/**
 * Inserire qui la documentazione della classe VerifyReport.
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
public class VerifyReport implements java.io.Serializable {
	// il serial version UID e' impostato in base a quanto configurato nel modello
	/**
	 * @generated
	 */
	static final long serialVersionUID = 1;

	/**
	 * @generated
	 */
	private java.lang.Boolean esito = null;

	/**
	 * Imposta il valore della property [esito]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setEsito(java.lang.Boolean val) {
		esito = val;
	}

	////{PROTECTED REGION ID(R483545681) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo esito. 
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
	public java.lang.Boolean getEsito() {
		return esito;
	}

	/**
	 * @generated
	 */
	private java.lang.Integer errorCodeComplessivo = null;

	/**
	 * Imposta il valore della property [errorCodeComplessivo]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setErrorCodeComplessivo(java.lang.Integer val) {
		errorCodeComplessivo = val;
	}

	////{PROTECTED REGION ID(R-851699478) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo errorCodeComplessivo. 
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
	public java.lang.Integer getErrorCodeComplessivo() {
		return errorCodeComplessivo;
	}

	/**
	 * @generated
	 */
	private java.lang.Integer[] errorCode = null;

	/**
	 * Imposta il valore della property [errorCode]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setErrorCode(java.lang.Integer[] val) {
		if (val == null) {
			errorCode = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			errorCode = new java.lang.Integer[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				errorCode[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R1472714672) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo errorCode. 
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
	public java.lang.Integer[] getErrorCode() {
		if (errorCode == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			java.lang.Integer[] copy = new java.lang.Integer[errorCode.length];
			for (int i = 0; i < errorCode.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = errorCode[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
	}

	/**
	 * @generated
	 */
	private it.csi.sicee.siceeorch.dto.siceeorch.Signature[] signatures = null;

	/**
	 * Imposta il valore della property [signatures]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setSignatures(it.csi.sicee.siceeorch.dto.siceeorch.Signature[] val) {
		if (val == null) {
			signatures = null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			signatures = new it.csi.sicee.siceeorch.dto.siceeorch.Signature[val.length];
			for (int i = 0; i < val.length; i++) { //NOSONAR  Reason:NOTINJ13
				signatures[i] = val[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
		}
	}

	////{PROTECTED REGION ID(R15682176) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo signatures. 
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
	public it.csi.sicee.siceeorch.dto.siceeorch.Signature[] getSignatures() {
		if (signatures == null) {
			return null;
		} else {
			// non si puo' usare System.arrayCopy perche' i DTO devono essere compilati Java 1.3
			it.csi.sicee.siceeorch.dto.siceeorch.Signature[] copy = new it.csi.sicee.siceeorch.dto.siceeorch.Signature[signatures.length];
			for (int i = 0; i < signatures.length; i++) { //NOSONAR  Reason:NOTINJ13
				copy[i] = signatures[i]; //NOSONAR  Reason:NOTINJ13
			} //NOSONAR  Reason:NOTINJ13
			return copy;
		}
	}

	/**
	 * @generated
	 */
	private java.lang.Integer conformitaParametriInput = null;

	/**
	 * Imposta il valore della property [conformitaParametriInput]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setConformitaParametriInput(java.lang.Integer val) {
		conformitaParametriInput = val;
	}

	////{PROTECTED REGION ID(R1964533516) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo conformitaParametriInput. 
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
	public java.lang.Integer getConformitaParametriInput() {
		return conformitaParametriInput;
	}

	/**
	 * @generated
	 */
	private java.lang.Integer formatoFirma = null;

	/**
	 * Imposta il valore della property [formatoFirma]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setFormatoFirma(java.lang.Integer val) {
		formatoFirma = val;
	}

	////{PROTECTED REGION ID(R2044305392) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo formatoFirma. 
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
	public java.lang.Integer getFormatoFirma() {
		return formatoFirma;
	}

	/**
	 * @generated
	 */
	private java.lang.Integer tipoFirma = null;

	/**
	 * Imposta il valore della property [tipoFirma]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setTipoFirma(java.lang.Integer val) {
		tipoFirma = val;
	}

	////{PROTECTED REGION ID(R-189229398) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo tipoFirma. 
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
	public java.lang.Integer getTipoFirma() {
		return tipoFirma;
	}

	/**
	 * @generated
	 */
	private java.lang.Integer numeroCertificatiFirma = null;

	/**
	 * Imposta il valore della property [numeroCertificatiFirma]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setNumeroCertificatiFirma(java.lang.Integer val) {
		numeroCertificatiFirma = val;
	}

	////{PROTECTED REGION ID(R-1356650103) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo numeroCertificatiFirma. 
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
	public java.lang.Integer getNumeroCertificatiFirma() {
		return numeroCertificatiFirma;
	}

	/**
	 * @generated
	 */
	private java.lang.Integer numeroMarche = null;

	/**
	 * Imposta il valore della property [numeroMarche]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setNumeroMarche(java.lang.Integer val) {
		numeroMarche = val;
	}

	////{PROTECTED REGION ID(R1914745923) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo numeroMarche. 
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
	public java.lang.Integer getNumeroMarche() {
		return numeroMarche;
	}

	/**
	 * @generated
	 */
	private java.util.Date dataVerifica = null;

	/**
	 * Imposta il valore della property [dataVerifica]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDataVerifica(java.util.Date val) {
		dataVerifica = (val == null ? null : new java.util.Date(val.getTime()));
	}

	////{PROTECTED REGION ID(R-1305340202) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo dataVerifica. 
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
	public java.util.Date getDataVerifica() {
		return (dataVerifica == null ? null : new java.util.Date(dataVerifica.getTime()));
	}

	/**
	 * @generated
	 */
	private boolean deliberationCompliant = true;

	/**
	 * Imposta il valore della property [deliberationCompliant]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setDeliberationCompliant(boolean val) {
		deliberationCompliant = val;
	}

	////{PROTECTED REGION ID(R-882324078) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo deliberationCompliant. 
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
	public boolean getDeliberationCompliant() {
		return deliberationCompliant;
	}

	/**
	 * @generated
	 */
	private java.lang.String tipoFile = null;

	/**
	 * Imposta il valore della property [tipoFile]
	 * @param val il valore da impostare
	 * @generated
	 */
	public void setTipoFile(java.lang.String val) {
		tipoFile = val;
	}

	////{PROTECTED REGION ID(R270990293) ENABLED START////}
	/**
	 * Inserire qui la documentazione dell'attributo tipoFile. 
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
	public java.lang.String getTipoFile() {
		return tipoFile;
	}

	/*PROTECTED REGION ID(R-2109571708) ENABLED START*/
	/// inserire qui eventuali ridefinizioni di toString, hashCode, equals
	/*PROTECTED REGION END*/
}
