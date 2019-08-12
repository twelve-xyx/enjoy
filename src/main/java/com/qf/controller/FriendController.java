package com.qf.controller;

import com.qf.pojo.FrieandApply;
import com.qf.pojo.Friendlist;
import com.qf.pojo.Users;
import com.qf.service.FrieandApplyService;
import com.qf.service.FriendlistService;
import com.qf.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.ws.rs.DefaultValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Controller
public class FriendController {

	@Resource
	private FrieandApplyService frieandApplyService;

	@Resource
	private FriendlistService friendlistService;

	@Resource
	private UsersService usersService;


	@RequestMapping("/friend/findById")
	@ResponseBody
	public Map findById(int currentuid){
		List<Friendlist> friendlists = friendlistService.findById(currentuid);
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",friendlists);
		return  map;
	}



	@RequestMapping("/friend/near")
	@ResponseBody
	public Map findNear(){

		List<Users> users = usersService.findall();
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",users);
		return  map;
	}

	@RequestMapping("/friend/near/add")
	@ResponseBody
	public Map addFridend(int uid ,int currentuid ){

		Users user = usersService.findById(currentuid);
		FrieandApply frieandApply=new FrieandApply();
		frieandApply.setUid(currentuid);
		frieandApply.setCurrentid(uid);
		frieandApply.setAddress(user.getAddress());
		frieandApply.setAge(user.getAge());
		frieandApply.setProfession(user.getProfession());
		frieandApply.setSex(user.getSex());
		frieandApply.setUsername(user.getUsername());
		frieandApply.setUserpicture(user.getUserpicture());

		int i = frieandApplyService.insertSelective(frieandApply);

		Map map=new HashMap();
		if (i>0){
			map.put("code",i);
			map.put("msg","成功");
			map.put("data","");
		}else{
			map.put("code",0);
			map.put("msg","失败");
			map.put("data","");
		}
		return  map;
	}


	@RequestMapping("/friend/search")
	@ResponseBody
	public Map findByUsername(String username){
		Map map1=new HashMap();
		map1.put("username",username);
		List<Users> users = usersService.findByUsername(map1);
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",users);
		return  map;
	}
}
