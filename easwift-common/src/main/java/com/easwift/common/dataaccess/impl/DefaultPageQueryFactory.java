package com.easwift.common.dataaccess.impl;

import com.easwift.common.dataaccess.api.IDaoSupport;
import com.easwift.common.dataaccess.api.Page;
import com.easwift.common.dataaccess.api.PageQueryFactory;

public class DefaultPageQueryFactory implements PageQueryFactory<PageQuery> {
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
