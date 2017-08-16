package com.example.guestbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class OnServletLogin extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");

		if(user.equals("admin")&&pass.equals("admin")){
			res.setContentType("text/html");
			res.getWriter().println("<html>");
			res.getWriter().println("<head>");
			res.getWriter().println("Hola "+ user);
			res.getWriter().println("<body>");
			res.getWriter().println("<form action='suma' method='POST'>");
			res.getWriter().println("<input type='text' name='suma'> + ");
			res.getWriter().println("<input type='text' name='sumando'>");
			res.getWriter().println("<br><br><input type='submit' value='Calcular' name='submit'>");
			res.getWriter().println("</form>");
			res.getWriter().println("</body>");
			res.getWriter().println("El resultado se despliega en otra pagina al dar click en Calcular");
			res.getWriter().println("</head>");
			res.getWriter().println("</html>");
		}
                else
                 pw.println("Login Failed...!");
		 pw.close();

	}

}