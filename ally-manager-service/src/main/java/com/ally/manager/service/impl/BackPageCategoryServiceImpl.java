package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.TCategoryMapper;
import com.ally.manager.pojo.TCategory;
import com.ally.manager.pojo.TCategoryExample;
import com.ally.manager.service.BackPageCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageCategoryServiceImpl implements BackPageCategoryService{
	@Autowired
	private TCategoryMapper tCategoryMapper;//分类mapper
	
	@Override
	public PageResult getTCategoryList(Integer page, Integer rows) {
		TCategoryExample example = new TCategoryExample();
		PageHelper.startPage(page, rows);
		List<TCategory> list = tCategoryMapper.selectByExample(example);
		//创建一个返回值对象
		PageResult result = new PageResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TCategory> pageInfo = new PageInfo<>(list);
		//总页数
		result.setTotal(pageInfo.getTotal());
		//当前页
		result.setPageNum(pageInfo.getPageNum());
		//总页数
		result.setPages(pageInfo.getPages());
		//下一页
		result.setNextPage(pageInfo.getNextPage());
		//前一页
		result.setPrePage(pageInfo.getPrePage());
		//第一页
		result.setFirstPage(pageInfo.getFirstPage());
		//最后一页
		result.setLastPage(pageInfo.getLastPage());
		
		return result;
	}

	@Override
	public List<TCategory> selectCategory(String name) {
		TCategoryExample example = new TCategoryExample();
		TCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		return tCategoryMapper.selectByExample(example);
	}

	@Override
	public int insertCategory(TCategory category) {
		return tCategoryMapper.insert(category);
	}

	@Override
	public int updateTCategory(TCategory category) {
		TCategoryExample example = new TCategoryExample();
		TCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(category.getId());
		TCategory result = tCategoryMapper.selectByPrimaryKey(category.getId());
		category.setRegisterTime(result.getRegisterTime());
		int i = tCategoryMapper.updateByPrimaryKey(category);
		return i;
	}

	@Override
	public void deleteBatchTCategory(List<Integer> ids) {
		TCategoryExample example = new TCategoryExample();
		TCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		tCategoryMapper.deleteByExample(example);
		
	}

	@Override
	public void deleteTCategory(Integer id) {
		tCategoryMapper.deleteByPrimaryKey(id);
	}
}
