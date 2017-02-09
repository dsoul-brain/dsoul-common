package com.easwift.basic.dataaccess.api;

import com.easwift.basic.dataaccess.entity.Page;

/**
 * 
 * @descrpiton [分页查询工厂接口]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:28:54]
 */
public interface IPageQueryFactory<T extends IPageQuery> {

	T getPageQuery();

	T getPageQuery(Page page, String queryStr, String countStr);

}
