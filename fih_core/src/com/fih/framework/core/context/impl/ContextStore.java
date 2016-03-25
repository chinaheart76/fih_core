package com.fih.framework.core.context.impl;

import java.util.HashMap;
import java.util.Map;

import com.fih.framework.core.context.IContext;

/**
 * @author 邵福安
 * @version v0.1 2016-03-25<br>
 *<br>
 * 创建时间：2016年3月25日 上午11:42:14<br>
 * 最后修改时间：<br>
 * 		TODO		
 *  <br>
 *  实现上下文接口
 */

@SuppressWarnings({"rawtypes","unchecked"})
public class ContextStore implements IContext {
	
	private Map store = new HashMap();

	@Override
	public Object get(Object key) {
		return store.get(key);
	}

	@Override
	public Object set(Object key, Object value) {
		return store.put(key, value);
	}

}
