<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="abc.day1220.model.GoodsItem" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="abc.day1220.model.ShoppingCart" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>显示购物车信息</title>
</head>
<body>
<p>您的购物车信息</p>
<table>
    <tr>
        <td>数量</td>
        <td>商品</td>
        <td>价格</td>
        <td>小计</td>
        <td>是否删除</td>
    </tr>
    <%
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart != null) {
            ArrayList<GoodsItem> items = new ArrayList<GoodsItem>(cart.getItems());
            for (GoodsItem item : items) {
    %>
    <tr>
        <td><%=item.getQuantity() %>
        </td>
        <td><%=item.getProduct().getName() %>
        </td>
        <td><%=item.getProduct().getPrice() %>
        </td>
        <td><%=item.getQuantity() * item.getProduct().getPrice() %>
        </td>
        <td><a href="deleteItem?id=<%=item.getProduct().getId() %>">删除</a></td>
    </tr>
    <%
        }
    %>
    <tr>
        <td colspan="4" style="text-align:right">总计:<%=cart.getTotal() %>
        </td>
    </tr>
    <%
        }
    %>
</table>
<a href="index.jsp">返回继续购物</a>
</body>
</html>