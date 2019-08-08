package com.qf.dao;

import com.qf.pojo.Friendlist;

public interface FriendlistMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Friendlist record);

    int insertSelective(Friendlist record);

    Friendlist selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Friendlist record);

    int updateByPrimaryKey(Friendlist record);
}