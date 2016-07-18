/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author athora0
 *
 */
public class OwnerDetailsDAO {
	public void insertData(List<String[]> list) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {

			// STEP 1: Open a connection
			System.out.println("Connecting to database...");

			conn = DBConnection.getDBConnection();
			// STEP 2: Execute a query
			System.out.println("Creating statement...");
			String sql = "INSERT INTO OWNER_DETAILS (OWNER_NUM,OWNER_NAME,MOBILE,STREET,ZIP_CODE,BOAT_NAME) VALUES(?,?,?,?,?,?)";
			preparedStatement = conn.prepareStatement(sql);

			for (String[] strings : list) {

				preparedStatement.setInt(1, Integer.parseInt(strings[0]));
				preparedStatement.setString(2, strings[1]);
				preparedStatement.setInt(3, Integer.parseInt(strings[2]));
				preparedStatement.setString(4, strings[3]);
				preparedStatement.setInt(5, Integer.parseInt(strings[4]));
				preparedStatement.setString(6, strings[5]);
				preparedStatement.execute();

			}
			System.out.println("OwenerDetails table data inserted");

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
