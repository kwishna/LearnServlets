<%@ page import="java.util.Scanner" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Server Page For Servlet</title>
</head>
<body bgcolor="cyan" style="border: 2px red dotted">
	
	<%! int i = 5; %>
	
	<%
	
		/** Tomcat Can Only Run Servlets, Not JSP. Tomacat Converts JSP To Servlet.
		 *  By Default, 'request' & 'response' Is Used By HttpServletRequest in JSP
		 */
		int num1 = Integer.parseInt(request.getParameter("num5")); 
		int num2 = Integer.parseInt(request.getParameter("num6")); 
		
		out.println("Output Is :: "+num1/num2); // By Default, 'out' Is Used For PrintWriter Object
	%>
	<br>
	My Favorite Number Is <%= i %>
	
</body>
</html>