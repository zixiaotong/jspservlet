<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/12/13
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>
    读取session
</h3>
<%
    String s = (String) session.getAttribute("aaa");
%>
<%=s%>
</body>
</html>
