package com.ally.search.service.serviceImpl;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.search.dao.SearchDao;
import com.ally.search.po.SearchResult;
import com.ally.search.service.SearchService;

/**
 * 搜索service
 * @author Administrator
 *
 */
@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	SearchDao searchDao;

	@Override
	public SearchResult search(String queryString, int page, int rows,String cate,String sort) throws Exception {
		// TODO Auto-generated method stub
		//创建查询条件
		SolrQuery query = new SolrQuery();
		//设置查询条件
		query.setQuery(queryString);
		//设置分页
		query.setStart((page-1)*rows);
		query.setRows(rows);
		//设置默认搜索域
		if("0".equals(cate))
			query.set("df","product_keywords");
		else
			query.set("df","category_name");
		if("1".equals(sort))
			query.setSort("product_price", ORDER.desc);
		else
			query.setSort("product_price", ORDER.asc);
		//设置高亮显示
		query.setHighlight(true);
		query.addHighlightField("product_keywords");
		query.setHighlightSimplePre("<em style='color:red'>");
		query.setHighlightSimplePost("</em>");
		//执行查询
		SearchResult searchResult = searchDao.search(query);
		//计算查询结果总页数
		Long recordCount = searchResult.getRecordCount();
		Long pageCount = recordCount/rows;
		if(recordCount%rows>0) {
			pageCount++;
		}
		searchResult.setPageCount(pageCount);
		searchResult.setCurPage(page);
		return searchResult;
	}

}
