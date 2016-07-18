/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author athora0
 *
 */
public class DBConnection {
	public static final String DB_URL = "jdbc:mysql://172.29.81.150:3306/athora0";
	public static final String USER = "athora0";
	public static final String PASS = "athora0";
	public static final Connection getDBConnection(){
		Connection conn=null;
		
		try {
			  conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
		} catch(SQLException sql){
			sql.printStackTrace();
		}
		return conn;
		 
	}

}
