package com.sears.collections;


import java.util.ArrayList;
import java.util.List;


public class ArrayManipulation {
	public static void main(String[] args) {

		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			data.add(i);
		}
		int sum=data.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Numbers is arraylist:");
		for (Integer integer : data) {
			System.out.print(integer+" ");
		}
		System.out.println("\nArraylist after manipulation :");
		for (Integer integer : data) {
			System.out.print(sum-integer+" ");
		}
	}
}
/*
 * void m1(){ m2(); throw new x("sdafdsf"); } void m2() throws x{ throw new
 * x("sdfsdffsd"); } }
 * 
 * class x extends RuntimeException{
 * 
 * public x(String message) { super(message); // TODO Auto-generated constructor
 * stub }
 * 
 * }
 */