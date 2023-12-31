package cgg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig conf;
	@Override
	public void destroy() {
		System.out.println("going to destroy servlet object....");

	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "First servlet created";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf = conf;
		System.out.println("creating object.....");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("servicing.......");
		//set the content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>this is my output from servlet</h1>");
		out.println("<h1> Today's date is "+LocalDate.now()+"</h1>");
	
	}

}
