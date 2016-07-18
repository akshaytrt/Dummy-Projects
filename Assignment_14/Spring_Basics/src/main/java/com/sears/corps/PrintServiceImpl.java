/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
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
	public void setMessageService(MessageServiceImpl messageService) {
		this.messageService = messageService;
	}

	public void printMessage(){
		System.out.println(this.getMessageService().generateMessage());
	}
}
