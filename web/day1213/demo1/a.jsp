<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/12/13
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送cookie</title>
</head>
<body>
<%
    Cookie c1 = new Cookie("aaa", "value1");
    Cookie c2 = new Cookie("bbb", "value2");
    response.addCookie(c1);
    response.addCookie(c2);
%>
</body>
</html>
