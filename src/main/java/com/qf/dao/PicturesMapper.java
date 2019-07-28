package com.qf.dao;

import com.qf.pojo.Pictures;

public interface PicturesMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Pictures record);

    int insertSelective(Pictures record);

    Pictures selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Pictures record);

    int updateByPrimaryKey(Pictures record);
}