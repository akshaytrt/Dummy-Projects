/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.OwnerDetailsDAO;
import com.sears.corps.services.OwnerDetailsService;

/**
 * @author athora0
 *
 */
public class OwnerDetailsImpl implements OwnerDetailsService {
	OwnerDetailsDAO ownerDetailsDAO = new OwnerDetailsDAO();

	public void insertData(List<String[]> list) {
		ownerDetailsDAO.insertData(list);
	}
}
