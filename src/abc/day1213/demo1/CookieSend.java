package abc.day1213.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SendCookie")
public class CookieSend extends HttpServlet {
    private static final long ser = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        Cookie userCookies = new Cookie("userName", "zhangsan");
        userCookies.setMaxAge(60 * 60 * 24);
        resp.addCookie(userCookies);

        Cookie studentCookies = new Cookie("seudentName", "zhangsan");
        resp.addCookie(studentCookies);

        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().print("向浏览器发送cookie完成");
    }
}
