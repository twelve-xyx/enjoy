package com.qf.dao;

import com.qf.pojo.Lables;

public interface LablesMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Lables record);

    int insertSelective(Lables record);

    Lables selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Lables record);

    int updateByPrimaryKey(Lables record);
}