package com.org1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Arithmatic_CalSep23  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
				
		PrintWriter pw = resp.getWriter(); 
		pw.print("<h1> <<<: Arithmatic Operations of Calculator :>>> </h1>");
		pw.print("<p> Addition of " + n1 + " and " + n2 + " is : " + (n1+n2) + "</p>");
		pw.print("<p> Substraction of " + n1 + " and " + n2 + " is : " + (n1-n2) + "</p>");
		pw.print("<p> Multiplication of " + n1 + " and " + n2 + " is : " + (n1*n2) + "</p>");
		pw.print("<p> Division of " + n1 + " and " + n2 + " is : " + (float) (n1/n2) + "</p>");
		pw.print("<p> Modulus of " + n1 + " and " + n2 + " is : " + (float) (n1%n2) + "</p>");
		
		pw.print("<a href = 'Calculator_Sep23.html'> Click Here... goto Home Page </a>");
	}
}
