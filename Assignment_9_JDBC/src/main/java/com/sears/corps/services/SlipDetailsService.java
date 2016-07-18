/**
 * 
 */
package com.sears.corps.services;

import java.util.List;

import com.sears.corps.model.SlipDetails;

/**
 * @author athora0
 *
 */
public interface SlipDetailsService {
	public int insertData(SlipDetails slipDetails);
	public void getSlipDetails(int ownerNum);
}
