package com.fih.framework.core.envelope;

import java.util.Collection;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月25日 下午12:17:11  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 信封元素描述定义集合
 * 
 */
public interface IEnvelopeElementDefinitions {
	
		Collection<IEnvelopeElementDescription> getDefinitions();
		
}
