package com.qf.service.Impl;

import com.qf.DuanXin.src.Sendsms;
import com.qf.dao.UsersMapper;
import com.qf.pojo.Users;
import com.qf.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//用户登录实现类,进行逻辑实现,用户验证
@Service
public class LoginServiceImpl implements LoginService {
    //注入dao层对象
    @Resource
    private UsersMapper usersMapper;
    //用户登录,手机号+密码
    @Override
    public Users loginUserPass(String uphone, String password) {
        //调用loginmapper的查询方法查询用户
        Users users = usersMapper.loginUserPass(uphone);
        if (users==null){
            return null;
        }
        //判断是否查询成功,查询成功则返回true,反之返回false
        if (users.getPassword().equals(password))
        {
            System.out.println("查出来的用户密码"+users.getPassword());
            return users;
        }
        return null;
    }

    //ajax验证用户是否存在
    @Override
    public boolean ajaxLoginUser(String uphone) {
        //调用loginmapper的查询方法查询用户
        Users users = usersMapper.ajaxLoginUser(uphone);
        //做判断
        if (users!=null){
            return true;
        }
        return false;
    }

    //获取短信验证码
    @Override
    public String LoginKey(HttpServletRequest request,String uphone) {
        //调用短信远程接口
        Sendsms sendsms = new Sendsms();
        String key = sendsms.Key(uphone);
        System.out.println(key);
        String keyC = uphone+"1234";
        request.getSession().setAttribute(keyC,key);
        request.getSession().setAttribute(uphone,uphone);
        return key;
    }

    //短信验证登录
    @Override
    public int LoginphoneKey(HttpServletRequest request,String uphone, String key,String status) {
        //取出缓存中的key和手机号
        String keyC = uphone+"1234";
        String key1 =(String) request.getSession().getAttribute(keyC);
        String uphoneN =(String) request.getSession().getAttribute(uphone);
        //查询用户信息
        Users users = usersMapper.loginUserPass(uphone);
        System.out.println(key1);
        //先判断手机号对不对在判断验证码是否正确
        if (uphoneN==null||key1==null){
            return 1;
        }

        if (users==null){
            request.getSession().setAttribute("zhuce",uphoneN);
            return 2;
        }
        if (uphoneN.equals(uphone)){
            if (key!=null&key!=""&&key1.equals(key)){
                //登陆成功,判断ststus是否为空,不为空则保存用户名和密码
                if(status.equals("0")){
                    HttpSession session = request.getSession();
                    session.setAttribute(uphone,uphone);
                    session.setAttribute(uphone+"password",users.getPassword());
                }
                System.out.println(request.getSession().getAttribute(keyC));
                request.getSession().removeAttribute(keyC);
                return 0;
            }else {
                return 1;
            }
        }
        return 1;
    }

    //注册用户
    @Override
    public boolean insert(HttpServletRequest request,String uphone,String pass) {

            //创建注册默认值
        if (pass==null){
            return false;
        }
        if (uphone==null){
            return false;
        }
            Users users = new Users();
            //生成随机名字
            String mcode ="MM" +(int)((Math.random()*9+1)*100);
            //设置参数
            users.setUsername(mcode);
            users.setUname("无");
            users.setUphone(uphone);
            users.setSex(0);
            users.setProfession("无");
            users.setAddress("无");
            users.setPassword(pass);
            users.setAge(18);
            users.setUserpicture("http://b-ssl.duitang.com/uploads/item/201504/17/20150417H0954_zPwhH.jpeg");
            users.setDistance(0.00);
            users.setState(0);
            users.setRegistertime(new Date());
            //调用注册方法
             int insert = usersMapper.insert(users);
            if (insert>0){
                System.out.println("注册成功services");
                String keyC = uphone+"1234";
                request.getSession().removeAttribute(keyC);
                request.getSession().removeAttribute(uphone);
                return true;
            }
           else {
                return false;
            }
    }

    //修改用户信息
    @Override
    public int updateByPrimaryKeySelective(Users record, String uphone) {
        //传入用户的手机号
        record.setUphone(uphone);
        //Z执行插入

        int i = usersMapper.updateByPrimaryKeySelective(record) ;
        System.out.println(i+"是否成功的状态");
        //判断是否更新成功
        if (i>0){
            return 2;
        }
        return 1;
    }
    //修改用户密码
    @Override
    public int updateByPssword(HttpServletRequest request,String uphone, String password,String key) {
        //取出缓存中的key和手机号,判断是否是当前需要更改密码的手机号
        String keyC =uphone +"1234";
        String key1 =(String) request.getSession().getAttribute(keyC);
        String uphoneN =(String) request.getSession().getAttribute(uphone);

        if (uphoneN==null||key1==null){
            return 1;
        }

        //判断用户手机号和验证码是否正确
        if (uphoneN.equals(uphone)&&key1.equals(key))
        {
            //判断用户密码是否和上一次一致,一致时,提示错误
            Users users = usersMapper.loginUserPass(uphone);
            if (users.getPassword().equals(password)){
                return 2;
            }else{
                //创建map传递要更改的密码
                Map map = new HashMap();
                map.put("uphone",uphone);
                map.put("password",password);
                int i = usersMapper.updateByPssword(map);
                if (i>0){
                    return 0;
                }else{
                    return 1;
                }
            }
        }
        return 0;
    }

    //退出登录
    @Override
    public void loginOut(HttpServletRequest request,String uphone) {
        //移除session缓存中的用户
        String attribute =(String) request.getSession().getAttribute(uphone);
        String password =(String) request.getSession().getAttribute(uphone+"password");
        if (attribute!=null&&password!=null){
            request.getSession().removeAttribute(uphone);
            request.getSession().removeAttribute(uphone+"password");
        }
    }

    //注销用户
    @Override
    public int deleteByPrimaryKey(HttpServletRequest request, String uphone, String key) {
        String keyC =uphone +"1234";
        String key1 =(String) request.getSession().getAttribute(keyC);
        String uphoneN =(String) request.getSession().getAttribute(uphone);

        if (uphoneN==null||key1==null){
            return 1;
        }

        //判断用户手机号和验证码是否正确
        if (uphoneN.equals(uphone)&&key1.equals(key)) {
            int i = usersMapper.deleteByPrimaryKey(uphone);
            request.getSession().removeAttribute(keyC);
            request.getSession().removeAttribute(uphone);
            return 0;
        }
        return 1;
    }


}
