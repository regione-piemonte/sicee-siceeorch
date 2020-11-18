/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceeorch.business.util;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Converter.
 */
public class Converter implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Convert to.
	 *
	 * @param slot_certificatore the slot_certificatore
	 * @return the it.csi.sicee.siceeorch.dto.siceeorch. certificatore
	 */
	public static final it.csi.sicee.siceeorch.dto.siceeorch.Certificatore convertTo(
			it.csi.sicee.siceesrv.dto.siceesrv.Certificatore slot_certificatore) {

		it.csi.sicee.siceeorch.dto.siceeorch.Certificatore outVal = null;
		if (slot_certificatore != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.Certificatore();

			outVal.setCellulare(slot_certificatore.getCellulare());
			outVal.setCivico(slot_certificatore.getCivico());
			outVal.setCognome(slot_certificatore.getCognome());
			outVal.setComune(slot_certificatore.getComune());
			outVal.setEmail(slot_certificatore.getEmail());
			outVal.setMatricola(slot_certificatore.getMatricola());
			outVal.setNome(slot_certificatore.getNome());
			outVal.setProvincia(slot_certificatore.getProvincia());
			outVal.setRagioneSociale(slot_certificatore.getRagioneSociale());
			outVal.setTelefono(slot_certificatore.getTelefono());
			outVal.setTitolo(slot_certificatore.getTitolo());
			outVal.setIndirizzo(slot_certificatore.getIndirizzo());
			outVal.setRegione(slot_certificatore.getRegione());
			outVal.setUidCurriculum(slot_certificatore.getUidCurriculum());
			outVal.setEsameSostenuto(slot_certificatore.getEsameSostenuto());
			outVal.setSitoWeb(slot_certificatore.getSitoWeb());
		}
		return outVal;
	}
	
	/**
	 * Convert to.
	 *
	 * @param slot_labelValue the slot_labelValue
	 * @return the it.csi.sicee.siceeorch.dto.siceeorch. labelValue
	 */
	public static final it.csi.sicee.siceeorch.dto.siceeorch.LabelValue convertTo(
			it.csi.sicee.siceesrv.dto.siceesrv.LabelValue slot_labelValue) {

		it.csi.sicee.siceeorch.dto.siceeorch.LabelValue outVal = null;
		if (slot_labelValue != null) {
			outVal = new it.csi.sicee.siceeorch.dto.siceeorch.LabelValue();

			outVal.setLabel(slot_labelValue.getLabel());
			outVal.setValue(slot_labelValue.getValue());
		}
		return outVal;
	}

}
