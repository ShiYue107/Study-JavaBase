<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.itkoma.Model.WangFei" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改用户信息</title>
</head>
<body>
	<h2>修改用户信息</h2>
	<form action="updateWangFei" method="post">
		<table border="1">
		<%WangFei wf = (WangFei) request.getAttribute("WangFei"); %>
		<input type="hidden" name="id" value="<%=wf.getId() %>" />
			<tr>
				<td>账 号:</td>
				<td><input type="text" name="number" value="<%=wf.getNumber() %>" /></td>
			</tr>
			<tr>
				<td>密 码:</td>
				<td><input type="password" name="password" value="<%=wf.getPassword() %>" /></td>
			</tr>
			<tr>
				<td>余 额:</td>
				<td><input type="text" name="balance" value="<%=wf.getBalance() %>" /></td>
			</tr>
			<tr>
				<td>描 述:</td>
				<td><input type="text" name="descs" value="<%=wf.getDescs() %>" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"></td>
				<td><input type="reset" value="重置"/></td>
			</tr>
		</table>
	</form>
</body>
</html>