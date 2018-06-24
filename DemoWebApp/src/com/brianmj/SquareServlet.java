package com.brianmj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
//		int k = Integer.parseInt(req.getParameter("k"));
//		
		PrintWriter out = resp.getWriter();
	out.write("Result is " + k);
		
		System.out.println("sq called");
	}
}
