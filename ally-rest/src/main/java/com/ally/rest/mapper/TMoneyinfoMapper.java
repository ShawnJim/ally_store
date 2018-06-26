package com.ally.rest.mapper;

import com.ally.rest.po.TMoneyinfo;
import com.ally.rest.po.TMoneyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMoneyinfoMapper {
    int countByExample(TMoneyinfoExample example);

    int deleteByExample(TMoneyinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMoneyinfo record);

    int insertSelective(TMoneyinfo record);

    List<TMoneyinfo> selectByExample(TMoneyinfoExample example);

    TMoneyinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMoneyinfo record, @Param("example") TMoneyinfoExample example);

    int updateByExample(@Param("record") TMoneyinfo record, @Param("example") TMoneyinfoExample example);

    int updateByPrimaryKeySelective(TMoneyinfo record);

    int updateByPrimaryKey(TMoneyinfo record);
}