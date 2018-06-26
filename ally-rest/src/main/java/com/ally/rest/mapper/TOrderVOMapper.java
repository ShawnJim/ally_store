package com.ally.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ally.rest.po.TOrderVO;

public interface TOrderVOMapper {
	
	TOrderVO orderByOrderid(String oid);
	
	List<TOrderVO> orderByStoid(Integer sid);

	List<TOrderVO> orderByStoidandOrderStatus(@Param(value = "stoid")Integer stoid, @Param(value = "orderstatus")Integer orderstatus);

	List<TOrderVO> orderByBraid(Integer braid);
}
