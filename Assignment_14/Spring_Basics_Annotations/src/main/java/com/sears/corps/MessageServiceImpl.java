/**
 * 
 */
package com.sears.corps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author athora0
 *
 */
@Component(value="messageService")
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
		return "Hello world";
	}
}
