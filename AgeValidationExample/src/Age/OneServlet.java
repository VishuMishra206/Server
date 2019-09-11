package Age;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OneServlet")
public class OneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		Integer age=Integer.parseInt(request.getParameter("age"));
	
		if(age>18 && age<25)
		{
			//response.sendRedirect("Form.html");
			//rd.forward(request, response);
			RequestDispatcher rs=request.getRequestDispatcher("/SecondServlet");
			out.println("you are eligible "+ name);
			rs.include(request, response);
			

		}
		else
		{	
		RequestDispatcher rd=request.getRequestDispatcher("/SecondServlet");
		}
		}
		
		
	

}
