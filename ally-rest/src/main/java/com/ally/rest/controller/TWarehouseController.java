package com.ally.rest.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.Msg;
import com.ally.rest.po.TWarehouse;
import com.ally.rest.service.TWarehouseService;

/**
 * 仓库数据表的控制层
 * @author Administrator
 *
 */
@Controller
public class TWarehouseController {

	@Autowired
	TWarehouseService tWarehouseService;
	
	/**
	 * 通过userid获取仓库数据
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/getWarehouse/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getWarehouseByUserid(@PathVariable("id")Integer id,HttpServletResponse response) {
		//设置回传编码
		allowCrossDomain(response);
		try {
			List<TWarehouse> warehouses = tWarehouseService.getWarehouseByUserid(id);
			return Msg.success().add("warehouses", warehouses);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
		
	}
	
	/**
	 * 根据仓库主键获取仓库数据
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/getWarehouseById/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getWarehouseById(@PathVariable("id")Integer id,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			TWarehouse warehouse = tWarehouseService.getWarehouseById(id);
			return Msg.success().add("warehouse", warehouse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}
	
	
	public void allowCrossDomain(HttpServletResponse response) {
		//设置回传编码,并且允许跨域
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}
}
