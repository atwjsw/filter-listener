<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% 
	session.setAttribute("sessionAttr", "sessionAttr"); 
	application.setAttribute("applicationAttr", "applicationAtrri");
	request.setAttribute("requestAttr", "requestAttr");
	session.setAttribute("currentUser", new com.atwjsw.listener.entity.User()); 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Servlet listener测试</title>
</head>
<body>
<h1>Servlet listener测试</h1>
<a href="attribute.jsp">属性变化监听器测试</a>
</body>
</html>