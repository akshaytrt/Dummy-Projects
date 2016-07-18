/**
 * 
 */
package com.sears.corps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author athora0
 *
 */
@Component(value="printService")
public class PrintServiceImpl implements PrintService {
	MessageServiceImpl messageService;
	
	/**
	 * @return the messageService
	 */
	
	public MessageService getMessageService() {
		return messageService;
	}

	/**
	 * @param messageService the messageService to set
	 */
	@Autowired
	@Qualifier("messageService")
	public void setMessageService(MessageServiceImpl messageService) {
		this.messageService = messageService;
	}

	public void printMessage(){
		System.out.println(this.getMessageService().generateMessage());
	}
}
