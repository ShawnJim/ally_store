package com.ally.manager.mapper;

import com.ally.manager.pojo.TBrandQy;
import com.ally.manager.pojo.TBrandQyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBrandQyMapper {
    int countByExample(TBrandQyExample example);

    int deleteByExample(TBrandQyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBrandQy record);

    int insertSelective(TBrandQy record);

    List<TBrandQy> selectByExample(TBrandQyExample example);

    TBrandQy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBrandQy record, @Param("example") TBrandQyExample example);

    int updateByExample(@Param("record") TBrandQy record, @Param("example") TBrandQyExample example);

    int updateByPrimaryKeySelective(TBrandQy record);

    int updateByPrimaryKey(TBrandQy record);
}