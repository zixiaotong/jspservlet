package prictice;

import javax.servlet.*;
import java.io.IOException;

public class E2_1Servlet implements Servlet {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("destroy");

    }

    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("init");
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("service");
    }

}
