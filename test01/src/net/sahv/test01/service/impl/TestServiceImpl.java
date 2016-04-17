package net.sahv.test01.service.impl;

import org.springframework.stereotype.Service;

import net.sahv.test01.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Override
	public String getMsg(String name){
		return "hello"+name;
	}
}
