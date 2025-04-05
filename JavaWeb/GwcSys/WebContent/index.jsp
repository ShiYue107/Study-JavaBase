<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品信息</title>
</head>
<body>
<h2>商品信息</h2>
<table border="1">
	<tr>
		<td>商品编号</td>
		<td>商品名称</td>
		<td>价格</td>
		<td>创建日期</td>
		<td>备注</td>
	</tr>
	<c:forEach var="goods" items="${goodsList}">
		<tr>
		<td>${goods.id}</td>
		<td>${goods.name}</td>
		<td>${goods.price}</td>
		<td>${goods.createTime}</td>
		<td>${goods.desc}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>