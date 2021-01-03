package abc.day0103;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Address address = new Address("������", "��ׯ��һ��", "100024");
        Employee emp = new Employee("����", "zhangsan@163.com", "13555555555", address);
        request.setAttribute("emp", emp);
        request.getRequestDispatcher("/beanDemo.jsp").forward(request, response);
    }

}
