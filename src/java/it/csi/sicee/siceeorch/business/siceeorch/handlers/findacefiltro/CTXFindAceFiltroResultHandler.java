package it.csi.sicee.siceeorch.business.siceeorch.handlers.findacefiltro;

import java.util.Map;
import org.apache.log4j.Logger;

import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.WorkflowException;

import it.csi.sicee.siceeorch.business.handlers.*;

/*PROTECTED REGION ID(R1143304744) ENABLED START*/
/// inserire qui eventuali import aggiuntive.
import java.util.ArrayList;

/*PROTECTED REGION END*/

/**
 * Implementazione della custom transformation [findAceFiltroResult].
 * la logica della trasformazione e' codificata in java nel metodo:
 * getTransformedObject() 
 * @generated
 */
public class CTXFindAceFiltroResultHandler extends CustomTransformBaseHandler {

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
		getLogger(null).debug("[CTXFindAceFiltroResultHandler::getTransformedObject]-START ");
		it.csi.sicee.siceeorch.dto.siceeorch.Ace[] outVal = (it.csi.sicee.siceeorch.dto.siceeorch.Ace[]) (inputs
				.get(_outputSlotName));

		/// valore degli input slot
		// slot [ace]
		it.csi.sicee.siceesrv.dto.siceesrv.Ace[] slot_ace = (it.csi.sicee.siceesrv.dto.siceesrv.Ace[]) inputs
				.get("SLOT_ace");

		/*PROTECTED REGION ID(R1620844855) ENABLED START*/
		/// inserire qui la logica di trasformazione

		ArrayList<it.csi.sicee.siceeorch.dto.siceeorch.Ace> arrayList = new ArrayList<it.csi.sicee.siceeorch.dto.siceeorch.Ace>();
		if (slot_ace != null) {
			it.csi.sicee.siceeorch.dto.siceeorch.Ace outValSing = null;
			for (it.csi.sicee.siceesrv.dto.siceesrv.Ace ace : slot_ace) {

				outValSing = new it.csi.sicee.siceeorch.dto.siceeorch.Ace();

				outValSing.setAnno(ace.getAnno());
				outValSing.setCertificatore(ace.getCertificatore());
				outValSing.setCivico(ace.getCivico());
				outValSing.setComune(ace.getComune());
				outValSing.setDataInvio(ace.getDataInvio());
				outValSing.setIndirizzo(ace.getIndirizzo());
				outValSing.setNumero(ace.getNumero());
				outValSing.setProvincia(ace.getProvincia());
				outValSing.setUid(ace.getUid());
				outValSing.setNome(ace.getNome());
				outValSing.setCognome(ace.getCognome());
				outValSing.setDataUpload(ace.getDataUpload());
				outValSing.setIdStato(ace.getIdStato());
				outValSing.setDescStato(ace.getDescStato());
				//outValSing.setUidFoto(ace.getUidFoto());
				outValSing.setDescDatiCat(ace.getDescDatiCat());
				outValSing.setUidIndicatore(ace.getUidIndicatore());
				outValSing.setDataScadenza(ace.getDataScadenza());

				arrayList.add(outValSing);
			}

			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Ace[arrayList.size()];
			arrayList.toArray(outVal);
		}

		/*PROTECTED REGION END*/
		getLogger(null).debug("[CTXFindAceFiltroResultHandler::getTransformedObject]-END ");
		return outVal;
	}
}
