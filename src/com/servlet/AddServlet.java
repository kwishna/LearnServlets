package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add") // If Annotation Is Commented. XML Must Be Uncommented.
public class AddServlet extends HttpServlet {

//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException { //service() Method Cannot Be Renamed.
//			// service() Method Will Work On Both GET Or POST Type Of Request.
//			// For Every Request service() Method Will Be Called. Either It Should Be Defined Here Or HttpServlet Class.
//			// HttpServlet Class Also Has service() Method Which Will Be Called If Not Overriden.
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		
//		System.out.println("Result Is :: "+k);
//		
//		PrintWriter print = res.getWriter();
//		print.println("The Sum Is :: "+k);
	
//		ServletConfig cf = getServletConfig();
//		String str = cf.getInitParameter("name");
//		print.println("Welcome Mr. "+str);
//	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { //doGet() Method Cannot Be Renamed.
//	// doGet() Method Will Work On Only GET Request.

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		System.out.println("Result Is :: "+k);
		
//		PrintWriter print = res.getWriter();
//		print.println("The Sum Is :: "+k);
//		
//		ServletConfig cf = getServletConfig(); // Setted Some Parameter For A Servlet Through XML And Retrieving Under That Servlet Only.
//		String str = cf.getInitParameter("name");
				
//		ServletContext ctx = getServletContext(); // Setted Some Parameter Through XML And Retrieving Under Any Servlet.
//		String str2 = ctx.getInitParameter("phone");
		
//		print.println("Welcome Mr. "+str+" With Phone : "+str2);		
// --------------------------------------------------------------------------------------------------------------	
		
//		// Dispatch - For Using Another Servlet Method
//		req.setAttribute("k", k); // Setting Attribute In Request Which Will Passed Through Dispatcher
//		
//		RequestDispatcher dis = req.getRequestDispatcher("sq"); // We Use Dispatcher & Redirect To Call Another Servlet Methods
//		dis.forward(req, res); // forwarding data to "sq" url
		
//// ----------------------------------------------------------------------------------------------------------------
		
//		// Redirect - For Using Another Servlet Method
		
//		res.sendRedirect("sq"+"?"+"k="+k); // URL gets redirected in browser to "/sq?k=" in SqServlet : URL Re-writing
//		// The Above Line Responds To Client To Redirect The URL
//		// Here Value Of 'k' Is Required To Send While Redirecting.
//		// To Maintain The Data In Redirect We Will Have To Use 'Session'.
		
//// -----------------------------------------------------------------------------------------------------------------
//		// Sending Data To Another Servlet Method Using Session 
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);		
//		res.sendRedirect("sq");
		
//// -----------------------------------------------------------------------------------------------------------------
//		// Sending Data To Another Servlet Using Cookies
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
	
	
	
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException { //doPost() Method Cannot Be Renamed.
	// doPost() Method Will Work On Only POST Request.

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		System.out.println("Result Is :: "+k);

//		PrintWriter print = res.getWriter();
//		print.println("The Sum Is :: "+k);
	}
	
	
}
