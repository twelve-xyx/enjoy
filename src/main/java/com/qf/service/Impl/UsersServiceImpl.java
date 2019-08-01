package com.qf.service.Impl;

import com.qf.dao.UsersMapper;
import com.qf.pojo.Users;
import com.qf.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qf.dao.FriendMapper;
import com.qf.dao.UsersMapper;
import com.qf.pojo.Dynamic;
import com.qf.pojo.Friend;
import com.qf.pojo.Users;
import com.qf.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;

	@Resource
	private FriendMapper friendMapper;


	@Override
	public int deleteByPrimaryKey(Integer uid) {
		return 0;
	}

	@Override
	public int insert(Users record) {
		return 0;
	}

	@Override
	public int insertSelective(Users record) {
		return 0;
	}

	@Override
	public Users selectByPrimaryKey(Integer uid) {
		return usersMapper.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByPrimaryKeySelective(Users record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Users record) {
		return 0;
	}

	@Override
	public Users findbyuid(int uid) {
		return usersMapper.findbyuid(uid);
	}

	@Override
	public Users getUsers(Users users) {
		return usersMapper.selectUsersMsg(users);
	}

	@Override
	public List<Dynamic> getDynamic(Dynamic dynamic) {
		return usersMapper.findMyDynamic(dynamic);
	}

	@Override
	public List<Friend> findFriend(Friend friend) {
		return friendMapper.findFriend(friend);
	}

	@Override
	public List<Users> findFriendMsg(List list) {
		return usersMapper.findMsgByFriend(list);
	}




}
