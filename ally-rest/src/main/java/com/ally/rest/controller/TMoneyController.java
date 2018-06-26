package com.ally.rest.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.Msg;
import com.ally.rest.po.TMoney;
import com.ally.rest.po.TMoneyinfo;
import com.ally.rest.service.TMoneyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class TMoneyController {

	@Autowired
	TMoneyService tMoneyService;
	//显示余额
	@RequestMapping(value="/getMoney/{id}",method=RequestMethod.POST)
	@ResponseBody
	public Msg getMoney(@PathVariable("id")Integer id,HttpServletResponse response) throws Exception {
		allowCrossDomain(response);
		 List<TMoney> money =  tMoneyService.getMoney(id);
		return Msg.success().add("Money", money);
	}
	
	//充值
	@RequestMapping(value="/rechargeMoney",method=RequestMethod.POST)
	@ResponseBody
	public Msg rechargeMoney(Integer id,BigDecimal money,HttpServletResponse response) throws Exception{
		allowCrossDomain(response);
		System.out.println(id+":"+money);
		int i = tMoneyService.rechargeMoney(id, money);
		if(i>0) {
			return Msg.success();
		}else {
			return Msg.flia();
		}
	}
	
	//提现
	@RequestMapping(value="/withdrawMoney",method=RequestMethod.POST)
	@ResponseBody
	public Msg withdrawMoney(Integer id,BigDecimal money,HttpServletResponse response) throws Exception{
		allowCrossDomain(response);
		System.out.println(id+":"+money);
		int i = tMoneyService.withdrawMoney(id, money);
		if(i>0) {
			return Msg.success();
		}else {
			return Msg.flia();
		}
	}
	
	//充值记录
	@RequestMapping(value="/rechargeRecord",method=RequestMethod.GET)
	@ResponseBody
	public Msg rechargeRecord(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="userid")Integer userid,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			System.out.println("充值记录"+userid);
			List<TMoneyinfo> moneyinfos = tMoneyService.rechargeRecord(userid);
			PageInfo page = new PageInfo(moneyinfos,5);
			return Msg.success().add("pageInfo",page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia().add("failStr","获取数据失败");
		}

	}

	//提现记录
	@RequestMapping(value="/withDrawrechargeRecord",method=RequestMethod.GET)
	@ResponseBody
	public Msg withDrawRechargeRecord(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="userid")Integer userid,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			System.out.println("充值记录"+userid);
			List<TMoneyinfo> moneyinfos = tMoneyService.withdrawRecord(userid);
			PageInfo page = new PageInfo(moneyinfos,5);
			return Msg.success().add("pageInfo",page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia().add("failStr","获取数据失败");
		}

	}

	//查询充值记录
	@RequestMapping(value="/select_rechargeRecordByNumber",method=RequestMethod.GET)
	@ResponseBody
	public Msg selectRrechargeRecordByNumber(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="number")String number,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			List<TMoneyinfo> moneyinfos = tMoneyService.selectRrechargeRecordByNumber(number);
			PageInfo page = new PageInfo(moneyinfos,5);
			return Msg.success().add("pageInfo",page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia().add("failStr","获取数据失败");
		}

	}

	//查询充值记录
	@RequestMapping(value="/select_withdrawRecordByNumber",method=RequestMethod.GET)
	@ResponseBody
	public Msg selectwithdrawRecordByNumber(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="number")String number,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			PageHelper.startPage(pn, 7);
			List<TMoneyinfo> moneyinfos = tMoneyService.selectRrechargeRecordByNumber(number);
			PageInfo page = new PageInfo(moneyinfos,5);
			return Msg.success().add("pageInfo",page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia().add("failStr","获取数据失败");
		}

	}	
	
	
	public void allowCrossDomain(HttpServletResponse response) {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}
}
