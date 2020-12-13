<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/12/13
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录成功</title>
</head>
<body>
<%=session.getAttribute("name")
%>欢迎您
</body>
</html>
