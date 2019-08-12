package com.qf.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 半城烟雨半城沙,我在等风也等你
 */
@Controller
public class TestController {
	@RequestMapping("/asdafas")
	@ResponseBody
	public String  find2(HttpServletResponse response) throws  Exception{
		String  json = "hello,springboot~!!";
		return "{\"json\":\""+json+"\"}";

	}
}
