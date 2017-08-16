package com.example.guestbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SumaServlet extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/plain");

		String sum=req.getParameter("suma");
		String sem=req.getParameter("sumando");
		pw.println("Su Respuesta es:");
		pw.println(Double.parseDouble(sum)+Double.parseDouble(sem));

	}

}