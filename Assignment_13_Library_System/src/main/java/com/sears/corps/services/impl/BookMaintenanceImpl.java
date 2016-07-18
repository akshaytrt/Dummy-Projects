/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.BookMaintenanceDao;
import com.sears.corps.model.Book;
import com.sears.corps.model.BookMaintenance;
import com.sears.corps.model.Student;
import com.sears.corps.services.BookMaintenanceService;

/**
 * @author athora0
 *
 */
public class BookMaintenanceImpl implements BookMaintenanceService {
	BookMaintenanceDao bookMaintenanceDao=new BookMaintenanceDao();
	public long assignBook(BookMaintenance bookMaintenance){
		return bookMaintenanceDao.assignBook(bookMaintenance);
	}
	public List<BookMaintenance> getAssignedBooks() {
		// TODO Auto-generated method stub
		return bookMaintenanceDao.getAssignedBooks();
	}
}
