<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品查询</title>
</head>
<body>
<form action="<c:url value='/ProductQueryServlet' />" method="post">
    请输入商品号：
    <input type="text" name="productid"/>
    <input type="submit" value="确定"/>
</form>
<p><a href="<c:url value='/ProductQueryServlet' />">查询所有商品</a></p>
</body>
</html>