<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ITkoma电脑会员系统</title>
</head>
<body>
	<h2>ITkoma电脑会员系统</h2>
	<a href="addVip.jsp">新增会员</a>
	<form action="queryAllVip">
		姓名&nbsp;&nbsp;<input type="text" name="name"/>
		性别&nbsp;&nbsp;<input type="text" name="gender"/>
		<button>搜索</button>
	</form>
	<table border="1">
		<tr>
			<td>编 号</td>
			<td>电 话号</td>
			<td>姓 名</td>
			<td>性 别</td>
			<td>开卡日期</td>
			<td>账户余额</td>
			<td>操 作</td>
		</tr>
		<c:forEach var="vip" items="${list }">
			<tr>
				<td><c:out value="${vip.id }"/></td>
				<td><c:out value="${vip.phone }"/></td>
				<td><c:out value="${vip.name }"/></td>
				<td><c:out value="${vip.gender }"/></td>
				<td><c:out value="${vip.openDate }"/></td>
				<td><c:out value="${vip.balance }"/></td>
				<td>
					<a href="deleteVip?id=${vip.id }">删除</a>
					<a href="findOne?id=${vip.id }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>