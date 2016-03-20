package com.fih.framework.core.envelope.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EnvelopeStore implements Map<String, Object> {
	
	private Map<String,Object> store = new HashMap<String,Object>();

	@Override
	public void clear() {
		store.clear();		
	}

	@Override
	public boolean containsKey(Object arg0) {
		return store.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		return store.containsValue(arg0);
	}

	@Override
	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		return store.entrySet();
	}

	@Override
	public Object get(Object arg0) {
		return (Object) store.get(arg0);
	}

	@Override
	public boolean isEmpty() {
		return store.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		return store.keySet();
	}

	@Override
	public Object put(String arg0, Object arg1) {
		return (Object) store.put(arg0, arg1);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> arg0) {
		store.putAll(arg0);
	}

	@Override
	public Object remove(Object arg0) {
		return (Object) store.remove(arg0);
	}

	@Override
	public int size() {
		return store.size();
	}

	@Override
	public Collection<Object> values() {
		return store.values();
	}

}
