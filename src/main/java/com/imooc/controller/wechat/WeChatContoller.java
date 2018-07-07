package com.imooc.controller.wechat;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/wechat")
public class WeChatContoller {

	@RequestMapping("/index")
	public String getWeChat(String signature){
		return signature;
	}
}
