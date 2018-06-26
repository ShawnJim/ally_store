package com.ally.search.service;

import com.ally.search.po.SearchResult;

/**
 * 搜索service接口
 * @author Administrator
 *
 */
public interface SearchService {

	SearchResult search(String queryString,int page,int rows, String cate, String sort) throws Exception;
}
