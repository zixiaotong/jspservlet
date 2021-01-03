<%--
  Created by IntelliJ IDEA.
  User: zishang
  Date: 2020/12/27
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
        request.setAttribute("str1","");
        request.setAttribute("str2","aaa");
%>
${6.8+ -1}<br/>
${25 div 4}<br/>
${25 mod 4}<br/>
${25 == 4}<br/>
${empty str1}<br/>
${empty str2}<br/>
</body>
</html>
