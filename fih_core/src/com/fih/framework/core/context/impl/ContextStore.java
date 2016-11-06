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


class ContextStore implements IContext {
	
	private static final long serialVersionUID = 2158609385120446855L;
	private Map<Object, Object> store = null;

	@SuppressWarnings("unchecked")
	@Override
	public Object get(Object key) {
		return store.get(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(Object key, Object value) {
		return store.put(key, value);
	}

	@SuppressWarnings("unused")
	private ContextStore() {
		super();
	}

	ContextStore(Map<Object, Object> store) {
		super();
		this.store = store;
	}	

}
