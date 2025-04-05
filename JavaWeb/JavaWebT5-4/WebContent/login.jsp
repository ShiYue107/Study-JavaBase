<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="user-select">
	<div class="container">
		<div class="siteIcon">
			<img src="style/images/icon.png" alt="" data-toggle="tooltip"
				data-placement="top" title="欢迎饭店管理系统" draggable="false" />
		</div>
		<form action="login" method="post" class="form-signin">
			<h2 class="form-signin-heading">管理员登录</h2>
			<label for="userName" class="sr-only">用户名</label> <input type="text"
				id="userName" name="username" placeholder="请输入帐号"
				class="form-control"> <label for="userPwd" class="sr-only">密码</label>
			<input type="password" id="userPwd" name="password"
				class="form-control" placeholder="请输入密码">
			<h5 class="errorMessage"><%=request.getAttribute("errorMessage") == null ? "" : request.getAttribute("errorMessage")%></h5>
			<button class="btn btn-lg btn-primary btn-block" type="submit"
				id="signinSubmit">登录</button>
		</form>
	</div>
	<script src="style/js/bootstrap.min.js"></script>
	<script>
		$('[data-toggle="tooltip"]').tooltip();
		window.oncontextmenu = function() {
			//return false;
		};
		$('.siteIcon img').click(function() {
			window.location.reload();
		});
	</script>
</body>
</html>