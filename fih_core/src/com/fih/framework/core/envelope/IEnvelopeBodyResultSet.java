package com.fih.framework.core.envelope;

import java.io.Serializable;
import java.util.List;

import com.fih.framework.core.context.IContext;
import com.fih.framework.dataset.IDataSet;

/**
 * @author 邵福安
 * @version v0.1
 *
 * 创建时间：2016年4月1日 下午12:20:27  <br>
 * 最后修改时间：<br>
 * 		TODO		
 * <br><br> 
 */
public interface IEnvelopeBodyResultSet extends Serializable {
	
	String getStatus();	
	String getMessage();
	void setMessage(String message);
	IContext getParameters();
	<T> T getParameter(String name);
	<T> void addParameter(T value);
	<T> T removeParameter(String name);
	
	List<IDataSet> getDataSets();
	IDataSet getDataSet(String dataSetName);
	void addDataSet(IDataSet dataset);
	void addDataSet(String dataSetName,IDataSet dataset);
	IDataSet removeDataSet(IDataSet dataSet);
	IDataSet removeDataSet(String dataSetName,IDataSet dataSet);
	
}
