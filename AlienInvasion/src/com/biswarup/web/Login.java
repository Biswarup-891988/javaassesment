package com.biswarup.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String User = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession ses = request.getSession();
		ses.setAttribute("User", User);
		ses.setAttribute("pwd", password);
		
		if(User.equalsIgnoreCase("Biswa") && password.equals("biswa")){
		
			response.sendRedirect("welcome.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
		
	}

}
