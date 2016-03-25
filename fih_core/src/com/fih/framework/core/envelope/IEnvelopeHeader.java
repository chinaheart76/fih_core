package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContext;

public interface IEnvelopeHeader extends IContext,IEnvelopeElementDefinitions {
	
	String getProtocol();
	String getVersion();
	String getClientId();
	String getClientName();
	String getClientType();
	String getUrl();
	String getMethod();
	String getStartTimeStamp();
	String getEndTimeStamp();
	String getEnvelopeId();
	String getEnvelopeSubId();
	String getServiceName();
	String getServiceNamespace();
	String getServiceMethod();
	
}
