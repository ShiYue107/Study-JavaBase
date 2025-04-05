<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.zf.pojo.*" %>
<%@page import="com.zf.impl.*" %>
<%@page import="com.zf.dao.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
 %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<title>电子公告牌系统 -- 登录</title>
<meta http-equiv=conent-type content="text/html; charset=gnk">
<link rel="stylesheet" type="text/css" href="style/style.css"/>
</head>

<body>
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 导航 -->
	<div>
		&gt;&gt;<b><a href="<%=path%>/index.jsp">论坛首页</a></b>
	</div>
	<br />
	<!-- 错误信息 -->
	<div class="t" align="center">
		<br /><font color="red"><%=request.getParameter("msg")%></font><br />
		<br /><input type="button" value="返回"
			onclick="window.history.back();" class="btn"><br />
		<br />
	</div>
	<!-- 声明 -->
	<br/>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>










