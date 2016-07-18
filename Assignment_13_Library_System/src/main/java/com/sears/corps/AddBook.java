package com.sears.corps;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sears.corps.model.Book;
import com.sears.corps.services.BookService;
import com.sears.corps.services.impl.BookImpl;

/**
 * Servlet implementation class AddBook
 */
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookService bookService=new BookImpl();
		Book book=new Book();
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminpage.jsp");
		book.setBookName(request.getParameter("bookname"));
		book.setAuthorName(request.getParameter("author"));
		book.setCopies(Integer.parseInt(request.getParameter("copies")));
		long result=bookService.addBook(book);
		if(result==1)
			requestDispatcher.include(request, response);
		else
			response.sendError(400, "Unable to add book data");
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
