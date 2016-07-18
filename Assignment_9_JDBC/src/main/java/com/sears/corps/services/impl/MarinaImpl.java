/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.MarinaDAO;
import com.sears.corps.services.MarinaService;

/**
 * @author athora0
 *
 */
public class MarinaImpl implements MarinaService {
	MarinaDAO marinaDAO = new MarinaDAO();

	public void insertData(List<String[]> list) {
		marinaDAO.insertData(list);
	}
}
