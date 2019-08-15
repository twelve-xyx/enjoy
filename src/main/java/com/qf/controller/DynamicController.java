package com.qf.controller;

import com.qf.pojo.Comments;
import com.qf.pojo.Dynamic;
import com.qf.pojo.DynamicVO;
import com.qf.service.CommentsService;
import com.qf.service.DynamicService;
import com.qf.service.PortraitService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import org.apache.commons.codec.binary.Base64;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.*;

@Controller
public class DynamicController {
    @Resource
    private DynamicService dynamicService;
    @Resource
    private CommentsService commentsService;

    /**
     * 查看所有动态
     * @param request
     * @return
     */
    @RequestMapping("/dynamic/show")
    @ResponseBody
    public Map<String,Object> findall(HttpServletRequest request){
        ArrayList<DynamicVO> arrayList2 = new ArrayList();
        Map<String,Object> map = new HashMap();;
        ArrayList<Dynamic> arrayList = (ArrayList<Dynamic>) dynamicService.findall();
        if (arrayList!=null&&arrayList.size()>0){
            for (Dynamic dynamic : arrayList) {
                ArrayList<String> arrayList1 = new ArrayList();
                String dynamicimg = dynamic.getDynamicimg();
                DynamicVO dynamicVO = new DynamicVO();
                Integer id = dynamic.getUid();
                List<Comments> getcomm = commentsService.getcomm(id);
                if (!StringUtils.isBlank(dynamicimg)){
                    String[] split = dynamicimg.split(",");
                    for (String s : split) {
                        StringBuilder strb = new StringBuilder(request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort()+"/upload/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                }
                dynamicVO.setDynamicimg(arrayList1);
                dynamicVO.setUid(dynamic.getUid());
                dynamicVO.setUserpicture(dynamic.getUserpicture());
                dynamicVO.setUsername(dynamic.getUsername());
                dynamicVO.setSex(dynamic.getSex());
                dynamicVO.setAddress(dynamic.getAddress());
                dynamicVO.setProfession(dynamic.getProfession());
                dynamicVO.setDynamictext(dynamic.getDynamictext());
                dynamicVO.setCreatetime(dynamic.getCreatetime());
                dynamicVO.setUpcount(dynamic.getUpcount());
                dynamicVO.setCommentcount(dynamic.getCommentcount());
                dynamicVO.setComments(getcomm);
                arrayList2.add(dynamicVO);
            }
            map.put("data",arrayList2);
            map.put("code",200);
            map.put("msg","success");
        }else{
            map.put("code",500);
            map.put("msg","failure");
        }
        return  map;
    }

    /**
     * 查看个人动态
     * @param userid
     * @return
     */
    @RequestMapping("/dynamic/findbyid")
    @ResponseBody
    public Map<String,Object> findbyid(Integer userid ,HttpServletRequest request){
        ArrayList<DynamicVO> arrayList2 = new ArrayList();
        Map<String,Object> map = new HashMap();;
        ArrayList<Dynamic> arrayList = (ArrayList<Dynamic>) dynamicService.findbyid(userid);
        if (arrayList!=null&&arrayList.size()>0){
            for (Dynamic dynamic : arrayList) {
                ArrayList<String> arrayList1 = new ArrayList();
                String dynamicimg = dynamic.getDynamicimg();

                Integer id = dynamic.getUid();
                List<Comments> getcomm = commentsService.getcomm(id);

                DynamicVO dynamicVO = new DynamicVO();
                if (!StringUtils.isBlank(dynamicimg)){
                    String[] split = dynamicimg.split(",");
                    for (String s : split) {
                        StringBuilder strb = new StringBuilder(request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort()+"/upload/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                }
                dynamicVO.setDynamicimg(arrayList1);
                dynamicVO.setUid(dynamic.getUid());
                dynamicVO.setUserpicture(dynamic.getUserpicture());
                dynamicVO.setUsername(dynamic.getUsername());
                dynamicVO.setSex(dynamic.getSex());
                dynamicVO.setAddress(dynamic.getAddress());
                dynamicVO.setProfession(dynamic.getProfession());
                dynamicVO.setDynamictext(dynamic.getDynamictext());
                dynamicVO.setCreatetime(dynamic.getCreatetime());
                dynamicVO.setUpcount(dynamic.getUpcount());
                dynamicVO.setCommentcount(dynamic.getCommentcount());
                dynamicVO.setComments(getcomm);
                arrayList2.add(dynamicVO);
            }
            map.put("data",arrayList2);
            map.put("code",200);
            map.put("msg","success");
        }else{
            map.put("code",500);
            map.put("msg","failure");
        }
        return  map;

    }

    /**
     * 查看好友动态
     * @param userid
     * @return
     */
    @RequestMapping("/dynamic/friend")
    @ResponseBody
    public Map<String,Object> friend(Integer userid,HttpServletRequest request){
        ArrayList<DynamicVO> arrayList2 = new ArrayList();
        Map<String,Object> map = new HashMap();;
        ArrayList<Dynamic> arrayList = (ArrayList<Dynamic>) dynamicService.friend(userid);
        if (arrayList!=null&&arrayList.size()>0){
            for (Dynamic dynamic : arrayList) {
                ArrayList<String> arrayList1 = new ArrayList();
                String dynamicimg = dynamic.getDynamicimg();

                Integer id = dynamic.getUid();
                List<Comments> getcomm = commentsService.getcomm(id);

                DynamicVO dynamicVO = new DynamicVO();
                if (!StringUtils.isBlank(dynamicimg)){
                    String[] split = dynamicimg.split(",");
                    for (String s : split) {
                        StringBuilder strb = new StringBuilder(request.getScheme() + "://" + request.getServerName()+ ":" + request.getServerPort()+"/upload/");
                        String  strb1 = strb.append(s).toString();
                        arrayList1.add(strb1);
                    }
                }
                dynamicVO.setDynamicimg(arrayList1);
                dynamicVO.setUid(dynamic.getUid());
                dynamicVO.setUserpicture(dynamic.getUserpicture());
                dynamicVO.setUsername(dynamic.getUsername());
                dynamicVO.setSex(dynamic.getSex());
                dynamicVO.setAddress(dynamic.getAddress());
                dynamicVO.setProfession(dynamic.getProfession());
                dynamicVO.setDynamictext(dynamic.getDynamictext());
                dynamicVO.setCreatetime(dynamic.getCreatetime());
                dynamicVO.setUpcount(dynamic.getUpcount());
                dynamicVO.setCommentcount(dynamic.getCommentcount());
                dynamicVO.setComments(getcomm);
                arrayList2.add(dynamicVO);
            }
            map.put("data",arrayList2);
            map.put("code",200);
            map.put("msg","success");
        }else{
            map.put("code",500);
            map.put("msg","failure");
        }
        return  map;
    }

    /**
     * 发布动态
     * @param record
     * @return
     */
    @RequestMapping("/dynamic/release")
    @ResponseBody
    public Map<String,Object> insert(Integer userid,Dynamic record, String[] tupian, HttpServletRequest request) throws IOException {
        record.setUpcount(0);
        record.setCommentcount(0);
        record.setCreatetime(new Date());

        System.out.println(tupian);
        Map<String,Object> map = new HashMap<String, Object>();
        String dir = request.getServletContext().getRealPath("/upload");
        File dirFile = new File(dir);
        if(dirFile.exists() == false)dirFile.mkdirs();
        StringBuilder str = new StringBuilder();
        if (tupian!=null&&tupian.length>0){
            String name = null ;
            String fileName = null;
            for(int i = 0;i<tupian.length;i++){
                String suffix = ".png";
                String data = null;

                if(i % 2==1){
                    data = tupian[i];
                }
                name = UUID.randomUUID().toString();
                fileName = name+suffix;
                if(i % 2==1){
                    if (i == tupian.length-1 ){

                        str.append(fileName);
                    }else if (i != tupian.length-1 ){
                        str.append(fileName+",");
                    }
                }
//                    BASE64Decoder decoder = new BASE64Decoder();
                byte[] bs = null;
                if (data!=null){
                    bs =  Base64.decodeBase64(data);;
                    for (int j = 0; j < bs.length; ++j) {
                        if (bs[j] < 0) {
                            //调整异常数据
                            bs[j] += 256;
                        }
                    }
                }
                if (data!=null){
                    try{
                        String imgFilePath = "/upload/" + fileName;
                        String totalPath = request.getServletContext().getRealPath(imgFilePath);
                        System.out.println("totalPath================"+totalPath);
                        OutputStream out = new FileOutputStream(totalPath);
                        out.write(bs);
                        out.flush();
                        out.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
            String dynamicing = str.toString();
            record.setDynamicimg(dynamicing);
            int i = dynamicService.insert(record);
            System.out.println(record.getUid()+"====================="+userid);
            dynamicService.dynamiduserid(record.getUid(),userid);
            if(i>0){
                map.put("code",200);
                map.put("msg","success")                                                                   ;
            }else{
                map.put("code",500);
                map.put("msg","failure");
            }
        }
        return map;
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
