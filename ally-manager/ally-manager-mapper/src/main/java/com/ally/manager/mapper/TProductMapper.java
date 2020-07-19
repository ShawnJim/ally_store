package com.ally.manager.mapper;

import com.ally.manager.pojo.TProduct;
import com.ally.manager.pojo.TProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductMapper {
    int countByExample(TProductExample example);

    int deleteByExample(TProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    List<TProduct> selectByExampleWithBLOBs(TProductExample example);

    List<TProduct> selectByExample(TProductExample example);

    TProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByExampleWithBLOBs(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByExample(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKeyWithBLOBs(TProduct record);

    int updateByPrimaryKey(TProduct record);
}