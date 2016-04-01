package com.fih.framework.core.envelope;

import com.fih.framework.core.envelope.excpt.EnvelopeRuntimeException;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月25日 下午12:19:40  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 信封处理接口
 */
public interface IEnvelopeHandler {
	
	/**
	 * 处理信封方法
	 * @param envelope
	 * @return
	 * @throws EnvelopeRuntimeException
	 */
	IEnvelope handler(IEnvelope envelope) throws EnvelopeRuntimeException;

}
