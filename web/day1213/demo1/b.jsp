<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/12/13
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收cookie</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie c : cookies) {
        String value = c.getValue();
        out.print(c.getName() + "=" + value);
    }
%>
</body>
</html>
