package com.org1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Calculator_Sep23 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		try {
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			RequestDispatcher rd = req.getRequestDispatcher("calculator");
			rd.forward(req, resp);
		} 
		
		catch (NumberFormatException e) {
			 
			PrintWriter pw = resp.getWriter();
			pw.print("<h1> You have to not entered Number data in field !! </h1>");
			pw.print("<h1>  Please enter valid number! !! </h1>");
			
			RequestDispatcher rd = req.getRequestDispatcher("Calculator_Sep23.html");
			rd.include(req, resp);
		}
	}
	
}
