package org.example02.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServeletExample extends HttpServlet {
	@Override
	protected void doGet (HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			String name = req.getParameter ("userName");
			String email = req.getParameter ("email");
			String ip = req.getRemoteAddr();	
			
			resp.getWriter().println("Your name is: " + name);
			resp.getWriter().println("Your email is: " + email);
			resp.getWriter().println("Your ip address is: " + ip);
	}
}
