package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTBrandPpCheck;
import java.util.List;

public interface MyTBrandPpCheckMapper {
	//查询品牌商-品牌审核信息分页
    List<MyTBrandPpCheck> selectMyBrandPpCheck();
    //查询品牌商-品牌审核信息分页
    List<MyTBrandPpCheck> selectMyBrandPpCheckState(int state);
    //根据品牌商用户名称查询品牌商审核信息
    List<MyTBrandPpCheck> selectMyBrandPpCheckUserName(String username);
    //单个冻结品牌商信息
	void freezeByPrimaryKey(Integer id);
	//批量冻结品牌商信息
	void freezeBatchMyBrandPp(List<Integer> ids);
	//单个通过品牌商信息
	void passByPrimaryKey(Integer id);
	//批量通过品牌商信息
	void passBatchMyBrandPp(List<Integer> ids);
	
}