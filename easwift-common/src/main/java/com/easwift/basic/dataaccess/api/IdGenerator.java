package com.easwift.basic.dataaccess.api;

import java.beans.PropertyDescriptor;
import java.io.Serializable;

/**
 * 
 * @descrpiton [Id 生成器]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:28:15]
 */
public interface IdGenerator {
	/**
	 * 设置并返回生成Id
	 * 
	 * @param entity
	 * @param idPropertyDescriptor
	 * @return
	 */
	Serializable setId(Object entity, PropertyDescriptor idPropertyDescriptor);

}
