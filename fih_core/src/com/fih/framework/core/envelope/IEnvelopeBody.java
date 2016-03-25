package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContext;

public interface IEnvelopeBody extends IContext,IEnvelopeElementDefinitions {
	
	String getStatus();	
	
}
