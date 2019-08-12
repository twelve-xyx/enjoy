package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Users;
import com.qf.service.UsersService;
import com.qf.util.DataView;
import net.sf.jsqlparser.expression.DateValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import javax.annotation.Resource;
import java.nio.channels.FileChannel;
import java.util.*;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Controller
public class UsersController {

	@Resource
	private UsersService usersService;


	/**
	 *  首页显示所有信息,分页24页,默认第一页
	 * @param index
	 * @return
	 */
	@RequestMapping("/index/findall")
	@ResponseBody
	public Map<String,Object> findall(@RequestParam(defaultValue = "1") int index){
		PageInfo<Users> pageInfo = usersService.findAll(index, 24);
		List<Users> users = pageInfo.getList();
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
	@ResponseBody
	public Map CountUsers(){
		List<Users> users = usersService.findall();
		int size = users.size();
		int id = (int) (1+Math.random() * size);
		Users user = usersService.findById(id);
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",user);
		return map;
	}


}
