/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author athora0
 *
 */
public class LocationDao {

	// JDBC driver name and database URL
	public void insertData(List<String[]> list) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {

			// STEP 1: Open a connection
			System.out.println("Connecting to database...");

			conn = DBConnection.getDBConnection();
			// STEP 2: Execute a query
			System.out.println("Creating statement...");
			String sql = "INSERT INTO LOCATION (ZIP_CODE,CITY,STATE) VALUES(?,?,?)";
			preparedStatement = conn.prepareStatement(sql);

			for (String[] strings : list) {

				preparedStatement.setInt(1, Integer.parseInt(strings[0]));
				preparedStatement.setString(2, strings[1]);
				preparedStatement.setString(3, strings[2]);
				preparedStatement.execute();

			}
			System.out.println("Location table data inserted");

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