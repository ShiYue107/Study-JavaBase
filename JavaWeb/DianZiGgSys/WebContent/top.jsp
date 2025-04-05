<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="com.zf.pojo.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
 %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>简易论坛</title>
<meta http-equiv=conent-type content="text/html; charset=utf-8">
</head>
<body>
	<div>
		<img src="image/logo-blue.png" width="300" height="100">
	</div>
	<!-- 用户信息、登录、注册 -->
	<%
		if(session.getAttribute("user") == null){
	%>
	<div class="h">
		您尚未<a href="login.jsp">登录</a> &nbsp;|&nbsp;<a href="reg.jsp">注册</a>|
	</div>
	<%
		}else{
			User loginUser = (User)session.getAttribute("user");
	%>
	<div>
		您好：
		<%=loginUser.getuName()%>&nbsp;|&nbsp;<a href="UserServlet?operate=logout">登出</a>|
	</div>
	<%
		}
	%>
</body>
</html>