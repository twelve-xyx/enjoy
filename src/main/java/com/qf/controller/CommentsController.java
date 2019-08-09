package com.qf.controller;

import com.qf.pojo.Comments;
import com.qf.service.CommentsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommentsController {

    @Resource
    private CommentsService commentsService;

    /**
     * 查看动态评论
     * @param uid
     * @return
     */
    @RequestMapping("/comments/getcomm")
    @ResponseBody
    public Map<String,Object> getcomm(Integer uid){
        Map<String,Object> map = new HashMap<String, Object>();
        List<Comments> getcomm = commentsService.getcomm(uid);
        if(getcomm!=null&&getcomm.size()>0){
            map.put("code",200);
            map.put("msg","success");
            map.put("getcomm",getcomm);
        }else{
            map.put("code",500);
            map.put("msg","failure");
        }
        return map;
    }





}
