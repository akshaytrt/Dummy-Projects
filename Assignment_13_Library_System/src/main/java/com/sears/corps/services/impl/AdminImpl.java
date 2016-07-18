/**
 * 
 */
package com.sears.corps.services.impl;

import com.sears.corps.dao.AdminDao;
import com.sears.corps.services.AdminService;

/**
 * @author athora0
 *
 */
public class AdminImpl implements AdminService {
	AdminDao adminDao=new AdminDao();
	public boolean validateUser(String username,String password){
		return adminDao.validateUser(username,password);
	}
}
