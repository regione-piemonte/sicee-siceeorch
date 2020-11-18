/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceeorch.business.siceeorch.util;



import it.csi.sicee.siceeorch.dto.siceeorch.Gateway;
import it.csi.sicee.siceeorch.dto.siceeorch.Transazione;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

public class Converter {
	
	public static final String LOGGER_PREFIX = "siceeorch";
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);
	
	public static Transazione convertTo (it.csi.mdp.core.business.dto.Transazione o) {
		Transazione ret = null;
		if (o != null) {
			ret = new Transazione();
			ret = (Transazione) getToSet(it.csi.mdp.core.business.dto.Transazione.class, Transazione.class, o, ret);
		}
		return ret;
	}
	
	public static it.csi.mdp.core.business.dto.Transazione convertTo (Transazione o) {
		it.csi.mdp.core.business.dto.Transazione ret = null;
		if (o != null) {
			ret = new it.csi.mdp.core.business.dto.Transazione();
			ret = (it.csi.mdp.core.business.dto.Transazione) getToSet(Transazione.class, it.csi.mdp.core.business.dto.Transazione.class, o, ret);
		}
		return ret;
	}
	
	public static Gateway[] convertTo (it.csi.mdp.core.business.paymentmanager.local.AppGateway[] o) {
		Gateway[] ret = null;
		if (o != null) {
			ret = new Gateway[o.length];
			for (int i = 0; i < o.length; i++) {
				ret[i] = (Gateway) getToSet(it.csi.mdp.core.business.paymentmanager.local.AppGateway.class, Gateway.class, o[i], new Gateway());
			}
		}
		return ret;
	}

	private static Object getToSet(Class<?> co,
			Class<?> cRet, Object o, Object ret) {
		try {
		Method[] array = co.getDeclaredMethods();			
		for (Method m: array) {
			String methodName = m.getName().replaceFirst("get", "set");
			if (m.getName().startsWith("get")) {
				Object r;
				r = m.invoke(o);
				if (r != null) {
					Method set = null;
					try {
						set = cRet.getDeclaredMethod(methodName, r.getClass());										
					} catch (java.lang.NoSuchMethodException e) {
						set = cRet.getDeclaredMethod(methodName, getBoxedToPrimitive(r.getClass()));
					} finally {				
						set.invoke(ret, r);
					}
				}
				
			}
		}
		} catch (Exception e) {
			logger.error("Errore", e);
		}
		
		return ret;
		
	}
	
	private static Class<?> getBoxedToPrimitive(Class<?> boxed)
	{
	  if (boxed.equals(java.lang.Boolean.class))
	  {
	   return boolean.class;
	  }
	  else
	  {
	    if (boxed.equals(java.lang.Byte.class))
	    {
	      return byte.class;
	    }
	    else
	    {
	      if (boxed.equals(java.lang.Character.class))
	      {
	        return char.class;
	      }
	      else
	      {
	        if (boxed.equals(java.lang.Double.class))
	        {
	         return double.class;
	        }
	        else
	        {
	          if (boxed.equals(java.lang.Float.class))
	          {
	            return float.class;
	          }
	          else
	          {
	            if (boxed.equals(java.lang.Integer.class))
	            {
	              return int.class;
	            }
	            else
	            {
	              if (boxed.equals(java.lang.Long.class))
	              {
	            	  return long.class;
	              }
	              else
	              {
	                if (boxed.equals(java.lang.Short.class))
	                {
	                	 return short.class;
	                } else
		              {
		                if (boxed.equals(java.sql.Timestamp.class))
		                {
		                	 return java.util.Date.class;
		                }else
			              {
			                if (boxed.equals(java.sql.Date.class))
			                {
			                	 return java.util.Date.class;
			                }
			              }
		              }
	              }
	            }
	          }
	        }
	      }
	    }
	  }
	  return null;
	}
	
	
}
