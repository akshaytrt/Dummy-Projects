package com.sears.corps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sears.corps.services.AdminService;
import com.sears.corps.services.impl.AdminImpl;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		boolean isValid;
		String adminUserName=request.getParameter("adminUserName");
		String adminPassword=request.getParameter("adminPassword");
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminpage.jsp");
		request.setAttribute("username",adminUserName);
		AdminService adminService=new AdminImpl();
		isValid=adminService.validateUser(adminUserName, adminPassword);
		if(isValid){
			 HttpSession session=request.getSession(true); 
			 session.setAttribute("name",adminUserName);
			requestDispatcher.include(request, response);
		}
		else
			{
				
				request.getRequestDispatcher("adminLogin.jsp").include(request, response);
				out.println("<center><font color='red'><h3>You have entered wrong credentials<h3></font><center>");
			}
	}

}
