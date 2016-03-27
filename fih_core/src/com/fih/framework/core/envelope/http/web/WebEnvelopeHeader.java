package com.fih.framework.core.envelope.http.web;

import java.util.Collection;
import java.util.Collections;

import com.fih.framework.core.context.IContext;
import com.fih.framework.core.envelope.ClientType;
import com.fih.framework.core.envelope.IEnvelopeElementDescription;
import com.fih.framework.core.envelope.IEnvelopeHeader;
import com.fih.framework.core.envelope.Method;
import com.fih.framework.core.envelope.Protocol;
import com.fih.framework.core.envelope.impl.EnvelopeStore;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午3:40:19  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * http协议web头实现
 */
public class WebEnvelopeHeader extends EnvelopeStore implements IEnvelopeHeader {

	@SuppressWarnings("unchecked")
	@Override
	public Collection<IEnvelopeElementDescription> getDefinitions() {
		return (Collection<IEnvelopeElementDescription>) super.get("definitions");
	}
	
	public void addDefinition(IEnvelopeElementDescription definition){
		
		Collection<IEnvelopeElementDescription> definitions = getDefinitions();
		
		if(null == definitions){
			definitions = Collections.emptySet();
		}
		
		definitions.add(definition);
		
	}

	@Override
	public Protocol getProtocol() {
		return Protocol.HTTP;
	}

	@Override
	public String getVersion() {
		return (String) super.get("version");
	}
	
	public String setVersion(String version){
		return (String)super.put("version", version);
	}

	@Override
	public String getClientId() {
		return (String) super.get("clientId");
	}
	
	public String setClientId(String clientId){
		return (String)super.put("clientId", clientId);
	}

	@Override
	public String getClientName() {
		return (String)super.get("clientName");
	}
	
	public String setClientName(String clientName){
		return (String)super.put("clientName", clientName);
	}

	@Override
	public ClientType getClientType() {
		return (ClientType)super.get("clientType");
	}
	
	public ClientType setClientType(ClientType clientType){
		return (ClientType)super.put("clientType",clientType);
	}

	@Override
	public String getUrl() {
		return (String)super.get("url");
	}

	public String setUrl(String url){
		return (String)super.put("url", url);
	}
	@Override
	public Method getMethod() {
		return (Method)super.get("method");
	}
	
	public Method setMethod(Method method){
		return (Method)super.put("method", method);
	}

	@Override
	public String getStartTimeStamp() {
		return (String)super.get("startTimeStamp");
	}
	
	public String setStartTimeStamp(String startTimeStamp){
		return (String)super.put("startTimeStamp", startTimeStamp);
	}

	@Override
	public String getEndTimeStamp() {
		return (String)super.get("endTimeStamp");
	}
	
	public String setEndTimeStamp(String endTimeStamp){
		return (String)super.put("endTimeStamp", endTimeStamp);
	}

	@Override
	public String getEnvelopeId() {
		return (String)super.get("envelopeId");
	}
	
	public String setEnvelopeId(String envelopeId){
		return (String)super.put("envelopeId", envelopeId);
	}

	@Override
	public String getEnvelopeSubId() {
		return (String)super.get("envelopeSubId");
	}
	
	public String setEnvelopeSubId(String envelopeSubId){
		return (String)super.put("envelopeSubId", envelopeSubId);
	}

	@Override
	public String getServiceName() {
		return (String)super.get("serviceName");
	}
	
	public String setServiceName(String serviceName){
		return (String)super.put("serviceName", serviceName);
	}

	@Override
	public String getServiceNamespace() {
		return (String)super.get("serviceNamespace");
	}
	
	public String setServiceNamespace(String serviceNamespace){
		return (String)super.put("serviceNamespace", serviceNamespace);
	}

	@Override
	public String getServiceMethod() {
		return (String)super.get("serviceMethod");
	}
	
	public String setServiceMethod(String serviceMethod){
		return (String)super.put("serviceMethod", serviceMethod);
	}

}
