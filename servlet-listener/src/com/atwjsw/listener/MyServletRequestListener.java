package com.atwjsw.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		//System.out.println("requestDestroyed");

	}

	@Override
	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		String username = servletRequestEvent.getServletRequest().getParameter("username");
		//System.out.println("requestInitialized : username = " + username);
		

	}

}
