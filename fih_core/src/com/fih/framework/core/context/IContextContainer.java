package com.fih.framework.core.context;

import java.io.Serializable;

/**
 * @author 邵福安
 * @version v0.1 2016-03-25<br>
 * <br>
 * 上下文容器接口
 *
 */
public interface IContextContainer extends Serializable {

	/**
	 * 获得上下文方法
	 * @return  返回上下文接口
	 * 
	 */
	IContext getContext();

}
