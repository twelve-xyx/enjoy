package com.qf.service;

import com.qf.pojo.Users;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {

    //用户登录验证
    Users loginUserPass(String uphone, String password);
    //ajax验证用户是否存在
    boolean ajaxLoginUser(String uphone);
    //获取短信验证码
    String LoginKey(HttpServletRequest request, String uphone);
    //短信验证登录
    boolean LoginphoneKey(HttpServletRequest request, String uphone, String key, String status);
    //用户注册
    boolean insert(HttpServletRequest request, String uphone, String key);
    //修改用户信息
    int updateByPrimaryKeySelective(Users record, String uphone);
    //修改用户密码
    int updateByPssword(HttpServletRequest request, String uphone, String password, String key);
    //用户退出登录
    void loginOut(HttpServletRequest request, String uphone);
    //注销用户
    int deleteByPrimaryKey(HttpServletRequest request, String uphone, String key);

}
