/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.BookDao;
import com.sears.corps.model.Book;
import com.sears.corps.services.BookService;

/**
 * @author athora0
 *
 */
public class BookImpl implements BookService {
	BookDao bookDao=new BookDao();
	public List<Book> getBookDetails() {
		// TODO Auto-generated method stub
		return bookDao.getBookDetails();
	}
	public Book getBookDetails(String bookName) {
		// TODO Auto-generated method stub
		return bookDao.getBookDetails(bookName);
	}
	public long addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}
	public long updateCopies(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateCopies(book);
	}
	public boolean checkCopies(Book book) {
		// TODO Auto-generated method stub
		return bookDao.checkCopies(book);
	}
	public long updateBook(Book book){
		return bookDao.updateBook(book);
	}

}
