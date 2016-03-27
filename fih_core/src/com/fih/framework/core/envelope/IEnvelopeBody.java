package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContext;
import com.fih.framework.core.context.IContextContainer;

/**
 * @author 邵福安
 * @version v0.1
 *<br>
 * 创建时间：2016年3月25日 上午11:57:29<br>
 * 最后修改时间：<br>
 * 		TODO		
 *  <br>
 *  信封体接口
 */
public interface IEnvelopeBody extends IContext,IContextContainer,IEnvelopeElementDefinitions {
	
	String getStatus();		
	String getMessage();
	
}
