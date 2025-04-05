<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会员添加</title>
</head>
<body>
	<h3>"*"号为必填</h3>
	<form action="getAdd.jsp" method="post">
		<table>
			<tr>
				<td>会员编码*</td>
				<td><input type="text" name="idNumber"></td>
			</tr>
			<tr>
				<td>会员姓名*</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>e-mail*</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>备注</td>
				<td><input type="text" name="bz"></td>
			</tr>
			<tr>
				<td><input type="reset" value="取消"></td>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>