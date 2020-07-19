package com.ally.rest.service;

import java.util.List;

import com.ally.rest.po.TWarehouse;

/**
 * 仓库数据表的服务层接口
 * @author Administrator
 *
 */
public interface TWarehouseService {

	
	/**
	 * 根据传入的userid获取用户的仓库数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<TWarehouse> getWarehouseByUserid(Integer id)throws Exception;

	/**
	 * 根据传入的主键获取仓库数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TWarehouse getWarehouseById(Integer id) throws Exception;

}
