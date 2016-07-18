/**
 * 
 */
package com.sears.corps;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author athora0
 *
 */
public class StudentDAOImpl implements StudentDAO {

	JdbcTemplate jdbcTemplate;

	public StudentDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		// TODO Auto-generated constructor stub
	}

	public int insertDetails(Student student) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO STUDENTS (ID,NAME,AGE)VALUES('" + student.getId() + "','" + student.getName() + "','"
				+ student.getAge() + "')";
		
		return jdbcTemplate.update(query);
	}

	public List<Student> getDetails() {
		// TODO Auto-generated method stub
		String query="SELECT ID,NAME,AGE FROM STUDENTS";
		List<Student> students=jdbcTemplate.query(query, new StudentMapper());
		return students;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String query="SELECT ID,NAME,AGE FROM STUDENTS WHERE ID=?";
		Student student= jdbcTemplate.queryForObject(query, 
                new Object[]{id}, new StudentMapper());
		return student;
	}

	public int updateStudent(Student student) {
		String query="UPDATE STUDENTS SET NAME='"+student.getName()+"',AGE="+student.getAge()+" WHERE ID="+student.getId();
		return jdbcTemplate.update(query);
	}

	public int delete(int id) {
		String query="DELETE FROM STUDENTS WHERE ID="+id;
		return jdbcTemplate.update(query);

	}

}
