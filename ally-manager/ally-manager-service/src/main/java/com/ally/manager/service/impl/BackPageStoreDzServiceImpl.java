package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTStoreDzMapper;
import com.ally.manager.pojo.my.MyTStoreDz;
import com.ally.manager.service.BackPageStoreDzService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageStoreDzServiceImpl implements BackPageStoreDzService{
	@Autowired
	private MyTStoreDzMapper storeDzMapper;//分销商-店主mapper
	
	@Override
	public PageResult getMyStoreDz(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTStoreDz> list = storeDzMapper.selectMyStoreDz();
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTStoreDz> pageInfo = new PageInfo<>(list);
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
	public List<MyTStoreDz> selectMyStoreDz(String username) {
		return storeDzMapper.selectMyStoreDzUserName(username);
	}

	@Override
	public void deleteMyStoreDz(int id) {
		storeDzMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void deleteBatchMyStoreDz(List<Integer> ids) {
		storeDzMapper.deleteBatchMyStoreDz(ids);
		
	}

	@Override
	public int updateMyTStoreDz(MyTStoreDz myTStoreDz) {
		return storeDzMapper.updateMyTStoreDz(myTStoreDz);
	}
}
