/**
 * 
 */
package com.sears.corps.services.impl;

import java.util.List;

import com.sears.corps.dao.LocationDao;
import com.sears.corps.services.LocationService;

/**
 * @author athora0
 *
 */
public class LocationImpl implements LocationService {
	LocationDao locationDao = new LocationDao();

	public void insertData(List<String[]> list) {
		locationDao.insertData(list);
	}
}
