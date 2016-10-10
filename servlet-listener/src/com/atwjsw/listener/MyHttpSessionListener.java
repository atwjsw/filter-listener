package com.atwjsw.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		//System.out.println("sessionCreated : sessionId = " + httpSessionEvent.getSession().getId());

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		//System.out.println("sessionDestroyed : sessionId = " + httpSessionEvent.getSession().getId());
	}

}
