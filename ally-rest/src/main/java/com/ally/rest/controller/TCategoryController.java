package com.ally.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.CateResult;
import com.ally.rest.po.Msg;
import com.ally.rest.po.TCategory;
import com.ally.rest.service.TCategoryService;

/**
 * 分类数据控制层
 * @author Administrator
 *
 */
@Controller
public class TCategoryController {
	@Autowired
	TCategoryService categoryService;
	

	
	/**
	 * 获取一级分类列表数据，以json格式返回
	 * @param callback
	 * @return
	 */
	@RequestMapping("/itemcat/list")
	@ResponseBody
	public Object getItemCatList(String callback) {
		CateResult catResult = categoryService.getItemCatList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	/**
	 * 获取二级分类列表数据，以json格式返回
	 * @param callback
	 * @return
	 */
	@RequestMapping("/itemfcate/list")
	@ResponseBody
	public Object getItemFCatList(String callback) {
		CateResult catResult = categoryService.getItemFCatList();
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	
	/**
	 * 根据父id获取分类数据
	 * @param callback
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/itemscate/list/{parentId}")
	@ResponseBody
	public Object getItemSCatList(String callback,@PathVariable("parentId")int parentId) {
		CateResult catResult = categoryService.getItemSCatList(parentId);
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(catResult);
		mappingJacksonValue.setJsonpFunction(callback);
		return mappingJacksonValue;
	}
	
	/**
	 * 根据id主键获取数据
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping("/getCate/{id}")
	@ResponseBody
	public Msg getCategory(@PathVariable("id")Integer id,HttpServletResponse response) {
		//设置跨域
		allowCrossDomain(response);
		try {
			TCategory category = categoryService.getCategory(id);
			return Msg.success().add("category", category);
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
