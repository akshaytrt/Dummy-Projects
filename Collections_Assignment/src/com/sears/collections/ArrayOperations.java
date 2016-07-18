/**
 * 
 */
package com.sears.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author athora0
 *
 */
public class ArrayOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count=0,key,value;
		Integer[] intArray={1,2,2,1,3,1,3,3,1,1,1,1,3,3,3,2,2,2,2,1,1,1};
		List<Integer> asList = Arrays.asList(intArray);
		
		System.out.println("Getting result by using frequency method ");
			System.out.println("Number :1"+" Occurence: "+Collections.frequency(asList, 1));
			System.out.println("Number :2"+" Occurence: "+Collections.frequency(asList, 2));
			System.out.println("Number :3"+" Occurence: "+Collections.frequency(asList, 3));
			
		
		
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (Integer integer : asList) {
			   if(map.containsKey(integer)){
				     count = map.get(integer);
				    map.put(integer, count+1);
				   }
				   else{
				    map.put(integer, 1);
				   }
		}
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itr=keySet.iterator();
		System.out.println("\nGetting the result by using map");
		while(itr.hasNext()){
			key=itr.next();
			value=map.get(key);
			System.out.println("Number :"+key+"  Occurence: "+value);
		}
		
	}

}
