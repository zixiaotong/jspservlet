package abc.day1129;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str1 = req.getParameter("num1");
        String str2 = req.getParameter("num2");
        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);
        int sum = num1 + num2;
        req.setAttribute("result", sum);
        req.getRequestDispatcher("/day1129/result.jsp").forward(req, resp);
    }
}
