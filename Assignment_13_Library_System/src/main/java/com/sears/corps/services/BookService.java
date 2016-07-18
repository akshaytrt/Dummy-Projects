/**
 * 
 */
package com.sears.corps.services;

import java.util.List;

import com.sears.corps.model.Book;

/**
 * @author athora0
 *
 */
public interface BookService {
	public List<Book> getBookDetails();
	public Book getBookDetails(String bookName);
	public long addBook(Book book);
	public long updateCopies(Book book);
	public boolean checkCopies(Book book);
	public long updateBook(Book book);
}
