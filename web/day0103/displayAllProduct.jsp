<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>所有商品</title>
</head>
<body>
<table>
    <tr>
        <td>商品号</td>
        <td>商品名</td>
        <td>价格</td>
        <td>库存</td>
        <td>类别</td>
    </tr>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td>${product.pname}</td>
            <td>${product.price}</td>
            <td>${product.stock}</td>
            <td>${product.type}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>