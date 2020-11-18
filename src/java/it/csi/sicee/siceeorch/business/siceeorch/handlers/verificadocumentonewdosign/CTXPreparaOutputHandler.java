package it.csi.sicee.siceeorch.business.siceeorch.handlers.verificadocumentonewdosign;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1443022774) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import it.csi.sicee.siceeorch.business.util.Constants;
import it.csi.sicee.siceeorch.dto.siceeorch.Signature;
import it.doqui.dosign.dosign.dto.signature.SignCertInfo;
import java.text.ParseException;
import java.util.ArrayList;
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [preparaOutput].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXPreparaOutputHandler extends CustomTransformBaseHandler {

	/**
	 * il prefisso dei logger
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * il logger utilizzato dall'handler
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * Logica effettiva di trasformazione degli slot di input nel valore da inseirire
	 * nello slot di output.
	 * La logica e' codificata in java.
	 * @param inputs mappa contenente gli input (nome dello slot e valore)
	 * @return l'oggetto risultante dalla trasformazione degli input e che dovra' essere
	 *         inserito nello sloti di output 
	 */
	public Object getTransformedObject(Map<String, Object> inputs) {
		getLogger(null).debug("[CTXPreparaOutputHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport outVal = (it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [serviceResult]
		it.doqui.dosign.dosign.dto.signature.VerifySignAndCertReport slot_serviceResult = (it.doqui.dosign.dosign.dto.signature.VerifySignAndCertReport) inputs
				.get("SLOT_serviceResult");
		// slot [digestAlgorithmResult]
		java.lang.String slot_digestAlgorithmResult = (java.lang.String) inputs.get("SLOT_digestAlgorithmResult");

		/*PROTECTED REGION ID(R-1245896875) ENABLED START*/
		/// inserire qui la logica di trasformazione
		outVal = new it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport();

		java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm", java.util.Locale.ITALY);
		Integer[] errorCodes = null;
		java.util.ArrayList<Integer> codes = new java.util.ArrayList<Integer>();

		outVal.setEsito(true);
		outVal.setErrorCodeComplessivo(slot_serviceResult.getErrorCode());

		switch (outVal.getErrorCodeComplessivo()) {
			case 1 :
				codes.add(Constants.KO_SIGNANDCERT_1);
				break;
			case 2 :
				codes.add(Constants.KO_SIGNANDCERT_2);
				break;
			case 3 :
				codes.add(Constants.KO_SIGNANDCERT_3);
				break;
			case 400 :
				codes.add(Constants.KO_SIGNANDCERT_400);
				break;
		}

		boolean isSignAndCert_7_150_160 = true;

		outVal.setNumeroCertificatiFirma(slot_serviceResult.getTotalNumSignature());
		outVal.setNumeroMarche(slot_serviceResult.getTotalNumTimeStamp());

		try {
			outVal.setDataVerifica(df.parse(slot_serviceResult.getVerificationDate()));
		} catch (ParseException e) {
			getLogger(null).error("[CTXPreparaOutputHandler::getTransformedObject]- " + e.getMessage());
		}

		outVal.setDeliberationCompliant(slot_serviceResult.getDeliberationCompliant());

		outVal.setTipoFirma(slot_serviceResult.getSignatureType());
		if (outVal.getTipoFirma() != Constants.OK_SIGNATURE_TYPE) {
			outVal.setEsito(false);
			codes.add(Constants.KO_SIGNATURE_TYPE_FORMAT);
		}

		outVal.setFormatoFirma(slot_serviceResult.getSignatureFormat());
		if (outVal.getFormatoFirma() != Constants.OK_SIGNATURE_FORMAT) {
			outVal.setEsito(false);
			codes.add(Constants.KO_SIGNATURE_TYPE_FORMAT);
		}

		outVal.setTipoFile(String.valueOf(slot_serviceResult.getFileType()));
		if (!outVal.getTipoFile().equals(Constants.OK_FILE_TYPE)) {
			outVal.setEsito(false);
			codes.add(Constants.KO_FILE_TYPE);
		}

		// SignCertInfo
		if (slot_serviceResult.getExternalEnvelope() != null) {
			SignCertInfo[] sci = slot_serviceResult.getExternalEnvelope().getSignature();

			ArrayList<it.csi.sicee.siceeorch.dto.siceeorch.Signature> signatures = new ArrayList<it.csi.sicee.siceeorch.dto.siceeorch.Signature>();

			ArrayList<SignCertInfo> signCertInfoList = new ArrayList<SignCertInfo>();

			// i SignCertInfo possono essere annidati
			for (it.doqui.dosign.dosign.dto.signature.SignCertInfo s : sci) {
				signCertInfoList.add(s);
				if (s.getSignature() != null) {
					for (int i = 0; i < s.getSignature().length; i++) {
						signCertInfoList.add(s.getSignature()[i]);
					}
				}
			}

			//for (it.doqui.dosign.dosign.dto.signature.SignCertInfo s : sci) {
			for (it.doqui.dosign.dosign.dto.signature.SignCertInfo s : signCertInfoList) {
				Signature sign = new Signature();

				sign.setTipoCertificato(s.getCertificateType()); // 1 = firma; 2 = marca temporale.
				sign.setCompliance(s.getCompliance());
				if (sign.getTipoCertificato() == Constants.TIPO_CERTIFICATO_FIRMA
						&& !sign.getCompliance().trim().equalsIgnoreCase(Constants.OK_COMPLIANCE)) {
					outVal.setEsito(false);
					codes.add(Constants.KO_COMPLIANCE);
				}

				try {
					if (s.getDateTimeSignature() != null)
						sign.setDataOra(df.parse(s.getDateTimeSignature()));
				} catch (ParseException e) {
					getLogger(null).debug("[CTXPreparaOutputHandler::getTransformedObject]- " + e.getMessage());
				}

				try {
					sign.setDataOraVerifica(df.parse(slot_serviceResult.getVerificationDate()));
				} catch (ParseException e) {
					getLogger(null).error("[CTXPreparaOutputHandler::getTransformedObject]- " + e.getMessage());
				}

				sign.setAlgoritmo(s.getDigestAlgorithm());
				String[] algoritmiValidi = slot_digestAlgorithmResult.split(",");
				boolean valido = false;
				for (String a : algoritmiValidi) {
					if (sign.getAlgoritmo().equals(a.trim())) {
						valido = true;
					}
				}
				if (!valido) {
					outVal.setEsito(false);
					codes.add(Constants.KO_DIGEST_ALGORITHM);
				}

				sign.setCodiceErrore(s.getErrorCode());

				if (s.getErrorCode() != Constants.OK_SIGNANDCERT_7) {
					isSignAndCert_7_150_160 = false;
				}

				if (s.getErrorCode() != Constants.OK_SIGNANDCERT_0 && s.getErrorCode() != Constants.OK_SIGNANDCERT_7) {

					boolean isSameError = false;
					switch (s.getErrorCode()) {
						case 4 :
						case 5 :
						case 6 :
						case 8 :
						case 9 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_4_9) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_4_9);
							break;
						case 10 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_10) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_10);
							break;
						case 11 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_11) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_11);
							break;
						case 12 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_12) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_12);
							break;
					}

					outVal.setEsito(false);
				}

				sign.setNome(s.getGivenname());
				sign.setCognome(s.getSurname());
				sign.setCodiceFiscale(s.getTaxCode());

				it.doqui.dosign.dosign.dto.certificate.VerifyCertificateReport r = s.getCertReport();

				try {
					if (r.getRevocationDate() != null)
						sign.setDataRevoca(df.parse(r.getRevocationDate()));
				} catch (ParseException e) {
					getLogger(null).error("[CTXPreparaOutputHandler::getTransformedObject]- " + e.getMessage());
				}

				sign.setAutoritaCertificato(r.getCertificationAuthority());
				sign.setCodiceErroreCertificato(r.getErrorCode());

				if (r.getErrorCode() != Constants.OK_SIGNANDCERT_150
						&& r.getErrorCode() != Constants.OK_SIGNANDCERT_160) {
					isSignAndCert_7_150_160 = false;
				}

				if (r.getErrorCode() != Constants.OK_SIGNANDCERT_0 && r.getErrorCode() != Constants.OK_SIGNANDCERT_150
						&& r.getErrorCode() != Constants.OK_SIGNANDCERT_160) {

					boolean isSameError = false;
					switch (r.getErrorCode()) {
						case 100 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_100) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_100);
							break;
						case 110 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_110) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_110);
							break;
						case 120 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_120) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_120);
							break;
						case 130 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_130) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_130);
							break;
						case 140 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_140) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_140);
							break;
						case 170 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_170) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_170);
							break;
						case 180 :
							isSameError = false;
							for (Integer error : codes) {
								if (error == Constants.KO_SIGNANDCERT_180) {
									isSameError = true;
									break;
								}
							}
							if (!isSameError)
								codes.add(Constants.KO_SIGNANDCERT_180);
							break;

					}
					outVal.setEsito(false);
				}

				sign.setNumeroSerie(r.getSerialNumber());

				try {
					sign.setDataInizioValidita(df.parse(r.getValidFrom()));
				} catch (ParseException e) {
					getLogger(null).error("[CTXPreparaOutputHandler::getTransformedObject]- " + e.getMessage());
				}

				try {
					sign.setDataFineValidita(df.parse(r.getValidTo()));
				} catch (ParseException e) {
					getLogger(null).error("[CTXPreparaOutputHandler::getTransformedObject]- " + e.getMessage());
				}

				signatures.add(sign);
			}

			Signature[] arraySignature = new Signature[signatures.size()];
			for (int i = 0; i < signatures.size(); i++)
				arraySignature[i] = signatures.get(i);

			outVal.setSignatures(arraySignature);

		}

		errorCodes = new Integer[codes.size()];
		for (int i = 0; i < codes.size(); i++) {
			errorCodes[i] = codes.get(i);
		}
		outVal.setErrorCode(errorCodes);

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXPreparaOutputHandler::getTransformedObject]-END ");
		return outVal;
	}
}
