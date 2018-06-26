package com.ally.manager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTBrandPpCheck;
import com.ally.manager.service.BackPageBrandPpCheckService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageBrandPpCheckController {
	@Resource
	private BackPageBrandPpCheckService backPageBrandPpCheckService;
	
	//分页查询品牌商-品牌审核信息
	@RequestMapping(value="MyBrandPpCheckPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyBrandPpCheckPage(Integer page,Integer rows) {
		PageResult result = backPageBrandPpCheckService.getMyBrandPpCheck(page, rows);
		return result;
	}
	
	//分页查询品牌商-品牌审核信息-状态
	@RequestMapping(value="MyBrandPpCheckPageState",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyBrandPpCheckPageState(Integer page,Integer rows,String states) {
		int state = Integer.parseInt(states);
		System.out.println(state);
		PageResult result = backPageBrandPpCheckService.getMyBrandPpCheckState(page, rows,state);
		return result;
	}
	
	//查询根据条件查询品牌商-品牌审核信息
	@RequestMapping(value="selectMyBrandPpCheck",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMyBrandPpCheck(String username) {
		System.out.println(username);
		 List<MyTBrandPpCheck> list = backPageBrandPpCheckService.selectMyBrandPpCheck(username);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//冻结品牌商-品牌信息
	@RequestMapping(value="freezeMyBrandPp",method=RequestMethod.POST)
	@ResponseBody
	public MSG freezeMyBrandPp(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageBrandPpCheckService.freezeBatchMyBrandPp(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageBrandPpCheckService.freezeMyBrandPp(id);
		}
		
		return MSG.success();
	}
	
	//通过品牌商-品牌信息
	@RequestMapping(value="passMyBrandPp",method=RequestMethod.POST)
	@ResponseBody
	public MSG passMyBrandPp(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageBrandPpCheckService.passBatchMyBrandPp(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageBrandPpCheckService.passMyBrandPp(id);
		}
		
		return MSG.success();
	}		
}
