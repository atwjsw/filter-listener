package com.atwjsw.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atwjsw.entity.User;

public class LoginServlet extends HttpServlet {	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("username: " + username);
		User user = login(username, password);
		if (user!=null) {
			System.out.println("user.getUsername() " + user.getUsername());
			req.getSession().setAttribute("loginUser", user.getUsername());
			req.getRequestDispatcher("/login_s.jsp").forward(req, resp);
		}	else {
			//登录失败用sendRedirect.
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	//模拟登录方法
	private User login(String username, String password) {
		
		User user = null;
		if (username.equals("admin") && password.equals("admin")) {
			user = new User("张三", "admin");
		} 
		return user;
		
	}
}
