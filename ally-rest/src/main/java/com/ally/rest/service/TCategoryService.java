package com.ally.rest.service;

import java.util.List;

import com.ally.rest.po.CateResult;
import com.ally.rest.po.TCategory;

public interface TCategoryService {

	TCategory getCategory(int id) throws Exception;

	CateResult getItemCatList();
	
	CateResult getItemFCatList();
	
	CateResult getItemSCatList(int parentId);

}
