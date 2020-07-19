package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTStoreDz;

import java.util.List;

public interface MyTStoreDzMapper {
	//查询分销商-店主信息分页
    List<MyTStoreDz> selectMyStoreDz();
   //根据品牌商企业名称查询企业信息
    List<MyTStoreDz> selectMyStoreDzUserName(String username);
    //单个删除分销商-店主信息
  	void deleteByPrimaryKey(int id);
    //批量删除分销商-店主信息
  	void deleteBatchMyStoreDz(List<Integer> ids);
  //更改分销商-店主信息
	int updateMyTStoreDz(MyTStoreDz myTStoreDz);

}