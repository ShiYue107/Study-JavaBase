<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录页面</title>
<style type="text/css">
	*{
		margin: 0 auto;
		padding: 0px;
	}
</style>
</head>
<body>
	<form action="userLogin" method="post">
		<table border="1"> 
			<tr><td colspan="2"><h1>云南理工学生信息管理系统</h1></td></tr>
			<tr><td>账号：</td><td><input name="name" type="text"/></td></tr>
			<tr><td>密码：</td><td><input name="password" type="password"/></td></tr>
			<tr><td colspan="2"><input type="submit" value="登录"/><input type="reset" value="重置"/></td></tr>
		</table>
		<%
		String msg=(String)request.getAttribute("msg");
		if(msg!=null){
		%>
		<p>错误信息：<%=msg %></p>
		<%
		}
		%>
	</form>
</body>
</html>