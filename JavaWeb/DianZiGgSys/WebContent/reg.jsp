<%@ page language="java" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
 %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>电子公告牌系统--注册</title>
<meta http-equiv=conent-type content="text/html; charset=utf-8">
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
	if(document.regform.upass.value != document.regfrom.upass1.value){
		alert("2次密码不一样");
		return false;
	}
}
</script>
</head>
<body>
	<div>
		<jsp:include page="top.jsp"></jsp:include>
		<!-- 导航 -->
		<div>
			&gt;&gt;<b><a href="index.jsp">首页</a></b>
		</div>
		<!-- 用户注册表单 -->
		<div class="t" style="margin-top: 15px" align="center">
			<form name="regfrom" onsubmit="return check()" action="userservlet?operate=reg"
			method="post">
				<table style="width: 800px">
					<tr>
						<td align="right" width="30%">用户名：</td>
						<td><input class="input" tabindex="1" type="text" maxlength="20" 
							size="35" name="uname"></td>
					</tr>
					<tr>
						<td align="right">密 码：</td>
						<td><input class="input" tabindex="2" type="password" maxlength="20" 
							size="35" name="upass"></td>
					</tr>
					<tr>
						<td align="right">重复密码：</td>
						<td><input class="input" tabindex="2" type="password" maxlength="20" 
							size="35" name="upass1"></td>
					</tr>
					<tr>
						<td align="right">性 别：</td>
						<td>女<input type="radio" name="gender" value="1">
							男<input type="radio" name="gender" value="2"></td>
					</tr>
					<tr>
						<td colspan="2" bordercolor="black" style="padding-left: 100px;"><br />
							<img src="image/head/1.gif">
							<input type="radio" name="head" value="1.gif" checked="checked">
							<img src="image/head/2.gif">
							<input type="radio" name="head" value="2.gif">
							<img src="image/head/3.gif">
							<input type="radio" name="head" value="3.gif">
							<img src="image/head/4.gif">
							<input type="radio" name="head" value="4.gif">
							<img src="image/head/5.gif">
							<input type="radio" name="head" value="5.gif"><br />
							<img src="image/head/6.gif">
							<input type="radio" name="head" value="6.gif">
							<img src="image/head/7.gif">
							<input type="radio" name="head" value="7.gif">
							<img src="image/head/8.gif">
							<input type="radio" name="head" value="8.gif">
							<img src="image/head/9.gif">
							<input type="radio" name="head" value="9.gif">
							<img src="image/head/10.gif">
							<input type="radio" name="head" value="10.gif"><br />
							<img src="image/head/11.gif">
							<input type="radio" name="head" value="11.gif">
							<img src="image/head/12.gif">
							<input type="radio" name="head" value="12.gif">
							<img src="image/head/13.gif">
							<input type="radio" name="head" value="13.gif">
							<img src="image/head/14.gif">
							<input type="radio" name="head" value="14.gif">
							<img src="image/head/15.gif">
							<input type="radio" name="head" value="15.gif">
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input class="btn"
							style="width: 120px;" tabindex="6" type="submit" value="注册">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!-- 声明 -->
	<br/>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>