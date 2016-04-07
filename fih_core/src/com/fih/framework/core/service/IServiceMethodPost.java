package com.fih.framework.core.service;

import com.fih.framework.core.context.IContext;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年3月27日 上午2:54:59  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 * 服务处理后置接口
 */
public interface IServiceMethodPost {
	
	/**
	 * 后置接口
	 * @param requestContext	请求上下文
	 * @param responseContext	响应上下文
	 */
	void Post(IContext requestContext,IContext responseContext);

}
