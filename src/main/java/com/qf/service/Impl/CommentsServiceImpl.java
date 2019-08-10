package com.qf.service.Impl;

import com.qf.dao.CommentsMapper;
import com.qf.pojo.Comments;
import com.qf.service.CommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Resource
    private CommentsMapper commentsMapper;

    public List<Comments> getcomm(Integer uid) {
        return commentsMapper.getcomm(uid);
    }
}
