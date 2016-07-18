/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.SlipDetailsDao;
import com.sears.corps.model.SlipDetails;
import com.sears.corps.services.SlipDetailsService;

/**
 * @author athora0
 *
 */
public class SlipDetailsImpl implements SlipDetailsService {
	SlipDetailsDao slipDetailsDao = new SlipDetailsDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sears.corps.services.SlipDetailsService#insertData(java.util.List)
	 */
	public int insertData(SlipDetails slipDetails) {
		// TODO Auto-generated method stub
		return slipDetailsDao.insertData(slipDetails);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sears.corps.services.SlipDetailsService#getSlipDetails()
	 */
	public void getSlipDetails(int ownerNum) {
		// TODO Auto-generated method stub
		slipDetailsDao.getSlipDetails(ownerNum);
	}

}
