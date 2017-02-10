package com.easwift.basic.dataaccess.impl;

import com.easwift.basic.dataaccess.api.IDaoSupport;
import com.easwift.basic.dataaccess.api.IPageQueryFactory;
import com.easwift.basic.dataaccess.entity.Page;

/**
 * 
 * @descrpiton [快速分页工厂实现类]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:42:04]
 */
public class FastPageQueryFactory implements IPageQueryFactory<FastPageQuery> {
	private IDaoSupport daoSupport;

	@Override
	public FastPageQuery getPageQuery() {
		return new FastPageQuery(daoSupport);
	}

	@Override
	public FastPageQuery getPageQuery(Page page, String queryStr, String countStr) {
		FastPageQuery fastPageQuery = new FastPageQuery(daoSupport);
		fastPageQuery.setPage(page);
		fastPageQuery.setQueryStr(queryStr);
		fastPageQuery.setCountStr(countStr);
		return fastPageQuery;
	}

	public IDaoSupport getDaoSupport() {
		return daoSupport;
	}

	public void setDaoSupport(IDaoSupport daoSupport) {
		this.daoSupport = daoSupport;
	}

}
