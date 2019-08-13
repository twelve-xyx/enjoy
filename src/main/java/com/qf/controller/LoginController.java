package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

//前台控制器,负责接收请求,跳转页面
@Controller
public class LoginController {

    //注入LoginService对象
  @Resource
  private LoginService loginService;

  //登录验证,用户名+密码
  @RequestMapping(method = RequestMethod.POST,value = "/loginNamePass")
  @ResponseBody
    public Map loginNamePass(ModelMap map, HttpServletRequest request, String uphone, String password, @RequestParam(defaultValue = "1") String status){
      //查询用户名+密码
     Users users = loginService.loginUserPass(uphone, password);
     Map mapX = new HashMap();
      //判断登录是否成功
      if (users==null){
          mapX.put("code",1);
          mapX.put("status","登录失败");
          return mapX;
      }
          if (users!=null)
          {
              //登陆成功,判断ststus是否为空,不为空则保存用户名和密码
              if(status.equals("0")){
                  HttpSession session = request.getSession();
                  session.setAttribute(uphone,uphone);
                  session.setAttribute(uphone+"password",password);
              }
              map.addAttribute("users",users);
              mapX.put("code",0);
              mapX.put("status","登录成功");
              return mapX;
          }else{
              mapX.put("code",1);
              mapX.put("status","登录失败");
              return mapX;
          }

  }
  //ajax验证用户是否存在
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value ="/ajaxLoginUser")
  public Map ajaxLoginUser(String uphone,HttpServletResponse response){
      //利用json将结果返回给前端
            //查询用户
            boolean b = loginService.ajaxLoginUser(uphone);
        Map mapX = new HashMap();
            //判断返回什么值
            if (b){
                mapX.put("code",0);
                mapX.put("status","存在");
                return mapX;
            }else {
                mapX.put("code",1);
                mapX.put("status","不存在");
                return mapX;
            }

    }

    //获取短信验证码
    @RequestMapping(method = RequestMethod.POST,value ="/LoginKey")
    //返回ajax值
    @ResponseBody
    public Map LoginKey(HttpServletRequest request,String uphone){
        String s1 = loginService.LoginKey(request,uphone);
        Map mapX = new HashMap();
        if (s1.length()>0){
            mapX.put("code",0);
            mapX.put("status","获取成功");
            return mapX;
        }else{
            mapX.put("code",1);
            mapX.put("status","获取失败");
            return mapX;
        }
    }
    //验证码登录
    @RequestMapping(method = RequestMethod.POST,value ="/LoginphoneKey")
    @ResponseBody
    public Map LoginphoneKey(HttpServletRequest request,String uphone,String key,String status){
        boolean b = loginService.LoginphoneKey(request, uphone, key,status);
        Map mapX = new HashMap();
        //判断登录是否成功
            if (b)
            {
                mapX.put("code",0);
                mapX.put("status","登录成功");
                return mapX;
            }
            else {
                mapX.put("code",1);
                mapX.put("status","登录失败");
                return mapX;
            }

    }
    //注册用户
    @RequestMapping(method = RequestMethod.POST,value ="/insert")
    @ResponseBody
    public Map insert(HttpServletResponse response,HttpServletRequest request,String uphone, String key) {
      //判断用户的手机号,验证码
        boolean insert = loginService.insert(request, uphone, key);
        Map mapX = new HashMap();
        //处理乱码
        //判断是否注册成功
            if (insert) {
                mapX.put("code",0);
                mapX.put("status","注册成功");
                return mapX;
            }
            else {
                mapX.put("code",1);
                mapX.put("status","注册失败");
                return mapX;
            }

    }
    //更改用户信息
    @RequestMapping(method = RequestMethod.POST,value ="/updateByPrimaryKeySelective")
    @ResponseBody
    public Map updateByPrimaryKeySelective(HttpServletResponse response, Users users, String uphone){
        int i = loginService.updateByPrimaryKeySelective(users, uphone);
        Map mapX = new HashMap();
        //判断是否更改成功

            if (i==2) {
                mapX.put("code",0);
                mapX.put("status","更改信息成功");
                return mapX;
            } else{
                mapX.put("code",1);
                mapX.put("status","更改信息失败");
                return mapX;
            }

    }
    //更改密码
    @RequestMapping(method = RequestMethod.POST,value ="/updateByPssword")
    @ResponseBody
    public Map updateByPssword(HttpServletResponse response,HttpServletRequest request,String uphone, String password,String key){
      //调用更改方法
        int i = loginService.updateByPssword(request, uphone, password, key);
        Map mapX = new HashMap();
        //判断是否更改成功
            if (i==2) {
                mapX.put("code",2);
                mapX.put("status","密码不能和上一次相同");
                return mapX;
            } else if (i==0){
                mapX.put("code",0);
                mapX.put("status","更改密码成功");
                return mapX;
            }else if (i==1){
                mapX.put("code",1);
                mapX.put("status","更改密码失败");
                return mapX;
            }else{
                mapX.put("code",3);
                mapX.put("status","更改密码异常");
                return mapX;
            }
    }

    //退出登录
    @RequestMapping(method = RequestMethod.POST,value ="/loginOut")
    @ResponseBody
    public Map loginOut(HttpServletResponse response,HttpServletRequest request,String uphone){
      loginService.loginOut(request,uphone);
        Map mapX = new HashMap();
        response.setContentType("text/html;charset=utf-8");
        //判断是否更改成功
        mapX.put("code",0);
        mapX.put("status","退出成功");
        return mapX;
    }
    //注销用户
    @RequestMapping(method = RequestMethod.POST,value ="/deleteByPrimaryKey")
    @ResponseBody
    public Map deleteByPrimaryKey(HttpServletResponse response,HttpServletRequest request, String uphone, String key){
      //调用注销方法
        int i = loginService.deleteByPrimaryKey(request, uphone, key);
        Map mapX = new HashMap();
        response.setContentType("text/html;charset=utf-8");
        //判断是否更改成功

            if (i==0) {
                mapX.put("code",0);
                mapX.put("status","注销成功");
                return mapX;
            }
            else {
                mapX.put("code",1);
                mapX.put("status","注销失败");
                return mapX;
            }
    }
}
