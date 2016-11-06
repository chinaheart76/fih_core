package com.fih.framework.core.config;

import java.lang.reflect.Method;

public interface IConfigManager {
	
	//Class<?> getFactoryClass(String clsname);
	
	<T> T getFactoryObject(String clsname);
	
	//Method getFactoryMethod(Class<?> cls,String methodName);

}
