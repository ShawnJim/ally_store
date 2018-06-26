package com.ally.manager.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTProduct;
import com.ally.manager.service.BackPageProductService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageProductController {
	@Resource
	private BackPageProductService backPageProductService;
	
	
	//分页查询产品信息
	@RequestMapping(value="productPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTProductList(Integer page,Integer rows) {
		PageResult result = backPageProductService.getTProductList(page, rows);
		return result;
	}

	//根据产品名称查询产品信息
	@RequestMapping(value="selectMyProduct",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMyProduct(String productName) {
		System.out.println(productName);
		 List<MyTProduct> list = backPageProductService.selectMyProduct(productName);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//修改产品信息
	@RequestMapping(value="updateProduct",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateProduct(MyTProduct myTProduct) {
		System.out.println("当前时间:"+new Date());
		myTProduct.setUpdateTime(new Date());
		// myTBrandPp.setRegisterTime(new Date());
		int i = backPageProductService.updateMyTProduct(myTProduct);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
	
	//删除产品信息
	@RequestMapping(value="deleteMyProduct",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteMyProduct(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				//del_ids.add(Integer.parseInt(string));
				del_ids.add(string);
			}
			backPageProductService.deleteBatchMyProduct(del_ids);
		}else {
			//Integer id = Integer.parseInt(ids);
			backPageProductService.deleteMyProduct(ids);
		}
		return MSG.success();
	}
	
}
