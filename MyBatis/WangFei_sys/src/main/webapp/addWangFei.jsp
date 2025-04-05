<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>新增用户</h2>
	<form action="addWF" method="post">
		<table border="1">
			<tr>
				<td>账 号:</td>
				<td><input type="text" name="number" /></td>
			</tr>
			<tr>
				<td>密 码:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>余 额:</td>
				<td><input type="text" name="balance" /></td>
			</tr>
			<tr>
				<td>描 述:</td>
				<td><input type="text" name="descs" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"/></td>
				<td><input type="reset" name="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>