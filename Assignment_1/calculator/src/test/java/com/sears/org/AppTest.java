package com.sears.org;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testAdd()
    {
    	App a=new App();
    	a.setData(10, 20);
    	int expected=30;
    	int actual=a.add();
    	assertEquals(expected, actual);
    }
    public void testAdd1(){
    	App a=new App();
    	a.setData(-10, 20);
    	int expected=10;
    	int actual=a.add();
    	assertEquals(expected, actual);
    }
    public void testAdd2(){
    	App a=new App();
    	a.setData(-10, -20);
    	int expected=-30;
    	int actual=a.add();
    	assertEquals(expected, actual);
    }
    //Test cases for subtract()
    
    public void testSub()
    {
    	App a=new App();
    	a.setData(10, 20);
    	int expected=-10;
    	int actual=a.subtract();
    	assertEquals(expected, actual);
    }
    public void testSub1(){
    	App a=new App();
    	a.setData(-10, 20);
    	int expected=-30;
    	int actual=a.subtract();
    	assertEquals(expected, actual);
    }
    public void testSub2(){
    	App a=new App();
    	a.setData(-10, -20);
    	int expected=10;
    	int actual=a.subtract();
    	assertEquals(expected, actual);
    }
    
    //Test cases for multiply
    
    public void testMul()
    {
    	App a=new App();
    	a.setData(10, 20);
    	int expected=200;
    	int actual=a.multiply();
    	assertEquals(expected, actual);
    }
    public void testMul1(){
    	App a=new App();
    	a.setData(-10, 20);
    	int expected=-200;
    	int actual=a.multiply();
    	assertEquals(expected, actual);
    }
    public void testMul2(){
    	App a=new App();
    	a.setData(-10, -20);
    	int expected=200;
    	int actual=a.multiply();
    	assertEquals(expected, actual);
    }
    
    //test cases for divide()
    
    public void testDiv()
    {
    	App a=new App();
    	a.setData(10, 20);
    	int expected=0;
    	int actual=a.divide();
    	assertEquals(expected, actual);
    }
    public void testDiv1(){
    	App a=new App();
    	a.setData(-20, 20);
    	int expected=-1;
    	int actual=a.divide();
    	assertEquals(expected, actual);
    }
    public void testDiv2(){
    	App a=new App();
    	a.setData(-20, -10);
    	int expected=2;
    	int actual=a.divide();
    	assertEquals(expected, actual);
    }
}
