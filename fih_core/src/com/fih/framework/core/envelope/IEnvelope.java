package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContextContainer;

/**
 * @author 邵福安
 * @version v0.1<br>
 *<br>
 * 创建时间：2016年3月25日 上午11:54:13<br>
 * 最后修改时间：<br>
 * 		TODO		
 *  <br>
 *  信封接口
 */
public interface IEnvelope extends IContextContainer {
	
	/**
	 * 返回信封头方法
	 * @return  信封头接口
	 */
	IEnvelopeHeader getHeader();
	
	/**
	 * 返回信封体方法
	 * @return  信封体接口
	 */
	IEnvelopeBody getBody();
			
}
