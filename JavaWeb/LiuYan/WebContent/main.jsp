<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.liuyan.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢迎:[<%=session.getAttribute("userName") %>]</h1>
	<a href="addMessage.jsp">添加留言</a>
	<table border="1">
		<tr>
		 	<td>留言人姓名</td>
		 	<td>留言时间</td>
		 	<td>留言标题</td>
		 	<td>留言内容</td>
		</tr>
		<%
		List<Message> list = (List<Message>)request.getAttribute("list");
		//展示数据
		for(int i=0;i<list.size();i++){
			Message msg = list.get(i);
		%>
		<tr>
		 	<td><%=msg.getName() %></td>
		 	<td><%=msg.getTime() %></td>
		 	<td><%=msg.getTitle() %></td>
		 	<td><%=msg.getMessage() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>