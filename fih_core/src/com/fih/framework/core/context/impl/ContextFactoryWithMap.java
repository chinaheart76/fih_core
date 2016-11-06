package com.fih.framework.core.context.impl;

import java.util.Map;

import com.fih.framework.core.context.IContext;
import com.fih.framework.core.context.IContextFactory;

public class ContextFactoryWithMap implements IContextFactory<Map<Object,Object>> {
	
	@Override
	public IContext createContext(Map<Object,Object> store) {
		return new ContextStore(store);
	}

}
