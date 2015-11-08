package com.lzq.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.lzq.entity.User;
import com.opensymphony.xwork2.ActionContext;

/**
 * ���̳�ActionSupport�ӿ�ʱ
 * ��ȡsession��request��response�ķ���
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
	
//  ������
//	private Map<String, Object> request;
//	@Override
//	public void setRequest(Map<String, Object> request) {
//		this.request=request;
//	}
	
//  ������	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	private HttpServletRequest request;
	
	public String execute() throws Exception {
		
		
		/*
		 * ��IoC��ʽ����һ�ַ�ʽ
		 * HttpServletRequest request=ServletActionContext.getRequest();
		 * System.out.println(request.getAttribute("user.userName"));
		 */
		
		/*
		 * ��IoC��ʽ���ڶ��ַ�ʽ
		 * Map request=(Map)ActionContext.getContext().get("request");
		 * System.out.println(request.get("user.userName"));
		 */
		
		/*
		 * IoC��ʽ�������ַ�ʽ
		 * ʵ�ֽӿڣ�RequestAware��ResponseAware��SessionAware
		 * ����Map˽�ж���private Map<String, Object> request��ʵ��set����;
		 * System.out.println(request.get("user.userName"));
		 */
		
		/*
		 * IoC��ʽ�������ַ�ʽ
		 * ʵ�ֽӿ�ServletRequestAware
		 * ����HttpServletRequest����ʵ��set������setServletRequest
		 */
		System.out.println(request.getAttribute("user.userName"));
		
		String forward = null;
		System.out.println("LoginAction");

		if ("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())) {
			System.out.println("��¼�ɹ���");
			forward = "success";
		} else {
			System.out.println("��¼ʧ�ܣ�");
			forward = "error";
		}

		return forward;
	}
}
