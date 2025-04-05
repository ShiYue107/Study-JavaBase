<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/23
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.student.pojo.*" %>
<html>
<head>
    <title>修改学员信息</title>
</head>
<body>
  <h2>修改学员信息</h2>
  <% Student stu = (Student)request.getAttribute("stu");%>
  <form action="updateStu" method="post">
      <input type="hidden" name="id" value="<%=stu.getId()%>"/>
      <table>
          <tr>
              <td>姓名:</td>
              <td><input type="text" name="name" value="<%=stu.getName()%>"/> *</td>
          </tr>
          <tr>
              <td>性别:</td>
              <td><input type="text" name="sex" value="<%=stu.getSex()%>"/></td>
          </tr>
          <tr>
              <td>报考类别:</td>
              <td><input type="text" name="level" value="<%=stu.getLevel()%>" /></td>
          </tr>
          <tr>
              <td>联系电话:</td>
              <td><input type="text" name="phone" value="<%=stu.getPhone()%>" /> *</td>
          </tr>
          <tr>
              <td>推荐人:</td>
              <td><input type="text" name="tjr" value="<%=stu.getTjr()%>" /></td>
          </tr>
          <tr>
              <td><input type="submit" value="提交"/></td>
              <td><input type="reset" value="重置"/></td>
          </tr>
      </table>
  </form>
</body>
</html>
