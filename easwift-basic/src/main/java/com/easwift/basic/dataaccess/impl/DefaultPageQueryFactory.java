package com.easwift.basic.dataaccess.impl;

import com.easwift.basic.dataaccess.api.IDaoSupport;
import com.easwift.basic.dataaccess.api.IPageQueryFactory;
import com.easwift.basic.dataaccess.entity.Page;

/**
 * 
 * @descrpiton [分类工厂实现类]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:42:32]
 */
public class DefaultPageQueryFactory implements IPageQueryFactory<PageQuery> {
	private IDaoSupport daoSupport;

	@Override
	public PageQuery getPageQuery() {
		return new PageQuery(daoSupport);
	}

	@Override
	public PageQuery getPageQuery(Page page, String queryStr, String countStr) {
		PageQuery pageQuery = new PageQuery(page, queryStr, countStr);
		pageQuery.setDaoSupport(daoSupport);
		return pageQuery;
	}

	public IDaoSupport getDaoSupport() {
		return daoSupport;
	}

	public void setDaoSupport(IDaoSupport daoSupport) {
		this.daoSupport = daoSupport;
	}

}
