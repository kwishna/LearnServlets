package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiply")
public class MultiplyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num3"));
		int num2 = Integer.parseInt(req.getParameter("num4"));
	// Writing HTML Code : Since, It Is Difficuilt. We Will Use JSP To Design Pages.	
		PrintWriter print = res.getWriter();
		print.println("<html>"
				+ "<head>"
				+ "<title>Multiplication Page</title>"
				+ "</head>"
				+ "<body style='background-color:cyan'>"
				+ "<div style='text-align:center'>"
				+ "<h1>");
		
		print.println("The Multiplication Is :: "+num1*num2);
		
		print.println("</h1>"
				+ "</div>"
				+ "</body>"
				+ "</html>");
		
	}

}
