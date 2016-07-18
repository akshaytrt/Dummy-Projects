/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sears.corps.model.ServiceDetails;

/**
 * @author athora0
 *
 */
public class ServicesDetailsDAO {
	public void insertData(ServiceDetails serviceDetails) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {

			// STEP 1: Open a connection
			System.out.println("Connecting to database...");

			conn = DBConnection.getDBConnection();
			// STEP 2: Execute a query
			System.out.println("Creating statement...");
			String sql = "INSERT INTO SERVICES (CATEGORY_NUM,JOB_DESC,EST_HRS,NEXT_SRVC_DATE,SLIP_ID) VALUES(?,?,?,?,?)";
			preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, serviceDetails.getCategory().getCategoryNum());
			preparedStatement.setString(2, serviceDetails.getJobDesc());
			preparedStatement.setInt(3, serviceDetails.getEstimatedHrs());
			preparedStatement.setString(4, serviceDetails.getNextServiceDate());
			preparedStatement.setInt(5, serviceDetails.getSlipDetail().getSlipId());
			preparedStatement.execute();
			System.out.println("Services table data inserted");

		} catch (SQLException sql) {
			sql.printStackTrace();

		} finally {
			try {
				preparedStatement.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
