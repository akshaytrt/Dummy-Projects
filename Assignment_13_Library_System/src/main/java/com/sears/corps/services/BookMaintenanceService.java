/**
 * 
 */
package com.sears.corps.services;

import java.util.List;

import com.sears.corps.model.Book;
import com.sears.corps.model.BookMaintenance;
import com.sears.corps.model.Student;

/**
 * @author athora0
 *
 */
public interface BookMaintenanceService {
	public long assignBook(BookMaintenance bookMaintenance);
	public List<BookMaintenance> getAssignedBooks();
}
