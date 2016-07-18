package com.sears.corps.exceptions;

/**
 * @author athora0 
 * This class is for creating custom exception class if we add
 *         wrong input for power,weight and distance
 */
public class WrongInputException extends Exception {
	public WrongInputException(String message) {
		super(message);
	}
}
