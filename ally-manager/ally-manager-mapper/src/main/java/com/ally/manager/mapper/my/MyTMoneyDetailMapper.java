package com.ally.manager.mapper.my;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ally.manager.pojo.my.MyTMoneyDetail;

public interface MyTMoneyDetailMapper {
	//查询用户钱包信息
    List<MyTMoneyDetail> selectMyMoneyDetail();
    
	//查询当前充值信息所对应的钱包
    List<MyTMoneyDetail> selectNewMyMoneyDetail(Integer moneyId);
    
    //修改钱包金额
    int updateMyMoneyDetail(@Param("id")Integer id,@Param("totalMoney")BigDecimal totalMoney);
    
    //增加钱包
    int insert(Integer userId);
}
