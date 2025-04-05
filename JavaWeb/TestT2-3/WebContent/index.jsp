<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String [] arr=new String[4];
		arr[0]="123";
		arr[1]="223";
		arr[2]="323";
		arr[3]="423";
	%>
	<ul>
		<%
			for(int i=0;i<arr.length;i++){
		%>
		<li><%=i %>:<%=arr[i] %></li>
		<% 
			}
		%>
	</ul>
</body>
</html>