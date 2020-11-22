package abc.Servlet;

import abc.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestOneServlet", urlPatterns = {"/request/OneServlet"})
public class OneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student(1, "zishag", 18);
        req.setAttribute("name", "zhangsan");
        req.setAttribute("password", "123456");
        req.setAttribute("stu", student);
        req.getRequestDispatcher("/request/TwoServlet").forward(req, resp);
    }
}
