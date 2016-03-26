package com.fih.framework.core.envelope;

/**
 * @author 邵福安
 * @version v0.1<br>
 *<br>
 * 创建时间：2016年3月25日 上午11:58:13<br>
 * 最后修改时间：<br>
 * 		TODO		
 *  <br>
 *  信封元素描述接口
 *  
 */
public interface IEnvelopeElementDescription {
	
	/**
	 * 元素名
	 * @return 元素名
	 */
	String getName();
	/**
	 * 元素类型
	 * @return	Class
	 */
	Class<?> getType();
	/**
	 * 元素说明
	 * @return 元素说明
	 */
	String getDescription();

}
