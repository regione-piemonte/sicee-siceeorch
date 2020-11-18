/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceeorch.business.siceeorch.util;

import it.csi.sicee.siceeorch.dto.siceeorch.Comune;

import java.util.Comparator;

public class ComuneComparator implements Comparator<Comune> {

	public int compare(Comune o1, Comune o2) {
		if (o1 == null)
			return 1;
		if (o2 == null)
			return -1;
		
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
