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
    <title>ͼ�����ϵͳ</title>
  </head>
  <body bgcolor="#71CABF">
  <form action="loginServlet" method="post">
    <table>
      <caption>�û���¼</caption>
      <tr>
        <td>��¼��</td>
        <td><input name="name" type="text" size="20"/></td>
      </tr>
      <tr>
        <td>����</td>
        <td><input name="password" type="password" size="20"/></td>
      </tr>
    </table>
    <input type="submit" value="��¼"/>
    <input type="reset" value="����"/>
  </form>
  </body>
</html>
