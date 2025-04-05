<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addMsg" method="get">
		<table border="1">
			<tr>
				<td colspan="2"><h1>添加留言</h1></td>
			</tr>
			<tr>
				<td>标题</td>
				<td><input name="title" type="text">
				</td>
			</tr>
			<tr>
				<td>内容</td>
				<td><textarea rows="10" cols="15" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">留言</button><button type="reset">重置</button></td>
			</tr>
		</table>
	</form>
</body>
</html>