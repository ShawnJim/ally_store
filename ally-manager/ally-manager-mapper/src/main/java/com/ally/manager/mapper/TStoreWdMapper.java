package com.ally.manager.mapper;

import com.ally.manager.pojo.TStoreWd;
import com.ally.manager.pojo.TStoreWdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStoreWdMapper {
    int countByExample(TStoreWdExample example);

    int deleteByExample(TStoreWdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStoreWd record);

    int insertSelective(TStoreWd record);

    List<TStoreWd> selectByExample(TStoreWdExample example);

    TStoreWd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStoreWd record, @Param("example") TStoreWdExample example);

    int updateByExample(@Param("record") TStoreWd record, @Param("example") TStoreWdExample example);

    int updateByPrimaryKeySelective(TStoreWd record);

    int updateByPrimaryKey(TStoreWd record);
}