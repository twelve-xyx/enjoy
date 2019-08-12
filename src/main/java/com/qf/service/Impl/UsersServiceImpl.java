package com.qf.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.FriendMapper;
import com.qf.dao.UsersMapper;
import com.qf.pojo.*;
import com.qf.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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
	public List<Users> findall(){
		return usersMapper.findall();
	}


	@Override
	public PageInfo<Users> findAll(int index, int size){
		PageHelper.startPage(index, size);
		List<Users> users = usersMapper.findAll();
		PageInfo<Users> pageInfo=new PageInfo<>(users);
		return pageInfo;
	}

	public Users findById(int uid){
		return usersMapper.findById(uid);
	}

	public List<Users> findByUsername(Map map){
		return usersMapper.findByUsername(map);
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

	@Override
	public int addTag(Lables lables) {
		return usersMapper.insertTag(lables);
	}

	@Override
	public int updateTag(Lables lables) {
		return usersMapper.updateTag(lables);
	}

	@Override
	public int deleteTag(Lables lables) {
		return usersMapper.deleteTag(lables);
	}
}
