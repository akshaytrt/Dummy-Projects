/**
 * 
 */
package com.sears.corps.classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author athora0
 *
 */
public class User {
	Properties prop = new Properties();

	public String getPassword(String userName) {
		String pwd = null;
		try {
			prop.load(User.class.getClassLoader().getResourceAsStream("user.properties"));
			pwd = prop.getProperty(userName);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pwd;
	}

}
