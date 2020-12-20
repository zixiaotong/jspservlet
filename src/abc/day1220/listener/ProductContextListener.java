package abc.day1220.listener;

import abc.day1220.model.Product;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;

@WebListener
public class ProductContextListener implements ServletContextListener {

    private ServletContext context = null;

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        context.removeAttribute("productList");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(101, "单反相机", 4159.95, 10, "家用"));
        productList.add(new Product(102, "苹果手机", 1199.95, 8, "家用"));
        productList.add(new Product(103, "笔记本电脑", 5129.95, 20, "电子"));
        productList.add(new Product(101, "平板电脑", 1239.95, 10, "电子"));
        context = sce.getServletContext();
        context.setAttribute("productList", productList);
    }

}
