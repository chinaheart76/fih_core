package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContextContainer;

/**
 * @author 邵福安
 * @version v0.1
 *<br>
 * 创建时间：2016年3月25日 上午11:56:53<br>
 * 最后修改时间：<br>
 * 		TODO		
 *  <br>
 *  信封头接口
 *  
 */
public interface IEnvelopeHeader extends IContextContainer,IEnvelopeElementDefinitions {
	
	Protocol getProtocol();
	String getVersion();
	String getClientId();
	String getClientName();
	ClientType getClientType();
	String getUrl();
	Method getMethod();
	String getStartTimeStamp();
	String getEndTimeStamp();
	String getEnvelopeId();
	String getEnvelopeSubId();
	String getServiceName();
	String getServiceNamespace();
	String getServiceMethod();
	
}
