<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/11/29
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="errorHandler.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int i = 1 / 0;
    out.print(i);
%>
</body>
</html>
