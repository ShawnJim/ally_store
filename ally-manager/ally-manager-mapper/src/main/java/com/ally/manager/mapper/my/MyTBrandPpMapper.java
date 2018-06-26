package com.ally.manager.mapper.my;

import com.ally.manager.pojo.my.MyTBrandPp;
import java.util.List;

public interface MyTBrandPpMapper {
	//查询品牌商-品牌信息分页
    List<MyTBrandPp> selectMyBrandPp();
    //根据品牌商姓名查询品牌商信息
    List<MyTBrandPp> selectMyBrandPpUserName(String username);
    //单个删除品牌商-品牌信息
	void deleteByPrimaryKey(Integer id);
	//批量删除品牌商-品牌信息
	void deleteBatchMyBrandPp(List<Integer> ids);
	//更改品牌商-品牌信息
	int updateMyTBrandPp(MyTBrandPp myTBrandPp);
	
}