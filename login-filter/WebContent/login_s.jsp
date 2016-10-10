<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功页面</title>
</head>
<body>
	<h1>欢迎登录</h1>
	<hr>
	<%-- <h1>欢迎您！ <%=session.getAttribute("loginUser") %></h1> --%>
	<!-- JSP里面可以用el表达式，更好，找不到不会报错 -->
	<h1>欢迎您！${loginUser}</h1>
	<h2><a href="jsp/backend.jsp">跳转保护页面测试</a></h2>
</body>
</html>