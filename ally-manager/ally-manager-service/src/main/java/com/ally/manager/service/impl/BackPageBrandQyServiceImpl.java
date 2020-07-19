package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTBrandQyMapper;
import com.ally.manager.pojo.my.MyTBrandQy;
import com.ally.manager.service.BackPageBrandQyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageBrandQyServiceImpl implements BackPageBrandQyService{

	@Autowired
	private MyTBrandQyMapper brandQyMapper;//企业mapper
	@Override
	public PageResult getMyBrandQy(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTBrandQy> list = brandQyMapper.selectMyBrandQy();
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTBrandQy> pageInfo = new PageInfo<>(list);
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
	public List<MyTBrandQy> selectMyBrandQy(String companyName) {
		return brandQyMapper.selectMyBrandQyUserName(companyName);
	}

	@Override
	public void deleteMyBrandQy(int id) {
		brandQyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatchMyBrandQy(List<Integer> ids) {
		brandQyMapper.deleteBatchMyBrandQy(ids);
	}

	@Override
	public int updateMyTBrandQy(MyTBrandQy myTBrandQy) {
		return brandQyMapper.updateMyTBrandQy(myTBrandQy);
	}
}
