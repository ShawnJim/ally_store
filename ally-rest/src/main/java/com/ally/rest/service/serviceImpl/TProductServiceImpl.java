package com.ally.rest.service.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.rest.mapper.TProductMapper;
import com.ally.rest.po.AddProResult;
import com.ally.rest.po.TProduct;
import com.ally.rest.po.TProductExample;
import com.ally.rest.po.TProductExample.Criteria;
import com.ally.rest.service.TProductService;

/**
 * 商品数据接口实现类
 * @author Administrator
 *
 */
@Service
public class TProductServiceImpl implements TProductService {
	
	@Autowired
	TProductMapper tproductMapper;
	

	@Override
	public AddProResult addProduct(TProduct product) throws Exception {
		// TODO Auto-generated method stub
		int i = tproductMapper.insertSelective(product);
		AddProResult addProResult = new AddProResult();
		if(i==1) {
			addProResult.setCode("200");
			addProResult.setStrResult("录入成功");
		}else {
			addProResult.setCode("400");
			addProResult.setStrResult("录入失败");
		}
		return addProResult;
	}

	@Override
	public List<TProduct> getBraProducts(Integer userid) throws Exception{
		TProductExample example = new TProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		List<TProduct> products = tproductMapper.selectByExample(example);
		return products;
	}

	@Override
	public void deleteEmp(List<String> list) throws Exception{
		// TODO Auto-generated method stub
		TProductExample example = new TProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(list);
		tproductMapper.deleteByExample(example);
		
	}

	@Override
	public void deleteEmp(String proIds) throws Exception{
		// TODO Auto-generated method stub
		tproductMapper.deleteByPrimaryKey(proIds);
	}

	@Override
	public List<TProduct> getBraConditionPros(Integer userid, TProduct product, Date startTime, Date endTime) throws Exception{
		// TODO Auto-generated method stub
		TProductExample example = new TProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userid);
		Integer skustatus = product.getSkuStatus();
		String proName = product.getName();
		String proId = product.getId();
		if(skustatus!=null)
			criteria.andSkuStatusEqualTo(skustatus);
		if(proName!=null)
			criteria.andNameEqualTo(proName);
		if(proId!=null)
			criteria.andIdEqualTo(proId);
		criteria.andShelftimeBetween(startTime, endTime);
		List<TProduct> products = tproductMapper.selectByExample(example);
		return products;
	}

	@Override
	public TProduct  getProduct(String id) throws Exception {
		// TODO Auto-generated method stub
		TProduct product = tproductMapper.selectByPrimaryKey(id);
		return product;
	}

	@Override
	public void updateProduct(TProduct product) throws Exception {
		// TODO Auto-generated method stub
		tproductMapper.updateByPrimaryKeySelective(product);
	}



}
