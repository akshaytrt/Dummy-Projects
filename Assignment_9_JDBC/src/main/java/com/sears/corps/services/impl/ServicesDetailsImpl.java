/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.ServicesDetailsDAO;
import com.sears.corps.model.ServiceDetails;
import com.sears.corps.services.ServicesDetailsService;

/**
 * @author athora0
 *
 */
public class ServicesDetailsImpl implements ServicesDetailsService {
	ServicesDetailsDAO servicesDetailsDAO = new ServicesDetailsDAO();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sears.corps.services.ServicesDetailsService#insertData(java.util.
	 * List)
	 */
	public void insertData(ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub
		servicesDetailsDAO.insertData(serviceDetails);
	}

}
