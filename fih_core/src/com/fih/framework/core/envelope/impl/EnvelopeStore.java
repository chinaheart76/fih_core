package com.fih.framework.core.envelope.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fih.framework.core.context.IContext;
import com.fih.framework.core.context.IContextContainer;
import com.fih.framework.core.context.impl.ContextStore;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午3:25:09  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 信封存储实现
 */
public class EnvelopeStore implements Map<String, Object>,IContextContainer {
	
	private Map<String,Object> store = new HashMap<String,Object>();

	@Override
	public void clear() {
		store.clear();		
	}

	@Override
	public boolean containsKey(Object arg0) {
		return store.containsKey(arg0);
	}

	public boolean containsKey(String arg0) {
		return store.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		return store.containsValue(arg0);
	}

	@Override
	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		return Collections.unmodifiableSet(store.entrySet());
	}

	@Override
	public Object get(Object arg0) {
		return (Object) store.get(arg0);
	}

	public Object get(String arg0) {
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
		throw new UnsupportedOperationException();
//		store.putAll(arg0);
	}
	
	public void putAll(EnvelopeStore arg0) {
//		throw new UnsupportedOperationException();
		store.putAll(arg0);
	}

	@Override
	public Object remove(Object arg0) {
		return (Object) store.remove(arg0);
	}

	public Object remove(String arg0) {
		return (Object) store.remove(arg0);
	}

	@Override
	public int size() {
		return store.size();
	}

	@Override
	public Collection<Object> values() {
		return Collections.unmodifiableCollection(store.values());
	}
	
	protected Map<String,Object> getStore(){
		return this.store;
	}

	@Override
	public IContext getContext() {
		Map<Object, Object> context = new HashMap<Object, Object>();
		
		context.putAll(this.store);
		
		return new ContextStore(context);
	}

}
