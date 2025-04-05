<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.itkoma.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
</head>
<body>
	<h1>修改会员信息</h1>
	<form action="updateVip">
	<%Vip vip = (Vip)request.getAttribute("vip"); %>
		<table border="1">
			<input type="hidden" name="id" value="${vip.id }"/>
			<tr><td>电话号</td><td><input type="text" name="phone" value="${vip.phone }"/></td></tr>
			<tr><td>姓 名</td><td><input type="text" name="name"/ value="${vip.name }"></td></tr>
			<tr><td>性 别</td><td><input type="text" name="gender" value="${vip.gender }"/></td></tr>
			<tr><td>开卡日期</td><td><input type="text" name="openDate" value="${vip.openDate }"/></td></tr>
			<tr><td>账户余额</td><td><input type="text" name="balance" value="${vip.balance }"/></td></tr>
			<tr><td colspan="2" align="center">
					<input type="submit" value="提交"/>
					<input type="reset" value="重置"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>