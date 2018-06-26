package com.ally.manager.service.utils;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ally.manager.mapper.my.MyTMoneyDetailMapper;
import com.ally.manager.mapper.my.MyTMoneyInfoMapper;
import com.ally.manager.pojo.my.MyTMoneyDetail;
import com.ally.manager.pojo.my.MyTMoneyInfo;

public class  MoneyUtil {
	
	@Autowired
	private MyTMoneyInfoMapper myTMoneyInfoMapper;//钱包审核mapper
	
	@Autowired
	private MyTMoneyDetailMapper myTMoneyDetailMapper;//钱包详情
	
	public boolean RechargeMoney(String id) {
			 System.out.println("单个加钱操作:"+id);
			 //先查询充值金额和钱包id
			 List<MyTMoneyInfo> listInfo =  myTMoneyInfoMapper.selectMoneys(id, 1);//id:当前通过的编号 1:充值
			 for (MyTMoneyInfo myTMoneyInfo : listInfo) {
				 
				 BigDecimal moneyNew = myTMoneyInfo.getMoney();
				 
				 Integer  moneyId = myTMoneyInfo.getMoneyId();
				 
				 System.out.println("充值的金额:"+moneyNew+"钱包id:"+moneyId);
				 
				 //获取到钱包里的金额和钱包id
				 List<MyTMoneyDetail> listDetail =  myTMoneyDetailMapper.selectNewMyMoneyDetail(moneyId);
				 for (MyTMoneyDetail myTMoneyDetail : listDetail) {
					 BigDecimal moneyOld = myTMoneyDetail.getTotalMoney();
					 
					 System.out.println("原来的余额:"+moneyOld);
					 
					 BigDecimal totalMoney = moneyNew.add(moneyOld);
					 
					 System.out.println("总金额:"+totalMoney);
					 //修改总金额
					 int j = myTMoneyDetailMapper.updateMyMoneyDetail(moneyId, totalMoney);
					 if(j>0) {
						 return true;
					 }
					 
				}
			}
			 
			 return false;

		}
}
