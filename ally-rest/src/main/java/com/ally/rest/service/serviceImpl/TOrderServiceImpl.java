package com.ally.rest.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.rest.mapper.TOrderMapper;
import com.ally.rest.mapper.TOrderVOMapper;
import com.ally.rest.po.TOrder;
import com.ally.rest.po.TOrderExample;
import com.ally.rest.po.TOrderExample.Criteria;
import com.ally.rest.po.TOrderVO;
import com.ally.rest.service.TOrderService;

/**
 * 订单表service层接口实现类
 * @author Administrator
 *
 */
@Service
public class TOrderServiceImpl implements TOrderService {
	
	@Autowired
	TOrderMapper tOrderMapper;
 
	@Autowired
	TOrderVOMapper orderVOMapper;
	
	@Override
	public void addOrder(TOrder order) throws Exception {
		// TODO Auto-generated method stub
		tOrderMapper.insertSelective(order);
	}

	@Override
	public TOrderVO getOrderByOrderId(String oid) throws Exception {
		// TODO Auto-generated method stub
		return orderVOMapper.orderByOrderid(oid);
	}

	@Override
	public void updateOrder(TOrder order)  throws Exception{
		// TODO Auto-generated method stub
		TOrderExample example = new TOrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderuuidEqualTo(order.getOrderuuid());
		tOrderMapper.updateByExampleSelective(order, example);
	}

	@Override
	public List<TOrderVO> getOrderByStoid(Integer stoid) throws Exception {
		// TODO Auto-generated method stub
		return orderVOMapper.orderByStoid(stoid);
	}

	@Override
	public void deleteOrder(String orderuuid) throws Exception{
		// TODO Auto-generated method stub
		TOrderExample example = new TOrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrderuuidEqualTo(orderuuid);
		tOrderMapper.deleteByExample(example);
	}

	@Override
	public List<TOrderVO> getOrderByStoidandOrderStatus(TOrder order) throws Exception{
		// TODO Auto-generated method stub
		return orderVOMapper.orderByStoidandOrderStatus(order.getStoid(),order.getOrderstatus());
	}

	@Override
	public List<TOrderVO> getOrderByBraid(Integer braid) throws Exception{
		// TODO Auto-generated method stub
		return orderVOMapper.orderByBraid(braid);
	}



}
