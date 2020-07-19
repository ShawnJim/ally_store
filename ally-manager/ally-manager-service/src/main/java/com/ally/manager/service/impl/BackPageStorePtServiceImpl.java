package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTStorePtMapper;
import com.ally.manager.pojo.my.MyTStorePt;
import com.ally.manager.service.BackPageStorePtService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageStorePtServiceImpl implements BackPageStorePtService{
	@Autowired
	private MyTStorePtMapper storePtMapper;//分销商-平台mapper
	
	@Override
	public PageResult getMyStorePt(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTStorePt> list = storePtMapper.selectMyStorePt();
		//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTStorePt> pageInfo = new PageInfo<>(list);
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
	public List<MyTStorePt> selectMyStorePt(String wwwName) {
		return storePtMapper.selectMyStorePtUserName(wwwName);
	}

	@Override
	public void deleteMyStorePt(int id) {
		storePtMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void deleteBatchMyStorePt(List<Integer> ids) {
		storePtMapper.deleteBatchMyStorePt(ids);
		
	}

	@Override
	public int updateMyTStorePt(MyTStorePt myTStorePt) {
		return storePtMapper.updateMyTStorePt(myTStorePt);
	}
}
