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
import com.ally.manager.pojo.my.MyTStoreDz;
import com.ally.manager.service.BackPageStoreDzService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageStoreDzController {
	@Resource
	private BackPageStoreDzService backPageStoreDzService;
	
	//分页查询分销商-店主
	@RequestMapping(value="MyStoreDzPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyStoreDzPage(Integer page,Integer rows) {
		PageResult result = backPageStoreDzService.getMyStoreDz(page, rows);
		return result;
	}
	
	//查询根据条件查询分销商-店主信息
	@RequestMapping(value="selectMyStoreDz",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMyStoreDz(String username) {
		System.out.println(username);
		List<MyTStoreDz> list = backPageStoreDzService.selectMyStoreDz(username);
		if(list == null || list.size() == 0) {
		return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//删除分销商-店主信息
	@RequestMapping(value="deleteMyStoreDz",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteMyStoreDz(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageStoreDzService.deleteBatchMyStoreDz(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageStoreDzService.deleteMyStoreDz(id);
		}
		
		return MSG.success();
	}		
	
	//修改分销商-店主信息
	@RequestMapping(value="updateStoreDz",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateStoreDz(MyTStoreDz myTStoreDz) {
		myTStoreDz.setUpdateTime(new Date());
		//admin.setRegisterTime(new Date());
		int i = backPageStoreDzService.updateMyTStoreDz(myTStoreDz);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
}
