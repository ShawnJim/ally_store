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
import com.ally.manager.pojo.TCategory;
import com.ally.manager.service.BackPageCategoryService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageCategoryController {
	@Resource
	private BackPageCategoryService backPageCategoryService;
	
	//分页查询分类信息
	@RequestMapping(value="categoryPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTCategoryList(Integer page,Integer rows) {
		PageResult result = backPageCategoryService.getTCategoryList(page, rows);
		return result;
	}
	
	//根据分类名称查询分类信息
	@RequestMapping(value="selectCategory",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectCategory(String name) {
		System.out.println(name);
		 List<TCategory> list = backPageCategoryService.selectCategory(name);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//增加分类
	@RequestMapping(value="insertCategory",method=RequestMethod.POST)
	@ResponseBody
	public MSG insertCategory(TCategory category){
		category.setRegisterTime(new Date());
		category.setUpdateTime(new Date());
		int i = backPageCategoryService.insertCategory(category);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
		
	}
	
	//修改分类
	@RequestMapping(value="updateCategory",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateAdmin(TCategory category) {
		category.setUpdateTime(new Date());
		//admin.setRegisterTime(new Date());
		int i = backPageCategoryService.updateTCategory(category);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
	
	//删除分类
	@RequestMapping(value="deleteCategory",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteCategory(String ids) {
		
		System.out.println("delete"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			backPageCategoryService.deleteBatchTCategory(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageCategoryService.deleteTCategory(id);
		}
		
		return MSG.success();
	}
}
