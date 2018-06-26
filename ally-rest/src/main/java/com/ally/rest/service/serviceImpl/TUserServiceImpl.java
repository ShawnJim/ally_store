package com.ally.rest.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.rest.mapper.TUserMapper;
import com.ally.rest.po.TUser;
import com.ally.rest.service.TUserService;

/**
 * 用户数据的服务层接口实现类
 * @author Administrator
 *
 */
@Service
public class TUserServiceImpl implements TUserService {

	@Autowired
	TUserMapper tUserMapper;

	@Override
	public TUser getUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		TUser tUser = tUserMapper.selectByPrimaryKey(id);
		return tUser;
	}
}
