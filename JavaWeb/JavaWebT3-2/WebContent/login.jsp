<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet" type="text/css" href="css/page.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/public.js"></script>
</head>
<body>
	<form action="index.jsp" method="post">
		<!-- 登录body -->
		<div class="logDiv">
			<img class="logBanner" src="img/logBanner.png" />
			<div class="logGet">
				<!-- 头部提示信息 -->
				<div class="logD logDtip">
					<p class="p1">登录</p>
				</div>
				<!-- 输入框 -->
				<div class="lgD">
					<img class="img1" src="img/logName.png" /><input type="text"
						placeholder="输入用户名" name="account" />
				</div>
				<div class="lgD">
					<img class="img1" src="img/logPwd.png" /><input type="password"
						name="password" placeholder="输入用户密码" />
				</div>
				<div class="logC">
					<button type="submit" id="login-button"
						onclick="window.location.href='index.jsp';">
						<strong>登陆</strong>
					</button>
				</div>
			</div>
		</div>
		<!-- 登录body  end -->
		<!-- 登录页面底部 -->
		<div class="logFoot">
			<p class="p1">版权所有：XX公司公司</p>
			<p class="p2">123456789</p>
		</div>
		<!-- 登录页面底部end -->
	</form>
</body>
</html>