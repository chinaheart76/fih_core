package com.fih.framework.core.context;

public interface IContext {
	
	Object get(Object key);
	Object set(Object key,Object value);

}
