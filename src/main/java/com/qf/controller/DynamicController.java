package com.qf.controller;

import com.qf.pojo.Dynamic;
import com.qf.service.DynamicService;
import com.qf.service.PortraitService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DynamicController {
    @Resource
    private DynamicService dynamicService;
    @Resource
    private PortraitService portraitService;

 /*   *//**
     * 查看所有动态
     * @return
     *//*
    @RequestMapping("findall")
    @ResponseBody
    public Map<String,Object> findall(){
        Map map = new HashMap();
        ArrayList<Dynamic> arrayList = new ArrayList();
        arrayList = (ArrayList<Dynamic>) dynamicService.findall();

        ArrayList<String> arrayList1 = new ArrayList();
        for (Dynamic dynamic : arrayList) {
            String dynamicimg = dynamic.getDynamicimg();
            String[] split = dynamicimg.split(",");
            for (String s : split) {
                StringBuilder strb = new StringBuilder("http://localhost/imgs/");
                String  strb1 = strb.append(s).toString();
                arrayList1.add(strb1);
            }
        }
        if (arrayList!=null&&arrayList.size()>0){
            map.put("code",200);
            map.put("msg","success");
            map.put("findall",arrayList);
            map.put("imgs", arrayList1);
        }else{
            map.put("code",500);
            map.put("msg","failure");
        }
        return  map;
    }*/

    /**
     * 查看所有动态
     * @return
     */
    @RequestMapping("/dynamic/show")
    @ResponseBody
    public List<Map<String,Object>> findall(){
        List<Map<String,Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String,Object> map = null;
        ArrayList<Dynamic> arrayList = new ArrayList();
        arrayList = (ArrayList<Dynamic>) dynamicService.findall();
        if (arrayList!=null&&arrayList.size()>0){
            for (Dynamic dynamic : arrayList) {
                 map = new HashMap();
                ArrayList<String> arrayList1 = new ArrayList();
                String dynamicimg = dynamic.getDynamicimg();
                if (!StringUtils.isBlank(dynamicimg)){
                    String[] split = dynamicimg.split(",");
                    for (String s : split) {
                        StringBuilder strb = new StringBuilder("http://localhost/imgs/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                    map.put("dynamicimg",arrayList1);
                }
                map.put("uid",dynamic.getUid());
                map.put("head",dynamic.getHead());
                map.put("username",dynamic.getUsername());
                map.put("sex",dynamic.getSex());
                map.put("address",dynamic.getAddress());
                map.put("professional",dynamic.getProfessional());
                map.put("dynamictext",dynamic.getDynamictext());
                map.put("createtime",dynamic.getCreatetime());
                map.put("upcount",dynamic.getUpcount());
                map.put("commcount",dynamic.getCommcount());
                mapList.add(map);
            }
        }else{
            map = new HashMap();
            map.put("code",500);
            map.put("msg","failure");
            mapList.add(map);
        }
        return  mapList;
    }

    /**
     * 发布动态
     * @param record
     * @return
     */
    @RequestMapping("/dynamic/release")
    @ResponseBody
        public Map<String,Object> insert(Dynamic record){
        Map map = new HashMap();
        int i = dynamicService.insert(record);
        System.out.println(i);
        if(i>0){
            map.put("code",200);
            map.put("msg","success")                                                                   ;
        }else{
            map.put("code",500);
            map.put("msg","failure");
        }
        return map;
    }

    /**
     * 查看个人动态
     * @param userid
     * @return
     */
    @RequestMapping("/dynamic/findbyid")
    @ResponseBody
    public List<Map<String,Object>> findbyid(Integer userid){
        List<Map<String,Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String,Object> map = null;
        ArrayList<Dynamic> arrayList = new ArrayList();
        arrayList = (ArrayList<Dynamic>) dynamicService.findbyid(userid);
        if (arrayList!=null&&arrayList.size()>0){
            for (Dynamic dynamic : arrayList) {
                map = new HashMap();
                ArrayList<String> arrayList1 = new ArrayList();
                String dynamicimg = dynamic.getDynamicimg();
                if (!StringUtils.isBlank(dynamicimg)){
                    String[] split = dynamicimg.split(",");
                    for (String s : split) {
                        StringBuilder strb = new StringBuilder("http://localhost/imgs/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                    map.put("dynamicimg",arrayList1);
                }
                map.put("uid",dynamic.getUid());
                map.put("head",dynamic.getHead());
                map.put("username",dynamic.getUsername());
                map.put("sex",dynamic.getSex());
                map.put("address",dynamic.getAddress());
                map.put("professional",dynamic.getProfessional());
                map.put("dynamictext",dynamic.getDynamictext());
                map.put("createtime",dynamic.getCreatetime());
                map.put("upcount",dynamic.getUpcount());
                map.put("commcount",dynamic.getCommcount());
                mapList.add(map);
            }
        }else{
            map = new HashMap();
            map.put("code",500);
            map.put("msg","failure");
            mapList.add(map);
        }
        return  mapList;

    }

    /**
     * 查看好友动态
     * @param userid
     * @return
     */
    @RequestMapping("/dynamic/friend")
    @ResponseBody
    public List<Map<String,Object>> friend(Integer userid){
            List<Map<String,Object>> mapList = new ArrayList<Map<String, Object>>();
            Map<String,Object> map = null;
            ArrayList<Dynamic> arrayList = new ArrayList();
            arrayList = (ArrayList<Dynamic>) dynamicService.friend(userid);
            if (arrayList!=null&&arrayList.size()>0){
                for (Dynamic dynamic : arrayList) {
                    map = new HashMap();
                    ArrayList<String> arrayList1 = new ArrayList();
                    String dynamicimg = dynamic.getDynamicimg();
                    if (!StringUtils.isBlank(dynamicimg)){
                        String[] split = dynamicimg.split(",");
                        for (String s : split) {
                            StringBuilder strb = new StringBuilder("http://localhost/imgs/");
                            String  strb1 = strb.append(s).toString();
                            arrayList1.add(strb1);
                        }
                        map.put("dynamicimg",arrayList1);
                    }
                    map.put("uid",dynamic.getUid());
                    map.put("head",dynamic.getHead());
                    map.put("username",dynamic.getUsername());
                    map.put("sex",dynamic.getSex());
                    map.put("address",dynamic.getAddress());
                    map.put("professional",dynamic.getProfessional());
                    map.put("dynamictext",dynamic.getDynamictext());
                    map.put("createtime",dynamic.getCreatetime());
                    map.put("upcount",dynamic.getUpcount());
                    map.put("commcount",dynamic.getCommcount());
                    mapList.add(map);
                }
            }else{
                map = new HashMap();
                map.put("code",500);
                map.put("msg","failure");
                mapList.add(map);
            }
            return  mapList;
    }

    /**
     * 点赞：status为0执行点赞 为1 执行取消点赞
     */
    @RequestMapping("/dynamic/like")
    @ResponseBody
    public Map<String,Object> dianZan(Integer status , Integer dynamicId){
        return  dynamicService.dianZan(status,dynamicId);
    }
}
