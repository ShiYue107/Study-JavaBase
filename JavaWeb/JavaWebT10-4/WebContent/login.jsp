<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UserMangerServlet" method="post">
		<table>
			<tr>
				<td>用户名:<input type="text" name="account"/></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;&nbsp;码<input type="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" /><input type="hidden" 
				     name="flag" value="_login"/></td>
			</tr>
			<tr>
				<td><font color="red">${msg}</font></td>
			</tr>
		</table>
	</form>
</body>
</html>