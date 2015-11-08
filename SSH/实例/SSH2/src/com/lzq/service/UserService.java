package com.lzq.service;

import com.lzq.entity.User;

public interface UserService {
	
	public void addUser(User user);

	public void delUser(String userName);

	public void modifyUser(User user);
}
