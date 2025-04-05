<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增</title>
</head>
<body>
	<h1>新增会员</h1>
	<form action="addVip">
		<table border="1">
			<tr><td>电话号</td><td><input type="text" name="phone"/></td></tr>
			<tr><td>姓 名</td><td><input type="text" name="name"/></td></tr>
			<tr><td>性 别</td><td><input type="text" name="gender"/></td></tr>
			<tr><td>开卡日期</td><td><input type="text" name="openDate"/></td></tr>
			<tr><td>账户余额</td><td><input type="text" name="balance"/></td></tr>
			<tr><td colspan="2" align="center">
					<input type="submit" value="提交"/>
					<input type="reset" value="重置"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>