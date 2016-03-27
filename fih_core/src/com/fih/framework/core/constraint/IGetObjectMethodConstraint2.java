package com.fih.framework.core.constraint;

import java.util.Collection;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午3:06:35  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 通过服务名获得服务拥有的约束接口
 */
public interface IGetObjectMethodConstraint2 {
	
	/**
	 * 获得服务的约束集合
	 * @param serviceName			服务名
	 * @param serviceNameSpace		命名空间
	 * @return	约束接口集合
	 */
	Collection<IConstraint> getConstraints(String methodName,String serviceName,String serviceNameSpace);

}
