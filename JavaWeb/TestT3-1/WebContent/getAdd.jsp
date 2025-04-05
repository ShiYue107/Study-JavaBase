<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加会员成功</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String id=request.getParameter("idNumber");
	String name=request.getParameter("name");
	String e_mail=request.getParameter("email");
	String beiZhu=request.getParameter("bz");
	Date date=new Date();
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
%>
	<table>
			<tr>
				<td>会员编码</td>
				<td><%=id %></td>
			</tr>
			<tr>
				<td>会员姓名</td>
				<td><%=name %></td>
			</tr>
			<tr>
				<td>e-mail</td>
				<td><%=e_mail %></td>
			</tr>
			<tr>
				<td>备注</td>
				<td><%=beiZhu %></td>
			</tr>
			<tr>
				<td>添加时间</td>
				<td><%=dateFormat.format(date) %></td>
			</tr>

</body>
</html>