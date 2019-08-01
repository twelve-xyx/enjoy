package com.qf.dao;


import com.qf.pojo.Dynamic;
import com.qf.pojo.Friend;

import com.qf.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    //查询所有数据,用户信息+精选图片+个人标签
    //三表联查
    public Users findbyuid(int uid);


    //我的详细资料
    Users selectUsersMsg(Users users);
     //我的动态
    List<Dynamic> findMyDynamic(Dynamic dynamic);
    //最近访问
    List<Users> findMsgByFriend(List<Friend> list);



}