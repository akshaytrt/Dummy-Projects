/**
 * 
 */
package com.sears.corps;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author athora0
 *
 */
public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet resultSet, int row) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(resultSet.getInt(1));
		student.setName(resultSet.getString(2));
		student.setAge(resultSet.getInt(3));
		return student;
	}

}
