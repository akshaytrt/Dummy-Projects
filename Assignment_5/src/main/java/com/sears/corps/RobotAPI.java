/**
 * 
 */
package com.sears.corps;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sears.corps.exceptions.NotEnoughPowerException;
import com.sears.corps.exceptions.WrongInputException;

/**
 * @author athora0
 *
 */
public class RobotAPI {
	private static final Logger logger = LogManager.getLogger(RobotAPI.class.getClass());

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			
			Robot robot = new Robot();
			System.out.println("Enter the power of the robot");
			robot.setPercentPower(input.nextFloat());
			System.out.println("Add some weight on robot");
			robot.setObjectWeight(input.nextFloat());
			System.out.println("How far robot should go");
			robot.setWalkedDistance(input.nextFloat());
			PhysicalOperation operations = new PhysicalOperation();

			logger.info("Initialised the Robot attributes");
			logger.info("Power: "+robot.getPercentPower());
			logger.info("Added Weight: "+robot.getObjectWeight());
			logger.info("How far robot should go :"+robot.getWalkedDistance());
			

			float distanceCovered = operations.calculateWalkDistance(robot.getPercentPower(), robot.getObjectWeight());
			float powerLeft = operations.powerConsume(robot);
			System.out.println("Details--------");
			System.out.println("Current power status :" + robot.getPercentPower());
			System.out.println("Added weight :" + robot.getObjectWeight() + " kg");
			System.out.println("Total Distance can be covered with weight:" + distanceCovered + " km");
			System.out.println("Power Left :" + powerLeft + "%");

			input.close();

		} catch (WrongInputException exception) {
			System.out.println(exception);
		} catch (NotEnoughPowerException exception) {
			System.out.println(exception);
		}
	}
}
