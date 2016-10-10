<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
<h1>登录页面</h1>
<hr>
<form action="<%=path%>/servlet/LoginServlet" method="post">
<table>
<tr>
<td><label for="verificationCode">请输入验证码：</label></td>
<td><input type="text" id="verificationCode" name="verificationCode"/></td>
<td><img id="imageCode" src="<%=path %>/servlet/ImageServlet"></img></td>
<%-- <td><a href="<%=path %>/servlet/ImageServlet">看不清换一个</a></td> --%>
<td><a href="javascript: reloadCode();">看不清换一个</a></td>
</tr>
<tr>
<td colspan="4"><button type="submit">登录</button></td>
</tr>
</table>
</form>
<script type="text/javascript">
	function reloadCode() {
		var time = new Date().getTime() 
		document.getElementById("imageCode").src="<%=path %>/servlet/ImageServlet?time="+time;
		<%-- console.log("<%=path %>/servlet/ImageServlet?time="+time); --%>
	}
</script>
</body>
</html>