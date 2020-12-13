package abc.day1213.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/day1213/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        if (name.equals("zhangsan") && pwd.equals("123")) {
            HttpSession session = req.getSession();
            session.setAttribute("name", name);
            req.getRequestDispatcher("/day1213/demo2/welcome.jsp").forward(req, resp);
        } else {
            req.setAttribute("msg", "密码错误");
            req.getRequestDispatcher("/day1213/demo2/login.jsp").forward(req, resp);
        }
    }
}
