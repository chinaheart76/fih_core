package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContextContainer;

public interface IEnvelope extends IContextContainer {
	
	IEnvelopeHeader getHeader();
	IEnvelopeBody getBody();
			
}
