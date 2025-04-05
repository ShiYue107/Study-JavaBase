<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.zf.pojo.*" %>
<%@page import="com.zf.impl.*" %>
<%@page import="com.zf.dao.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<title>电子公告牌系统--发布帖子</title>
<meta http-equiv=conent-type content="text/html; charset=gbk">
<link rel="stylesheet" type="text/css" href="style/style.css"/>
<script type="text/javascritp">
	function check(){
		if(document.postform.title.value==""){
			alert("标题不能为空");
			return false;
		}
		if(document.postform.upass.value==""){
			alert("内容不能为空");
			return false;
		}
		if(document.postform.content.value.length > 1000){
			alert("长度不能大于1000");
			return false;
		}
	}
</script>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 主体 -->
	<div>
		<br />
		<!-- 导航 -->
		<div>
			<b><a href="index.jsp">论坛首页</a></b>&gt;&gt;<b><a 
				href="topicservlet?operate=list&page=1&boardid=${boardid}">
				${boardname}</a></b>
		</div>
		<br />
		<div>
			<form name="postfrom" onsubmit="return check()" action=
				"topicservlet?operate=add" method="post">
				<input type="hidden" name="boardid" value="${board.boardid }"/>
				<div class="1">
					<table cellpadding="0" cellspacing="0" align="center">
						<tr>
							<td class="h" colspan="3"><b>发布帖子</b></td>
						</tr>
						<tr class="tr3">
							<th width:"20%"><b>标题</b></th>
							<th><input class="input" style="padding-left: 2px;font: 14px tahoma" 
														tabindex="1" size="60" name="title"></th>
						</tr>
						<tr class="tr3">
							<th valign="top">
								<div>
									<b>内容</b>
								</div>
							</th>
							<th colspan="2">
								<div>
									<span><textarea style="width: 500px;" name="content"
										 rows="20" cols="90" tabindex="2">${reply.content}</textarea></span>
								</div>(不能大于:<font color="blue">1000</font>字)
							</th>
						</tr>
					</table>
				</div>
				<div style="margin: 15px 0px;text-align: center;" >
					<input class="btn" tabindex="3" type="submit" value="提交">
					<input class="btn" tabindex="4" type="reset" value="重置">
				</div>
			</form>
		</div>
	</div>
	<!-- 声明 -->
	<br/>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>



