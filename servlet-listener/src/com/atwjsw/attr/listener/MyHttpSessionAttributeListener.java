package com.atwjsw.attr.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("HttpSessionAttributeListener....attributeAdded : " 
				+ httpSessionBindingEvent.getName());

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("HttpSessionAttributeListener....attributeRemoved : " 
				+ httpSessionBindingEvent.getName());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("HttpSessionAttributeListener....attributeReplaced : " 
				+ httpSessionBindingEvent.getName());
	}

}
