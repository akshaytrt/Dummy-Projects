/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sears.corps.model.Book;
import com.sears.corps.model.BookMaintenance;
import com.sears.corps.model.Student;
import com.sears.corps.services.BookService;
import com.sears.corps.services.impl.BookImpl;

/**
 * @author athora0
 *
 */
public class BookMaintenanceDao {
	public long assignBook(BookMaintenance bookMaintenance) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String assignDate = df.format(date);
		System.out.println(assignDate);
		Long rowAffected = 0l;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +30);
		Date rdate = cal.getTime();
		String returnDate = df.format(rdate);
		Connection connection = DBConnection.getDBConnection();
		String sql = "INSERT INTO BORROW_DETAILS (STUDENT_USERNAME,BOOK_ID,ISSUE_DATE,RETURN_DATE) VALUES ('"
				+ bookMaintenance.getStudent().getStudentUsername() + "','" + bookMaintenance.getBook().getBookId()
				+ "',NOW(),'" + returnDate + "');";
		BookService bookService = new BookImpl();

		try {
			if (bookService.checkCopies(bookMaintenance.getBook())) {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				rowAffected = preparedStatement.executeLargeUpdate(sql);
				if (rowAffected == 1) {
					bookService = new BookImpl();
					bookService.updateCopies(bookMaintenance.getBook());

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowAffected;
	}

	public List<BookMaintenance> getAssignedBooks() {
		Connection connection = DBConnection.getDBConnection();
		String sql = "SELECT B.BOOK_ID,BOOK_NAME,AUTHOR,S.STUDENT_USERNAME,STUDENT_NAME,MOBILE,ADDRESS,ISSUE_DATE,RETURN_DATE "
				+ "FROM BOOK_DETAILS B INNER JOIN STUDENT S INNER JOIN BORROW_DETAILS BO "
				+ "ON B.BOOK_ID=BO.BOOK_ID AND S.STUDENT_USERNAME=BO.STUDENT_USERNAME;";
		List<BookMaintenance> assignedBooks = new ArrayList<BookMaintenance>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Book book = new Book();
				Student student = new Student();
				BookMaintenance bookMaintenance = new BookMaintenance();
				book.setBookId(resultSet.getInt(1));
				book.setBookName(resultSet.getString(2));
				book.setAuthorName(resultSet.getString(3));
				bookMaintenance.setBook(book);
				student.setStudentUsername(resultSet.getString(4));
				student.setName(resultSet.getString(5));
				student.setMobile(resultSet.getLong(6));
				student.setAddress(resultSet.getString(7));
				bookMaintenance.setStudent(student);
				bookMaintenance.setIssueDate(resultSet.getString(8));
				bookMaintenance.setReturnDate(resultSet.getString(9));
				assignedBooks.add(bookMaintenance);
			}
			for (BookMaintenance bookMaintenance1 : assignedBooks) {
				System.out.println(bookMaintenance1.getBook().getBookId());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assignedBooks;

	}
}
