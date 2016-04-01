package com.fih.framework.core.constraint;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午2:59:09  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 约束接口
 */
public interface IConstraint extends Serializable {
	
	/**
	 * 约束名称
	 * @return
	 */
	String getName();
	
	/**
	 * 约束处理集合
	 * @return
	 */
	Collection<IConstraintHandler> getHandlers();
	
	/**
	 * 约束说明
	 * @return
	 */
	String getDescription();

}
