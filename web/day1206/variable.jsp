<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    String remoteAddr = request.getRemoteAddr();
    response.setContentType("text/html;charset=UTF-8");
%>
你的IP地址为:<%=remoteAddr%><br>
你的主机名为:<%=request.getRemoteHost() %>

<%out.print("hello web"); %>
<%="hello web" %>

<%
    String path = application.getRealPath("/WEB-INF/web.xml");
    out.print("<br>");
    out.print(path);
%>

<%
    path = request.getServletContext().getRealPath("/WEB-INF/web.xml");
    out.print("<br>");
    out.print(path);
%>

<%
    pageContext.forward("/other");
%>

</body>
</html>