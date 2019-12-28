package com.hello.word.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class JmeterController {
	
	Map<String, User> mapParam = new HashMap<String, User>();
	
	@RequestMapping("getToken")
	public Result<Object> getToken(String user,String password) {
		Result<Object> result = new Result<Object>();
		if(user == null || user == "") {
			result.setCode(1);
			result.setMessage("用户不可以为空");
			return result;
		}
		if(password == null || password == "") {
			result.setCode(1);
			result.setMessage("密码不可以为空");
			return result;
		}
		String token = String.valueOf(System.currentTimeMillis());
		User u = new User();
		u.setAccount(user);
		u.setPassword(password);
		mapParam.put(token, u);
		result.setCode(0);
		result.setMessage("获取token成功");
		result.setToken(token);
		return result;
	}
	
	
	@RequestMapping("isFlag")
	public boolean isFlag(String token) {
		if(mapParam.containsKey(token)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

}
