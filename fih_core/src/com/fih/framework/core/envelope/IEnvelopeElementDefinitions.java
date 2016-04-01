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
	
		/**
		 * 获得全部元素描述
		 * @return
		 */
		Collection<IEnvelopeElementDescription> getDefinitions();
		/**
		 * 获得指定元素描述
		 * @param name
		 * @return
		 */
		IEnvelopeElementDescription getDefinition(String name);
		
		/**
		 * 增加元素描述
		 * @param definition
		 */
		void addDefinition(IEnvelopeElementDescription definition);
		void addDefinition(String name,IEnvelopeElementDescription definition);
		
		IEnvelopeElementDescription remove(String name);
		IEnvelopeElementDescription remove(IEnvelopeElementDescription definition);
		
		
}
