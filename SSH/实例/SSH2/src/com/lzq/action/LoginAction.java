package com.lzq.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){
		String forward=null;
		
		if ("admin".equals(userName) && "admin".equals(password)) {
			Map sessionMap=(Map)ActionContext.getContext().get("session");
			sessionMap.put("userName", userName);
			forward="success";
		}else {
			forward="error";
		}
		return forward;
	}
}
