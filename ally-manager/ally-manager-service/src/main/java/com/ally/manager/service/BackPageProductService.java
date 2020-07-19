package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTProduct;

public interface BackPageProductService {
	
	//分页查询产品信息
	PageResult getTProductList(Integer page, Integer rows);
	//根据产品名称查询产品信息
	List<MyTProduct> selectMyProduct(String productName);
	//修改产品信息
	int updateMyTProduct(MyTProduct myTProduct);
	//批量删除产品信息
	void deleteBatchMyProduct(List<String> del_ids);
	//单个删除产品信息
	void deleteMyProduct(String id);
}
