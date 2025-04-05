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
<title>电子公告牌系统</title>
<meta http-equiv=conent-type content="text/html; charset=gnk">
<link rel="stylesheet" type="text/css" href="style/style.css"/>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<div>
		<!-- 主体 -->
		<div class="t">
			<table cellspacing="0" cellpadding="0" width="100%">
				<tr class="tr2" align="center">
					<td colspan="2">论坛</td>
					<td style="width: 5%;">主题</td>
					<td style="width: 25%;">最后发表</td>
				</tr>
				<!-- 主版块 父版块id为b0的版块为主版块 -->
				<c:forEach var="board" items="${map[key]}">
					<tr class="tr3">
						<td colspan="4">${board.boardname}</td>
					</tr>
					<c:set var="key" value="b${board.boardid }"></c:set>
					<c:forEach var="sonboard" items="${map[key]}">
						<tr class="tr3">
							<td width=5%>&nbsp;</td>
							<th align="left"><img src="image/board.gif">
								<a href="topicservlet?operate=list&page=1&boardid=${sonboard.boardid}">
									${sonboard.boardname}</a>
							</th>
							<td align="center">${sonboard.count}</td>
							<c:if test="${sonboard.count != 0}">
								<th>
									<span>
										<a href="topicservlet?operate=detail&page=1&boardid=${
										sonboard.boardid}&topicid=${sonboard.lasttopic.topicid}">
										${sonboard.lasttopic.title}</a>
									</span><br />
									<span>${sonboard.lastpostuser}</span>
									<span class="gray">[${sonboard.lasttopic.publishtime}]</span>
								</th>
							</c:if>
							<c:if test="${sonboard.count == 0}">
								<th>该版块暂时还没人来过</th>
							</c:if>
						</tr>
					</c:forEach>
				</c:forEach>
			</table>
		</div>
	</div>
	<br/>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>