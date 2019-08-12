package com.qf.dao;

import com.qf.pojo.FrieandApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FrieandApplyMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(FrieandApply record);

    int insertSelective(FrieandApply record);

    FrieandApply selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(FrieandApply record);

    int updateByPrimaryKey(FrieandApply record);

    public List<FrieandApply> findById(int currentid);

    public int deleteByUidAndCurrentuid(@Param("uid") int uid,@Param("currentid") int currentid);
}