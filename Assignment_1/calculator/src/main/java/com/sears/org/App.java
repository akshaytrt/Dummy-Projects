package com.sears.org;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private int firstNum,secondNum;
    public static void main( String[] args )
    {
    	try
    	{
    	App calc=new App();
    	Scanner s=new Scanner(System.in);
    	System.out.println("First Number :");
    	int num1=s.nextInt();
    	System.out.println("Second Number :");
    	int num2=s.nextInt();
    	calc.setData(num1, num2);
    	System.out.println("Addition is "+calc.add());
    	System.out.println("Subtraction is "+calc.subtract());
    	System.out.println("Multiplication is "+calc.multiply());
    	System.out.println("Division is "+calc.divide());
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println("Entered Character input for number");
    	}
    	catch(InputMismatchException ime)
    	{
    		System.out.println("User did not entered a number...");
    	}
    	catch(ArithmeticException ae)
    	{
    		System.out.println("Entered zero for denominator....");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public void setData(int firstNum,int secondNum)
    {
    	this.firstNum=firstNum;
    	this.secondNum=secondNum;
    }
    public int add()
    {
    	return (this.firstNum + this.secondNum);
    }
    public int subtract()
    {
    	return (this.firstNum - this.secondNum);
    }
    public int multiply()
    {
    	return (this.firstNum * this.secondNum);
    }
    public int divide()
    {
    	return (this.firstNum / this.secondNum);
    }
}
