package com.hello.word.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.word.web.service.TestService;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("getUser")
	public Result<Object> getUserInfo() {
		Result<Object> result = new Result<Object>();
		result.setCode(0);
		result.setDesc("用户信息");
		result.setT(testService.test());
		return result;
	}
}
