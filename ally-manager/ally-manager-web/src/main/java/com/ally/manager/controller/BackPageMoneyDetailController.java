package com.ally.manager.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.service.BackPageMoneyDetailService;

@Controller
@RequestMapping("/back")
public class BackPageMoneyDetailController {
	@Resource
	private BackPageMoneyDetailService backPageMoneyDetailService;
	
	//分页查询钱包信息
	@RequestMapping(value="moneyDetailPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTMoneyDetailList(Integer page,Integer rows) {
		
		PageResult result = backPageMoneyDetailService.getTMoneyDetailList(page, rows);
		return result;
	}		
}
