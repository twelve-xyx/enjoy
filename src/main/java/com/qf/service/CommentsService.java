package com.qf.service;

import com.qf.pojo.Comments;

import java.util.List;

public interface CommentsService {
    List<Comments> getcomm(Integer uid);

    int insert(Comments record);

    void commdy(Integer dynamicid, Integer commentsid);
}
