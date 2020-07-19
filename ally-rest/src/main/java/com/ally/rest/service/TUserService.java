package com.ally.rest.service;

import com.ally.rest.po.TUser;

/**
 * 用户数据的服务层接口
 * @author Administrator
 *
 */
public interface TUserService {

	/**
	 * 根据id获取用户数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TUser getUser(Integer id) throws Exception;

}
