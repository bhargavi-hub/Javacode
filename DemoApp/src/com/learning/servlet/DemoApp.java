package com.learning.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp")
public class DemoApp extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		
		List<Student> studs = Arrays.asList(new Student(1,"Bhargavi"),new Student(2,"Chinnu"), new Student(3,"Harshitha"));
				
		request.setAttribute("students", studs);
		
		RequestDispatcher rd = request.getRequestDispatcher("jsps/hello.jsp");
	     rd.forward(request, response);
		
	}

}
