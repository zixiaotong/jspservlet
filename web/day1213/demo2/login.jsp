<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/12/13
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String message = "";
    String msg = (String) request.getAttribute("msg");
    if (msg != null) {
        out.print(msg);
    }
%>
<form action="/jspservlet/day1213/login" method="post">
    姓名：<input name="name" type="text">
    密码：<input name="pwd" type="password">
    登录：<input type="submit" value="登录">
</form>
</body>
</html>
