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
import com.sears.corps.services.StudentService;
import com.sears.corps.services.impl.AdminImpl;
import com.sears.corps.services.impl.StudentImpl;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
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
		String studentUserName=request.getParameter("UserName");
		String studentPassword=request.getParameter("UserPassword");
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("userpage.jsp");
		request.setAttribute("username",studentUserName);
		StudentService studentService=new StudentImpl();
		isValid=studentService.validateUser(studentUserName, studentPassword);
		if(isValid){
			 HttpSession session=request.getSession(); 
			 session.setAttribute("studentUserName",studentUserName);
			requestDispatcher.include(request, response);
		}
		else
			{
				
				request.getRequestDispatcher("userLogin.jsp").include(request, response);
				out.println("<center><font color='red'><h3>You have entered wrong credentials<h3></font><center>");
			}
	}

}
