package com.qf.controller;

import com.qf.dao.FriendlistMapper;
import com.qf.pojo.FrieandApply;
import com.qf.pojo.Friendlist;
import com.qf.pojo.Users;
import com.qf.service.FrieandApplyService;
import com.qf.service.FriendlistService;
import com.qf.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Controller
public class FrieandApplyController {
	@Resource
	private FrieandApplyService frieandApplyService;

	@Resource
	private UsersService usersService;

	@Resource
	private FriendlistService friendlistService;


	@RequestMapping("/friend/apply")
	@ResponseBody
	public Map findById(int currentuid){
		List<FrieandApply> frieandApplies = frieandApplyService.findById(currentuid);
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",frieandApplies);
		return  map;
	}

	@RequestMapping("/friend/apply/agree")
	@ResponseBody
	public Map agree(int uid,int currentuid){

		Users user = usersService.findById(uid);
		Friendlist friendlist=new Friendlist();
		friendlist.setUid(uid);
		friendlist.setCurrentid(currentuid);
		friendlist.setUsername(user.getUsername());
		friendlist.setSex(user.getSex());
		friendlist.setUserpiceture(user.getUserpicture());
		friendlist.setFcreatetime(new Date());

		int i = friendlistService.insertSelective(friendlist);

		int j = frieandApplyService.deleteByUidAndCurrentuid(uid, currentuid);
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

	@RequestMapping("/friend/apply/refuse")
	@ResponseBody
	public Map refuse(int uid,int currentuid){
		int i = frieandApplyService.deleteByUidAndCurrentuid(uid, currentuid);
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

}
