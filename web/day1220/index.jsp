<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="abc.day1220.model.Product" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>购物系统首页</title>
</head>
<body>
<h3>商品列表</h3>
<table>
    <tr>
        <th>商品号</th>
        <th>商品名</th>
        <th>价格</th>
        <th>库存量</th>
        <th>类型</th>
        <th>商品详细信息</th>
    </tr>
    <%
        ArrayList<Product> productList = (ArrayList<Product>) application.getAttribute("productList");
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
    %>
    <tr>
        <td><%=product.getId() %>
        </td>
        <td><%=product.getName() %>
        </td>
        <td><%=product.getPrice() %>
        </td>
        <td><%=product.getStock() %>
        </td>
        <td><%=product.getType() %>
        </td>
        <td><a href="viewProductDetails?id=<%=product.getId()%>">商品详情</a></td>
    </tr>
    <%
        }
    %>
</table>
<a href="showCart.jsp">查看购物车</a>
</body>
</html>