package com.ally.rest.service.serviceImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.utils.IDUtils;
import com.ally.rest.mapper.TMoneyMapper;
import com.ally.rest.mapper.TMoneyinfoMapper;
import com.ally.rest.po.TMoney;
import com.ally.rest.po.TMoneyExample;
import com.ally.rest.po.TMoneyExample.Criteria;
import com.ally.rest.po.TMoneyinfo;
import com.ally.rest.po.TMoneyinfoExample;
import com.ally.rest.service.TMoneyService;
@Service
public class TMoneyServiceImpl implements TMoneyService{

	@Autowired
	TMoneyMapper tMoneyMapper;
	
	@Autowired
	TMoneyinfoMapper tMoneyInfoMapper;
	
	//获取钱包余额
	@Override
	public List<TMoney> getMoney(Integer id) throws Exception {
		TMoneyExample example = new TMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		List<TMoney> money= tMoneyMapper.selectByExample(example);
		return money;
	}
	
	//充值
	@Override
	public int rechargeMoney(Integer id, BigDecimal money) {
		
		TMoneyinfo tMoneyinfo = new TMoneyinfo();
		
		TMoneyExample example = new TMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		List<TMoney> moneys= tMoneyMapper.selectByExample(example);
		for (TMoney tMoney : moneys) {
			tMoneyinfo.setMoneyid(tMoney.getId());//钱包id
			tMoneyinfo.setUserid(tMoney.getUserid());//userId
		}
		tMoneyinfo.setId(id);//订单id
		tMoneyinfo.setNumber(String.valueOf(IDUtils.genItemId()));//订单编号
		tMoneyinfo.setMoney(money);//充值金额
		tMoneyinfo.setTime(new Date());//充值时间
		tMoneyinfo.setType(1);//类型: 1:充值
		return tMoneyInfoMapper.insert(tMoneyinfo);
	}
	
	//提现
	@Override
	public int withdrawMoney(Integer id, BigDecimal money) {
		
		TMoneyinfo tMoneyinfo = new TMoneyinfo();
		
		TMoneyExample example = new TMoneyExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		List<TMoney> moneys= tMoneyMapper.selectByExample(example);
		for (TMoney tMoney : moneys) {
			tMoneyinfo.setMoneyid(tMoney.getId());//钱包id
			tMoneyinfo.setUserid(tMoney.getUserid());//userId
		}
		tMoneyinfo.setId(id);//订单id
		tMoneyinfo.setNumber(String.valueOf(IDUtils.genItemId()));//订单编号
		tMoneyinfo.setMoney(money);//充值金额
		tMoneyinfo.setTime(new Date());//充值时间
		tMoneyinfo.setType(2);//类型: 1:充值
		return tMoneyInfoMapper.insert(tMoneyinfo);
	}
	
	//充值记录
	@Override
	public List<TMoneyinfo> rechargeRecord(Integer id) {
		TMoneyinfoExample example = new TMoneyinfoExample();
		TMoneyinfoExample.Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		criteria.andTypeEqualTo(1);//充值
		return tMoneyInfoMapper.selectByExample(example);
	}
	
	//提现记录
	@Override
	public List<TMoneyinfo> withdrawRecord(Integer id) {
		TMoneyinfoExample example = new TMoneyinfoExample();
		TMoneyinfoExample.Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		criteria.andTypeEqualTo(2);//提现
		return tMoneyInfoMapper.selectByExample(example);
	}
	
	//根据number查询充值/提现记录
	@Override
	public List<TMoneyinfo> selectRrechargeRecordByNumber(String number) {
		// TODO Auto-generated method stub
		TMoneyinfoExample example = new TMoneyinfoExample();
		TMoneyinfoExample.Criteria criteria = example.createCriteria();
		criteria.andNumberEqualTo(number);
		return tMoneyInfoMapper.selectByExample(example);
	}
	
	

}
