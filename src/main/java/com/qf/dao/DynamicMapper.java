package com.qf.dao;

import com.qf.pojo.Dynamic;
import com.qf.pojo.DynamicExample;
import com.qf.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DynamicMapper {
    int countByExample(DynamicExample example);

    int deleteByExample(DynamicExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    List<Dynamic> selectByExample(DynamicExample example);

    Dynamic selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByExample(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKey(Dynamic record);

    List<Dynamic> findall();

    List<Dynamic> findbyid(Integer userid);

    List<Dynamic> friend(Integer userid);
    void dynamiduserid(@Param(value = "dyid")   Integer dyid,@Param(value = "userid")   Integer userid);

    Map<String,Object> dianZan(Integer status, Integer dynamicId);

    public List<Dynamic> indexFindByUid();

    List<Dynamic> findallDynamic(int userid);
}