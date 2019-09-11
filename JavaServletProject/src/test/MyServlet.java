package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get method called");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int name1=Integer.parseInt(request.getParameter("name1"));
		int name2=Integer.parseInt(request.getParameter("name2"));
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Addition");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Welcome<h1>"+ (name1 + name2) + "</h1>");
		out.println("</body>");
		out.println("</html>");
		//System.out.println("post method called");
		
		doGet(request, response);
	}

}
