<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>返校信息查询系统</title>
</head>
<body>
	<h2>返校信息管理系统</h2>
	<table border="1">
		<tr>
			<td>选择</td>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>出发地</td>
			<td>返校日期</td>
			<td>核酸检测日期</td>
			<td>核酸检测结果</td>
			<td>操作</td>
		</tr>
		<c:forEach var="ci" items="${list}">
			<tr>
			<td><input type="checkbox" value="${ci.id}"></td>
			<td><c:out value="${ci.id}"/></td>
			<td><c:out value="${ci.name}"/></td>
			<td><c:out value="${ci.gender}"/></td>
			<td><c:out value="${ci.from}"/></td>
			<td><c:out value="${ci.returnDate}"/></td>
			<td><c:out value="${ci.checkDate}"/></td>
			<td><c:out value="${ci.state}"/></td>
			<td><a href="DelServlet?id=${ci.id}">删除</a></td>
		</tr>
		</c:forEach>
	</table>
	<tr><a href="addCheckInfo.jsp">新增</a></tr>
</body>
</html>