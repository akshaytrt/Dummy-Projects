package com.sears.corps.demo.dateTime;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateTimeServlet
 */
public class DateTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateTimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date=new Date();
		PrintWriter out=response.getWriter();
		response.setHeader("Refresh", "10");
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>Date time : ");
		out.print(date+"</h3>");
		
		out.print("</html>");
		out.print("</body>");
		
	}

}
