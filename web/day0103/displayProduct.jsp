<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品信息</title>
</head>
<body>
<table>
    <tr>
        <td>商品号</td>
        <td>${product.id}</td>
    </tr>
    <tr>
        <td>商品名</td>
        <td>${product.pname}</td>
    </tr>
    <tr>
        <td>价格</td>
        <td>${product.price}</td>
    </tr>
    <tr>
        <td>库存</td>
        <td>${product.stock}</td>
    </tr>
    <tr>
        <td>类别</td>
        <td>${product.type}</td>
    </tr>
</table>
</body>
</html>