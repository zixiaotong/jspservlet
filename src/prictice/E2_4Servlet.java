package prictice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class E2_4Servlet
 */
@WebServlet("/E24Servlet")
public class E2_4Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public E2_4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println(userName);
        System.out.println(passWord);
        for (String s : hobby) {
            System.out.println(s);
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("	<body>");
        out.println("	<h2>����������" + userName + "</h2>");
        out.println("	<h3>����������" + passWord + "</h3>");
        out.println("	<h4>���İ�����");
        for (String s : hobby) {
            out.print(s + ",");
        }
        out.print("</h4>");
        out.println("	</body>");
        out.println("	</html>");
    }

}
