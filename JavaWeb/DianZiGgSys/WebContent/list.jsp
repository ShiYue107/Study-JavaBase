<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
 %>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>电子公告牌系统 -- 帖子列表</title>
<meta http-equiv=conent-type content="text/html; charset=gnk">
<link rel="stylesheet" type="text/css" href="style/style.css"/>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 主体 -->
	<div>
		<!-- 导航 -->	
		<br />
		<div>
			<b><a href="start.jsp">首页</a></b>&gt;&gt;<b><a href="topicservlet?operate=list
				&page=1&boardid=${boardid}">${boardname}</a></b>
		</div>
		<br />
		<!-- 新帖 -->
		<div>
			<a href="topicservlet?operate=preadd&boardid=${boardid}"><img src="image/post.gif"
				border="0"></a>
		</div>
		<!-- 翻页 -->
		<div>
			<a href="topicservlet?operate=list&page=${page - 1}&bardid=${boardid}">上一页</a>|
			<a href="topicservlet?operate=list&page=${page + 1}&bardid=${boardid}">下一页</a>
		</div>
		<div class="t">
			<table cellspacing="0" cellpadding="0" width="100%">
				<tr>
					<th class="h" style="width: 100%" colspan="4"><span>&nbsp;</span></th>
				</tr>
				<!-- 表头 -->
				<tr class="tr2">
					<td>&nbsp;</td>
					<td style="width:80%" align="center">文章</td>
					<td style="width:10%" align="center">作者</td>
					<td style="width:10%" align="center">回复</td>
				</tr>
				<!-- 主题 -->
				<c:forEach var="row" items="${map}">
					<tr class="tr3">
						<td><img src="image/topic.gif" border=0></td>
						<td style="font-size: 15px">
							<a href="topicservlet?operate=detail&page=1&boardid=${row.boardid}
								&topicid=${row.topicid}">${row.title}</a>
						</td>
						<td align="center">${row.uname}</td>
						<td align="center">${row.unt}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<!-- 翻页 -->
		<div>
			<a href="topicservlet?operate=list&page=${page - 1}&bardid=${boardid}">上一页</a>|
			<a href="topicservlet?operate=list&page=${page + 1}&bardid=${boardid}">下一页</a>
			<span>当前第${page }页，共${page.count }页</span>
		</div>
	</div>
	<br/>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>