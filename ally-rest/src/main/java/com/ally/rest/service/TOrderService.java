package com.ally.rest.service;

import java.util.List;

import com.ally.rest.po.TOrder;
import com.ally.rest.po.TOrderVO;

/**
 * 订单表service层接口
 * @author Administrator
 *
 */
public interface TOrderService {

	
	/**
	 * 传入order 进行订单数据添加
	 * @param order
	 * @return
	 * @throws Exception 
	 */
	void addOrder(TOrder order) throws Exception;

	/**
	 * 根据传入的orderid进行订单查询
	 * @param oid
	 * @return
	 */
	TOrderVO getOrderByOrderId(String oid) throws Exception;

	
	/**
	 * 传入order 进行订单数据修改
	 * @param order
	 * @return
	 * @throws Exception 
	 */
	void updateOrder(TOrder order) throws Exception;

	/**
	 * 传入stoid 进行订单数据查询
	 * @param order
	 * @return
	 * @throws Exception 
	 */
	List<TOrderVO> getOrderByStoid(Integer stoid) throws Exception;

	/**
	 * 传入订单id 进行订单数据删除
	 * @param order
	 * @return
	 * @throws Exception 
	 */
	void deleteOrder(String orderuuid) throws Exception;

	/**
	 * 传入stoid 和订单状态进行订单数据查询
	 * @param order
	 * @return
	 * @throws Exception 
	 */
	List<TOrderVO> getOrderByStoidandOrderStatus(TOrder order) throws Exception;

	/**
	 * 传入braid 进行订单数据查询
	 * @param order
	 * @return
	 * @throws Exception 
	 */
	List<TOrderVO> getOrderByBraid(Integer braid) throws Exception;


}
