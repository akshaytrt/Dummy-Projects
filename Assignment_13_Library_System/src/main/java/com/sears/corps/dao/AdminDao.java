/**
 * 
 */
package com.sears.corps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author athora0
 *
 */
public class AdminDao {
 public boolean validateUser(String username,String password){
	 boolean isValid=false;
	 Connection connection=DBConnection.getDBConnection();
	 String sql="SELECT ADMIN_USERNAME,ADMIN_PASSWORD FROM ADMIN WHERE ADMIN_USERNAME=? AND ADMIN_PASSWORD=?";
	 try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultSet=preparedStatement.executeQuery();
		 isValid=resultSet.next();
		 return isValid;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return isValid;
	
 }
}
