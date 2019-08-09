package com.qf.controller;

import com.qf.pojo.Portrait;
import com.qf.service.PortraitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PortratiController {

    @Resource
    private PortraitService portraitService;

    /**
     * 查看好友信息
     * @param userid
     * @return
     */
    @RequestMapping("getfriend")
    @ResponseBody
    public Map<String,Object> getid(Integer userid){
        Map<String,Object> map = new HashMap<String, Object>();
        List<Portrait> list = portraitService.getfriend(userid);
        if(list!=null&&list.size()>0){
            map.put("code",200);
            map.put("mgs","success");
            map.put("getfriend",list);
        }else{
            map.put("code",500);
            map.put("mgs","failure");
        }
        return map;
    }
}
