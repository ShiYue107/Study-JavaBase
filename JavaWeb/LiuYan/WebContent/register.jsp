<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
</head>
<body>
	<form action="userRegister" method="post">
		<h1>新用户注册</h1>
		用户名:<input name="userName" type="text"><br>
		密码:<input name="password" type="password"><br>
		确认密码:<input name="repwd" type="password"><br>
		<input type="hidden" name="userType" value="0">
		<button type="submit">注册</button><button type="reset">取消</button>
	</form>
</body>
</html>