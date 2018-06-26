package com.ally.rest.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.Msg;
import com.ally.rest.po.TOrder;
import com.ally.rest.po.TOrderVO;
import com.ally.rest.service.TOrderService;
import com.ally.common.utils.IDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 订单表控制层
 * @author Administrator
 *
 */
@Controller
public class TOrderController {

	@Autowired
	TOrderService tOrderService;

	/**
	 * 根据传入的order添加订单
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/add_order")
	@ResponseBody
	public Msg addOrder(TOrder order,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		//设置创建时间
		Date d = new Date();
		order.setCreationtime(d);
		//设置订单表id
		long l = IDUtils.genItemId();
		String id = Long.toString(l);
		order.setOrderuuid(id);
		System.out.println(order);
		try {
			tOrderService.addOrder(order);
			return Msg.success().add("orderID", id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}

	/**
	 * 根据传入的orderid获取订单数据
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/get_order")
	@ResponseBody
	public Msg getOrderByOrderId(@RequestParam(value="pn",defaultValue="1")Integer pn,String oid,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		try {
			TOrderVO orderVO = tOrderService.getOrderByOrderId(oid);
			return Msg.success().add("orderVO", orderVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}

	/**
	 * 根据传入的order修改订单
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/update_order")
	@ResponseBody
	public Msg updateOrder(TOrder order,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		//设置支付时间
		if(order.getOrderstatus()==0) {
		Date paytime = new Date();
		order.setPaytime(paytime);
		}
		try {
			tOrderService.updateOrder(order);
			return Msg.success();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}


	}
	
	/**
	 * 根据传入的sto获取订单
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/get_orderByStoid")
	@ResponseBody
	public Msg getOrderByStoid(@RequestParam(value="pn",defaultValue="1")Integer pn,TOrder order,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			List<TOrderVO> orderVOs = tOrderService.getOrderByStoid(order.getStoid());
			PageInfo page = new PageInfo(orderVOs,5);
			return Msg.success().add("pageInfo", page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}
	
	/**
	 * 根据传入的品牌商ID获取订单
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/get_orderByBraid")
	@ResponseBody
	public Msg get_orderByBraid(@RequestParam(value="pn",defaultValue="1")Integer pn,TOrder order,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			List<TOrderVO> orderVOs = tOrderService.getOrderByBraid(order.getBraid());
			PageInfo page = new PageInfo(orderVOs,5);
			return Msg.success().add("pageInfo", page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}
	
	/**
	 * 根据传入的stoid和订单状态获取订单
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/get_orderByStoidandOrderStatus")
	@ResponseBody
	public Msg getOrderByStoidandOrderStatus(@RequestParam(value="pn",defaultValue="1")Integer pn,TOrder order,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			List<TOrderVO> orderVOs = tOrderService.getOrderByStoidandOrderStatus(order);
			PageInfo page = new PageInfo(orderVOs,5);
			return Msg.success().add("pageInfo", page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}
	
	/**
	 * 根据传入的订单获取订单
	 * @param order
	 * @param response
	 * @return
	 */
	@RequestMapping("/delete_order")
	@ResponseBody
	public Msg deleteOrder(TOrder order,HttpServletResponse response) {
		//允许跨域
		allowCrossDomain(response);
		try {
			tOrderService.deleteOrder(order.getOrderuuid());
			return Msg.success();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}


	
	
	public void allowCrossDomain(HttpServletResponse response) {
		//允许跨域及设置编码
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}

}
