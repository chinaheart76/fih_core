package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContext;

/**
 * @author �۸���
 * @version v0.1
 *<br>
 * ����ʱ�䣺2016��3��25�� ����11:56:53<br>
 * ����޸�ʱ�䣺<br>
 * 		TODO		
 *  <br>
 *  �ŷ�ͷ�ӿ�
 *  
 */
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
