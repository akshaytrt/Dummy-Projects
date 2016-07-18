package com.sears.corps;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sears.corps.model.Book;
import com.sears.corps.model.BookMaintenance;
import com.sears.corps.model.Student;
import com.sears.corps.services.BookMaintenanceService;
import com.sears.corps.services.impl.BookMaintenanceImpl;

/**
 * Servlet implementation class AssignBook
 */
public class AssignBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignBook() {
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
		BookMaintenanceService bookMaintenanceService=new BookMaintenanceImpl();
		BookMaintenance bookMaintenance=new BookMaintenance();
		Book book=new Book();
		Student student=new Student();
		book.setBookId(Integer.parseInt(request.getParameter("bookId")));
		student.setStudentUsername(request.getParameter("studentId"));
		bookMaintenance.setBook(book);
		bookMaintenance.setStudent(student);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminpage.jsp");
		if(1==bookMaintenanceService.assignBook(bookMaintenance))
			requestDispatcher.include(request, response);
		else
			response.sendError(400, "Unable to assign the book");
		
	}

}
