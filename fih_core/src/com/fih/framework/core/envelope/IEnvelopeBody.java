package com.fih.framework.core.envelope;

import com.fih.framework.core.context.IContext;

/**
 * @author �۸���
 * @version v0.1
 *<br>
 * ����ʱ�䣺2016��3��25�� ����11:57:29<br>
 * ����޸�ʱ�䣺<br>
 * 		TODO		
 *  <br>
 *  �ŷ���ӿ�
 */
public interface IEnvelopeBody extends IContext,IEnvelopeElementDefinitions {
	
	String getStatus();	
	
}
