package com.hello.word.web.service.ipml;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.word.web.Mapper.TestMapper;
import com.hello.word.web.controller.User;
import com.hello.word.web.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);
	

	@Autowired
	TestMapper testMapper;
	
	@Override
	public List<User> test() {
		List<User> list = testMapper.listUser();
		LOGGER.info("=============================:{}",list);
		return list;
	}

}
