<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
	<%@page import="com.exam.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		boolean isLoginSuccess=false;
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		if(account!=null&&password!=null){
			for(Adminstrator administrator : AdministratorList.adminList){
				if(account.equals(administrator.getAccount())
						&&password.equals(administrator.getPassword())){
					isLoginSuccess=true;
					break;
				}
			}
		}
		if(!isLoginSuccess){
			response.sendRedirect("login.jsp");
		}
		out.print("登录成功！！");
	%>
</body>
</html>