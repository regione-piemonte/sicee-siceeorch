
package test.siceeorch;

import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UnrecoverableException;

import it.csi.sicee.siceeorch.dto.siceeorch.*;

import it.csi.sicee.siceeorch.interfacecsi.siceeorch.*;

import it.csi.sicee.siceeorch.exception.siceeorch.*;

import it.csi.csi.util.xml.*;
import it.csi.csi.porte.*;
import it.csi.csi.porte.proxy.*;
import javax.sql.DataSource;
import org.apache.log4j.*;
import junit.framework.TestCase;

/*PROTECTED REGION ID(R-1126110030) ENABLED START*/
/// inserire qui eventuali import aggiuntive
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Date;

import it.csi.sicee.siceeorch.business.siceeorch.util.Converter;
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.csi.wrapper.CSIException;
import it.csi.sicee.siceeorch.dto.siceeorch.Transazione;
import it.doqui.index.ecmengine.exception.publishing.NoSuchNodeException;

/*PROTECTED REGION END*/

/**
 * @generated
 */
public class TestSiceeorch extends TestCase {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * @generated
	 */
	it.csi.sicee.siceeorch.interfacecsi.siceeorch.SiceeorchSrv pd = null;

	/**
	 * @generated
	 */
	public void setUp() throws Exception {
		InfoPortaDelegata info = PDConfigReader.read("test/java/test/siceeorch/defpd_siceeorch.xml");
		pd = (it.csi.sicee.siceeorch.interfacecsi.siceeorch.SiceeorchSrv) PDProxy.newInstance(info);
	}

	/*PROTECTED REGION ID(R-2074811632) ENABLED START*/
	// inserire qui la definizione di variabili locali, costanti da usare nel test.
	// non verranno sovrascritte da successive rigenerazioni
	public static final String TIPOLOGIA_ALLEGATO_ACE = "CERTIFICATO";
	public static final String TIPOLOGIA_ALLEGATO_IMG = "IMMAGINE";
	public static final String TIPOLOGIA_ALLEGATO_CV = "CURRICULUM_VITAE";
	/*PROTECTED REGION END*/

	/// Implementazione operazioni esposte dal servizio

	/**
	 * @generated
	 */
	public void testOperationElencoRegioni() {
		/*PROTECTED REGION ID(R-1436580318) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		Regione[] array;
		try {
			array = pd.elencoRegioni();
			assertNotNull(array);

			GenericUtil.stampa(array, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationElencoProvince() {
		/*PROTECTED REGION ID(R-1881464157) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		Provincia[] array;
		try {
			array = pd.elencoProvince("01");
			assertNotNull(array);

			GenericUtil.stampa(array, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationElencoComuni() {
		/*PROTECTED REGION ID(R-1574731774) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		Comune[] array;
		try {
			array = pd.elencoComuni("001");
			assertNotNull(array);

			GenericUtil.stampa(array, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetDescrizioneRegione() {
		/*PROTECTED REGION ID(R-491525535) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Regione obj = pd.getDescrizioneRegione("01");
			GenericUtil.stampa(obj, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetDescrizioneComune() {
		/*PROTECTED REGION ID(R1365247835) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Comune obj = pd.getDescrizioneComune("001315");
			GenericUtil.stampa(obj, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetDescrizioneProvincia() {
		/*PROTECTED REGION ID(R-531262947) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Provincia obj = pd.getDescrizioneProvincia("001");
			GenericUtil.stampa(obj, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetVieByCodiceIstat() {
		/*PROTECTED REGION ID(R1357413024) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Via[] array = pd.getVieByCodiceIstat("roma", "001272");

			GenericUtil.stampa(array, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetViaById() {
		/*PROTECTED REGION ID(R132168609) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Via via = pd.getViaById(1);
			GenericUtil.stampa(via, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationInserisciAllegato() {
		/*PROTECTED REGION ID(R598450893) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			String attestato = "2000 100105 0002";

			String[] split = attestato.split(" ");

			String id = "100105";
			String prog = split[2];
			String anno = split[0];

			Documento doc = new Documento();

			doc.setMatricola(id);
			doc.setIdCertificatore(id);
			doc.setDoc(new String("ciao pippo").getBytes());
			doc.setNome("test.txt");
			doc.setMimeType("text/plain");
			doc.setEncoding("UTF-8");
			doc.setDimensione(0L);
			doc.setDataUpload(new Date(System.currentTimeMillis()));
			doc.setTipologia(TIPOLOGIA_ALLEGATO_CV);

			doc.setDataUpload(new Date(System.currentTimeMillis()));

			pd.creaAlberatura(id, "doc", 0, 0);

			String uid = pd.inserisciAllegato(doc);
			GenericUtil.stampa(uid, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationInserisciDocumento() {
		/*PROTECTED REGION ID(R-2050668512) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			String attestato = "2000 sicee99 0010";

			String[] split = attestato.split(" ");

			String id = split[1];
			String prog = split[2];
			String anno = split[0];

			Documento doc = new Documento();
			doc.setAttestato(attestato);
			doc.setDoc(new String("ciao").getBytes());
			doc.setNome("test_ace.txt");
			doc.setMatricola(id);
			doc.setMimeType("text/plain");
			doc.setEncoding("UTF-8");
			doc.setDimensione(0L);
			doc.setClasseEnergetica("test");
			doc.setComune("test");
			doc.setDestinazione("test");
			doc.setTipologia(TIPOLOGIA_ALLEGATO_ACE);
			doc.setAnnoCertificato(anno);
			doc.setIdCertificatore(id);
			doc.setProgrCertificato(prog);
			doc.setDataUpload(new Date(System.currentTimeMillis()));

			String uid = pd.inserisciDocumento(doc);

			doc.setUid(uid);
			pd.cancellaDocumento(doc);

			GenericUtil.stampa(uid, false, 1);

		} catch (DocumentoException e) {
			if (e.getNestedExcMsg().contains("Duplicate child")) {
				fail();
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationCancellaDocumento() {
		/*PROTECTED REGION ID(R-1239225522) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni

		try {
			String attestato = "2000 100105 0002";

			String[] split = attestato.split(" ");

			String id = "105";
			String prog = split[2];
			String anno = split[0];

			Documento doc = new Documento();

			doc.setMatricola(id);
			doc.setIdCertificatore(id);
			doc.setDoc(new String("ciao pippo").getBytes());
			doc.setNome("regole dieta.doc");
			doc.setMimeType("text/plain");
			doc.setEncoding("UTF-8");
			doc.setDimensione(0L);
			doc.setDataUpload(new Date(System.currentTimeMillis()));
			doc.setTipologia(TIPOLOGIA_ALLEGATO_CV);

			doc.setDataUpload(new Date(System.currentTimeMillis()));

			pd.creaAlberatura(id, "doc", 0, 0);

			String uid = pd.inserisciAllegato(doc);
			doc = new Documento();
			doc.setUid(uid);
			pd.cancellaDocumento(doc);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationRicercaDocumento() {
		/*PROTECTED REGION ID(R2058871092) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		Documento doc = new Documento();
		try {

			String uid = "2ad36ba6-7d5c-11e5-bdc5-5f432be53ca6";
			doc.setUid(uid);

			GenericUtil.stampa(doc, false, 0);

			it.csi.sicee.siceeorch.dto.siceeorch.Documento docRic = pd.ricercaDocumento(doc);

			System.out.println("Stampo il nome trovato: " + docRic.getNome());

			GenericUtil.stampa(docRic, false, 0);

		} catch (NoSuchNodeException noNode) {
			System.err.println("Sono in NoSuchNodeException");
		} catch (Exception e) {
			System.err.println("Sono in Exception");
			System.err.println("Sono in Exception - e.getCause(): " + e.getCause());

			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationCreaAlberatura() {
		/*PROTECTED REGION ID(R1193684303) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni

		try {

			pd.creaAlberatura("sicee06", "doc", 0, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindElencoCertificatori() {
		/*PROTECTED REGION ID(R-1135274740) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni

		try {

			FiltroRicercaCertificatori filtro = new FiltroRicercaCertificatori();
			filtro.setCognome("BON");

			Certificatore[] cert = pd.findElencoCertificatori(filtro);

			GenericUtil.stampa(cert, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAce() {
		/*PROTECTED REGION ID(R-2030981997) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			FiltroRicercaAce filtro = new FiltroRicercaAce();
			filtro.setAnno("2011");
			filtro.setCertificatore("100007");
			filtro.setNumero("0021");

			Ace ace = pd.findAce(filtro);

			GenericUtil.stampa(ace, false, 1);
			/*
			Certificatore c = pd.findCertificatore("200250");
			System.out.println(c.getMatricola());*/

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindCertificatore() {
		/*PROTECTED REGION ID(R924830628) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			Certificatore cert = pd.findCertificatore("104386");

			GenericUtil.stampa(cert, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationElencoTitoli() {
		/*PROTECTED REGION ID(R-1093374624) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			Titolo[] titoli = pd.elencoTitoli();

			GenericUtil.stampa(titoli, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindNotaio() {
		/*PROTECTED REGION ID(R-1396569212) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			Notaio not = pd.findNotaio("cramzoo@gmail.com");
			GenericUtil.stampa(not, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationUpdateInvioLog() {
		/*PROTECTED REGION ID(R-1624958419) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			InvioLog upd = new InvioLog();
			upd.setAnno("2009");
			upd.setCertificatore("6");
			upd.setNumero("0002");
			upd.setIdNotaio(1L);

			//pd.updateInvioLog(upd);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetParametro() {
		/*PROTECTED REGION ID(R-1852806246) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			String str = pd.getParametro("TESTO_MAIL_NOTAIO_HTML");

			str = str.replaceAll("@cr@", "\n");

			str = str.replaceAll("@codice.ace@", "PAPERINO");
			str = str.replaceAll("@nome.certificatore@", "BOZ");
			GenericUtil.stampa(str, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationVerificaDocumento() {
		/*PROTECTED REGION ID(R-2029384394) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Documento doc = new Documento();
			/*doc.setUid("754ec5ef-9a1d-11df-9b13-3715aaae967d");
			
			Documento docRes = pd.ricercaDocumento(doc);
			if (docRes != null) {
				System.out.println("nome: " + docRes);
				System.out.println("nome: " + docRes.getNome());
				System.out.println("nome: " + docRes.getAttestato());
				GenericUtil.stampa(pd.verificaDocumento(docRes), false, 0);
			}*/

			File file = new File("d:\\INFDocCADES-T-B64.pdf.p7m");

			byte fileContent[] = new byte[(int) file.length()];
			FileInputStream fin = new FileInputStream(file);
			fin.read(fileContent);
			doc.setDoc(fileContent);
			GenericUtil.stampa(pd.verificaDocumento(doc), false, 0);

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMimeTypeInfo() {
		/*PROTECTED REGION ID(R-2039352997) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			Documento documento = new Documento();

			File file = new File("D://image.gif");
			FileInputStream is = new FileInputStream(file);
			byte fileContent[] = new byte[(int) file.length()];
			is.read(fileContent);
			is.close();

			documento.setDoc(fileContent);

			MimeTypeInfo info = pd.getMimeTypeInfo(documento);
			info.getMimeType();

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationIsProductEnabled() {
		/*PROTECTED REGION ID(R-1208015693) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			System.out.println(pd.isProductEnabled());

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationIsServiceEnabled() {
		/*PROTECTED REGION ID(R1182253101) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			System.out.println(pd.isServiceEnabled("SICEEWEB"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationIsUserEnabled() {
		/*PROTECTED REGION ID(R-789944523) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			System.out.println(pd.isUserEnabled("BZOMRC75P15L219F"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceSostitutivi() {
		/*PROTECTED REGION ID(R-1940355934) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			FiltroRicercaAce filtro = new FiltroRicercaAce();
			filtro.setAnno("2011");
			filtro.setCertificatore("100007");
			filtro.setNumero("0001");

			Ace[] ace = pd.findAceSostitutivi(filtro);

			GenericUtil.stampa(ace, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaCertificato() {
		/*PROTECTED REGION ID(R374247204) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		System.out.println("ENTRO - testOperationGetStampaCertificato");
		try {
			/*byte[] datiOld;
			datiOld = pd
					.getStampaCertificato("100105", "0031", "2011", "Bozza");
			
			System.out.println("Stampo l'array del doc: " + datiOld);*/

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaRicevutaInvioAce() {
		/*PROTECTED REGION ID(R-509277842) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		System.out.println("ENTRO - testOperationGetStampaRicevutaInvioAce");
		try {
			byte[] datiOld;
			datiOld = pd.getStampaRicevutaInvioAce("100007", "0010", "2012");

			System.out.println("Stampo l'array del doc: " + datiOld);

			File f = new File("D:\\temp\\stampe\\pdfCreatoRicevutaInvioOrch.pdf");

			OutputStream out;
			out = new FileOutputStream(f);
			out.write(datiOld);

			out.close();
		} catch (Exception e) {
			fail(e.getMessage());
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationVerificaDocumentoNewDosign() {
		/*PROTECTED REGION ID(R1082399218) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationStartMdpTransaction() {
		/*PROTECTED REGION ID(R-1808230544) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		try {
			MdpBox box = pd.getMdpPaymentMode("SICEE");
			//GenericUtil.stampa(box.getTransazione(), false, 0);
			GenericUtil.stampa(box.getGateways(), false, 0);
			box.getTransazione().setGatewayId(box.getGateways()[0].getGatewayId());
			box.getTransazione().setGatewaypaymodeid(box.getGateways()[0].getPaymentmodeId());
			box.getTransazione().setCcy("EUR");
			box.getTransazione().setAmount(1d);
			GenericUtil.stampa(box.getTransazione(), false, 0);
			String aa = pd.startMdpTransaction(box.getTransazione());
			GenericUtil.stampa(aa, false, 0);

		} catch (Exception e) {
			fail(e.getMessage());
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpPaymentMode() {
		/*PROTECTED REGION ID(R1493299087) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		try {
			MdpBox box = pd.getMdpPaymentMode("SICEE");
			GenericUtil.stampa(box.getTransazione(), false, 0);
			GenericUtil.stampa(box.getGateways(), false, 0);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpTransactionState() {
		/*PROTECTED REGION ID(R1306092877) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		try {
			Transazione tr = pd.getMdpTransactionState("TST000000000042511");
			GenericUtil.stampa(tr, false, 0);

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceFiltro() {
		/*PROTECTED REGION ID(R1537371003) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceFiltroCount() {
		/*PROTECTED REGION ID(R99674708) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceFlgPregresso() {
		/*PROTECTED REGION ID(R73326634) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetDettaglioAce() {
		/*PROTECTED REGION ID(R-749100041) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceMonitoraggio() {
		/*PROTECTED REGION ID(R338727168) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationEstraiDocumento() {
		/*PROTECTED REGION ID(R644331465) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindUidRifIndex() {
		/*PROTECTED REGION ID(R-1778856573) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindImpiantoByCodice() {
		/*PROTECTED REGION ID(R-152149665) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		Impianto[] array;
		try {

			array = pd.findImpiantoByCodice(12);

			System.out.println("Stampo array: " + array);

			assertNotNull(array);

			GenericUtil.stampa(array, false, 1);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindImpiantoByPOD() {
		/*PROTECTED REGION ID(R1482650233) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		Impianto[] array;
		try {

			try {
				array = pd.findImpiantoByPOD("ND");

				System.out.println("Stampo array: " + array);

				assertNotNull(array);

				GenericUtil.stampa(array, false, 1);
			} catch (SigitExcessiveResultsException e) {

				System.out.println("Ho intecettato l'eccezione dei troppi risultati");
				e.printStackTrace();
				fail();
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindImpiantoByPDR() {
		/*PROTECTED REGION ID(R1482649906) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		Impianto[] array;
		try {

			array = pd.findImpiantoByPDR("02090000780165");

			System.out.println("Stampo array: " + array);

			assertNotNull(array);

			GenericUtil.stampa(array, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindLibrettoByUID() {
		/*PROTECTED REGION ID(R932052818) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		Documento doc = new Documento();
		try {

			String uid = "2ad36ba6-7d5c-11e5-bdc5-5f432be53ca6";

			doc = pd.findLibrettoByUID(uid);

			System.out.println("Stampo il nome trovato: " + doc.getNome());

			GenericUtil.stampa(doc, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindProtocollazione() {
		/*PROTECTED REGION ID(R307143418) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpNewTransazione() {
		/*PROTECTED REGION ID(R2035875704) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		try {

			System.out.println("Sono entrato");

			String idTransazione = pd.getMdpNewTransazione();

			System.out.println("Stampo idTransazione: " + idTransazione);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpNewUrlWisp() {
		/*PROTECTED REGION ID(R2046525816) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		try {

			System.out.println("Sono entrato");

			String urlWisp = pd.getMdpNewUrlWisp("TST000000000042511", new Double(13));

			System.out.println("Stampo l'url WISP: " + urlWisp);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpNewSceltaWisp() {
		/*PROTECTED REGION ID(R870485369) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		try {

			System.out.println("Sono entrato");

			InformativaScelta informativaScelta = pd.getMdpNewSceltaWisp("TST000000000042648");

			System.out.println("identificativo informativa PSP [" + informativaScelta.getIdInformativa() + "]");

			System.out.println("identificativo PSP [" + informativaScelta.getIdentificativo() + "]");
			System.out.println("ragione sociale PSP [" + informativaScelta.getRagioneSociale() + "]");
			System.out.println("desc servizio [" + informativaScelta.getDescrizioneServizio() + "]");

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpNewUrlPagamento() {
		/*PROTECTED REGION ID(R-1648994307) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		try {

			it.csi.mdp.core.business.dto.Transazione t = new it.csi.mdp.core.business.dto.Transazione();
			t.setTransactionId("123456");
			t.setApplicationId("PROVA");
			t.setLanguage("ITA");

			double importo = new Double("10.00");
			System.out.println("Stampo importo new: " + importo);
			t.setAmount(new Double("10.00"));
			t.setCcy("EUR");

			System.out.println("Sono entrato");

			GenericUtil.stampa(t, false, 3);

			DettaglioPagamento dettaglioPagamento = new DettaglioPagamento();

			// Dati del VERSANTE (colui che effettua l'esborso di denaro)
			dettaglioPagamento.setAnagraficaVersante("amerigo vespucci");
			dettaglioPagamento.setIndirizzoVersante("C.so unione sovietica");
			dettaglioPagamento.setCivicoVersante("216");
			dettaglioPagamento.setCapVersante("10100");
			dettaglioPagamento.setLocalitaVersante("Torino");
			dettaglioPagamento.setProvinciaVersante("TO");
			dettaglioPagamento.setNazioneVersante("IT");
			dettaglioPagamento.setEmailVersante("amerigo.vespucci@csi.it");
			dettaglioPagamento.setTipoIdentificativoUnivocoVersante("F");
			dettaglioPagamento.setCodiceIdentificativoUnivocoVersante("VSPMRG80A01L219L");

			//Dati del PAGATORE (la persona a cui e' intestata la posizione debitoria verso l'Ente)
			dettaglioPagamento.setAnagraficaPagatore("Marco Polo"); // Obbligatorio
			dettaglioPagamento.setIndirizzoPagatore("C.so Unione Sovietica");
			dettaglioPagamento.setCivicoPagatore("216");
			dettaglioPagamento.setCapPagatore("10100");
			dettaglioPagamento.setLocalitaPagatore("Torino");
			dettaglioPagamento.setProvinciaPagatore("TO");
			dettaglioPagamento.setNazionePagatore("IT");
			dettaglioPagamento.setEmailPagatore("marco.polo@csi.it");
			dettaglioPagamento.setTipoIdentificativoUnivocoPagatore("F"); // Obbligatorio
			dettaglioPagamento.setCodiceIdentificativoUnivocoPagatore("PLOMRC81A01L219C"); // Obbligatorio

			dettaglioPagamento.setImportoPagamento(10.50);
			dettaglioPagamento.setNumTransazione("TST000000000042570");

			final int INTESASANPAOLO_INFORMATIVA_ID = 2196;

			dettaglioPagamento.setIdInformativa(INTESASANPAOLO_INFORMATIVA_ID);

			String urlPagamento = pd.getMdpNewUrlPagamento(dettaglioPagamento);

			System.out.println("Stampo l'url Pagamento: " + urlPagamento);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpNewStatoTransazione() {
		/*PROTECTED REGION ID(R-1521773399) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetMdpNewIUV() {
		/*PROTECTED REGION ID(R-2117801852) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationRestoreDocumento() {
		/*PROTECTED REGION ID(R-1639218851) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		Documento doc = new Documento();
		try {

			String uid = "79772bb7-bbe8-11e8-83dd-8bb41c399c67";
			doc.setUid(uid);

			GenericUtil.stampa(doc, false, 0);

			String uidResult = pd.restoreDocumento(doc);

			System.out.println("Stampo l'uid: " + uidResult);

			//GenericUtil.stampa(docRic, false, 0);

		} catch (NoSuchNodeException noNode) {
			System.err.println("Sono in NoSuchNodeException");
		} catch (Exception e) {
			System.err.println("Sono in Exception");
			System.err.println("Sono in Exception - e.getCause(): " + e.getCause());

			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaCertificatoIText() {
		/*PROTECTED REGION ID(R-250760078) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaTarghettaCertificatoIText() {
		/*PROTECTED REGION ID(R765576218) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationInsertLogAccesso() {
		/*PROTECTED REGION ID(R-947673897) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testTestResources() {
		try {
			pd.testResources();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @generated
	 */
	public void testSelfCheck() {
		try {
			pd.selfCheck(null);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/// eventuali metodi aggiuntivi
	/*PROTECTED REGION ID(R-1687458864) ENABLED START*/
	// inserire qui la dichiarazione di eventuali metodi aggiuntivi utili
	// per l'implementazione.
	// non verrà sovrascritto da successive rigenerazioni.

	/*public void testElencoRegioniProvince() {
		Regione[] pr;
		try {
			pr = pd.elencoRegioni();
			for (int i = 0; i < pr.length; i++) {
				System.out.println("Regione: " + pr[i].getNome() + " Istat: "
						+ pr[i].getCod());
				Provincia[] pa = pd.elencoProvince(pr[i].getCod());
				for (int j = 0; j < pa.length; j++) {
					System.out.println("\t\tProvincia: " + pa[j].getNome()
							+ " Istat: " + pa[j].getCod());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}*/

	/*public void testElencoComuniTorino() {
		Regione[] pr;
		try {
			pr = pd.elencoRegioni();
			Comune[] pa = pd.elencoComuni("001");
			if (pa == null)
				throw new Exception();
	
			for (int j = 0; j < pa.length; j++) {
				System.out.println("Comune: " + pa[j].getNome() + " Istat: "
						+ pa[j].getCod());
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}*/

	/*public void testElencoComuniValleAosta() {
		Regione[] pr;
		try {
			pr = pd.elencoRegioni();
			Comune[] pa = pd.elencoComuni("007");
	
			for (int j = 0; j < pa.length; j++) {
				System.out.println("Comune: " + pa[j].getNome() + " Istat: "
						+ pa[j].getCod());
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}*/

	public void testOperationInserisciFoto() {

		try {
			String attestato = "2000 sicee99 0001";

			String[] split = attestato.split(" ");

			String id = split[1];
			String prog = split[2];
			String anno = split[0];

			Documento doc = new Documento();
			doc.setAttestato(attestato);
			doc.setMatricola(id);
			doc.setDoc(new String("ciao").getBytes());
			doc.setNome("test_img.txt");
			doc.setMimeType("text/plain");
			doc.setEncoding("UTF-8");
			doc.setDimensione(0L);
			doc.setClasseEnergetica("test");
			doc.setComune("test");
			doc.setDestinazione("test");
			doc.setTipologia(TIPOLOGIA_ALLEGATO_IMG);
			doc.setAnnoCertificato(anno);
			doc.setIdCertificatore(id);
			doc.setProgrCertificato(prog);
			doc.setDataUpload(new Date(System.currentTimeMillis()));

			String uid = pd.inserisciDocumento(doc);
			GenericUtil.stampa(uid, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

	}

	public void testConverter() {
		try {
			it.csi.mdp.core.business.dto.Transazione o = new it.csi.mdp.core.business.dto.Transazione();
			o.setAmount(10.0);
			o.setChangestatedate(new Timestamp(0));
			o.setInitDate(new Timestamp(0));
			Transazione ret = Converter.convertTo(o);

			GenericUtil.stampa(ret, false, 1);

			o = Converter.convertTo(ret);

			GenericUtil.stampa(o, false, 1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*PROTECTED REGION END*/
}
