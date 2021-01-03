package abc.day1220.action;

import abc.day1220.model.GoodsItem;
import abc.day1220.model.Product;
import abc.day1220.model.ShoppingCart;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/addToCart", "/viewProductDetails", "/deleteItem"})
public class ShoppingCartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ServletContext context;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uri = request.getRequestURL().toString();
        System.out.println(uri);
        if (uri.endsWith("viewProductDetails")) {
            showProductDetails(request, response);
        } else {
            deleteItem(request, response);
        }
    }

    private void deleteItem(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer productId = Integer.parseInt(request.getParameter("id"));
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        ArrayList<GoodsItem> items = new ArrayList<>(cart.getItems());
        for (GoodsItem item : items) {
            if (productId == item.getProduct().getId()) {
                cart.delete(productId);
                session.setAttribute("cart", cart);
            }
        }
        response.sendRedirect("/jspservlet/day1220/showCart.jsp");
    }

    private void showProductDetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer productId = 0;
        try {
            productId = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Product product = this.getProduct(productId);
        if (product != null) {
            HttpSession session = request.getSession();
            session.setAttribute("product", product);
            response.sendRedirect("/jspservlet/day1220/showProduct.jsp");
        } else {
            // δ�鵽��Ʒ
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Integer productId = 0;
        Integer quantity = 0;
        productId = Integer.parseInt(request.getParameter("id"));
        quantity = Integer.parseInt(request.getParameter("quantity"));
        Product product = this.getProduct(productId);
        if (product != null && quantity > 0) {
            GoodsItem item = new GoodsItem(product, quantity);
            HttpSession session = request.getSession();
            ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
            if (cart == null) {
                cart = new ShoppingCart();
            }
            cart.add(item);
            session.setAttribute("cart", cart);
        }
        response.sendRedirect("/jspservlet/day1220/showCart.jsp");
    }

    private Product getProduct(int productId) {
        context = this.getServletContext();
        ArrayList<Product> products = (ArrayList<Product>) context.getAttribute("productList");
        for (Product product : products) {
            if (productId == product.getId()) {
                return product;
            }
        }
        return null;
    }

}
