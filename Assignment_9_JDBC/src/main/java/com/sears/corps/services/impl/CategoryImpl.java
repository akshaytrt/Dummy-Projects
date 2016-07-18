/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.CategoryDAO;
import com.sears.corps.services.CategoryService;

/**
 * @author athora0
 *
 */
public class CategoryImpl implements CategoryService {
	CategoryDAO categoryDAO=new CategoryDAO();
	public void insertData(List<String[]> list){
		categoryDAO.insertData(list);
	}
}
