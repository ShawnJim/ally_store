package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.TCategory;

public interface BackPageCategoryService {
	//分页查询分类信息
	PageResult getTCategoryList(Integer page, Integer rows);
	//根据分类名称查询分类信息
	List<TCategory> selectCategory(String name);
	//增加分类
	int insertCategory(TCategory category);
	//修改分类
	int updateTCategory(TCategory category);
	//批量删除分类
	void deleteBatchTCategory(List<Integer> del_ids);
	//单个删除分类
	void deleteTCategory(Integer id);
}
