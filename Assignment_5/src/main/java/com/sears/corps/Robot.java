/**
 * 
 */
package com.sears.corps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sears.corps.exceptions.WrongInputException;
import com.sears.corps.helper.ApplicationConstants;

/**
 * @author athora0
 *
 */
public class Robot {
	private float percentPower;
	private float objectWeight;
	private float walkedDistance;
	private static final Logger logger = LogManager.getLogger(Robot.class.getClass());

	/**
	 * @param percentPower
	 * @param objectWeight
	 * @param walkedDistance
	 */
	public Robot(float percentPower, float objectWeight, float walkedDistance) {
		super();
		if (percentPower < ApplicationConstants.MIN_POWER)
			System.out.println("Low power..(Blinked red light)");
		this.percentPower = percentPower;
		this.objectWeight = objectWeight;
		this.walkedDistance = walkedDistance;
	}

	/**
	 * 
	 */
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getPercentPower() {
		return percentPower;
	}

	public void setPercentPower(float percentPower) throws WrongInputException {
		checkValidity(percentPower);
		checkPower(percentPower);
		this.percentPower = percentPower;
	}

	public float getObjectWeight() {
		return objectWeight;
	}

	public void setObjectWeight(float objectWeight) throws WrongInputException {
		checkValidity(objectWeight);
		checkWeight(objectWeight);
		this.objectWeight = objectWeight;
	}

	public float getWalkedDistance() {
		return walkedDistance;
	}

	public void setWalkedDistance(float walkedDistance) throws WrongInputException {
		checkValidity(walkedDistance);
		checkDistance(walkedDistance);
		this.walkedDistance = walkedDistance;
	}

	public void checkValidity(float data) throws WrongInputException {
		if (data < 0){
			logger.error("Entered negative data");
			throw new WrongInputException("Dont enter negative value");
		}

	}

	public void checkDistance(float distance) throws WrongInputException {
		if (distance > ApplicationConstants.WALK_PER_CHARGE) {
			logger.error("Robot cannot walk more than 5 km");
			throw new WrongInputException("Robot cannot walk more than 5 km");
		}

	}

	public void checkWeight(float weight) throws WrongInputException {
		if (weight > ApplicationConstants.MAX_WEIGHT) {
			logger.error("Overweight...Robot can't pick more than 10 Kg weight");
			throw new WrongInputException("Overweight...Robot can't pick more than 10 Kg weight");
		}
	}

	public void checkPower(float minPower) throws WrongInputException {
		if (minPower < ApplicationConstants.MIN_POWER) {
			logger.warn("Low power...");
			System.out.println("Low power..(Blinked red light)");
		} else if (minPower > ApplicationConstants.MAX_POWER) {
			logger.error("Dont enter power greater than 100");
			throw new WrongInputException("Dont enter power greater than 100");
		}
	}

}
