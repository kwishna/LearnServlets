package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq") // If Annotation Is Commented. XML Must Be Uncommented.
public class SqServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8805122427428009804L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		// Dispatcher Handle
		
//		int k = (int) req.getAttribute("k"); // Getting Passed Attribute Of Dispatcher In AddServlet Class		
//		PrintWriter print = res.getWriter();
//		print.println("Result from Dispatcher Sq Is :: "+k*k);
		
// ---------------------------------------------------------------------------
		
//		//Redirect Handle (Without Session)
		
//		int l = Integer.parseInt(req.getParameter("k"));
//		PrintWriter print2 = res.getWriter();
//		print2.println("Result from Redirect Sq Without Session Is :: "+l*l);
		
// ---------------------------------------------------------------------------
		
//		//Redirect Handle (With Session)
		
//		HttpSession session = req.getSession();
//		int m = (int) session.getAttribute("k");
//		PrintWriter print3 = res.getWriter();
//		print3.println("Result from Redirect Sq With Session Is :: "+m*m);
		
// ---------------------------------------------------------------------------
		
//		//Redirect Handle (With Cookies)
		
		Cookie[] cookie = req.getCookies();
		
		int n = 0;
		
		for(Cookie k : cookie) {
			
			if(k.getName().equals("k")) {				
				n = Integer.parseInt(k.getValue());
				System.out.println(n);
			}
		}
		
		PrintWriter print4 = res.getWriter();
		print4.println("Result from Redirect Sq With Cookie Is :: "+n*n);	
		
	}	
}
