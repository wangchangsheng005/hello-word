package com.hello.word.web.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hello.word.web.controller.User;

@Mapper
public interface TestMapper {

    @Select(" select * from user")
    List<User> listUser();
	
}
