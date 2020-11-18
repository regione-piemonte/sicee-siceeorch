/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceeorch.business.util;

import javax.xml.rpc.ServiceException;

import it.csi.csi.wrapper.CSIException;
import it.csi.sigit.sigitext.ws.service.client.SigitUserNotAuthorizedException;
import it.csi.sigit.sigitext.ws.service.client.SigitextException;
import it.csi.sigit.sigitext.ws.service.client.SigitextSigitextServiceLocator;
import it.csi.sigit.sigitext.ws.service.client.SigitextSigitext_PortType;

public class ServiziUtil {
	
	public static SigitextSigitext_PortType getClientSigitext() throws ServiceException {
		
		SigitextSigitextServiceLocator sigitextLocator = new SigitextSigitextServiceLocator();
		String sigitextAddress = Constants.SIGITEXT_URL;
		sigitextLocator.setsigitextSigitextEndpointAddress(sigitextAddress);

		return sigitextLocator.getsigitextSigitext();
		
	}
	
	public static Exception handleSigitextExceptions(Exception e) {
		
		if (e instanceof SigitUserNotAuthorizedException) {

			String[] errorMessageArray = e.toString().split("SigitUserNotAuthorizedException:");

			if (errorMessageArray.length > 1) {
				String errorMessage = e.toString().split("SigitUserNotAuthorizedException:")[1];

				e = new CSIException(errorMessage);
			}
		}

		if (e instanceof SigitextException) {

			String[] errorMessageArray = e.toString().split("SigitextException:");

			if (errorMessageArray.length > 1) {
				String errorMessage = e.toString().split("SigitextException:")[1];

				e = new CSIException(errorMessage);
			}
		}
		
		return e;
	}
}
