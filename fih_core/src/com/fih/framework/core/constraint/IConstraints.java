package com.fih.framework.core.constraint;

import java.util.Collection;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午3:04:18  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 对象拥有的约束集合接口
 */
public interface IConstraints {
	
	/**
	 * 获得对象或者服务的约束接口集合
	 * @return	约束接口集合
	 */
	Collection<IConstraint> getConstraints();
	
	IConstraint getConstraint(String name);
	void addConstraint(IConstraint constraint);
	IConstraint removeConstraint(String name);
	IConstraint removeConstraint(IConstraint constraint);

}
