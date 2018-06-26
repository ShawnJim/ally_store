package com.ally.manager.mapper.my;

import java.util.List;

import com.ally.manager.pojo.my.MyTProduct;

public interface MyTProductMapper {

	//查询产品管理-产品管理信息分页
    List<MyTProduct> selectMyTProduct();
    //根据产品名称查询产品管理信息
	List<MyTProduct> selectMyProductProductName(String productName);
	//修改产品信息
	int updateMyTProduct(MyTProduct myTProduct);
	//批量删除产品信息
	void deleteBatchMyProduct(List<String> ids);
	//单个删除产品信息
	void deleteByPrimaryKey(String id);

}