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
 * Servlet implementation class ForwardController
 */
@WebServlet("/ForwardController")
public class ForwardController extends HttpServlet {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String un=request.getParameter("username");
		String pass=request.getParameter("pwd");
		if(un.equals("rays") && pass.equals("rays"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("SucessPage");
			rd.forward(request, response);
		}
		else
		{
			out.print("<center> <font color='red'> WRONG USERNAME AND PASSWORD...</font></center>");
			RequestDispatcher rd=request.getRequestDispatcher("Form1.html");
			rd.include(request, response);
		}
		
		/*out.println("<b>Welcome to IncludeController Second servlet</b>");
		out.println("user Name is"+ un +"</b>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		RequestDispatcher dis=request.getRequestDispatcher("/TestController");
		dis.forward(request,response);
		*/
		
		
		
		//doGet(request, response);
		
		
		
	}

}
