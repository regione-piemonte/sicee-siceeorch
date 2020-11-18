/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceeorch.business.util;

import it.csi.sicee.siceeorch.business.siceeorch.util.Converter;
import it.csi.sicee.siceeorch.dto.siceeorch.Impianto;
import it.csi.sicee.siceeorch.dto.siceeorch.Signature;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class GenericUtil.
 */
public class GenericUtil implements Serializable {
	
	/** The Constant BEGIN. */
	static final int BEGIN = 1;
	
	/** The Constant END. */
	static final int END = 2;
	
	/** The Constant VALUE. */
	static final int VALUE = 3;
	
	/** The Constant TEST. */
	static final int TEST = 4;
	
	/** The Constant SIMPLE. */
	static final int SIMPLE = 5;

	/** The log. */
	protected static Logger log = Logger.getLogger("siceeorch");

	/**
	 * Stampa.
	 *
	 * @param o the o
	 * @param useLog4j the use log4j
	 * @param depth the depth
	 * @param testName the test name
	 */
	public static void stampa(Object o, boolean useLog4j, int depth,
			String testName) {
		try {
			if (useLog4j) {
				log.debug(testName + " BEGIN");
			} else {
				System.out.println(testName + " BEGIN");
			}
			if (o != null) {
				if (o.getClass().isArray()) {
					Object[] a = (Object[]) o;
					stampa(a, useLog4j, depth);
				} else {
					stampa(o, useLog4j, depth);
				}
			}
			if (useLog4j) {
				log.debug(testName + " END");
			} else {
				System.out.println(testName + " END");
			}
		} catch (Exception e) {
			log.error(e);
		}
	}

	/**
	 * Stampa.
	 *
	 * @param o the o
	 * @param useLog4j the use log4j
	 * @param depth the depth
	 */
	public static void stampa(Object o, boolean useLog4j, int depth) {

		try {
			if (o == null) {
				print(o, null, useLog4j, depth, BEGIN);
			} else {
				if (o instanceof String) {
					print(o, o, useLog4j, depth, SIMPLE);
				}
				if (o instanceof Integer) {
					print(o, o, useLog4j, depth, SIMPLE);
				} else {
					print(o, null, useLog4j, depth, BEGIN);
					callGetMethods(o, useLog4j, depth + 1);
					print(o, null, useLog4j, depth, END);
				}
			}
		} catch (Exception e) {
			log.error(e);
		} 
	}

	/**
	 * Prints the.
	 *
	 * @param o the o
	 * @param value the value
	 * @param useLog4j the use log4j
	 * @param depth the depth
	 * @param type the type
	 * @throws Exception the exception
	 */
	private static void print(Object o, Object value, boolean useLog4j,
			int depth, int type) throws Exception {

		StringBuffer tab = new StringBuffer();
		for (int i = 0; i < depth; i++) {
			tab.append("\t");
		}
		if (o != null) {
			String className = o.getClass().getName();
			switch (type) {
			case BEGIN:
				tab.append(className);
				tab.append(" BEGIN");
				break;
			case END:
				tab.append(className);
				tab.append(" END");
				break;
			case VALUE:
				tab.append(((Method) o).getName());
				tab.append(" == ");
				tab.append(value);
				break;
			case SIMPLE:
				tab.append(o);
				tab.append(" == ");
				tab.append(value);
				break;
			default:

			}
		} else if (type == TEST) {
			tab.append("");
		} else {
			tab.append("Oggetto nullo!!");
		}

		if (useLog4j) {
			log.debug(tab);
		} else {
			System.out.println(tab);
		}

	}

	/**
	 * Call get methods.
	 *
	 * @param o the o
	 * @param useLog4j the use log4j
	 * @param depth the depth
	 */
	private static void callGetMethods(Object o, boolean useLog4j, int depth) {
		try {
			Method[] meth = o.getClass().getDeclaredMethods();
			for (int i = 0; i < meth.length; i++) {
				Method thisM = meth[i];
				if (thisM.getName().startsWith("get")) {
					if (!thisM.getName().equals("get")) {
						Object result = thisM.invoke(o, new Object[] {});
						if (result != null && result.getClass().isArray()) {
							Object[] a = (Object[]) result;
							stampa(a, useLog4j, depth);
						} else {
							print(thisM, result, useLog4j, depth, VALUE);
						}
					}
				}
			}
		} catch (Exception e) {
			log.error(e);
		}
	}

	/**
	 * Stampa.
	 *
	 * @param o the o
	 * @param useLog4j the use log4j
	 * @param depth the depth
	 * @throws Exception the exception
	 */
	public static void stampa(Object[] o, boolean useLog4j, int depth)
			throws Exception {
		if (o != null) {
			String className = o.getClass().getSimpleName();
			for (int i = 0; i < o.length; i++) {
				stampa(o[i], false, depth);
			}

			if (o.length == 0) {
				if (useLog4j) {
					log.debug(className + " vuoto");
				} else {
					System.out.println("vuoto");
				}
			}
		} else {
			if (useLog4j) {
				log.debug("vuoto");
			} else {
				System.out.println("vuoto");
			}
		}

	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param s the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param s the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Integer s) {
		return s == null;
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param s the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Double s) {
		return s == null;
	}

	/**
	 * Convert to date from gmt format.
	 *
	 * @param s the s
	 * @return the date
	 */
	public static Date convertToDateFromGMTFormat(String s) {
		if (s == null)
			return null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd HH:mm:ss yyyy",Locale.UK);
		Date parsed = null;
		try {
			parsed = sdf.parse(s);
		} catch (ParseException e) {
			log.error(e);
		}
		return parsed;
	}

	/**
	 * Convert to date.
	 *
	 * @param s the s
	 * @return the java.util. date
	 */
	public static java.util.Date convertToDate(String s) {
		Date ret = null;
		if (s != null && s.length() > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			try {
				ret = sdf.parse(s);
			} catch (ParseException e) {
				log.error(e);
			}
		} else {
			ret = null;
		}
		
		return ret;
	}

	/**
	 * Convert to date.
	 *
	 * @param s the s
	 * @return the java.util. date
	 */
	public static java.util.Date convertToSimpleDate(String s) {
		Date ret = null;
		if (s != null && s.length() > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				ret = sdf.parse(s);
			} catch (ParseException e) {
				log.error(e);
			}
		} else {
			ret = null;
		}
		
		return ret;
	}
	
	/**
	 * Convert to string.
	 *
	 * @param i the Integer
	 * @return the string
	 */
	public static String convertToString(Integer i) {
		String converted = null;

		if(i != null) {
			try {
				converted = i.toString();
			}
			catch(Exception e) {
				log.error("Errore durante la conversione di '" + i + "' in String: " + i, e);
			}
		}
		return converted;
	}
	
	/**
	 * Rimappa verify report.
	 *
	 * @param slot_result the slot_result
	 */
	public static void rimappaVerifyReport(it.doqui.index.ecmengine.dto.engine.security.VerifyReport slot_result)
	{
		it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport outVal = new it.csi.sicee.siceeorch.dto.siceeorch.VerifyReport(); 
		
		Integer[] errorCodes = null;
		ArrayList<Integer> codes = new ArrayList<Integer>();
		
		outVal.setErrorCode(errorCodes);
		outVal.setEsito(codes.isEmpty());
		outVal.setConformitaParametriInput(slot_result
				.getConformitaParametriInput());
		outVal.setFormatoFirma(slot_result.getFormatoFirma());
		outVal.setTipoFirma(slot_result.getTipoFirma());
		outVal.setNumeroCertificatiFirma(slot_result
				.getNumCertificatiFirma());
		outVal.setNumeroMarche(slot_result.getNumCertificatiMarca());
		
	}
	
	/**
	 * Recupera signature by verify report.
	 *
	 * @param vReport the v report
	 * @param lSignature the l signature
	 * @return the array list
	 */
	public static ArrayList<Signature> recuperaSignatureByVerifyReport(it.doqui.index.ecmengine.dto.engine.security.VerifyReport vReport, ArrayList<Signature> lSignature)
	{
		
		log.debug("\n ########### VerifyReport - inizio ###########");
		
		
		log.debug("Stampo il vReport: "+vReport);
		
		log.debug("vReport.getConformitaParametriInput: "+vReport.getConformitaParametriInput());
		log.debug("vReport.getDate: "+vReport.getDate());

		log.debug("vReport.getErrorCode: "+vReport.getErrorCode());
		log.debug("vReport.getFormatoFirma: "+vReport.getFormatoFirma());
		log.debug("vReport.getNumCertificatiFirma: "+vReport.getNumCertificatiFirma());
		log.debug("vReport.getNumCertificatiMarca: "+vReport.getNumCertificatiMarca());
		log.debug("vReport.getTipoFirma: "+vReport.getTipoFirma());
		log.debug("vReport.getUid: "+vReport.getUid()); 
		
		if (vReport.getUid() != null && vReport.getUid().length > 0)
		{
			log.debug("\n Stampo l'enco degli UID: "+vReport.getUid().length);
			
			for (int i = 0; i < vReport.getUid().length; i++) {
				log.debug("   UID "+i+": "+vReport.getUid()[i]);
			}
		}
		
		log.debug("vReport.getChild: "+vReport.getChild());
		
		if (vReport.getChild() != null)
		{
			log.debug("@@ HA FIGLI: ");
			recuperaSignatureByVerifyReport(vReport.getChild(), lSignature);
			log.debug("\n\n");
		}else {
			log.debug("@@ NON HA FIGLI");
		}
		
		log.debug("vReport.getSignature: "+vReport.getSignature());
		
		if (vReport.getSignature() != null)
		{
			log.debug("@@ HA SIGNATURE: ");
			recuperaSignatureByListSignature(vReport.getSignature(), lSignature);
			log.debug("\n\n");
		}else {
			log.debug("@@ NON HA SIGNATURE");
		}
		
		
		
		
		log.debug("\n ########### VerifyReport - fine ########### \n");

		return lSignature;
		
		
	}
	
	
	/**
	 * Recupera signature by list signature.
	 *
	 * @param aSignature the a signature
	 * @param lSignature the l signature
	 * @return the array list
	 */
	public static ArrayList<Signature> recuperaSignatureByListSignature(it.doqui.index.ecmengine.dto.engine.security.Signature[] aSignature, ArrayList<Signature> lSignature)
	{
		
		log.debug("\n ########### Signature - inizio ###########");
		
		log.debug("Stampo il vSignature: "+aSignature);
		
		Signature signatureOrch = new Signature();

		for (int i = 0; i < aSignature.length; i++) {
			
			it.doqui.index.ecmengine.dto.engine.security.Signature signature = aSignature[i];

			
			signatureOrch = new Signature();
			
			signatureOrch.setCa(signature.getCa());
			signatureOrch.setCodiceErrore(signature.getErrorCode());
			
			/*
			getLogger(null).debug(
					"Signature " + i + " error code: "
							+ sign[i].getErrorCode());
			*/
			
			/*
			if (sign[i].getErrorCode() != 0
					&& sign[i].getErrorCode() != 6 && outVal.getEsito()) {
				outVal.setEsito(false);
			}
			*/
			
			signatureOrch.setCodiceFiscale(signature.getCodiceFiscale());
			signatureOrch.setCognome(signature.getSurname());
			signatureOrch.setDataFineValidita(GenericUtil
					.convertToDateFromGMTFormat(signature
							.getFineValidita()));
			signatureOrch.setDataInizioValidita(GenericUtil
					.convertToDateFromGMTFormat(signature
							.getInizioValidita()));
			signatureOrch.setDataOra(signature.getDataOra());
			signatureOrch.setDataOraVerifica(GenericUtil.convertToDate(signature
					.getDataOraVerifica()));
			signatureOrch.setNome(signature.getGivenname());
			signatureOrch.setNumeroSerie(signature.getSerialNumber());

			lSignature.add(signatureOrch);
			
			if (log.isDebugEnabled())
			{
				log.debug("\nSIGNATURE: "+i);
			
				log.debug("signature.getAnnoFirma: "+signature.getAnnoFirma());
				log.debug("signature.getCa: "+signature.getCa());
				log.debug("signature.getCert: "+signature.getCert());
				log.debug("signature.getCodiceFiscale: "+signature.getCodiceFiscale());
				log.debug("signature.getDataOra: "+signature.getDataOra());
				log.debug("signature.getDataOraVerifica: "+signature.getDataOraVerifica());
				log.debug("signature.getDipartimento: "+signature.getDipartimento());
				log.debug("signature.getDnQualifier: "+signature.getDnQualifier());
				log.debug("signature.getErrorCode: "+signature.getErrorCode());
				log.debug("signature.getFineValidita: "+signature.getFineValidita());
				log.debug("signature.getFirmatario: "+signature.getFirmatario());
	
				log.debug("signature.getGiornoFirma: "+signature.getGiornoFirma());
				log.debug("signature.getGivenname: "+signature.getGivenname());
				log.debug("signature.getInizioValidita: "+signature.getInizioValidita());
				log.debug("signature.getMeseFirma: "+signature.getMeseFirma());
				log.debug("signature.getMinutiFirma: "+signature.getMinutiFirma());
				log.debug("signature.getNominativoFirmatario: "+signature.getNominativoFirmatario());
				log.debug("signature.getNumeroControfirme: "+signature.getNumeroControfirme());
				log.debug("signature.getOraFirma: "+signature.getOraFirma());
				log.debug("signature.getOrganizzazione: "+signature.getOrganizzazione());
				log.debug("signature.getPaese: "+signature.getPaese());
				log.debug("signature.getSecondiFirma: "+signature.getSecondiFirma());
				log.debug("signature.getSerialNumber: "+signature.getSerialNumber());
				log.debug("signature.getSurname: "+signature.getSurname());
				log.debug("signature.getTipoCertificato: "+signature.getTipoCertificato());
				log.debug("signature.getTipoFirma: "+signature.getTipoFirma());
				log.debug("signature.isTimestamped: "+signature.isTimestamped());
				
				log.debug("signature.getSignature: "+signature.getSignature());
			}
			if (signature.getSignature() != null && signature.getSignature().length > 0)
			{
				log.debug("@@ HA "+signature.getSignature().length+" SIGNATURE: ");
				recuperaSignatureByListSignature(signature.getSignature(), lSignature);
				log.debug("\n\n");
			}else {
				log.debug("@@ NON HA SIGNATURE");
			}
			
		}
		
		
		log.debug("\n ########### Signature - fine ########### \n");

		return lSignature;
	}

	/**
	 * Stampa signature by list.
	 *
	 * @param aSignature the a signature
	 */
	public static void stampaSignatureByList(Signature[] aSignature)
	{
		
		log.debug("\n ########### Signature ORCH - inizio ###########");
		
		log.debug("Stampo il signatureOrch: "+aSignature);
		
		if (aSignature != null && aSignature.length > 0)
		{
			for (int i = 0; i < aSignature.length; i++) {
				
				Signature signatureOrch = aSignature[i];
				
				log.debug("\nSIGNATURE ORCH: "+i);
				
				log.debug("getCodiceFiscale: "+signatureOrch.getCodiceFiscale());
				log.debug("getCognome: "+signatureOrch.getCognome());
				log.debug("getNome: "+signatureOrch.getNome());
				log.debug("getDataFineValidita: "+signatureOrch.getDataFineValidita());
				log.debug("getDataInizioValidita: "+signatureOrch.getDataInizioValidita());
				log.debug("getDataOra: "+signatureOrch.getDataOra());
				log.debug("getDataOraVerifica: "+signatureOrch.getDataOraVerifica());
				log.debug("getNumeroSerie: "+signatureOrch.getNumeroSerie());
				
				
			}
		}
		
		log.debug("\n ########### Signature ORCH - fine ########### \n");

	}

	/**
	 * Rimappa verify report.
	 *
	 * @param slot_result the slot_result
	 */
	public static it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] rimappaListImpianto(it.csi.sigit.sigitext.ws.service.client.Impianto[] slot_result)
	{
		
		
		it.csi.sicee.siceeorch.dto.siceeorch.Impianto[] outVal = null;
		if (slot_result != null)
		{
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Impianto[slot_result.length]; 

			it.csi.sicee.siceeorch.dto.siceeorch.Impianto impiantoOut = null;
			it.csi.sigit.sigitext.ws.service.client.Impianto impiantoIn = null;

			for (int i = 0; i < slot_result.length; i++) {
				
				impiantoOut = new it.csi.sicee.siceeorch.dto.siceeorch.Impianto();
				
				impiantoIn = slot_result[i];
				
				impiantoOut.setCodiceImpianto(impiantoIn.getCodiceImpianto());
				
				impiantoOut.setStato(impiantoIn.getStato());
				impiantoOut.setDtAssegnazione(convertToSimpleDate(impiantoIn.getDtAssegnazione()));
				impiantoOut.setDtDismissione(convertToSimpleDate(impiantoIn.getDtDismissione()));
				impiantoOut.setMotivoDisimissione(impiantoIn.getMotivoDisimissione());
				impiantoOut.setIndirizzo(impiantoIn.getIndirizzo());
				impiantoOut.setCivico(impiantoIn.getCivico());
				impiantoOut.setDescComune(impiantoIn.getDescComune());
				impiantoOut.setSiglaProv(impiantoIn.getSiglaProv());
				impiantoOut.setDenomResponsabile(impiantoIn.getDenomResponsabile());
				impiantoOut.setCfResponsabile(impiantoIn.getCfResponsabile());
				impiantoOut.setDenom3Responsabile(impiantoIn.getDenom3Responsabile());
				impiantoOut.setCf3Responsabile(impiantoIn.getCf3Responsabile());
				
				it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[] listRifCatOut = new it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale[impiantoIn.getRifCatastali().length];
				it.csi.sigit.sigitext.ws.service.client.RifCatastale[] listRifCatIn = impiantoIn.getRifCatastali();
				it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale rifCatOut = null;
				it.csi.sigit.sigitext.ws.service.client.RifCatastale rifCatIn = null;
				
				for (int j = 0; j < listRifCatIn.length; j++) {
					
					rifCatIn = listRifCatIn[j];
					
					rifCatOut = new it.csi.sicee.siceeorch.dto.siceeorch.RifCatastale();
					
					rifCatOut.setSezione(rifCatIn.getSezione());
					rifCatOut.setFoglio(rifCatIn.getFoglio());
					rifCatOut.setParticella(rifCatIn.getParticella());
					rifCatOut.setSubalterno(rifCatIn.getSubalterno());
					rifCatOut.setPod(rifCatIn.getPod());
					rifCatOut.setPdr(rifCatIn.getPdr());
					
					listRifCatOut[j] = rifCatOut;
				}
				
				impiantoOut.setRifCatastale(listRifCatOut);
				
				impiantoOut.setDtUltAggLibretto(convertToSimpleDate(impiantoIn.getDtUltAggLibretto()));
				impiantoOut.setUidIndexLibretto(impiantoIn.getUidIndexLibretto());
				
				
				
				
				it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[] listRappContrOut = new it.csi.sicee.siceeorch.dto.siceeorch.RappControllo[impiantoIn.getRappControllo().length];
				it.csi.sigit.sigitext.ws.service.client.RappControllo[] listRappContrIn = impiantoIn.getRappControllo();
				it.csi.sicee.siceeorch.dto.siceeorch.RappControllo rappContrOut = null;
				it.csi.sigit.sigitext.ws.service.client.RappControllo rappContrIn = null;
				
				for (int j = 0; j < listRappContrIn.length; j++) {
					
					rappContrIn = listRappContrIn[j];
					
					rappContrOut = new it.csi.sicee.siceeorch.dto.siceeorch.RappControllo();
					
					
					rappContrOut.setDescTipoDoc(rappContrIn.getDescTipoDoc());
					rappContrOut.setSiglaBollino(rappContrIn.getSiglaBollino());
					rappContrOut.setNumBollino(rappContrIn.getNumBollino());
					rappContrOut.setDtControllo(convertToSimpleDate(rappContrIn.getDtControllo()));
					rappContrOut.setApparecchiature(rappContrIn.getApparecchiature());
					rappContrOut.setUidIndexLibretto(rappContrIn.getUidIndexLibretto());
					
					listRappContrOut[j] = rappContrOut;
				}
				
				impiantoOut.setRappControllo(listRappContrOut);
				
				outVal[i] = impiantoOut;
			}
		
		}
		
		return outVal;
	}
	
	public static String costruisciDescVia(it.csi.sitad.tpnm.entity.Via via)
	{
		StringBuffer indirizzo = new StringBuffer();
		indirizzo.append(via.getIndirizzo().getTipoVia());
		indirizzo.append(" ");
		indirizzo.append(via.getIndirizzo().getNomeVia().getNome_via());
		
		
		//via.getLocalita().getComune().getToponimo()
		log.debug("---> Localita.getComune().getToponimo() oggetto "+via.getLocalita().getComune().getToponimo());
		
		if (!via.getLocalita().getNome().equalsIgnoreCase(via.getLocalita().getComune().getToponimo()))
		{
			// devo aggiungere la localita (es a Villanova d'Asti per il nome via: Buttigliera ritorna 3 vie valide uguali ma con localita' diversa {STAZIONE - SAVI - VILLANOVA D'ASTI})
			indirizzo.append(" Loc. ");
			indirizzo.append(via.getLocalita().getNome());
		}
		
		
		
		// devo aggiungere che se una via non e' in stato 'V' allora aggiungo nella descrizione 'DEPRECATO'
		if (!via.getStatoVia().equals(Constants.COD_STATO_VIA_VALIDA))
		{
			indirizzo.append(" (");
			indirizzo.append(Constants.DESC_STATO_VIA_DEPRECATO);
			indirizzo.append(")");
		}
		
		return indirizzo.toString();
	}
	
	/**
	 * Checks if is null or empty.
	 *
	 * @param doc the doc
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(byte[] doc) {
		if (doc != null)
			return false;
		
		return true;
	}
}