<%@page import="java.util.Random"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.exam.pojo.PeopleInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="DramFlie.jsp" method="post">
		<%
			List pList=new ArrayList();
			pList.add(new PeopleInfo(1,"张三"));
			pList.add(new PeopleInfo(2,"李四"));
			pList.add(new PeopleInfo(3,"王五"));
			pList.add(new PeopleInfo(4,"赵六"));
			pageContext.setAttribute("pList", pList);
			Random rand=new Random();
			int num=rand.nextInt(4)+1;
		%>
		<c:set var="peopleId" value="<%=num %>"/>
		<table border="1">
			<tr>
				<td width="100">编号</td>
				<td width="100">姓名</td>
			</tr>
			<c:set var="showName" value="11111111"/>
			<c:forEach var="people" items="${pList}" varStatus="pIndex">
				<c:if test="${pIndex.index mod 2 eq 0}">
					<tr bgcolor="yellow">
				</c:if>
				<c:if test="${pIndex.index mod 2 ne 0}">
					<tr bgcolor="cyan">
				</c:if>
				<c:if test="${people.peopleId ==peopleId }">
					<c:set var="showName" value="${people.peopleName}"/>
				</c:if>
				<td>${people.peopleId}</td>
				<td>${people.peopleName}</td>
			</c:forEach>
			<tr bgcolor="red">
				<td>中奖人：</td>
				<td><c:out value="${showName}"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="抽奖"/></td>
			</tr>
		</table>
	</form>
</body>
</html>