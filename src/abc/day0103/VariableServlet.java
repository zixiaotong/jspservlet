package abc.day0103;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class VariableServlet
 */
@WebServlet("/VariableServlet")
public class VariableServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ServletContext application = this.getServletContext();
        request.setAttribute("re_aaa", "request_aaa");
        session.setAttribute("se_aaa", "session_aaa");
        application.setAttribute("ap_aaa", "application_aaa");

        request.setAttribute("aaa", "request_aaa");
        session.setAttribute("aaa", "session_aaa");
        application.setAttribute("aaa", "application_aaa");

        RequestDispatcher rd = request.getRequestDispatcher("variable.jsp");
        rd.forward(request, response);
    }

}
