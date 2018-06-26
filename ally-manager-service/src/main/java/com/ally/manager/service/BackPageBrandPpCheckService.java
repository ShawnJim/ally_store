package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTBrandPpCheck;

public interface BackPageBrandPpCheckService {
	//查询品牌商-品牌审核信息分页
	PageResult getMyBrandPpCheck(int page,int rows);
	//查询品牌商-品牌审核信息分页-状态
	PageResult getMyBrandPpCheckState(int page,int rows,int state);
	//根据用户名查询品牌商-品牌审核信息
	List<MyTBrandPpCheck> selectMyBrandPpCheck(String username);
	//批量冻结品牌商-品牌信息
	void freezeBatchMyBrandPp(List<Integer> ids);
	//单个冻结品牌商-品牌信息
	void freezeMyBrandPp(Integer id);
	//单个通过品牌商-品牌信息
	void passMyBrandPp(Integer id);
	//批量通过品牌商-品牌信息
	void passBatchMyBrandPp(List<Integer> del_ids);
}
