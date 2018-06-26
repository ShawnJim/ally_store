package com.ally.manager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTStoreDzCheck;
import com.ally.manager.service.BackPageBrandDzCheckService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageStoreDzCheckController {
	@Resource
	private BackPageBrandDzCheckService backPageBrandDzCheckService;
	
	//分页查询品牌商-店主审核信息
	@RequestMapping(value="MyStoreDzCheckPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyStoreDzCheckPage(Integer page,Integer rows) {
		PageResult result = backPageBrandDzCheckService.getMyStoreDzCheck(page, rows);
		return result;
	}
	
	//分页查询品牌商-店主审核信息-状态
	@RequestMapping(value="MyStoreDzCheckPageState",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyStoreDzCheckPageState(Integer page,Integer rows,String states) {
		int state = Integer.parseInt(states);
		PageResult result = backPageBrandDzCheckService.getMyStoreDzCheckState(page, rows,state);
		return result;
	}
	
	//查询根据条件查询品牌商-店主审核信息
	@RequestMapping(value="selectMyStoreDzCheck",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMyStoreDzCheck(String username) {
		System.out.println(username);
		 List<MyTStoreDzCheck> list = backPageBrandDzCheckService.selectMyStoreDzCheck(username);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//冻结品牌商-店主信息
	@RequestMapping(value="freezeMyStoreDz",method=RequestMethod.POST)
	@ResponseBody
	public MSG freezeMyStoreDz(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageBrandDzCheckService.freezeBatchMyStoreDz(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageBrandDzCheckService.freezeMyStoreDz(id);
		}
		
		return MSG.success();
	}
	
	//通过品牌商-店主信息
	@RequestMapping(value="passMyStoreDz",method=RequestMethod.POST)
	@ResponseBody
	public MSG passMyStoreDz(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageBrandDzCheckService.passBatchMyStoreDz(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageBrandDzCheckService.passMyStoreDz(id);
		}
		
		return MSG.success();
	}
}
