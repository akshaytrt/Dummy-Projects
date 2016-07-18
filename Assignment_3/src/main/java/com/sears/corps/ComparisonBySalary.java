/**
 * 
 */
package com.sears.corps;

import java.util.Comparator;

/**
 * @author athora0
 *
 */
public class ComparisonBySalary implements Comparator<Person> {
	public int compare(Person person1, Person person2) {
		return ((person1.getSalary() < person2.getSalary()) ? -1 : (person1.getSalary() > person2.getSalary()) ? 1 : 0);
	}
}
