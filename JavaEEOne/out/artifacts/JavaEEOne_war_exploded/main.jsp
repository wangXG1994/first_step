<%@ page import="javax.security.auth.spi.LoginModule" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/17
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" import="org.model.Login"%>
<html>
<head>
    <title>wellcome</title>
</head>
<body bgcolor="#7fffd4">
    <%
        Login login = (Login)session.getAttribute("login");
        String lgn = login.getName();
    %>
    <%=lgn%>,ฤ๚บรฃฌปถำญสนำรกฃ
</body>
</html>
