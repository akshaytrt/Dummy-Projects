/**
 * 
 */
package com.sears.corps.services.impl;

import com.sears.corps.dao.AdminDao;
import com.sears.corps.dao.StudentDao;
import com.sears.corps.services.StudentService;

/**
 * @author athora0
 *
 */
public class StudentImpl implements StudentService {

	StudentDao studentDao=new StudentDao();
	public boolean validateUser(String username,String password){
		return studentDao.validateUser(username,password);
	}

}
