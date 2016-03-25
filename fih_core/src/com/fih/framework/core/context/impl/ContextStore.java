package com.fih.framework.core.context.impl;

import java.util.HashMap;
import java.util.Map;

import com.fih.framework.core.context.IContext;

/**
 * @author �۸���
 * @version v0.1 2016-03-25<br>
 *<br>
 * ����ʱ�䣺2016��3��25�� ����11:42:14<br>
 * ����޸�ʱ�䣺<br>
 * 		TODO		
 *  <br>
 *  ʵ�������Ľӿ�
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
