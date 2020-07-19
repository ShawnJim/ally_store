package com.ally.search.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ally.search.dao.SearchDao;
import com.ally.search.po.Item;
import com.ally.search.po.SearchResult;

@Repository
public class SearchDaoImpl implements SearchDao{
	
	@Autowired 
	SolrServer solrServer;

	@Override
	public SearchResult search(SolrQuery query) throws Exception {
		// TODO Auto-generated method stub
		//返回值对象
		SearchResult searchResult = new SearchResult();
		//分局查询条件查询索引库
		QueryResponse queryResponse = solrServer.query(query);
		//取查询结果
		SolrDocumentList solrDocumentList = queryResponse.getResults();
		//取查询结果总数量
		searchResult.setRecordCount(solrDocumentList.getNumFound());
		//商品列表
		List<Item> items = new ArrayList<>();
		//取高亮显示
		Map<String, Map<String, List<String>>> highlighting =  queryResponse.getHighlighting();
		//去商品列表
		for (SolrDocument solrDocument : solrDocumentList) {
			//创建商品对象
			Item item = new Item();
			item.setId((String) solrDocument.get("id"));
			//取高亮结果
			List<String> list = highlighting.get((String) solrDocument.get("id")).get("product_name");
			String title = "";
			if (list!=null&&list.size()>0) {
				title = list.get(0);
			}else {
				title = (String) solrDocument.get("product_name");
			}
			item.setPro_name(title);
			List keywords = (List) solrDocument.get("product_keywords");
			item.setSell_point((String)keywords.get(1));
			item.setPicture((String) solrDocument.get("product_picture"));
			item.setPrice((float) solrDocument.get("product_price"));
			item.setCate_name((String) solrDocument.get("category_name"));
			items.add(item);
		}
		searchResult.setItemList(items);
		return searchResult;
	}

}
