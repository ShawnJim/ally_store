package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.TAdmin;

public interface BackPageAdminService {
	//利用分页插件获取admin页面信息
	PageResult getTAdminList(int page ,int rows);
	//新增管理员用户
	int insertTAmind(TAdmin admin);
	//验证新添加的管理员是否存在
	boolean checkTAdmin(String username);
	//删除管理员
	void deleteTAdmin(int id);
	//批量删除管理员
	void deleteBatchTAdmin(List<Integer> ids);
	//更改管理员
	int updateTAdmin(TAdmin admin);
	//查询管理员
	List<TAdmin> selectTAdmin(String username);
}
