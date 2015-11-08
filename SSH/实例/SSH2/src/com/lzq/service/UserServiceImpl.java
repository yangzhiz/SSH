package com.lzq.service;

import javax.annotation.Resource;

import com.lzq.dao.UserDao;
import com.lzq.entity.User;

public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void delUser(String userName) {
		userDao.delUser(userName);
	}

	@Override
	public void modifyUser(User user) {
		userDao.modifyUser(user);
	}

}
