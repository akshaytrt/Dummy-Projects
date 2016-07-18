package com.sears.corps;

import com.sears.corps.exceptions.NotEnoughPowerException;
import com.sears.corps.exceptions.WrongInputException;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest{
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */

	@Test
	public void powerConsumeTest() {
		PhysicalOperation physicalOperation = new PhysicalOperation();
		
		try {
			Robot robot = new Robot(100, 2, 3);
			float actual = physicalOperation.powerConsume(robot);
			float expected = 38;
			assertEquals(expected, actual,0.0);
		} catch (NotEnoughPowerException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void powerConsumeTest1() {
		PhysicalOperation physicalOperation = new PhysicalOperation();
		
		try {
			 Robot robot = new Robot(14,0,0);
			float actual = physicalOperation.powerConsume(robot);
			float expected = 14;
			assertEquals(expected, actual,0.0);
		} catch (NotEnoughPowerException e) {
			System.out.println(e);
		}
	}
	@Test
	public void powerConsumeTest2() {
		PhysicalOperation physicalOperation = new PhysicalOperation();
		
		try {
			Robot robot = new Robot(100,0,3.5f);
			float actual = physicalOperation.powerConsume(robot);
			float expected = 30;
			assertEquals(expected, actual,0.0);
		} catch (NotEnoughPowerException e) {
			System.out.println(e);
		}
	}
	@Test (expected=WrongInputException.class)
	public void exceededWeightTest() throws WrongInputException{
		Robot robot = new Robot();
		robot.setObjectWeight(12);
	}
	
}
