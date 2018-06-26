package com.ally.rest.service;

import com.ally.rest.po.TcategoryVO;

/**
 * 获取分类下的商品数据
 * @author Administrator
 *
 */
public interface TCategoryVOService {

	/**
	 * 根据传入的分类id获取商品数据
	 * @param id
	 * @return
	 */
	TcategoryVO getScateProducts(Integer id) throws Exception;

}
