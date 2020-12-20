<%@ page import="abc.day1220.model.Product" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品详细信息</title>
</head>
<body>
<%
    Product product = (Product) session.getAttribute("product");
%>
<p>显示商品详细信息</p>
<form action="addToCart" method="post" name="myForm">
    <input type="hidden" name="id" value="<%=product.getId() %>"/>
    <table>
        <tr>
            <td>商品名</td>
            <td><%=product.getName() %>
            </td>
        </tr>
        <tr>
            <td>价格</td>
            <td><%=product.getPrice() %>
            </td>
        </tr>
        <tr>
            <td>库存量</td>
            <td><%=product.getStock() %>
            </td>
        </tr>
        <tr>
            <td>类型</td>
            <td><%=product.getType()%>
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" name="quantity"/>
                <input type="submit" value="加入购物车"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><a href="index.jsp">显示商品列表</a></td>
        </tr>
    </table>
</form>
</body>
</html>