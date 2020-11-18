/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceeorch.business.siceeorch.util;

import it.csi.sicee.siceeorch.dto.siceeorch.Provincia;

import java.util.Comparator;

public class ProvinciaComparator implements Comparator<Provincia> {

	public int compare(Provincia o1, Provincia o2) {
		if (o1 == null)
			return 1;
		if (o2 == null)
			return -1;
		
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
