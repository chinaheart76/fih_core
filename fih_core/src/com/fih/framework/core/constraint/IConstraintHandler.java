package com.fih.framework.core.constraint;

import com.fih.framework.core.constraint.excpt.ConstraintRuntimeException;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午3:03:12  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 约束处理接口
 */
public interface IConstraintHandler {

	/**
	 * 约束处理器
	 * @param constraintOfObject	约束处理对象
	 */
	<T> void handler(T constraintOfObject) throws ConstraintRuntimeException;
}
