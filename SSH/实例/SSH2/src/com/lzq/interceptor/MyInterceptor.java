package com.lzq.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 拦截器
 * @author liuzhengquan
 *
 */
public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("---------MyInterceptor.destory()-------------");
	}

	@Override
	public void init() {
		System.out.println("---------MyInterceptor.init()-------------");
	}

	/**
	 * 请求前，先调用intercept方法
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("---------MyInterceptor.intercept()-------------");
		String result=null;
		
		//得到session
		Map<String, Object> sessionMap=invocation.getInvocationContext().getSession();
		
		String userName=(String)sessionMap.get("userName");
		
		System.out.println("userName="+userName);
		
		if (userName != null) {
			result=invocation.invoke();
		}else {
			result="checkError";
		}
		return result;
	}

}
