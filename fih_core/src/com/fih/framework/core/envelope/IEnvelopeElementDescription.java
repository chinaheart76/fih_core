package com.fih.framework.core.envelope;

/**
 * @author �۸���
 * @version v0.1<br>
 *<br>
 * ����ʱ�䣺2016��3��25�� ����11:58:13<br>
 * ����޸�ʱ�䣺<br>
 * 		TODO		
 *  <br>
 *  �ŷ�Ԫ�������ӿ�
 *  
 */
public interface IEnvelopeElementDescription {
	
	/**
	 * Ԫ����
	 * @return Ԫ����
	 */
	String getName();
	/**
	 * Ԫ������
	 * @return	Class
	 */
	Class<?> getType();
	/**
	 * Ԫ��˵��
	 * @return Ԫ��˵��
	 */
	String getDescription();

}
