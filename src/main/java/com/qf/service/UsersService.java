package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Dynamic;
import com.qf.pojo.Friend;
import com.qf.pojo.Friendlist;
import com.qf.pojo.Users;

import java.util.List;
import java.util.Map;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
public interface UsersService {
	int deleteByPrimaryKey(Integer uid);

	int insert(Users record);

	int insertSelective(Users record);

	Users selectByPrimaryKey(Integer uid);

	int updateByPrimaryKeySelective(Users record);

	int updateByPrimaryKey(Users record);

//	查询所有数据,用户信息+精选图片+个人标签
//	三表联查
	public List<Users> findall();

	public PageInfo<Users> findAll(int index, int size );

	//根据id查询用户全部信息
	public Users findById(int uid);

	public List<Users> findByUsername(Map map);

	//我的详细资料(主键查询用户表)
	public Users getUsers(Users users);
	//我的动态
	public List<Dynamic> getDynamic(Dynamic dynamic);
	//最近来访的id
	public List<Friend> findFriend(Friend friend);
	//最近来访的详细资料
	public List<Users> findFriendMsg(List list);
}
