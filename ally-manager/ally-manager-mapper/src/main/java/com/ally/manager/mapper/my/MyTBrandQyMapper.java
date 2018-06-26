package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTBrandQy;

import java.util.List;

public interface MyTBrandQyMapper {
	//查询品牌商-企业信息分页
    List<MyTBrandQy> selectMyBrandQy();
    //根据品牌商企业名称查询企业信息
    List<MyTBrandQy> selectMyBrandQyUserName(String companyName);
   	//单个删除品牌商-企业信息
    void deleteByPrimaryKey(Integer id);
    //批量删除品牌商-企业信息
  	void deleteBatchMyBrandQy(List<Integer> ids);
  	//更改品牌商-企业信息
  	int updateMyTBrandQy(MyTBrandQy myTBrandQy);
}