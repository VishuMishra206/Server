package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);\\
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		if(name.trim().length()==0)
		{
			response.sendRedirect("RegisterForm.html?status=Name cannot be empty");
			return;
		}
		if(email.trim().length()==0)
		{
			response.sendRedirect("RegisterForm.html?status=Email cannot be empty");
			return;
		}
		response.sendRedirect("Login.html");
	}

}
