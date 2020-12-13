package abc.day1213.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReadCookie")
public class CookieRead extends HttpServlet {
    private static final long ser = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Cookie[] cookies = req.getCookies();
        for(Cookie c:cookies){
            String value = c.getValue();
            System.out.println(c.getName()+"="+value);
        }
    }
}
