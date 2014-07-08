package com.rainbow.paidui.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainbow.paidui.web.dao.UserMapper;
import com.rainbow.paidui.web.model.User;
import com.rainbow.paidui.web.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		return userMapper.addUser(user);
	}

}
