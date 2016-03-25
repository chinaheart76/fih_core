package com.fih.framework.core.context;

/**
 * @author 邵福安
 * @version v0.1 2016-03-25
 *	
 *	上下文接口
 *
 */
public interface IContext {
	
	/**
	 * 获取方法.
	 * 
	 * @param key	上下文关键字
	 * @return	关键字值
	 * 
	 */
	Object get(Object key);
	
	/**
	 * 赋值方法.
	 * 
	 * @param key	上下文关键字
	 * @param value	关键字值
	 * @return	无返回
	 */
	Object set(Object key,Object value);

}
