package Calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String product=request.getParameter("prname");
		Integer qty=Integer.parseInt(request.getParameter("qty"));
		int sum=0;
		switch(product)
		{
		case "Soap": sum=qty*50;
		             out.println("price :"+ sum);
		             break;
		case "Shampoo" : sum=qty*120;
		                 out.println("price :"+sum);
		                 break;
		case "toothbrush" : sum=qty*50;
		                    out.println("price :"+sum);
		                    break;
		                    
		                    default: out.println("Invalid");

		
		}
		
	
	}

}
