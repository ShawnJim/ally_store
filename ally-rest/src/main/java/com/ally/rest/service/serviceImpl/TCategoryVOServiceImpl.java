package com.ally.rest.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.rest.mapper.TCategoryVOMapper;
import com.ally.rest.po.TcategoryVO;
import com.ally.rest.service.TCategoryVOService;

@Service
public class TCategoryVOServiceImpl implements TCategoryVOService{
	
	@Autowired
	TCategoryVOMapper categoryVOMapper;

	@Override
	public TcategoryVO getScateProducts(Integer id) throws Exception {
		// TODO Auto-generated method stub
		TcategoryVO tcategoryVO = categoryVOMapper.listProductByScateid(id);
		return tcategoryVO;
	}

}
