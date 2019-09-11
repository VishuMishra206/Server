package includeTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeController
 */
@WebServlet("/IncludeController")
public class IncludeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un=request.getParameter("username");
		String pass=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<b>Welcome to IncludeController  first servlet</b>");
		out.println("user Name is"+ un +"</b>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		RequestDispatcher dis=request.getRequestDispatcher("/TestController");
		dis.include(request,response);
		doGet(request, response);
		
		
	}

}
