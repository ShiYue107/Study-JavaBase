<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.io.*,java.util.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>自定义网页动态时间</title>
</head>
<body>
	<h3>
		<%
			response.setHeader("refresh", "5;URL=There.jsp");
		%>
		当前时间是：<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) %>
	</h3>
</body>
</html>