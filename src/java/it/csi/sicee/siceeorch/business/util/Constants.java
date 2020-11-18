/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceeorch.business.util;

import java.io.Serializable;
import java.util.ResourceBundle;

// TODO: Auto-generated Javadoc
/**
 * The Class Constants.
 */
public class Constants implements Serializable {
	
	/** The Constant ERROR_CODE91. */
	public static final int ERROR_CODE91 = 91;
	
	/** The Constant ERROR_CODE92. */
	public static final int ERROR_CODE92 = 92;
	
	/** The Constant ERROR_CODE93. */
	public static final int ERROR_CODE93 = 93;
	
	/** The Constant ERROR_CODE94. */
	public static final int ERROR_CODE94 = 94;
	
	/** The Constant ERROR_CODE95. */
	public static final int ERROR_CODE95 = 95;
	
	// NEW DOSIGN INIZIO
	/** The Constant TIPO_CERTIFICATO_FIRMA. */
	public static final int TIPO_CERTIFICATO_FIRMA = 1;
	
	/** The Constant TIPO_CERTIFICATO_MARCA_TEMPORALE. */
	public static final int TIPO_CERTIFICATO_MARCA_TEMPORALE = 2;
	
	/** The Constant OK_SIGNANDCERT_0. */
	public static final int OK_SIGNANDCERT_0 = 0;
	
	/** The Constant OK_SIGNANDCERT_7. */
	public static final int OK_SIGNANDCERT_7 = 7;
	
	/** The Constant OK_SIGNANDCERT_150. */
	public static final int OK_SIGNANDCERT_150 = 150;
	
	/** The Constant OK_SIGNANDCERT_160. */
	public static final int OK_SIGNANDCERT_160 = 160;
	
	/** The Constant KO_SIGNANDCERT_1. */
	public static final int KO_SIGNANDCERT_1 = 101;
	
	/** The Constant KO_SIGNANDCERT_2. */
	public static final int KO_SIGNANDCERT_2 = 102;
	
	/** The Constant KO_SIGNANDCERT_3. */
	public static final int KO_SIGNANDCERT_3 = 103;
	
	/** The Constant KO_SIGNANDCERT_400. */
	public static final int KO_SIGNANDCERT_400 = 400;
	
	/** The Constant KO_SIGNANDCERT_4_9. */
	public static final int KO_SIGNANDCERT_4_9 = 49;
	
	/** The Constant KO_SIGNANDCERT_10. */
	public static final int KO_SIGNANDCERT_10 = 10;
	
	/** The Constant KO_SIGNANDCERT_11. */
	public static final int KO_SIGNANDCERT_11 = 11;
	
	/** The Constant KO_SIGNANDCERT_12. */
	public static final int KO_SIGNANDCERT_12 = 12;
	
	/** The Constant KO_SIGNANDCERT_100. */
	public static final int KO_SIGNANDCERT_100 = 100;
	
	/** The Constant KO_SIGNANDCERT_110. */
	public static final int KO_SIGNANDCERT_110 = 110;
	
	/** The Constant KO_SIGNANDCERT_120. */
	public static final int KO_SIGNANDCERT_120 = 120;
	
	/** The Constant KO_SIGNANDCERT_130. */
	public static final int KO_SIGNANDCERT_130 = 130;
	
	/** The Constant KO_SIGNANDCERT_140. */
	public static final int KO_SIGNANDCERT_140 = 140;
	
	/** The Constant KO_SIGNANDCERT_170. */
	public static final int KO_SIGNANDCERT_170 = 170;
	
	/** The Constant KO_SIGNANDCERT_180. */
	public static final int KO_SIGNANDCERT_180 = 180;
	
	/** The Constant OK_SIGNATURE_TYPE. */
	public static final int OK_SIGNATURE_TYPE = 0;
	
	/** The Constant OK_SIGNATURE_FORMAT. */
	public static final int OK_SIGNATURE_FORMAT = 3;	
	
	/** The Constant KO_SIGNATURE_TYPE_FORMAT. */
	public static final int KO_SIGNATURE_TYPE_FORMAT = 20;
	
	/** The Constant OK_FILE_TYPE. */
	public static final String OK_FILE_TYPE = "2"; //TSD;
	
	/** The Constant KO_FILE_TYPE. */
	public static final int KO_FILE_TYPE = 40;
	
	/** The Constant OK_COMPLIANCE. */
	public static final String OK_COMPLIANCE = "Conforme al profilo richiesto";
	
	/** The Constant KO_COMPLIANCE. */
	public static final int KO_COMPLIANCE = 50;
	
	/** The Constant KO_DIGEST_ALGORITHM. */
	public static final int KO_DIGEST_ALGORITHM = 60;
	// NEW DOSIGN FINE
	
	/** The rb. */
	private static ResourceBundle rb = ResourceBundle.getBundle("siceeorch");
	
	/** The index tenant username. */
	public static String INDEX_TENANT_USERNAME = rb.getString("siceeorch.index.tenant.username");
	
	/** The index tenant password. */
	public static String INDEX_TENANT_PASSWORD = rb.getString("siceeorch.index.tenant.password");

	/** The sigitext password. */
//	public static final String SIGIT_PWD = rb.getString("siceeorch.sigitext.password");
//	public static final String SIGIT_UTENTE = "SIGIT";

	/** The Constant TIPOLOGIA_ALLEGATO_ACE. */
	public static final String TIPOLOGIA_ALLEGATO_ACE = "CERTIFICATO";
	
	/** The Constant TIPOLOGIA_ALLEGATO_IMG. */
	public static final String TIPOLOGIA_ALLEGATO_IMG = "IMMAGINE";
	
	/** The Constant TIPOLOGIA_ALLEGATO_CV. */
	public static final String TIPOLOGIA_ALLEGATO_CV = "CURRICULUM_VITAE";
	
	/** The Constant FOTO_ABILITATA. */
	public static final String FOTO_ABILITATA = "FOTO_ABILITATA";
	
	public static final String COD_STATO_VIA_VALIDA = "V";
	public static final String COD_STATO_VIA_QUALSIASI = "A";
	public static final String DESC_STATO_VIA_DEPRECATO = "deprecato";
	
	/** The si. */
	public static String SI = "S";
	
	/** The no. */
	public static String NO = "N";
	
	/** The Constant CODICE_APPLICAZIONE_MODOL. */
	public static final String CODICE_APPLICAZIONE_MODOL = "SICEE";

	/** The Constant CODICE_MODULO_MODOL_APE_2015. */
	public static final String CODICE_MODULO_MODOL_APE_2015 = "MODULO_APE_2015-v2.0.0";
	public static final String CODICE_MODULO_MODOL_TARGHETTA = "MODULO_TARGHETTA_2015-v1.0.0";

	public static final String COD_APPLICATION_ID = "APPLICATION_ID";
	public static final String COD_ID_GATEWAY_NODO = "ID_GATEWAY_NODO";
	public static final String COD_ID_PAYMENTMODE_NODO = "ID_PAYMENTMODE_NODO";
	public static final String COD_DATI_SPECIFICI_RISCOSSIONE = "DATI_SPECIFICI_RISCOSSIONE";
	public static final String COD_VERSAMENTO = "CODICE_VERSAMENTO";

	public static final String MDPNEW_CORE_URL = rb.getString("siceeorch.mpdnew.core.url");
	public static final String MDPNEW_IUV_URL = rb.getString("siceeorch.mpdnew.iuv.url");

	public static final String SIGITEXT_URL = rb.getString("siceeorch.sigitext.wsdl.url");

	public static final String CODICE_PARAMETRO_TOKEN_JWT = "TOKEN_JWT";
	
}
