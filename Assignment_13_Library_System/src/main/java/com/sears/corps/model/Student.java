/**
 * 
 */
package com.sears.corps.model;

/**
 * @author athora0
 *
 */
public class Student {
	private String studentUsername;
	private String studentPassword;
	private String name;
	private long mobile;
	private String address;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mobile
	 */
	public long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the studentUsername
	 */
	public String getStudentUsername() {
		return studentUsername;
	}
	/**
	 * @param studentUsername the studentUsername to set
	 */
	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	/**
	 * @return the studentPassword
	 */
	public String getStudentPassword() {
		return studentPassword;
	}
	/**
	 * @param studentPassword the studentPassword to set
	 */
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
}
