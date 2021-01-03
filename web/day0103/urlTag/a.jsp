<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<c:url value="/index.jsp"/> <br>
${pageContext.request.contextPath}<br>
<c:url value="/index.jsp"/><br>

<a href="<c:url value='/index.jsp' />"></a><br>

<c:url value="/day0103/urlTag/b.jsp" var="path" scope="request">
    <c:param name="username" value="张三"></c:param>
    <c:param name="password" value="qwerty"></c:param>
</c:url>
<br>
<a href="${path}">b.jsp</a><br>
</body>
</html>