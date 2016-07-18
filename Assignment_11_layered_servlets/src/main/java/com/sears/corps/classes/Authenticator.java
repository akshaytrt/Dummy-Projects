/**
 * 
 */
package com.sears.corps.classes;

/**
 * @author athora0
 *
 */
public class Authenticator {
	public boolean authenticate(String userName,String password){
		User user=new User();
		if(user.getPassword(userName).equals(password))
		return true;
		else
			return false;
	}
}
