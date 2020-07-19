package com.ally.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.Msg;
import com.ally.rest.po.TcategoryVO;
import com.ally.rest.service.TCategoryVOService;

@Controller
public class TCategoryVOController {

	@Autowired
	TCategoryVOService tCategoryVOService;
	
	@RequestMapping("/get_scate_products")
	@ResponseBody
	public Msg getScateProducts(Integer id,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			TcategoryVO tcategoryVO = tCategoryVOService.getScateProducts(id);
			return Msg.success().add("scate_products", tcategoryVO);
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
