package com.sears.corps.demo.servletCounters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCounterB
 */
public class ServletCounterB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int counter = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCounterB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		counter += 1;

		System.out.println("Servlet B called " + counter + " times");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html>" + "<head><title>Welcome</title></head>" + "<body>" + "<h3>Hello</h3>" + "<br>" + "<a href="
				+ "counter.html" + ">Back to main page</a>" + "</body></html>");
	}

}
