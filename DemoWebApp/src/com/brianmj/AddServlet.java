package com.brianmj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		k *= k;
		
		HttpSession session = req.getSession();
		session.setAttribute("k", k); 
		
		resp.sendRedirect("sq");
		
		
//		req.setAttribute("k", k);
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, resp);
		
		
	}
}
