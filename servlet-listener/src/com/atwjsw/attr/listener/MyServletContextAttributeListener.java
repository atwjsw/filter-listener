package com.atwjsw.attr.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("ServletContextAttributeListener....attributeAdded : " 
					+ servletContextAttributeEvent.getName());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("ServletContextAttributeListener....attributeRemoved : " 
					+ servletContextAttributeEvent.getName());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
		System.out.println("ServletContextAttributeListener....attributeReplaced : " 
					+ servletContextAttributeEvent.getName());
	}

}
