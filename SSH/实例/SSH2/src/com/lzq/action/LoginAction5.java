package com.lzq.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.lzq.entity.User;
import com.opensymphony.xwork2.ActionContext;

/**
 * 不继承ActionSupport接口时
 * 获取session、request、response的方法
 * @author liuzhengquan
 *
 */
public class LoginAction5 implements  ServletRequestAware {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
//  第三种
//	private Map<String, Object> request;
//	@Override
//	public void setRequest(Map<String, Object> request) {
//		this.request=request;
//	}
	
//  第四种	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	private HttpServletRequest request;
	
	public String execute() throws Exception {
		
		
		/*
		 * 非IoC方式：第一种方式
		 * HttpServletRequest request=ServletActionContext.getRequest();
		 * System.out.println(request.getAttribute("user.userName"));
		 */
		
		/*
		 * 非IoC方式：第二种方式
		 * Map request=(Map)ActionContext.getContext().get("request");
		 * System.out.println(request.get("user.userName"));
		 */
		
		/*
		 * IoC方式：第三种方式
		 * 实现接口：RequestAware、ResponseAware、SessionAware
		 * 声明Map私有对象private Map<String, Object> request，实现set方法;
		 * System.out.println(request.get("user.userName"));
		 */
		
		/*
		 * IoC方式：第四种方式
		 * 实现接口ServletRequestAware
		 * 声明HttpServletRequest对象，实现set方法：setServletRequest
		 */
		System.out.println(request.getAttribute("user.userName"));
		
		String forward = null;
		System.out.println("LoginAction");

		if ("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())) {
			System.out.println("登录成功！");
			forward = "success";
		} else {
			System.out.println("登录失败！");
			forward = "error";
		}

		return forward;
	}
}
