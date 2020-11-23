package abc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shanglei
 * @program:gogoup-api
 * @date 2020/11/7. 10:35 PM
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phome = req.getParameter("phome");
        out.print("<html>");
        out.print("<body>");
        out.print("</body>");
        out.print("<h3>您的名字是：" + name + "<h3>");
        out.print("<h3>您的邮箱是：" + email + "<h3>");
        out.print("<h3>您的电话是：" + phome + "<h3>");
        out.print("</html>");
    }
}
