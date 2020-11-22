package abc.Servlet;

import abc.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestTwoServlet", urlPatterns = {"/request/TwoServlet"})
public class TwoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = (Student) req.getAttribute("stu");
        String name = (String) req.getAttribute("name");
        String password = (String) req.getAttribute("password");
        resp.getWriter().println(name);
        resp.getWriter().println(password);
        resp.getWriter().println(student.getId());
        resp.getWriter().println(student.getName());
        resp.getWriter().println(student.getAge());
    }
}
