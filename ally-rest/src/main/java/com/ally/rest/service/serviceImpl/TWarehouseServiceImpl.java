package com.ally.rest.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.rest.mapper.TWarehouseMapper;
import com.ally.rest.po.TWarehouse;
import com.ally.rest.po.TWarehouseExample;
import com.ally.rest.po.TWarehouseExample.Criteria;
import com.ally.rest.service.TWarehouseService;

/**
 * 仓库数据表的服务层接口实现类
 * @author Administrator
 *
 */
@Service
public class TWarehouseServiceImpl implements TWarehouseService {

	@Autowired
	TWarehouseMapper warehouseMapper;

	@Override
	public List<TWarehouse> getWarehouseByUserid(Integer id) throws Exception {
		// TODO Auto-generated method stub
		TWarehouseExample example = new TWarehouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		List<TWarehouse> warehouses = warehouseMapper.selectByExample(example);
		return warehouses;
	}

	@Override
	public TWarehouse getWarehouseById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		TWarehouse warehouse = warehouseMapper.selectByPrimaryKey(id);
		return warehouse;
	}
}
