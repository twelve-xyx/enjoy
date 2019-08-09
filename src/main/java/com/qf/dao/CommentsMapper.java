package com.qf.dao;

import com.qf.pojo.Comments;
import com.qf.pojo.CommentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentsMapper {

    List<Comments> getcomm(Integer uid);

    int countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(Integer commid);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(Integer commid);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}