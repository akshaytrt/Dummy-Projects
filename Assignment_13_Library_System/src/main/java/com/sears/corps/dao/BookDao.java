/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sears.corps.model.Book;

/**
 * @author athora0
 *
 */
public class BookDao {
	public List<Book> getBookDetails() {
		List<Book> bookList = new ArrayList<Book>();

		Connection connection = DBConnection.getDBConnection();
		String sql = "SELECT BOOK_ID,BOOK_NAME,AUTHOR,COPIES FROM BOOK_DETAILS ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Book book = new Book();
				book.setBookId(resultSet.getInt(1));
				book.setBookName(resultSet.getString(2));
				book.setAuthorName(resultSet.getString(3));
				book.setCopies(resultSet.getInt(4));
				bookList.add(book);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookList;
	}

	public Book getBookDetails(String bookName) {
		Book book = new Book();

		Connection connection = DBConnection.getDBConnection();
		String sql = "SELECT BOOK_ID,BOOK_NAME,AUTHOR,COPIES FROM BOOK_DETAILS WHERE BOOK_NAME='" + bookName + "';";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				book.setBookId(resultSet.getInt(1));
				book.setBookName(resultSet.getString(2));
				book.setAuthorName(resultSet.getString(3));
				book.setCopies(resultSet.getInt(4));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	public long addBook(Book book) {
		Connection connection = DBConnection.getDBConnection();
		String sql = "INSERT INTO BOOK_DETAILS (BOOK_NAME,AUTHOR,COPIES) VALUES('" + book.getBookName() + "','"
				+ book.getAuthorName() + "','" + book.getCopies() + "');";
		long rowAffected=0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowAffected= preparedStatement.executeLargeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowAffected;
	}
	public long updateCopies(Book book){
		Connection connection = DBConnection.getDBConnection();
		String sql = "UPDATE BOOK_DETAILS SET COPIES=COPIES-1 WHERE BOOK_ID="+book.getBookId()+";";
		long rowAffected=0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowAffected= preparedStatement.executeLargeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowAffected;
	}
	
	public boolean checkCopies(Book book){
		Connection connection = DBConnection.getDBConnection();
		String sql = "SELECT COPIES FROM BOOK_DETAILS WHERE BOOK_ID="+book.getBookId()+";";
		long copies=0;
		boolean result = false;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()){
				copies=resultSet.getInt(1);
				if(1<=copies)
					result=true;
				else
					result=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public long updateBook(Book book){
		Connection connection = DBConnection.getDBConnection();
		String sql = "UPDATE BOOK_DETAILS SET COPIES="+book.getCopies()+" WHERE BOOK_ID="+book.getBookId()+";";
		long rowAffected=0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowAffected= preparedStatement.executeLargeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowAffected;
	}

}
