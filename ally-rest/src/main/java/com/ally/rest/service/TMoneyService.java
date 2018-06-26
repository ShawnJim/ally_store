package com.ally.rest.service;

import java.math.BigDecimal;
import java.util.List;

import com.ally.rest.po.TMoney;
import com.ally.rest.po.TMoneyinfo;

public interface TMoneyService {
	//获取钱包余额
	List<TMoney> getMoney(Integer id) throws Exception;
	
	//充值
	int rechargeMoney(Integer id,BigDecimal money);

	//提现
	int withdrawMoney(Integer id, BigDecimal money);
	
	//充值记录
	List<TMoneyinfo> rechargeRecord(Integer id);
	
	//提现记录
	List<TMoneyinfo> withdrawRecord(Integer id);
	
	//根据number查询充值记录
	List<TMoneyinfo> selectRrechargeRecordByNumber(String number);
}
