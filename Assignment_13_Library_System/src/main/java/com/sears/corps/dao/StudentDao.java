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
public class StudentDao {
	 public boolean validateUser(String username,String password){
		 boolean isValid=false;
		 Connection connection=DBConnection.getDBConnection();
		 String sql="SELECT STUDENT_USERNAME,STUDENT_PASSWORD FROM STUDENT WHERE STUDENT_USERNAME=? AND STUDENT_PASSWORD=?";
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
