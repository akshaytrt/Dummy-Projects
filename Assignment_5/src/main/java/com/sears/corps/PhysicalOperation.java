package com.sears.corps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sears.corps.exceptions.NotEnoughPowerException;
import com.sears.corps.helper.ApplicationConstants;

public class PhysicalOperation {
	private static final Logger logger = LogManager.getLogger(PhysicalOperation.class.getClass());

	public float walkRobot(Robot robot) {
		float distanceCovered;
		distanceCovered = calculateWalkDistance(robot.getPercentPower(), robot.getObjectWeight());

		return distanceCovered;

	}

	// This method will calculate the walking distance with given weight and
	// power
	public float calculateWalkDistance(float powerPercent, float addedWeight) {
		float distanceCovered;
		logger.info("Calculating the distance that robot should walk within the given power");
		distanceCovered = ApplicationConstants.WALK_PER_CHARGE * (powerPercent - (addedWeight * 2))
				/ ApplicationConstants.MAX_POWER;
		logger.info("Distance calculated");
		return distanceCovered;
	}

	// This method will calculate the power consumed for given distance and
	// power
	public float powerConsume(Robot robot) throws NotEnoughPowerException {
		float powerConsumption = 0;
		logger.info("Calculating the power left after performing walk operation");
		
		powerConsumption = (robot.getWalkedDistance()
				* (ApplicationConstants.MAX_POWER
						+ (robot.getObjectWeight() * ApplicationConstants.EXTRA_POWER_CONSUMPTION))
				/ ApplicationConstants.WALK_PER_CHARGE);

		if ((robot.getPercentPower() - powerConsumption) < 0)
			throw new NotEnoughPowerException("RobotAPI don't have enough battery power");
		logger.info("Left power calculated");
		
		return Math.round((robot.getPercentPower() - powerConsumption));
	}

}
