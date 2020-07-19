package com.ally.portal.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/sto_index")
	public String showStoIndex() {
		return "sto_index";
	}
	
	@RequestMapping("/pro_detail")
	public String showProDetail() {
		return "pro_detail";
	}
	
	@RequestMapping("/sto_personal")
	public String showStoPersonal() {
		return "sto_personal";
	}
	
	//钱包信息
	@RequestMapping("/sto_moneyInfo")
	public String showStMoneyInfo() {
		return "sto_moneyInfo";
	}
	//钱包充值
	@RequestMapping("/sto_moneyRecharge")
	public String showStMoneRechargey() {
		return "sto_moneyRecharge";
	}
	
	//钱包提现
	@RequestMapping("/sto_moneyWithdraw")
	public String showStMoneWithdraw() {
		return "sto_moneyWithdraw";
	}	

	//搜索详情
	@RequestMapping("/pro_search")
	public String showProSearch() {
		return "pro_search";
	}
	
	//充值记录
	@RequestMapping("/sto_rechargeRecord")
	public String showStoRechargeRecord() {
		return "sto_rechargeRecord";
	}

	//提现记录
	@RequestMapping("/sto_withdrawRecord")
	public String showStoWithdrawRechargeRecord() {
		return "sto_withdrawRecord";
	}

	//购买表单提交
	@RequestMapping("/sto_shopping_submit")
	public String showStoShoppingSubmit() {
		return "sto_shopping_submit";
	}

	//所有订单
	@RequestMapping("/sto_allOrder")
	public String showStoAllOrder() {
		return "sto_allOrder";
	}

	//待完成订单
	@RequestMapping("/sto_waitCompleteOrder")
	public String showStoWaitCompleteOrder() {
		return "sto_waitCompleteOrder";
	}

	//代付款订单
	@RequestMapping("/sto_waitpayforOrder")
	public String showStoWaitpayforOrder() {
		return "sto_waitpayforOrder";
	}

	//已完成订单
	@RequestMapping("/sto_CompleteOrder")
	public String showStoCompleteOrder() {
		return "sto_CompleteOrder";
	}
}
