<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" type="com.eaxm.data.User" scope="request"/>恭喜
<jsp:getProperty property="name" name="user"/>登录成功
</body>
</html>