package com.qf;

import com.qf.pojo.Users;
import com.qf.service.Impl.UsersServiceImpl;
import com.qf.service.UsersService;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
public class Test {


	public static void main(String[] args) {
		UsersService usersService=new UsersServiceImpl();

		Users users = usersService.selectByPrimaryKey(1);

		Integer age = users.getAge();
		System.out.println(age);
	}
}
