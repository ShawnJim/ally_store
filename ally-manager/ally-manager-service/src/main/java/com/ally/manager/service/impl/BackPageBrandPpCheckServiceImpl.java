package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTBrandPpCheckMapper;
import com.ally.manager.pojo.my.MyTBrandPpCheck;
import com.ally.manager.service.BackPageBrandPpCheckService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageBrandPpCheckServiceImpl implements BackPageBrandPpCheckService{
	@Autowired
	private MyTBrandPpCheckMapper brandPpCheckMapper;//品牌商审核mapper
	
	@Override
	public PageResult getMyBrandPpCheck(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTBrandPpCheck> list = brandPpCheckMapper.selectMyBrandPpCheck();
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTBrandPpCheck> pageInfo = new PageInfo<>(list);
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
	public PageResult getMyBrandPpCheckState(int page, int rows,int state) {
		PageHelper.startPage(page, rows);
		List<MyTBrandPpCheck> list = brandPpCheckMapper.selectMyBrandPpCheckState(state);
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTBrandPpCheck> pageInfo = new PageInfo<>(list);
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
	public List<MyTBrandPpCheck> selectMyBrandPpCheck(String username) {
		return brandPpCheckMapper.selectMyBrandPpCheckUserName(username);
	}

	@Override
	public void freezeBatchMyBrandPp(List<Integer> ids) {
		brandPpCheckMapper.freezeBatchMyBrandPp(ids);
		
	}

	@Override
	public void freezeMyBrandPp(Integer id) {
		brandPpCheckMapper.freezeByPrimaryKey(id);
		
	}

	@Override
	public void passMyBrandPp(Integer id) {
		brandPpCheckMapper.passByPrimaryKey(id);
		
	}

	@Override
	public void passBatchMyBrandPp(List<Integer> ids) {
		brandPpCheckMapper.passBatchMyBrandPp(ids);
	}

}
