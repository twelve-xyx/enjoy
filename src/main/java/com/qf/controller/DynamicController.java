package com.qf.controller;

import com.qf.pojo.Dynamic;
import com.qf.service.DynamicService;
import com.qf.service.PortraitService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

    /**
     * 查看所有动态
     * @param request
     * @return
     */
    @RequestMapping("/dynamic/show")
    @ResponseBody
    public List<Map<String,Object>> findall(HttpServletRequest request){
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
                        StringBuilder strb = new StringBuilder(request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort()+"/upload/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                    map.put("dynamicimg",arrayList1);
                }
                map.put("uid",dynamic.getUid());
                map.put("head",dynamic.getUserpicture());
                map.put("username",dynamic.getUsername());
                map.put("sex",dynamic.getSex());
                map.put("address",dynamic.getAddress());
                map.put("professional",dynamic.getProfession());
                map.put("dynamictext",dynamic.getDynamictext());
                map.put("createtime",dynamic.getCreatetime());
                map.put("upcount",dynamic.getUpcount());
                map.put("commcount",dynamic.getCommentcount());



                Map map2  = new HashMap<String,Object>();
                map2.put("code",200);
                map2.put("msg","success");
                mapList.add(map2);
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
     * 查看个人动态
     * @param userid
     * @return
     */
    @RequestMapping("/dynamic/findbyid")
    @ResponseBody
    public List<Map<String,Object>> findbyid(Integer userid ,HttpServletRequest request){
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
                        StringBuilder strb = new StringBuilder(request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort()+"/upload/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                    map.put("dynamicimg",arrayList1);
                }
                map.put("uid",dynamic.getUid());
                map.put("head",dynamic.getUserpicture());
                map.put("username",dynamic.getUsername());
                map.put("sex",dynamic.getSex());
                map.put("address",dynamic.getAddress());
                map.put("professional",dynamic.getProfession());
                map.put("dynamictext",dynamic.getDynamictext());
                map.put("createtime",dynamic.getCreatetime());
                map.put("upcount",dynamic.getUpcount());
                map.put("commcount",dynamic.getCommentcount());
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
    public List<Map<String,Object>> friend(Integer userid,HttpServletRequest request){
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
                        StringBuilder strb = new StringBuilder(request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort()+"/upload/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                    map.put("dynamicimg",arrayList1);
                }
                map.put("uid",dynamic.getUid());
                map.put("head",dynamic.getUserpicture());
                map.put("username",dynamic.getUsername());
                map.put("sex",dynamic.getSex());
                map.put("address",dynamic.getAddress());
                map.put("professional",dynamic.getProfession());
                map.put("dynamictext",dynamic.getDynamictext());
                map.put("createtime",dynamic.getCreatetime());
                map.put("upcount",dynamic.getUpcount());
                map.put("commcount",dynamic.getCommentcount());
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
    public Map<String,Object> insert(Integer userid,Dynamic record, MultipartFile[] tupian, HttpServletRequest request){
        try {
            Map map = new HashMap();
            StringBuilder stringBuilder = new StringBuilder();
            if(tupian!=null&&tupian.length>0){
                for (int i = 0;i<tupian.length;i++) {
                    String fileName = tupian[i].getOriginalFilename();
                    if(i<tupian.length-1){
                        stringBuilder.append(fileName+",");
                    }else {
                        stringBuilder.append(fileName);
                    }
                    String dir = request.getServletContext().getRealPath("/upload");
                    File dirFile = new File(dir);
                    if(dirFile.exists() == false)dirFile.mkdirs();
                    String relativePath = "/upload/" + fileName;;
                    String totalPath = request.getServletContext().getRealPath(relativePath);
                    File newFile = new File(totalPath);
                    FileCopyUtils.copy(tupian[i].getInputStream(), new FileOutputStream(newFile));
                }
            }
            String str = stringBuilder.toString();
            record.setDynamicimg(str);
            int i = dynamicService.insert(record);
            dynamicService.dynamiduserid(record.getUid(),userid);
            if(i>0){
                map.put("code",200);
                map.put("msg","success")                                                                   ;
            }else{
                map.put("code",500);
                map.put("msg","failure");
            }
            return map;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 点赞：status为0执行点赞 为1 执行取消点赞
     */
    @RequestMapping("/dynamic/like")
    @ResponseBody
    public Map<String,Object> dianZan(Integer status , Integer dynamicId){
        return  dynamicService.dianZan(status,dynamicId);
    }

    @RequestMapping("findall")
    @ResponseBody
    public Map<String,Object> findall(){
        List<Dynamic> findall = dynamicService.findall();
        Map map = new HashMap();
        map.put("find",findall);
        return  map;
    }
}
