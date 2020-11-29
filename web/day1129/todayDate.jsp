<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/11/29
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>日期</title>
</head>
<body>
<% LocalDate localDate = LocalDate.now();%>
今天的日期是：<%= localDate%>
</body>
</html>
