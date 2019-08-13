package com.qf.dao;

import com.qf.pojo.*;

import java.util.List;
import java.util.Map;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    //查询所有数据,用户信息+精选图片+个人标签
    //三表联查
    public List<Users> findall();
    public List<Users> findAll();

    //根据id查询当前用户的信息
    public Users findById(int uid);

    public List<Users> findByUsername(Map map);

    //我的详细资料
    Users selectUsersMsg(Users users);
    //我的动态
    List<Dynamic> findMyDynamic(Dynamic dynamic);
    //最近访问
    List<Users> findMsgByFriend(List<Friend> list);
    //新增标签
    int insertTag(Lables lables);
    //修改标签
    int updateTag(Lables lables);
    //删除标签
    int deleteTag(Lables lables);

    //用户登录接口

    //手机号,用户密码验证
    Users loginUserPass(String uphone);
    //ajax验证用户是否存在
    Users ajaxLoginUser(String uphone);
    //更改用户密码
    int updateByPssword(Map map);

    int deleteByPrimaryKey(String uphone);

}