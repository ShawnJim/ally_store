package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTStoreDzCheck;

public interface BackPageBrandDzCheckService {
	//查询分销商-店主审核信息分页
	PageResult getMyStoreDzCheck(int page,int rows);
	//查询分销商-店主审核信息分页
	PageResult getMyStoreDzCheckState(int page,int rows,int state);
	//根据用户名查询分销商-店主审核信息
	List<MyTStoreDzCheck> selectMyStoreDzCheck(String username);
	//批量冻结分销商-店主信息
	void freezeBatchMyStoreDz(List<Integer> del_ids);
	//单个冻结分销商-店主信息
	void freezeMyStoreDz(Integer id);
	//批量通过分销商-店主信息
	void passBatchMyStoreDz(List<Integer> del_ids);
	//单个通过分销商-店主信息
	void passMyStoreDz(Integer id);
}
