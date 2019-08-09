package com.qf.dao;

import com.qf.pojo.Portrait;
import com.qf.pojo.PortraitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PortraitMapper {

    List<Portrait> getfriend(Integer userid);

    int countByExample(PortraitExample example);

    int deleteByExample(PortraitExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Portrait record);

    int insertSelective(Portrait record);

    List<Portrait> selectByExample(PortraitExample example);

    Portrait selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Portrait record, @Param("example") PortraitExample example);

    int updateByExample(@Param("record") Portrait record, @Param("example") PortraitExample example);

    int updateByPrimaryKeySelective(Portrait record);

    int updateByPrimaryKey(Portrait record);
}