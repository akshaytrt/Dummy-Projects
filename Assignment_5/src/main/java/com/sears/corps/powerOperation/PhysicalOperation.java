package com.sears.corps.powerOperation;

import com.sears.corps.exceptions.NotEnoughPowerException;
import com.sears.corps.helper.ApplicationConstants;

public class PhysicalOperation {

	public float walkRobot(Power power) {
		float distanceCovered;
		distanceCovered = calculateWalkDistance(power.getPercentPower(), power.getObjectWeight());

		return distanceCovered;

	}
	//This method will calculate the walking distance with given weight and power
	public float calculateWalkDistance(float powerPercent, float addedWeight) {
		float distanceCovered;
		distanceCovered = ApplicationConstants.WALK_PER_CHARGE * (powerPercent - (addedWeight * 2))
				/ ApplicationConstants.MAX_POWER;
		return distanceCovered;
	}
	//This method will calculate the power consumed for given distance and power
	public float powerConsume(Power power) throws NotEnoughPowerException{
		float powerConsumption = 0;
		powerConsumption = (power.getWalkedDistance()
				* (ApplicationConstants.MAX_POWER
						+ (power.getObjectWeight() * ApplicationConstants.EXTRA_POWER_CONSUMPTION))
				/ ApplicationConstants.WALK_PER_CHARGE);
		
		if((power.getPercentPower() - powerConsumption)<0)
			throw new NotEnoughPowerException("Robot don't have enough battery power"); 
		return power.getPercentPower() - powerConsumption;
	}

}
