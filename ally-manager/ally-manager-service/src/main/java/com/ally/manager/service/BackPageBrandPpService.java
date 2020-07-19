package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTBrandPp;

public interface BackPageBrandPpService{
	
	//查询品牌商-品牌信息分页
	PageResult getMyBrandPp(int page,int rows);
	//根据用户名查询品牌商-品牌信息
	List<MyTBrandPp> selectMyBrandPp(String username);
	//删除品牌商-品牌信息
	void deleteMyBrandPp(int id);
	//批量删除品牌商-品牌信息
	void deleteBatchMyBrandPp(List<Integer> ids);
	//更改品牌商-品牌信息
	int updateMyTBrandPp(MyTBrandPp myTBrandPp);
	
}
