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
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class FirstFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("FirstFilter destroyed.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("FirstFilter doFilter starts...");
		
		HttpServletResponse httpResp = (HttpServletResponse)response;
		//httpResp.sendRedirect("filter.jsp");		
		//request.getRequestDispatcher("/filter.jsp").forward(request, response);
		filterChain.doFilter(request, response);
		System.out.println("FirstFilter doFilter ends...");
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("FirstFilter filter inited.");
	}

}
