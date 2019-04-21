package com.springtest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BasicInterceptorByExtends extends HandlerInterceptorAdapter {
	/**
	 * 在业务处理之前调用
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=============>>1");
		return true;
	}
	/**
	 * 在业务处理器处理请求执行完成后，生成视图之前执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle============>>1");
	}
	/**
	 * 完全处理完请求后被调用，可用于清理资源等
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)throws Exception {    
		System.out.println("afterCompletion=======>>1");
	} 
}
