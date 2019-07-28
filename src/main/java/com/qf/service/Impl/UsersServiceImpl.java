package com.qf.service.Impl;

import com.qf.dao.UsersMapper;
import com.qf.pojo.Users;
import com.qf.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;


	@Override
	public Users findbyuid(int uid) {
		return usersMapper.findbyuid(uid);
	}
}
