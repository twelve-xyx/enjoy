package com.qf.controller;

import com.qf.dao.CollectMapper;
import com.qf.pojo.Collect;
import com.qf.pojo.Users;
import com.qf.service.CollectService;
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
public class CollectController {

	@Resource
	private CollectService collectService;

	@Resource
	private UsersService usersService;


	/**
	 *  添加到我的收藏,
	 * @param uid       要添加到收藏列表的id
	 * @param currentUid    当前用户的id
	 * @return
	 */
	@RequestMapping("/index/insertCollect")
	@ResponseBody
	public Map<String,Object> findall(int uid,int currentUid){
		Users users = usersService.findById(uid);
		Collect collect=new Collect();
		//传入当前登录用户id
		collect.setUid(currentUid);
		collect.setUsername(users.getUsername());
		collect.setCreatetime(new Date());
		collect.setUserpicture(users.getUserpicture());
		int i = collectService.insertSelective(collect);
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


		return map;
	}


}
