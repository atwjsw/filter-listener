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
import javax.xml.ws.Response;

public class SecondFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("SecondFilter filter destroyed.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("SecondFilter doFilter starts...");
		filterChain.doFilter(request, response);
		System.out.println("SecondFilter doFilter ends...");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("SecondFilter filter inited.");
	}

}
