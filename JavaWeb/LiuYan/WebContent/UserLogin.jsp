<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
	margin: 0px auto;
	padding:0px;
	}
</style>
</head>
<body>
	<form action="userLogin" method="post">
		<h1>Tony时尚美发店</h1>
		用户名:<input name="userName" type="text"><br>
		密&nbsp;&nbsp;码:<input name="password" type="password"><br>
		<button>登录</button>
		<a href="register.jsp">去注册...</a>
	</form>
</body>
</html>