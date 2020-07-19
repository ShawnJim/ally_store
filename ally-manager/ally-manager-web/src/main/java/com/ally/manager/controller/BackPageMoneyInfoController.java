package com.ally.manager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTMoneyInfo;
import com.ally.manager.service.BackPageMoneyInfoService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageMoneyInfoController {
	@Resource
	private BackPageMoneyInfoService backPageMoneyInfoService;
	
	//分页查询钱包信息
	@RequestMapping(value="moneyInfoPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTMoneyInfoList(Integer page,Integer rows,String types) {
		
		int type = Integer.parseInt(types);
		System.out.println("type:"+type);
		PageResult result = backPageMoneyInfoService.getTMoneyInfoList(page, rows,type);
		return result;
	}
	
	//分页查询钱包信息-点击审核状态事件
	@RequestMapping(value="moneyInfoPageState",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTMoneyInfoStateList(Integer page,Integer rows,String states,String types) {
		int type = Integer.parseInt(types);
		System.out.println("type:"+type+"  states:"+states);
		int state = Integer.parseInt(states);
		PageResult result = backPageMoneyInfoService.getTMoneyInfoStateList(page, rows, type, state);
		return result;
	}
	
	//冻结钱包信息
	@RequestMapping(value="freezeMoneyInfo",method=RequestMethod.POST)
	@ResponseBody
	public MSG freezeMoney(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(string);
			}
			backPageMoneyInfoService.freezeBatchMoneyInfo(del_ids);
		}else {
			backPageMoneyInfoService.freezeMoneyInfo(ids);
		}
		
		return MSG.success();
	}
	
	//通过钱包信息
	@RequestMapping(value="passMoneyInfo",method=RequestMethod.POST)
	@ResponseBody
	public MSG passMoney(String ids,Integer type) {
		System.out.println("=====pass:"+ids+"type:"+type);
		if(ids.contains("-")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(string);
			}
			backPageMoneyInfoService.passBatchMoneyInfo(del_ids,type);
		}else {
			backPageMoneyInfoService.passMoneyInfo(ids,type);
		}
		
		return MSG.success();
	}
	
	//根据条件查询钱包充值信息
	@RequestMapping(value="selectMoneys",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMoneys(String number,String types) {
		int type = Integer.parseInt(types);
		 List<MyTMoneyInfo> list = backPageMoneyInfoService.selectMoneys(number,type);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
}
