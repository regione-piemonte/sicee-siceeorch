package it.csi.sicee.siceeorch.business.siceeorch.handlers.findace;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R12822824) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findAceResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindAceResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindAceResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Ace outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Ace) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [ace]
		it.csi.sicee.siceesrv.dto.siceesrv.Ace slot_ace = (it.csi.sicee.siceesrv.dto.siceesrv.Ace) inputs
				.get("SLOT_ace");

		/*PROTECTED REGION ID(R935643703) ENABLED START*/
		/// inserire qui la logica di trasformazione
		if (slot_ace != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Ace();
			outVal.setAnno(slot_ace.getAnno());
			outVal.setCertificatore(slot_ace.getCertificatore());
			outVal.setCivico(slot_ace.getCivico());
			outVal.setComune(slot_ace.getComune());
			outVal.setDataInvio(slot_ace.getDataInvio());
			outVal.setIndirizzo(slot_ace.getIndirizzo());
			outVal.setNumero(slot_ace.getNumero());
			outVal.setProvincia(slot_ace.getProvincia());
			outVal.setUid(slot_ace.getUid());
			outVal.setUidIndicatore(slot_ace.getUidIndicatore());
			outVal.setNome(slot_ace.getNome());
			outVal.setCognome(slot_ace.getCognome());
			outVal.setDataUpload(slot_ace.getDataUpload());
			outVal.setIdStato(slot_ace.getIdStato());
			outVal.setDescStato(slot_ace.getDescStato());
			outVal.setUidFoto(slot_ace.getUidFoto());
			outVal.setDescDatiCat(slot_ace.getDescDatiCat());
			outVal.setDataScadenza(slot_ace.getDataScadenza());
		}
		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindAceResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
