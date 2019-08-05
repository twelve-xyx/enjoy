package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Users;

import java.util.List;

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
}
