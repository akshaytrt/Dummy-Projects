/**
 * 
 */
package com.sears.corps.robot;

import java.util.Scanner;

import com.sears.corps.exceptions.NotEnoughPowerException;
import com.sears.corps.exceptions.WrongInputException;
import com.sears.corps.powerOperation.PhysicalOperation;
import com.sears.corps.powerOperation.Power;

/**
 * @author athora0
 *
 */
public class Robot {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			Power power = new Power(0);
			System.out.println("Enter the power of the robot");
			power.setPercentPower(input.nextFloat());
			System.out.println("Add some weight on robot");
			power.setObjectWeight(input.nextFloat());
			System.out.println("How far robot should go");
			power.setWalkedDistance(input.nextFloat());
			PhysicalOperation operations = new PhysicalOperation();

			float distanceCovered = operations.calculateWalkDistance(power.getPercentPower(), power.getObjectWeight());
			float powerLeft = operations.powerConsume(power);
			System.out.println("Details--------");
			System.out.println("Current power status :" + power.getPercentPower());
			System.out.println("Added weight :" + power.getObjectWeight()+" kg");
			System.out.println("Total Distance can be covered with weight:" + distanceCovered+" km");
			System.out.println("Power Left :" + powerLeft);

		} catch (WrongInputException exception) {
			exception.printStackTrace();
		} catch (NotEnoughPowerException exception) {
			exception.printStackTrace();
		}
	}
}
