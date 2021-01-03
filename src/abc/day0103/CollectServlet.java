package abc.day0103;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollectServlet
 */
@WebServlet("/CollectServlet")
public class CollectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> country = new ArrayList<String>();
        country.add("�й�");
        country.add("Ӣ��");
        country.add("����˹");
        HashMap<String, String> capital = new HashMap<String, String>();
        capital.put("China", "����");
        capital.put("England", "�׶�");
        capital.put("Russia", "Ī˹��");
        request.setAttribute("country", country);
        request.setAttribute("capital", capital);
        request.getRequestDispatcher("/collections.jsp").forward(request, response);
    }

}
