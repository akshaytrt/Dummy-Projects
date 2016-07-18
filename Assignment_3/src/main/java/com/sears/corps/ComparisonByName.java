/**
 * 
 */
package com.sears.corps;

import java.util.Comparator;

/**
 * @author athora0
 *
 */
public class ComparisonByName implements Comparator<Person> {

	public int compare(Person person1, Person person2) {
		return person1.getName().compareTo(person2.getName());
	}
}
