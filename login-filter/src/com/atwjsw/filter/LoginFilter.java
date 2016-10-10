package com.atwjsw.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class LoginFilter implements Filter {	

	@Override
	public void destroy() {
		System.out.println("LoginFilter destroyed.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("LoginFilter doFilter starts...");
		
		HttpServletRequest httpReq = (HttpServletRequest)request;
		System.out.println(httpReq.getSession().getAttribute("loginUser"));
		if (httpReq.getSession().getAttribute("loginUser")!=null) {
			filterChain.doFilter(request, response);			
		} else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		System.out.println("LoginFilter doFilter ends...");		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("LoginFilter filter inited.");
	}

}
