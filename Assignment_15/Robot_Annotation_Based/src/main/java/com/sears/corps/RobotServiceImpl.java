/**
 * 
 */
package com.sears.corps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sears.corps.exceptions.NotEnoughPowerException;
import com.sears.corps.services.RobotService;

/**
 * @author athora0
 *
 */
@Component
public class RobotServiceImpl implements RobotService {

	@Autowired
	PhysicalOperation physicalOperation;
	public float walkRobot(Robot robot) {
		// TODO Auto-generated method stub
		return physicalOperation.walkRobot(robot);
	}

	public float calculateWalkDistance(float powerPercent, float addedWeight) {
		// TODO Auto-generated method stub
		return physicalOperation.calculateWalkDistance(powerPercent, addedWeight);
	}

	public float powerConsume(Robot robot) throws NotEnoughPowerException {
		// TODO Auto-generated method stub
		return physicalOperation.powerConsume(robot);
	}

}
