package com.learning.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		PrintWriter out = res.getWriter();
		int k =0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies){
			
			if(c.getName().equals("k")){
				k = Integer.parseInt(c.getValue());
			}
		}
		//int k = (int) req.getAttribute("k");
		
		//int k = Integer.parseInt(req.getParameter("k"));
	
		// using session
		/* HttpSession session = req.getSession();
		int k = (int) session.getAttribute("k"); 
		*/
		
		k = k * k ;
		
		out.println("Result using cookies is >>" + k);
	}

}
