package com.qf.dao;

import com.qf.pojo.FrieandApply;

public interface FrieandApplyMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(FrieandApply record);

    int insertSelective(FrieandApply record);

    FrieandApply selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(FrieandApply record);

    int updateByPrimaryKey(FrieandApply record);
}