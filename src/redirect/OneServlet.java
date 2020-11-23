package redirect;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class OneServlet
 */
@WebServlet(name="RedirectOneServlet",urlPatterns={"/Redirect/OneServlet"})
public class OneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("One Servlet!");
		response.sendRedirect("/jspservlet/Redirect/TwoServlet");
//		response.sendRedirect("http://www.baidu.com");
	}

}
