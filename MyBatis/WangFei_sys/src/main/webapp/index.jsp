<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>云南理工职业学院网费系统</title>
</head>
<body>
<h2>云南理工职业学院网费系统</h2>
	<a href="addWangFei.jsp">添加</a>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>账号</td>
			<td>密码</td>
			<td>余额</td>
			<td>描述</td>
			<td>操作</td>
		</tr>
		<c:forEach var="wf" items="${list }">
			<tr>
			<td><c:out value="${wf.id }"></c:out></td>
			<td><c:out value="${wf.number }"></c:out></td>
			<td><c:out value="${wf.password }"></c:out></td>
			<td><c:out value="${wf.balance }"></c:out></td>
			<td><c:out value="${wf.descs }"></c:out></td>
			<td>
				<a href="delWangFei?id=${wf.id }">删除</a>
				<a href="selOneWangFei?id=${wf.id }">修改</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>

</html>