package com.fih.framework.core.context.impl;

import java.util.HashMap;
import java.util.Map;

import com.fih.framework.core.context.IContext;

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
