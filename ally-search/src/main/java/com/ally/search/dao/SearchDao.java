package com.ally.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.ally.search.po.SearchResult;

public interface SearchDao {
	
	SearchResult search(SolrQuery query) throws Exception;

}
