<%@page import="com.exam.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		User user=new User();
		user.setName(name);
		user.setPwd(pwd);
		request.setAttribute("user", user);
		RequestDispatcher dis=request.getRequestDispatcher("LoginSuccess.jsp");
		dis.forward(request, response);
		
	%>
</body>
</html>