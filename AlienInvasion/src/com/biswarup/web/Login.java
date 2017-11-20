package com.biswarup.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fetch value from request object
		String User = request.getParameter("username");
		String password = request.getParameter("password");
		
		//fetch value from init parameter
		ServletConfig config=getServletConfig();getServletConfig();
		String checkuser=config.getInitParameter("username");
		String checkpassword=config.getInitParameter("password");
		
		//If pass-welcome page , else error page
		if(User.equals(checkuser) && password.equals(checkpassword)){
			
			//Set the user name and password in session attribute
			HttpSession ses = request.getSession();
			ses.setAttribute("User", User);
			ses.setAttribute("pwd", password);
			
			response.sendRedirect("welcome.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
		
	}

}
