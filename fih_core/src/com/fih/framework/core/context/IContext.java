package com.fih.framework.core.context;

/**
 * @author �۸���
 * @version v0.1 2016-03-25
 *	
 *	�����Ľӿ�
 *
 */
public interface IContext {
	
	/**
	 * ��ȡ����.
	 * 
	 * @param key	�����Ĺؼ���
	 * @return	�ؼ���ֵ
	 * 
	 */
	Object get(Object key);
	
	/**
	 * ��ֵ����.
	 * 
	 * @param key	�����Ĺؼ���
	 * @param value	�ؼ���ֵ
	 * @return	�޷���
	 */
	Object set(Object key,Object value);

}
