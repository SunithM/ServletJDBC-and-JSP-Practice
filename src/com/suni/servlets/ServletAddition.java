package com.suni.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletAddition extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		Long num1=Long.parseLong(req.getParameter("number1"));
		Long num2= Long.parseLong(req.getParameter("number2"));
		PrintWriter out=res.getWriter();
		out.print("Sum of two numbers :"+(num1+num2));
		
		
	}

}
