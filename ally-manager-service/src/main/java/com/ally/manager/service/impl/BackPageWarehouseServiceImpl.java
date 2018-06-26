package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.TWarehouseMapper;
import com.ally.manager.mapper.my.MyTWarehouseMapper;
import com.ally.manager.pojo.TWarehouse;
import com.ally.manager.pojo.TWarehouseExample;
import com.ally.manager.pojo.my.MyTWarehouse;
import com.ally.manager.service.BackPageWarehouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageWarehouseServiceImpl implements BackPageWarehouseService{
	@Autowired
	private MyTWarehouseMapper myTWarehouseMapper;//仓库mapper
	
	@Override
	public PageResult getTWarehouseList(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<MyTWarehouse> list = myTWarehouseMapper.selectMysWarehouse();
		//创建一个返回值对象
		PageResult result = new PageResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<MyTWarehouse> pageInfo = new PageInfo<>(list);
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

/*	@Override
	public List<TWarehouse> selectTWarehouse(String name) {
		TWarehouseExample example = new TWarehouseExample();
		TWarehouseExample.Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		return tWarehouseMapper.selectByExample(example);
	}

	@Override
	public int updateTWarehouse(TWarehouse warehouse) {
		TWarehouseExample example = new TWarehouseExample();
		TWarehouseExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(warehouse.getId());
		TWarehouse result = tWarehouseMapper.selectByPrimaryKey(warehouse.getId());
		warehouse.setRegistertime(result.getRegistertime());
		int i = tWarehouseMapper.updateByPrimaryKey(warehouse);
		return i;
	}

	@Override
	public void deleteBatchTWarehouse(List<Integer> ids) {
		TWarehouseExample example = new TWarehouseExample();
		TWarehouseExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		tWarehouseMapper.deleteByExample(example);
		
	}

	@Override
	public void deleteTWarehouse(Integer id) {
		tWarehouseMapper.deleteByPrimaryKey(id);
		
	}	*/
}
