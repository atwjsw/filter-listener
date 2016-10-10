<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% 
	session.removeAttribute("sessionAttr"); 
	session.removeAttribute("currentUser");
	application.removeAttribute("applicationAttr");
	request.removeAttribute("requestAttr");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>属性变化监听器测试</title>
</head>
<body>
<h1>属性变化监听器测试</h1>
</body>
</html>