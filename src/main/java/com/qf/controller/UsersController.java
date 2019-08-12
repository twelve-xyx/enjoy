package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Dynamic;
import com.qf.pojo.Users;
import com.qf.service.DynamicService;
import com.qf.service.UsersService;
import com.qf.util.DataView;
import net.sf.jsqlparser.expression.DateValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import javax.annotation.Resource;
import java.nio.channels.FileChannel;
import java.util.*;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@RestController
public class UsersController {

	@Resource
	private UsersService usersService;

	@Resource
	private DynamicService dynamicService;

	/**
	 *  首页显示所有信息,分页24页,默认第一页
	 * @return
	 */
	@GetMapping("/index/findall")
	public Map<String,Object> findall(){
		List<Users> users = usersService.findall();
		for (Users user : users) {
			List<Dynamic> dynamics = dynamicService.findallDynamic(user.getUid());
			user.setDynamicList(dynamics);
		}
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",users);
		return map;
	}


	/**
	 * 左滑切换下一个,
	 * 点击我的收藏后切换下一个用户
	 * @return
	 */
	@RequestMapping("/index/findone")
	public Map CountUsers(){
		List<Users> users = usersService.findall();
		int size = users.size();
		int id = (int) (1+Math.random() * size);
		Users user = usersService.findById(id);
		List<Dynamic> dynamics = dynamicService.findallDynamic(user.getUid());
		user.setDynamicList(dynamics);
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",user);
		return map;
	}


}
