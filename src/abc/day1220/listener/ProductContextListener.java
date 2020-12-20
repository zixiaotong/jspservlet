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
        productList.add(new Product(101, "�������", 4159.95, 10, "����"));
        productList.add(new Product(102, "ƻ���ֻ�", 1199.95, 8, "����"));
        productList.add(new Product(103, "�ʼǱ�����", 5129.95, 20, "����"));
        productList.add(new Product(101, "ƽ�����", 1239.95, 10, "����"));
        context = sce.getServletContext();
        context.setAttribute("productList", productList);
    }

}
