<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
</head>
<body>
	<!-- 上部 -->
	<div id="Head_1">
		<!-- 标题 -->
		<div id="Head_1_Logo">
			<b style="font-family: '黑体'">饭店管理平台</b>
		</div>
		<!-- 欢迎用户的文字 -->
		<div id="Head_1_UserWelcome">
			<img border="0" width="13" height="14" src="style/images/user.gif" />
			您好，<b><%=session.getAttribute("administrator") == null ? "" : session.getAttribute("administrator")%></b>
		</div>
		<!-- 一些链接按钮 -->
		<div id="Head_1_FunctionButton">
			<a target="_parent" href="logout"> <img width="78" height="20"
				alt="退出系统" src="style/images/logout.gif" />
			</a>
		</div>
	</div>
	<!-- 下部 -->
	<div id="Head_2">
		<!-- 任务提醒 -->
		<div id="Head2_Awoke">
			<ul id="AwokeNum">
			</ul>
		</div>
		<div class="Head2_FunctionList" style="float: left"></div>
		<div id="Head2_FunctionList"></div>
	</div>
</body>
</html>