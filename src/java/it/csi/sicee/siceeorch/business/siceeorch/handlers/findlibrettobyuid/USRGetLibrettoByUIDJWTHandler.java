package it.csi.sicee.siceeorch.business.siceeorch.handlers.findlibrettobyuid;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;
import com.opensymphony.workflow.FunctionProvider;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R-1031527986) ENABLED START*/
import it.csi.sicee.siceeorch.business.util.GenericUtil;
import it.csi.sicee.siceeorch.business.util.ServiziUtil;
import it.csi.sigit.sigitext.ws.service.client.Documento;
import it.csi.sigit.sigitext.ws.service.client.SigitextSigitext_PortType;
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class USRGetLibrettoByUIDJWTHandler implements FunctionProvider {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceeorch";

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/**
	 * @generated
	 */
	public void execute(Map transientVars, Map args, PropertySet ps) throws WorkflowException {

		this.initFunctionHandler(transientVars, args, ps);

		this.eseguiFunctionHandler(transientVars, args, ps);

		this.releaseFunctionHandler(transientVars, args, ps);
	}

	private void initFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetLibrettoByUIDJWTHandler::initFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-167886537) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetLibrettoByUIDJWTHandler::eseguiFunctionHandler]-END ");
	}

	private void releaseFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetLibrettoByUIDJWTHandler::releaseFunctionHandler]-START ");
		/*PROTECTED REGION ID(R1271432832) ENABLED START*/
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetLibrettoByUIDJWTHandler::releaseFunctionHandler]-END ");
	}

	public void eseguiFunctionHandler(Map transientVars, Map args, PropertySet ps) throws WorkflowException {
		getLogger(null).debug("[USRGetLibrettoByUIDJWTHandler::eseguiFunctionHandler]-START ");
		/*PROTECTED REGION ID(R-167996232) ENABLED START*/
		java.lang.String slot_uid = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_uid", ps);
		java.lang.String slot_tokenJWT = (java.lang.String) DataSlotHelper.getDataSlotValue("SLOT_tokenJWT", ps);

		it.csi.sicee.siceeorch.dto.siceeorch.Documento documentoSiceeorch = null;

		try {

			SigitextSigitext_PortType clientSigitext = ServiziUtil.getClientSigitext();

			if (getLogger(null).isDebugEnabled()) {

				getLogger(null)
						.debug("[USRGetLibrettoByUIDJWTHandler::eseguiFunctionHandler]- Libretto UID : " + slot_uid);
			}

			Documento documentoSigitext = clientSigitext.getLibrettoByUIDJWT(slot_uid, slot_tokenJWT);

			if (getLogger(null).isDebugEnabled()) {
				GenericUtil.stampa(documentoSigitext, true, 3);
			}

			if (documentoSigitext != null) {
				documentoSiceeorch = new it.csi.sicee.siceeorch.dto.siceeorch.Documento();
				documentoSiceeorch.setNome(documentoSigitext.getNome());
				documentoSiceeorch.setMimeType(documentoSigitext.getMimeType());
				documentoSiceeorch.setEncoding(documentoSigitext.getEncoding());
				documentoSiceeorch.setUid(documentoSigitext.getUid());
				documentoSiceeorch.setDoc(documentoSigitext.getDoc());
			}

			DataSlotHelper.setDataSlotValue("SLOT_result", documentoSiceeorch, ps);
		} catch (Exception e) {
			// l'eccezione viene inserita nel contesto per essere processata successivamente

			e = ServiziUtil.handleSigitextExceptions(e);

			DataSlotHelper.setLastError(e, ps);

			getLogger(null)
					.error("[USRGetLibrettoByUIDJWTHandler::eseguiFunctionHandler]-richiamo ko, inserimento eccezione "
							+ e + " nell'apposito slot  ", e);
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[USRGetLibrettoByUIDJWTHandler::eseguiFunctionHandler]-END ");
	}

	/*PROTECTED REGION ID(R1411867305) ENABLED START*/
	////// inserire qui eventuali metodi di supporto
	/*PROTECTED REGION END*/

}
