package com.ally.rest.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ally.rest.po.TMoney;
import com.ally.rest.po.TMoneyExample;

public interface TMoneyMapper {
    int countByExample(TMoneyExample example);

    int deleteByExample(TMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMoney record);

    int insertSelective(TMoney record);

    List<TMoney> selectByExample(TMoneyExample example);

    TMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMoney record, @Param("example") TMoneyExample example);

    int updateByExample(@Param("record") TMoney record, @Param("example") TMoneyExample example);

    int updateByPrimaryKeySelective(TMoney record);

    int updateByPrimaryKey(TMoney record);
}