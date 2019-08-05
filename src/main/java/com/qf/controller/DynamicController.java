package com.qf.controller;

import com.qf.pojo.Dynamic;
import com.qf.service.DynamicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DynamicController {
    @Resource
    private DynamicService dynamicService;

    @RequestMapping("findall")
    @ResponseBody
    public Map<String,Object> findall(){
        List<Dynamic> findall = dynamicService.findall();
        Map map = new HashMap();
        map.put("find",findall);
        return  map;
    }



}
