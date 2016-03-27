package com.fih.framework.core.envelope;

import com.fih.framework.core.envelope.excpt.EnvelopeRuntimeException;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月25日 下午12:18:44  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 信封创建工厂
 * 
 */
public interface IEnvelopeFactory {
	
	IEnvelope createEnvelope() throws EnvelopeRuntimeException;

}
