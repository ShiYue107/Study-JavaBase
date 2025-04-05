<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.zf.pojo.*" %>
<%@page import="com.zf.impl.*" %>
<%@page import="com.zf.dao.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
 %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>电子公告牌系统--登录</title>
<meta http-equiv=conent-type content="text/html; charset=gnk">
<link rel="stylesheet" type="text/css" href="style/style.css"/>
<script language="javascritp">
function check(){
	if(document.loginfrom.uname.value==""){
		alert("用户名不能为空");
		return false;
	}
	if(document.loginfrom.upass.value==""){
		alert("密码不能为空");
		return false;
	}
}
</script>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<!-- 导航 -->
<div>
	&gt;&gt;<b><a href="index.jsp">首页</a></b>
</div>
<!-- 用户登录表单 -->
<div class="t" style="margin-top: 15px" align="center">
	<form name="loginform" onsubmit="return ckeck()" action="userservlet?operate=login" 
	method="post">
		<table style="width: 600px;">
			<tr>
				<td align="right" width="30%">用户名：</td>
				<td><input calss="input" tabindex="1" type="text" maxlength="20"
					size="35" name="uname"></td>
			</tr>	
			<tr>
				<td align="right">密 码：</td>
				<td><input calss="input" tabindex="2" type="password" maxlength="20"
					size="35" name="upass"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" >
					<input class="btn" style="width: 120px;"tabindex="6" type="submit" value="登录">
				</td>
			</tr>
		</table>
	</form>
</div>
<!-- 声明 -->
<br/>
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>





