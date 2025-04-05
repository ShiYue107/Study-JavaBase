<%@page import="com.student.Model.*  "%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有的学生信息</title>
<style type="text/css">
	*{
		margin: 0 auto;
		padding: 0px;
	}
</style>
</head>
<body>
	<table border="1">
		<tr><td colspan="6"><h1>云南理工学生信息管理系统</h1></td></tr>
		<%User user=(User)session.getAttribute("user"); %>
		<tr><td colspan="6">欢迎[<%=user.getName() %>]</td></tr>
		<tr>
			<td>学生编号</td>
			<td>学生姓名</td>
			<td>学生性别</td>
			<td>学生年龄</td>
			<td>联系电话</td>
			<td>家庭住址</td>
		</tr>
		<c:forEach var="stu" items="${stuList }"> 
			<tr>
				<td><c:out value="${stu.id}"/></td>
				<td><c:out value="${stu.name}"/></td>
				<td><c:out value="${stu.gender}"/></td>
				<td><c:out value="${stu.age}"/></td>
				<td><c:out value="${stu.tel}"/></td>
				<td><c:out value="${stu.address}"/></td>		
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6"><a href="addStudent.jsp">添加学生信息</a></td>
		</tr>
		
	</table>
</body>
</html>