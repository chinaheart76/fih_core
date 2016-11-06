package com.fih.framework.core.context;

public interface IContextFactory<T> {
	
	IContext createContext(T t);

}
