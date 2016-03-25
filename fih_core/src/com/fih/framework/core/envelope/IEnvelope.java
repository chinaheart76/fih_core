package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContextContainer;

/**
 * @author �۸���
 * @version v0.1<br>
 *<br>
 * ����ʱ�䣺2016��3��25�� ����11:54:13<br>
 * ����޸�ʱ�䣺<br>
 * 		TODO		
 *  <br>
 *  �ŷ�ӿ�
 */
public interface IEnvelope extends IContextContainer {
	
	/**
	 * �����ŷ�ͷ����
	 * @return  �ŷ�ͷ�ӿ�
	 */
	IEnvelopeHeader getHeader();
	
	/**
	 * �����ŷ��巽��
	 * @return  �ŷ���ӿ�
	 */
	IEnvelopeBody getBody();
			
}
