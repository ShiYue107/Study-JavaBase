<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.zf.pojo.*" %>
<%@page import="com.zf.impl.*" %>
<%@page import="com.zf.dao.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% String path = request.getContextPath(); %>

<!doctype html public "-//w3c//dtd html 4.01 transitional//en" "http://www.w3c.org/tr/1999/rec-
html401-19991224/lose.dtd">
<html>
<head>
<title>电子公告牌系统 -- 看帖</title>
<meta http-equiv=conent-type content="text/html; charset=gnk">
<link rel="stylesheet" type="text/css" href="style/style.css"/>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 主体 -->
	<div>
		<br />
		<!-- 导航 -->
		<div>
			<b><a href="index.jsp">论坛首页</a></b>&gt;&gt;<b><a href="topicservlet?operate=
					list&page=1&boardid=${boardid}">${boardname}</a></b>
		</div><br />
		<!-- 新帖 -->
		<div>
			<a href="topicservlet?operate=preadd&boardid=${boardid}"><img src="image/post.gif" 
				border="0"></a>
		</div>
		<!-- 翻页 -->
		<div>
			<a href="topicservlet?operate=detail&page=${page - 1}&bardid=${boardid}">上一页</a>|
			<a href="topicservlet?operate=detail&page=${page + 1}&bardid=${boardid}">下一页</a>
		</div>
		<!-- 本页主题的标题 -->
		<div>
			<table cellspacing="0" cellpadding="0" width="100%">
				<tr>
					<th class="h">本页主题：${topic}</th>
				</tr>
				<tr class="tr2">
					<td>&nbsp;</td>
				</tr>
			</table>
		</div>
		<!-- 主题 -->
		<div class="t">
			<table style="board-top-width:0px;table-layout: fixed;" cellspacing="0" 
							cellpadding="0" width="100%">
				<tr class="tr1">
					<th style="width: 20%"><b>${user.uname}</b><br /><img src="image/head/
								${user.uname}"/><br />注册:${user.regtime}<br />
					</th>
					<th>
						<h4>【主贴】：${topic.title}</h4>
						<div>
							<pre>${topic.content}</pre>
						</div>
						<div class="topic gray">发表：[${topic.publishtime}]&nbsp;
							最后修改[${topic.modifytime}]</div>
					</th>
				</tr>
			</table>
		</div>
		<!-- 回复 -->
		<c:forEach var="row" items="${rows}">
			<div class="t">
				<table style="border-top-width: 0px;table-layout: fixed;" cellpadding="0"
								cellspacing="0" width="100%">
					<tr class="tr1">
						<th style="width: 20%"><b>${row.uname}</b><br />
						<br /><img src="image/head/${row.head }"><br />
							注册：${row.regtime}<br /></th>
						<th>
							<h4>${row.title}</h4>
							<div>
								<pre>${row.content }</pre>
							</div>
							<div class="tipad gray">
								发表：[${topic.publishtime}]&nbsp;
								<c:if test="${sessionscpe.user.uid eq row.uid}">
									最后修改[${topic.modifytime}]
									<a href="javascript:dodelete(${row.replyid},${row.topic
										${boardid})">[删除]</a>
									<a href="replyservlet?operate=premodify&topic=${topic.topicid}
										&replyid=${row.replyid}&boardid=${boardid}">[修改]</a>
								</c:if>
							</div>
						</th>
					</tr>
				</table>
			</div>
		</c:forEach>
		<div>
			<a href="topicservlet?operate=detail&page=${page - 1}&bardid=${boardid}
				&topicid=${topic.topicid}">上一页</a>|
			<a href="topicservlet?operate=detail&page=${page + 1}&bardid=${boardid}
				&topicid=${topic.topicid}">下一页</a>
			<span>当前第${page }页，共${page.count }页</span>
		</div>
	</div>
	<!-- 回复 -->
	<div>
		<form name="postform" onsubmit="return check()"
			action="replyservlet?operate=reply" method="post">
			<input type="hidden" name="boardid" value="${boardid}"/>
			<input type="hidden" name="topicid" value="${topic.topicid}"/>
			<div class="t">
				<table cellpadding="0" cellspacing="0" align="center">
					<tr>
						<td class="h" colspan="3"><b>回复帖子</b></td>
					</tr>
					<tr class="tr3">
						<th width="20%"><b>标题</b></th>
						<th><input class="input" 
							style="padding-left: 2px;font: 14px tahoma" tabindex="1"
							size="60" name="title"></th>
					</tr>
					<tr class="tr3">
						<th valign="top">
							<div>
								<b>内容</b>
							</div>
						</th>
						<th colspan="2">
							<div>
								<span><textarea style="width:500px;" name="content"
									 rows="20" cols="90" tabindex="2"></textarea></span>
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
	<!-- 声明 -->
	<br/>
	<jsp:include page="foot.jsp"></jsp:include>
	<script type="text/javascript">
		function dodelete(replyid,topicid,boardid) {
			if (boardid && topicid && replyid) {
				var url = "replyservlet?operate=delete&replyid=" + replyid + 
						"&boardid=" + boardid + "&topicid=" + topicid;
				if (confirm("您真的要删除吗？")) {
					window.location = url;
				}
			}
		}
	</script>
</body>
</html>