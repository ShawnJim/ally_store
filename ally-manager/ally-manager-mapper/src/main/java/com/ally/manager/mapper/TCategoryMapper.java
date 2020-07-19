package com.ally.manager.mapper;

import com.ally.manager.pojo.TCategory;
import com.ally.manager.pojo.TCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCategoryMapper {
    int countByExample(TCategoryExample example);

    int deleteByExample(TCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCategory record);

    int insertSelective(TCategory record);

    List<TCategory> selectByExample(TCategoryExample example);

    TCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCategory record, @Param("example") TCategoryExample example);

    int updateByExample(@Param("record") TCategory record, @Param("example") TCategoryExample example);

    int updateByPrimaryKeySelective(TCategory record);

    int updateByPrimaryKey(TCategory record);
}