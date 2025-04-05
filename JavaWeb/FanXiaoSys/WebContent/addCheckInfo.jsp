<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增返校信息</title>
</head>
<body>
	<h2 align="center">新增返校人员信息</h2>
	<form action="AddServlet" method="post">
		<table border="1" style="margin-left: 41%">
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<td>出发地:</td>
				<td><input type="text" name="from"></td>
			</tr>
			<tr>
				<td>返校日期:</td>
				<td><input type="date" name="returnDate"></td>
			</tr>
			<tr>
				<td>核酸检测日期:</td>
				<td><input type="date" name="checkDate"></td>
			</tr>
			<tr>
				<td>检测结果:</td>
				<td><input type="text" name="state"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" style="margin-left: 25px"></td>
				<td><input type="reset" value="重置" style="margin-left: 60px"></td>
			</tr>
		</table>
	</form>
</body>
</html>