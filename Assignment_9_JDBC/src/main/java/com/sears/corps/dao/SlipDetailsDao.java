/**
 * 
 */
package com.sears.corps.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import com.sears.corps.model.SlipDetails;

/**
 * @author athora0
 *
 */
public class SlipDetailsDao {
	public int insertData(SlipDetails slipDetails) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		int slipId = 0;

		try {

			// STEP 1: Open a connection
			System.out.println("Connecting to database...");

			conn = DBConnection.getDBConnection();
			// STEP 2: Execute a query
			System.out.println("Creating statement...");
			String sql = "INSERT INTO SLIP_DETAILS (OWNER_NUM,MARINA_NUM) VALUES(?,?)";
			preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, slipDetails.getOwnerDetail().getOwnerNum());
			preparedStatement.setInt(2, slipDetails.getMarinaDetail().getMarinaNum());
			preparedStatement.executeUpdate();
			System.out.println("Slip_Details table data inserted");

			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			while (resultSet.next()) {
				slipId = resultSet.getInt(1);
			}

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
		return slipId;
	}

	public void getSlipDetails(int ownerNum) {
		Connection conn = null;
		conn = DBConnection.getDBConnection();
		CallableStatement callableStatement = null;
		ResultSet rs = null;
		try {
			callableStatement = conn.prepareCall("{call GET_WORK_ORDER(?)}");
			callableStatement.setInt(1, ownerNum);
			rs = callableStatement.executeQuery();
			while (rs.next()) {
				System.out.println("\t\t\t WORK ORDER");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Slip id:" + rs.getString(1)+"\t\t\t\t"+"Marina number :" + rs.getString(3));
				System.out.println("Boat name: " + rs.getString(2)+"\t\t\t"+"Marina name :" + rs.getString(4));
				System.out.println("\n\nOwner name: " + rs.getString(5));
				System.out.println("Mobile number: " + rs.getString(6)+" "+"Street :" + rs.getString(7));
				System.out.println("City :" + rs.getString(8));
				System.out.println("State :" + rs.getString(9));
				System.out.println("Zipcode :" + rs.getString(10));
				System.out.println("Owner number: " + rs.getString(11));
				System.out.println("\n\nService id :" + rs.getString(12));
				System.out.println("Category number :" + rs.getString(13));
				System.out.println("Category description :" + rs.getString(14));
				System.out.println("Job description :" + rs.getString(15));
				System.out.println("Estimated gours: " + rs.getString(16));
				System.out.println("Next date to service: " + rs.getString(17));
				System.out.println("---------------------------------------------------------------------------");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
