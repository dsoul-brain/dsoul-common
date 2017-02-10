package com.easwift.basic.dataaccess.impl;

import java.util.List;

import com.easwift.basic.dataaccess.api.IDaoSupport;
import com.easwift.basic.dataaccess.entity.Page;
import com.easwift.basic.spring.CurrentSpringContext;

/**
 * @descrpiton [自定义约束分页]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:36:39]
 */
public class FindEqualPageQuery {

	private static IDaoSupport daoSupport;

	private final Page page;
	private final FindEqualBuilder findEqualBuilder;

	public <T> FindEqualPageQuery(Page page, FindEqualBuilder findEqualBuilder) {
		this.page = page;
		this.findEqualBuilder = findEqualBuilder;
		if (daoSupport == null) {
			daoSupport = CurrentSpringContext.getBean("roofDaoSupport", IDaoSupport.class);
		}
	}

	public Page find() {
		Long rowCount = ((BasicDaoSupport) daoSupport).findEqualCount(findEqualBuilder);
		page.setTotal(rowCount);
		List<?> rows = daoSupport.findEqual(findEqualBuilder, page.getStart().intValue(), page.getLimit().intValue());
		page.setDataList(rows);
		return page;
	}

}
