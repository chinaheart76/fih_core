package com.fih.framework.core.envelope;

import com.fih.framework.core.envelope.excpt.EnvelopeRuntimeException;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午2:54:59  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 信封处理后置接口
 */
public interface IEnvelopeHandlerPost {
	
	/**
	 * 后置接口
	 * @param requestEnvelope	请求信封
	 * @param responseEnvelope	响应信封
	 */
	void Post(IEnvelope requestEnvelope,IEnvelope responseEnvelope) throws EnvelopeRuntimeException;

}
