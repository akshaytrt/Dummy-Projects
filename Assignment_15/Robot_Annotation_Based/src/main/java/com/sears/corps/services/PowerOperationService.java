/**
 * 
 */
package com.sears.corps.services;

import org.springframework.stereotype.Service;

import com.sears.corps.Robot;
import com.sears.corps.exceptions.NotEnoughPowerException;

/**
 * @author athora0
 *
 */
@Service
public interface PowerOperationService {
	public float walkRobot(Robot robot);
	public float calculateWalkDistance(float powerPercent, float addedWeight);
	public float powerConsume(Robot robot) throws NotEnoughPowerException ;
}
