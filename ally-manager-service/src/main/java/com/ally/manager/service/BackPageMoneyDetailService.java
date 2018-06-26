package com.ally.manager.service;

import com.ally.common.pojo.PageResult;

public interface BackPageMoneyDetailService {
	
	//查询用户钱包信息
	PageResult getTMoneyDetailList(int page ,int rows);
}
