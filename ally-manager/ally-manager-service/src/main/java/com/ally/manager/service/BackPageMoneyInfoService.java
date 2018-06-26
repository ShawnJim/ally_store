package com.ally.manager.service;

import java.util.List;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTMoneyInfo;

public interface BackPageMoneyInfoService {
	//查询钱包审核信息
	PageResult getTMoneyInfoList(int page ,int rows,int type);
	//查询钱包审核信息-状态
	PageResult getTMoneyInfoStateList(int page, int rows,int type, int state);
	//批量冻结钱包充值
	void freezeBatchMoneyInfo(List<String> del_ids);
	//单个冻结钱包充值
	void freezeMoneyInfo(String id);
	//批量通过钱包充值
	void passBatchMoneyInfo(List<String> del_ids,Integer type);
	//单个通过钱包充值
	void passMoneyInfo(String ids,Integer type);
	//根据条件查询钱包充值信息
	List<MyTMoneyInfo> selectMoneys(String number,int type);
}
