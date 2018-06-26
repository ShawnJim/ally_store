package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTBrandPpMapper;
import com.ally.manager.pojo.my.MyTBrandPp;
import com.ally.manager.service.BackPageBrandPpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageBrandPpServiceImpl implements BackPageBrandPpService{
	
	@Autowired
	private MyTBrandPpMapper brandPpMapper;//品牌商mapper
	
	@Override
	public PageResult getMyBrandPp(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTBrandPp> list = brandPpMapper.selectMyBrandPp();
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTBrandPp> pageInfo = new PageInfo<>(list);
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
	public List<MyTBrandPp> selectMyBrandPp(String username) {
		return brandPpMapper.selectMyBrandPpUserName(username);
	}

	@Override
	public void deleteMyBrandPp(int id) {
		brandPpMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void deleteBatchMyBrandPp(List<Integer> ids) {
		brandPpMapper.deleteBatchMyBrandPp(ids);
		
	}

	@Override
	public int updateMyTBrandPp(MyTBrandPp myTBrandPp) {
		return brandPpMapper.updateMyTBrandPp(myTBrandPp);
	}
}
