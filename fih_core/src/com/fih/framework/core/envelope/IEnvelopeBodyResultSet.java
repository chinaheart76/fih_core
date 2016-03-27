package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContext;

public interface IEnvelopeBodyResultSet {
	
	String getStatus();	
	String getMessage();
	IContext getResultSet();

}
