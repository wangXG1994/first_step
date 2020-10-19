<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/17
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
  <head>
    <title>图书管理系统</title>
  </head>
  <body bgcolor="#71CABF">
  <form action="loginServlet" method="post">
    <table>
      <caption>用户登录</caption>
      <tr>
        <td>登录名</td>
        <td><input name="name" type="text" size="20"/></td>
      </tr>
      <tr>
        <td>密码</td>
        <td><input name="password" type="password" size="20"/></td>
      </tr>
    </table>
    <input type="submit" value="登录"/>
    <input type="reset" value="重置"/>
  </form>
  </body>
</html>
