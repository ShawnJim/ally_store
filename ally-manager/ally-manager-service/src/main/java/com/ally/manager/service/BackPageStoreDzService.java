package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTStoreDz;

public interface BackPageStoreDzService {
		//查询分销商-店主信息分页
			PageResult getMyStoreDz(int page,int rows);	
		//根据用户名查询分销商-店主信息
			List<MyTStoreDz> selectMyStoreDz(String username);	
		//删除分销商-店主信息
			void deleteMyStoreDz(int id);
		//批量删除分销商-店主信息
			void deleteBatchMyStoreDz(List<Integer> ids);
		//更改分销商-店主信息	
			int updateMyTStoreDz(MyTStoreDz myTStoreDz);

}
