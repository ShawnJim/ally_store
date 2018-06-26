package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTBrandQy;

public interface BackPageBrandQyService {
	
	//查询品牌商-企业信息分页
		PageResult getMyBrandQy(int page,int rows);
	//根据用户名查询品牌商-企业信息
		List<MyTBrandQy> selectMyBrandQy(String companyName);
	//删除品牌商-企业信息
		void deleteMyBrandQy(int id);
	//批量删除品牌商-企业信息
		void deleteBatchMyBrandQy(List<Integer> ids);
	//更改品牌商-企业信息	
		int updateMyTBrandQy(MyTBrandQy myTBrandQy);
}
