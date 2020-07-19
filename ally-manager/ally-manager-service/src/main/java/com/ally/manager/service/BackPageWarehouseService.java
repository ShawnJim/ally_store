package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.TWarehouse;

public interface BackPageWarehouseService {
	//利用分页插件获取仓库页面信息
	PageResult getTWarehouseList(int page ,int rows);
/*	//根据条件查询仓库信息
	List<TWarehouse> selectTWarehouse(String name);
	//修改仓库信息
	int updateTWarehouse(TWarehouse warehouse);
	//批量删除仓库信息
	void deleteBatchTWarehouse(List<Integer> del_ids);
	//单个删除仓库信息
	void deleteTWarehouse(Integer id);*/
}
