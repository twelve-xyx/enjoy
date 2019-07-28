package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.UsersService;
import com.qf.util.DataView;
import net.sf.jsqlparser.expression.DateValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import javax.annotation.Resource;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Controller
public class UsersController {

	@Resource
	private UsersService usersService;

	@RequestMapping("/find")
	@ResponseBody
	public Map<String,Object> findall(int uid){
		Users users = usersService.selectByPrimaryKey(uid);
		Map map=new HashMap();
		map.put("code",1);
		map.put("msg","成功");
		map.put("data",users);
		return map;
	}

}
