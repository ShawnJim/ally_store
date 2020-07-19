package com.ally.manager.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ally.manager.pojo.my.MyTMoneyInfo;

public interface MyTMoneyInfoMapper {
	//查询钱包审核信息分页
    List<MyTMoneyInfo> selectMyMoneyInfo(int type);
    //查询钱包审核信息分页-状态
    List<MyTMoneyInfo> selectMyMoneyInfoState(@Param("type")int type,@Param("state")int state);
	//批量冻结钱包充值信息
	void freezeBatchMoneyInfo(List<String> ids);
	//单个冻结钱包充值信息
	void freezeMoneyInfo(String id);
	//批量通过钱包充值信息
	int passBatchMoneyInfo(List<String> ids);
	//单个通过钱包充值信息
	int passMoneyInfo(String id);
	//根据条件查询钱包充值信息
	List<MyTMoneyInfo> selectMoneys(@Param("number")String number,@Param("type")int type);
	
}
