package com.atwjsw.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		int counter = (int)servletContextEvent.getServletContext().getAttribute("counter");
		//System.out.println("contextDestroyed : counter = " + (counter+1));
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		String initParam = servletContextEvent.getServletContext().getInitParameter("initParam");
		servletContextEvent.getServletContext().setAttribute("counter", 1);
		//System.out.println("contextInitialized: initParam = " + initParam);

	}

}
