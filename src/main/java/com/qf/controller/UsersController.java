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
import java.util.List;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Controller
public class UsersController {

	@Resource
	private UsersService usersService;

	@RequestMapping("/index/findall")
	@ResponseBody
	public DataView findall(ModelMap map,int uid){
		Users users = usersService.findbyuid(uid);
		List list=new ArrayList();
		list.add(users);
		DataView<Users> dataView=new DataView<>();
		dataView.setCode(0);
		dataView.setMsg("成功");
		dataView.setData(list);
		return dataView;
	}

}
