package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTStorePt;

import java.util.List;

public interface MyTStorePtMapper {
	//查询分销商-平台信息分页
    List<MyTStorePt> selectMyStorePt();
   //根据分销商网店名称查询网店信息
    List<MyTStorePt> selectMyStorePtUserName(String wwwName);
    //单个删除分销商-店主信息
  	void deleteByPrimaryKey(int id);
    //批量删除分销商-店主信息
  	void deleteBatchMyStorePt(List<Integer> ids);
  //更改分销商-店主信息
	int updateMyTStorePt(MyTStorePt myTStorePt);

}