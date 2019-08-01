package com.qf.dao;

import com.qf.pojo.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}