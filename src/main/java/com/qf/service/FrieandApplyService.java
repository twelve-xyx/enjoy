package com.qf.service;

import com.qf.pojo.FrieandApply;

import java.util.List;

public interface FrieandApplyService {
    int deleteByPrimaryKey(Integer fid);

    int insert(FrieandApply record);

    int insertSelective(FrieandApply record);

    FrieandApply selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(FrieandApply record);

    int updateByPrimaryKey(FrieandApply record);
    public List<FrieandApply> findById(int currentid);

    public int deleteByUidAndCurrentuid(int uid,int currentid);
}