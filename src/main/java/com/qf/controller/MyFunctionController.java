package com.qf.controller;

import com.qf.pojo.Dynamic;
import com.qf.pojo.Friend;
import com.qf.pojo.Users;
import com.qf.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyFunctionController {
    @Resource
    private UsersService usersServicel;


//我的详细资料
    @RequestMapping("/user/userinformation")
    public Users myInfo(Users users){
        return usersServicel.getUsers(users);
    }


//我的动态
    @RequestMapping("/user/myDynamic")
    public List<Dynamic> myDynamic(Dynamic dynamic){
        return usersServicel.getDynamic(dynamic);
    }

//好友的动态
    @RequestMapping("/user/userDynamic")
    public List<Dynamic> userDynamic(Dynamic dynamic)
    {
        return usersServicel.getDynamic(dynamic);
    }
//最近来访
    @RequestMapping("/user/rvisitor")
    public List<Users> getRecentVisitor(Friend friend){
      List<Friend> friends=new ArrayList<>();
        friends=  usersServicel.findFriend(friend);
        List list=new ArrayList();
        for (Friend friend1 : friends) {
            list.add(friend1.getU2id());
        }
        List<Users> users=usersServicel.findFriendMsg(list);
        return users;


    }
}
