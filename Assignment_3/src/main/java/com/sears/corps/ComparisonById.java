package com.sears.corps;

import java.util.Comparator;

public class ComparisonById implements Comparator<Person> {
	public int compare(Person person1, Person person2) {
		return ((person1.getId() < person2.getId()) ? -1 : (person1.getId() > person2.getId()) ? 1 : 0);
	}

}
