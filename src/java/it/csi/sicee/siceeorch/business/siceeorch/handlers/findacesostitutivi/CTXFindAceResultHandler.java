package it.csi.sicee.siceeorch.business.siceeorch.handlers.findacesostitutivi;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R712556029) ENABLED START*/
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
		it.csi.sicee.siceeorch.dto.siceeorch.Ace[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Ace[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [ace]
		it.csi.sicee.siceesrv.dto.siceesrv.Ace[] slot_ace = (it.csi.sicee.siceesrv.dto.siceesrv.Ace[]) inputs
				.get("SLOT_ace");

		/*PROTECTED REGION ID(R1152536578) ENABLED START*/
		/// inserire qui la logica di trasformazione

		try {

			if (slot_ace != null && slot_ace.length > 0) {

				outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Ace[slot_ace.length];

				for (int i = 0; i < slot_ace.length; i++) {
					it.csi.sicee.siceesrv.dto.siceesrv.Ace aceSrv = slot_ace[i];

					it.csi.sicee.siceeorch.dto.siceeorch.Ace aceOrch = new it.csi.sicee.siceeorch.dto.siceeorch.Ace();
					aceOrch.setAnno(aceSrv.getAnno());
					aceOrch.setNumero(aceSrv.getNumero());
					aceOrch.setCertificatore(aceSrv.getCertificatore());

					aceOrch.setCivico(aceSrv.getCivico());
					aceOrch.setComune(aceSrv.getComune());
					aceOrch.setDataInvio(aceSrv.getDataInvio());
					aceOrch.setIndirizzo(aceSrv.getIndirizzo());
					aceOrch.setProvincia(aceSrv.getProvincia());
					aceOrch.setUid(aceSrv.getUid());
					aceOrch.setNome(aceSrv.getNome());
					aceOrch.setCognome(aceSrv.getCognome());
					aceOrch.setDataUpload(aceSrv.getDataUpload());
					aceOrch.setIdStato(aceSrv.getIdStato());
					aceOrch.setDescStato(aceSrv.getDescStato());
					aceOrch.setUidIndicatore(aceSrv.getUidIndicatore());
					aceOrch.setDataScadenza(aceSrv.getDataScadenza());

					outVal[i] = aceOrch;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindAceResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
