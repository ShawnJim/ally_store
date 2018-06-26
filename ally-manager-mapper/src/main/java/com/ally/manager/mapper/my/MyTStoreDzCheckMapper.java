package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTStoreDzCheck;

import java.util.List;

public interface MyTStoreDzCheckMapper {
	//查询分销商-店主审核信息分页
	List<MyTStoreDzCheck> selectMyStoreDzCheck();
	//查询分销商-店主审核信息分页
	List<MyTStoreDzCheck> selectMyStoreDzCheckState(int state);
	//根据分销商用户名称查询店主审核信息
	List<MyTStoreDzCheck> selectMyStoreDzCheckUserName(String username);
	//批量冻结分销商信息
	void freezeBatchMyStoreDz(List<Integer> ids);
	//单个冻结分销商信息
	void freezeByPrimaryKey(Integer id);
	//批量通过分销商信息
	void passBatchMyStoreDz(List<Integer> ids);
	//单个通过分销商信息
	void passByPrimaryKey(Integer id);
	
}