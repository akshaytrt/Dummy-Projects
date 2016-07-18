/**
 * 
 */
package com.sears.corps;

import java.util.List;

/**
 * @author athora0
 *
 */
public interface StudentDAO {
	public int insertDetails(Student student);

	public List<Student> getDetails();

	public Student getStudent(int id);

	public int updateStudent(Student student);

	public int delete(int id);
}
