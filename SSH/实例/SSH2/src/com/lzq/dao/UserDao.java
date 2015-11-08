package com.lzq.dao;

import com.lzq.entity.User;

public interface UserDao {
	public void addUser(User user);
	
	public void delUser(String userName);
	
	public void modifyUser(User user);
}
