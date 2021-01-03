package abc.day0103.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import abc.day0103.model.Product;

@WebServlet("/ProductQueryServlet")
public class ProductQueryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DataSource dataSource;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String productId = request.getParameter("productid");
            String sql = "select * from product where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, productId);
            rs = pst.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("id"));
                product.setPname(rs.getString("pname"));
                product.setPrice(rs.getDouble("price"));
                product.setStock(rs.getInt("stock"));
                product.setType(rs.getString("type"));
                request.getSession().setAttribute("product", product);
                response.sendRedirect("/jspservlet/day0103/displayProduct.jsp");
            } else {
                response.sendRedirect("/jspservlet/day0103/error.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList<Product> list = new ArrayList<>();
        try {
            con = dataSource.getConnection();
            String sql = "select * from product";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("id"));
                product.setPname(rs.getString("pname"));
                product.setPrice(rs.getDouble("price"));
                product.setStock(rs.getInt("stock"));
                product.setType(rs.getString("type"));
                list.add(product);
            }
            if (!list.isEmpty()) {
                req.getSession().setAttribute("productList", list);
                resp.sendRedirect("/jspservlet/day0103/displayAllProduct.jsp");
            } else {
                resp.sendRedirect("/jspservlet/day0103/error.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void init() {
        Context context;
        try {
            context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/testDS");
            try {
                Connection con = dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(dataSource);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

}
