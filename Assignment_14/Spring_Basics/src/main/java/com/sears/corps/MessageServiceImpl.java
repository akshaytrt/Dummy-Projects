/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public class MessageServiceImpl implements MessageService {
	String message;
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public String generateMessage(){
		return message;
	}
}
