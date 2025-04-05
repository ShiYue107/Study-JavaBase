<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*,com.exam.dao.*,com.exam.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="509" height="204" border="1px" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="2" align="center" ><a href="query.jsp">返回</a></td>
		</tr>
		<tr>
			<td width="40" align="center" ><span class="style2">序号</span></td>
			<td width="390" align="center" ><span class="style2">帖子标题</span></td>
		</tr>
		<%
			for(Title t:TitleDao.titleArr){
		%>
		<tr>
			<td align="center" ><%=t.getId() %></td>
			<td align="left" ><%=t.getTitle() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>