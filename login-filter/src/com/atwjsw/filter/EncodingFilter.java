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

public class EncodingFilter implements Filter {	

	@Override
	public void destroy() {
		System.out.println("EncodingFilter destroyed.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("EncodingFilter doFilter starts...");
		
		request.setCharacterEncoding("utf-8");
		filterChain.doFilter(request, response);			
		response.setCharacterEncoding("utf-8");
		System.out.println("EncodingFilter doFilter ends...");		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("EncodingFilter filter inited.");
	}

}
