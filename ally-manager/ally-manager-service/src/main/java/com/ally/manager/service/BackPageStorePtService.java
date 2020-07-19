package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTStorePt;

public interface BackPageStorePtService {
	//查询分销商-平台信息分页
	PageResult getMyStorePt(int page,int rows);	
	//根据网店名称查询分销商-平台信息
	List<MyTStorePt> selectMyStorePt(String wwwName);	
	//删除分销商-平台信息
	void deleteMyStorePt(int id);
	//批量删除分销商-平台信息
	void deleteBatchMyStorePt(List<Integer> ids);
	//更改分销商-平台信息	
	int updateMyTStorePt(MyTStorePt myTStorePt);
	

}
