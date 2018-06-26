package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTMoneyDetailMapper;
import com.ally.manager.pojo.my.MyTMoneyDetail;
import com.ally.manager.service.BackPageMoneyDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageMoneyDetailServiceImpl implements BackPageMoneyDetailService{
	@Autowired
	private MyTMoneyDetailMapper myTMoneyDetailMapper;//用户钱包mapper
	
	@Override
	public PageResult getTMoneyDetailList(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTMoneyDetail> list = myTMoneyDetailMapper.selectMyMoneyDetail();
		for (MyTMoneyDetail myTMoneyDetail : list) {
			System.out.println(myTMoneyDetail);
		}
		//创建一个返回值对象
		PageResult result = new PageResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<MyTMoneyDetail> pageInfo = new PageInfo<>(list);
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


}
