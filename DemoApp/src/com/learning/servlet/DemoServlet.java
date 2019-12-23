package com.learning.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet {
	
	protected void DoGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String name = "Bhargavi";
		
		request.setAttribute("label", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
	}

}
