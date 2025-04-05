<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:choose>
	<c:when test="${type==1 }">
		<title>管理员发帖</title>
	</c:when>
	<c:otherwise>
		<title>帖子列表</title>
	</c:otherwise>
</c:choose>
</head>
<body>
	<c:choose>
		<c:when test="${type==1 }">
			<h3>管理员[<c:out value="${account}" />]欢迎您</h3>
			<form action="TitleMangerServlet" method="post">
				<table>
					<tr>
						<td>标题名：</td>
						<td><input type="text" name="title"/></td>
						<td><input type="hidden" name="flag" value="_send"/></td>
						<td><input type="submit" value="发帖"/></td>
					</tr>
					<tr>
						<td><font color="red">${msg}</font></td>
					</tr>
					<tr>
						<td><a href="queryTitle.jsp">点击查看所有帖子列表</a></td>
					</tr>
				</table>
			</form>
		</c:when>
		<c:otherwise>
			<a href="queryTitle.jsp">点击查看所有帖子列表</a>
		</c:otherwise>
	</c:choose>
</body>
</html>