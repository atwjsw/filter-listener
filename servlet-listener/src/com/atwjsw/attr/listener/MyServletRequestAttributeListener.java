package com.atwjsw.attr.listener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("ServletRequestAttributeListener....attributeAdded : " 
				+ servletRequestAttributeEvent.getName());

	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("ServletRequestAttributeListener....attributeRemoved : " 
				+ servletRequestAttributeEvent.getName());

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		System.out.println("ServletRequestAttributeListener....attributeReplaced : "
				+ servletRequestAttributeEvent.getName());

	}

}
