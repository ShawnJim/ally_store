package com.ally.manager.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTMoneyDetailMapper;
import com.ally.manager.mapper.my.MyTMoneyInfoMapper;
import com.ally.manager.pojo.my.MyTMoneyDetail;
import com.ally.manager.pojo.my.MyTMoneyInfo;
import com.ally.manager.service.BackPageMoneyInfoService;
import com.ally.manager.service.utils.MoneyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageMoneyInfoServiceImpl implements BackPageMoneyInfoService{
	@Autowired
	private MyTMoneyInfoMapper myTMoneyInfoMapper;//钱包审核mapper
	
	@Autowired
	private MyTMoneyDetailMapper myTMoneyDetailMapper;//钱包详情
	
	@Override
	public PageResult getTMoneyInfoList(int page, int rows,int type) {
		PageHelper.startPage(page, rows);
		List<MyTMoneyInfo> list = myTMoneyInfoMapper.selectMyMoneyInfo(type);
		//创建一个返回值对象
		PageResult result = new PageResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<MyTMoneyInfo> pageInfo = new PageInfo<>(list);
		//总页数
		result.setTotal(pageInfo.getTotal());
		//当前页
		result.setPageNum(pageInfo.getPageNum());
		//总页数
		result.setPages(pageInfo.getPages());
		//下一页
		result.setNextPage(pageInfo.getNextPage());
		//前一页
		result.setPrePage(pageInfo.getPrePage());
		//第一页
		result.setFirstPage(pageInfo.getFirstPage());
		//最后一页
		result.setLastPage(pageInfo.getLastPage());
		
		return result;
	}

	@Override
	public PageResult getTMoneyInfoStateList(int page, int rows,int type, int state) {
		PageHelper.startPage(page, rows);
		System.out.println("service="+type);
		List<MyTMoneyInfo> list = myTMoneyInfoMapper.selectMyMoneyInfoState(type,state);
		//创建一个返回值对象
		PageResult result = new PageResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<MyTMoneyInfo> pageInfo = new PageInfo<>(list);
		//总页数
		result.setTotal(pageInfo.getTotal());
		//当前页
		result.setPageNum(pageInfo.getPageNum());
		//总页数
		result.setPages(pageInfo.getPages());
		//下一页
		result.setNextPage(pageInfo.getNextPage());
		//前一页
		result.setPrePage(pageInfo.getPrePage());
		//第一页
		result.setFirstPage(pageInfo.getFirstPage());
		//最后一页
		result.setLastPage(pageInfo.getLastPage());
		
		return result;
	}

	@Override
	public void freezeBatchMoneyInfo(List<String> ids) {
		myTMoneyInfoMapper.freezeBatchMoneyInfo(ids);
		
	}

	@Override
	public void freezeMoneyInfo(String id) {
		myTMoneyInfoMapper.freezeMoneyInfo(id);
		
	}

	@Override
	public void passBatchMoneyInfo(List<String> ids,Integer type) {
		int i =  myTMoneyInfoMapper.passBatchMoneyInfo(ids);
		if(i>0) {
			System.out.println("批量加钱操作");
			//
		}
	}

	@Override
	public void passMoneyInfo(String id,Integer type) {
		 int i = myTMoneyInfoMapper.passMoneyInfo(id);
		 if(i>0) {
			/* MoneyUtil mutil = new MoneyUtil();
			 boolean flag =  mutil.RechargeMoney(id);
			 if(flag) {
				 System.out.println("充值成功");
			 }else {
				 System.out.println("充值失敗");
			 }*/
			 System.out.println("单个加钱操作:"+id+"type:"+type);
			 //先查询金额和钱包id
			 List<MyTMoneyInfo> listInfo =  myTMoneyInfoMapper.selectMoneys(id, type);//id:当前通过的编号 1:充值 2:提現
			 for (MyTMoneyInfo myTMoneyInfo : listInfo) {
				 
				 BigDecimal moneyNew = myTMoneyInfo.getMoney();
				 
				 Integer  moneyId = myTMoneyInfo.getMoneyId();
				 
				 System.out.println("充值的金额:"+moneyNew+"钱包id:"+moneyId);
				 
				 //获取到钱包里的金额和钱包id
				 List<MyTMoneyDetail> listDetail =  myTMoneyDetailMapper.selectNewMyMoneyDetail(moneyId);
				 for (MyTMoneyDetail myTMoneyDetail : listDetail) {
					 BigDecimal moneyOld = myTMoneyDetail.getTotalMoney();
					 
					 System.out.println("原来的余额:"+moneyOld);
					 BigDecimal totalMoney;//总金额
					 int j = 0 ;//是否充值成功
					 if(type == 1) {
						 totalMoney = moneyNew.add(moneyOld);
						 //修改总金额
						 j = myTMoneyDetailMapper.updateMyMoneyDetail(moneyId, totalMoney);
					 }else {
						 totalMoney = moneyOld.subtract(moneyNew);
						 int r = totalMoney.compareTo(BigDecimal.ZERO);//和0比較
						 if(r == -1) {
							 //表示比0小
							 System.out.println("余額不足,不能提現");
						 }else {
							 j = myTMoneyDetailMapper.updateMyMoneyDetail(moneyId, totalMoney);
						 }
					 }
					 
					 if(j>0) {
						 System.out.println("成功");
					 }else {
						 System.out.println("失敗");
					 }
					 System.out.println("总金额:"+totalMoney);


					 
				}
			}
			 
		 }
		
	}


	@Override
	public List<MyTMoneyInfo> selectMoneys(String number,int type) {
		
		return myTMoneyInfoMapper.selectMoneys(number,type);
	}
}
