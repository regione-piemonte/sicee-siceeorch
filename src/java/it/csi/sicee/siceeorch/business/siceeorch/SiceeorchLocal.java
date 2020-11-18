
package it.csi.sicee.siceeorch.business.siceeorch;

import it.csi.sicee.siceeorch.dto.siceeorch.*;

import it.csi.sicee.siceeorch.exception.siceeorch.*;

/**
 * Interfaccia locale dell'EJB che implementa il servizio siceeorch.
 * @generated
 */
public interface SiceeorchLocal
		extends
			javax.ejb.EJBLocalObject,
			it.csi.sicee.siceeorch.interfacecsi.siceeorch.SiceeorchSrv {

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

}
