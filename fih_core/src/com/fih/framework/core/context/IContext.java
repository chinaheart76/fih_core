package com.fih.framework.core.context;

import java.io.Serializable;

/**
 * @author 邵福安
 * @version v0.1 2016-03-25<br>
 *	<br>
 *	上下文接口
 *
 */
public interface IContext extends Serializable {
	
	/**
	 * 获取方法.
	 * 
	 * @param key	上下文关键字
	 * @return	关键字值
	 * 
	 */
	<K,V> V get(K key);
	
	/**
	 * 赋值方法.
	 * 
	 * @param key	上下文关键字
	 * @param value	关键字值
	 * @return	无返回
	 */
	<K,V> V set(K key,V value);

}
