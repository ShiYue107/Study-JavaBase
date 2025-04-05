<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/21
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>伯牙驾校学员管理系统</title>
  </head>
  <body>
  <h2>报名学员信息信息</h2>
  <form action="queryAllStu" method="post">
    姓名:&nbsp;&nbsp;<input type="text" name="name"/>
    联系电话:&nbsp;&nbsp;<input type="text" name="phone"/>
    <input type="submit" value="搜索"/>
  </form>
  <table border="1">
    <tr>
      <td>学员编号</td>
      <td>学员姓名</td>
      <td>学员性别</td>
      <td>报考类别</td>
      <td>联系电话</td>
      <td>推荐人</td>
      <td>报名时间</td>
      <td>操 作</td>
    </tr>
    <c:forEach var="stu" items="${list}">
      <tr>
        <td><c:out value="${stu.id}"/></td>
        <td><c:out value="${stu.name}"/></td>
        <td><c:out value="${stu.sex}"/></td>
        <td><c:out value="${stu.level}"/></td>
        <td><c:out value="${stu.phone}"/></td>
        <td><c:out value="${stu.tjr}"/></td>
        <td><c:out value="${stu.startTime}"/></td>
        <td>
          <a href="findOne?id=${stu.id}">修改</a>
          <a href="deleteStu?id=${stu.id}">删除</a>
        </td>
      </tr>
    </c:forEach>
    <tr><td colspan="8" align="right"><a href="addStu.jsp">新增学员信息</a></td></tr>
  </table>
  </body>
</html>
