package com.lzq.action;

import javax.annotation.Resource;

import com.lzq.entity.User;
import com.lzq.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * paojia 将属性放在user里面
 * @author liuzhengquan
 *
 */
public class UserManagerAction extends ActionSupport {

	@Resource
	private UserService userService;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String addUser() {
		userService.addUser(user);
		return "success";
	}

	public String delUser() {
		userService.delUser(user.getUserId());
		return "success";
	}

	public String modifyUser() {
		userService.modifyUser(user);
		return "success";
	}
}
