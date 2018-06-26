package com.ally.rest.service;

import java.util.Date;
import java.util.List;

import com.ally.rest.po.AddProResult;
import com.ally.rest.po.TProduct;

/**
 * 商品数据服务层接口
 * @author Administrator
 *
 */
public interface TProductService {
	
	/**
	 * 添加商品的方法 根据product类进行增加
	 * @param product
	 * @return
	 * @throws Exception
	 */
	AddProResult addProduct(TProduct product) throws Exception;

	/**
	 * 品牌商根 据品牌商id获取商品数据的方法
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	List<TProduct> getBraProducts(Integer userid) throws Exception;

	
	/**
	 * 批量删除品牌商商品 根据list集合进行删除
	 * @param list
	 * @throws Exception
	 */
	void deleteEmp(List<String> list) throws Exception;
	
	/**
	 * 删除单个品牌商商品 根据传入的String类型id 进行删除
	 * @param proIds
	 */
	void deleteEmp(String proIds) throws Exception;

	/**
	 * 条件搜索商品数据的方法
	 * @param userid
	 * @param product
	 * @param startTime
	 * @param endTime
	 * @return
	 * @throws Exception 
	 */
	List<TProduct> getBraConditionPros(Integer userid, TProduct product, Date startTime, Date endTime) throws Exception;

	

	/**
	 * 根据id获取商品数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TProduct getProduct(String id) throws Exception;

	
	/**
	 * 传入Tproduct 进行商品数据的修改
	 * @param product 
	 * @throws Exception
	 */
	void updateProduct(TProduct product) throws Exception;
	
	
}
