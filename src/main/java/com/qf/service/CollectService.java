package com.qf.service;

import com.qf.pojo.Collect;

import java.util.List;

public interface CollectService {
    int deleteByPrimaryKey(Integer cid);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
    //查询某人收藏
    List<Collect> findOnesCollect(Collect collect);
}