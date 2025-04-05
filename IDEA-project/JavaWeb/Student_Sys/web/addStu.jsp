<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/23
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学员信息</title>
</head>
<body>
    <h2>新增学员信息</h2>
    <form action="addStu" method="post">
        <table>
            <tr>
                <td>姓名:</td>
                <td><input type="text" name="name" /> *</td>
            </tr>
            <tr>
                <td>性别:</td>
                <td>
                    <input type="radio" name="sex" value="男"/>男
                    <input type="radio" name="sex" value="女"/>女
                </td>
            </tr>
            <tr>
                <td>报考类别:</td>
                <td>
                    <select name="level">
                        <option value="C1">C1</option>
                        <option value="C2">C2</option>
                        <option value="B1">B1</option>
                        <option value="B2">B2</option>
                        <option value="A1">A1</option>
                        <option value="A2">A2</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>联系电话:</td>
                <td><input type="text" name="phone" /> *</td>
            </tr>
            <tr>
                <td>推荐人:</td>
                <td><input type="text" name="tjr" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"/></td>
                <td><input type="reset" value="重置"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
