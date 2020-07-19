package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTWarehouse;

import java.util.List;

public interface MyTWarehouseMapper {
	//查询仓库信息分页
	List<MyTWarehouse> selectMysWarehouse();
}