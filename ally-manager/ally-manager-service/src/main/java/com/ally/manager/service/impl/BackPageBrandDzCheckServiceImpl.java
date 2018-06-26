package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTStoreDzCheckMapper;
import com.ally.manager.pojo.my.MyTStoreDzCheck;
import com.ally.manager.service.BackPageBrandDzCheckService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageBrandDzCheckServiceImpl implements BackPageBrandDzCheckService{
	@Autowired
	private MyTStoreDzCheckMapper storeDzCheckMapper;//店主商审核mapper
	
	@Override
	public PageResult getMyStoreDzCheck(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTStoreDzCheck> list = storeDzCheckMapper.selectMyStoreDzCheck();
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTStoreDzCheck> pageInfo = new PageInfo<>(list);
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
	public PageResult getMyStoreDzCheckState(int page, int rows,int state) {
		PageHelper.startPage(page, rows);
		List<MyTStoreDzCheck> list = storeDzCheckMapper.selectMyStoreDzCheckState(state);
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTStoreDzCheck> pageInfo = new PageInfo<>(list);
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
	public List<MyTStoreDzCheck> selectMyStoreDzCheck(String username) {
		return storeDzCheckMapper.selectMyStoreDzCheckUserName(username);
	}

	@Override
	public void freezeBatchMyStoreDz(List<Integer> ids) {
		storeDzCheckMapper.freezeBatchMyStoreDz(ids);
		
	}

	@Override
	public void freezeMyStoreDz(Integer id) {
		storeDzCheckMapper.freezeByPrimaryKey(id);
		
	}

	@Override
	public void passBatchMyStoreDz(List<Integer> ids) {
		storeDzCheckMapper.passBatchMyStoreDz(ids);
		
	}

	@Override
	public void passMyStoreDz(Integer id) {
		storeDzCheckMapper.passByPrimaryKey(id);
		
	}
}
