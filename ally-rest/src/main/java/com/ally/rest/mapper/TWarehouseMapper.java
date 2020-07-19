package com.ally.rest.mapper;

import com.ally.rest.po.TWarehouse;
import com.ally.rest.po.TWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWarehouseMapper {
    int countByExample(TWarehouseExample example);

    int deleteByExample(TWarehouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWarehouse record);

    int insertSelective(TWarehouse record);

    List<TWarehouse> selectByExample(TWarehouseExample example);

    TWarehouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWarehouse record, @Param("example") TWarehouseExample example);

    int updateByExample(@Param("record") TWarehouse record, @Param("example") TWarehouseExample example);

    int updateByPrimaryKeySelective(TWarehouse record);

    int updateByPrimaryKey(TWarehouse record);
}