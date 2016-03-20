package com.fih.framework.core.service;

import com.fih.framework.core.envelope.IEnvelope;

public interface IServiceEntry {
	
	IEnvelope Service(IEnvelope request);

}
