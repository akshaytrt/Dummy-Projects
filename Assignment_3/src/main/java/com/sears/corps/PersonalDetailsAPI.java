/**
 * 
 */
package com.sears.corps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author athora0
 *
 */
public class PersonalDetailsAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person data;
		List<Person> list = new ArrayList<Person>();
		List<Person> list2 = new ArrayList<Person>();
		List<Person> temporaryList = new ArrayList<Person>();
		Address address1 = new Address("Maharashtra", "India", "Asia");
		Address address2 = new Address("Telangana", "India", "Asia");
		Address address3 = new Address("Assam", "India", "Asia");
		Address address4 = new Address("West Bengal", "India", "Asia");
		Address address5 = new Address("Punjab", "India", "Asia");

		Person person1 = new Person(1201, "Akshay", 20000, address1);
		Person person2 = new Person(1042, "Ram", 30000, address2);
		Person person3 = new Person(1003, "Ajay", 25000, address3);
		Person person4 = new Person(1004, "Rahul", 24000, address4);
		Person person5 = new Person(1205, "Durga", 200000, address5);

		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);

		Collections.sort(list, new ComparisonById());
		System.out.println("Sorted by Id");
		Iterator<Person> itr = list.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(data.getId() + "  " + data.getName() + "  " + data.getSalary());
		}

		System.out.println("--------------------------------------------------");

		Collections.sort(list, new ComparisonByName());
		System.out.println("Sorted by Name");
		itr = list.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(data.getId() + "  " + data.getName() + "  " + data.getSalary());
		}
		System.out.println("--------------------------------------------------");

		Collections.sort(list, new ComparisonBySalary());
		System.out.println("Sorted by Salary");
		itr = list.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(data.getId() + "  " + data.getName() + "  " + data.getSalary());
		}

		Address address6 = new Address("Arkansas", "USA", "North America");
		Address address7 = new Address("Alaska", "USA", "North America");
		Address address8 = new Address("California", "USA", "North America");
		Address address9 = new Address("Shanghai", "China", "Asia");
		Address address10 = new Address("Colorado", "USA", "North America");
		
		Person person9 = new Person(1034, "Jimmy", 44000, address9);
		Person person6 = new Person(1211, "Tony Stark", 200000, address6);
		Person person7 = new Person(1142, "Jack", 350000, address7);
		Person person8 = new Person(1103, "Alex", 30000, address8);
		Person person10 = new Person(1205, "Tim", 200000, address10);

		list.add(person6);
		list.add(person7);
		list.add(person8);
		list.add(person9);
		list.add(person10);

		temporaryList.addAll(list);

		for (Person person : temporaryList) {
			if (!person.getAddress().getCountry().equalsIgnoreCase("India")) {
				list2.add(person);
			}
		}
		list.removeAll(list2);
		Collections.sort(list2, new ComparisonById());
		System.out.println("--------------------------------------------------");
		System.out.println("Sorted List of NRI's by Id");
		itr = list2.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(
					data.getId() + "  " + data.getName() + "  " + data.getSalary() + "  " + data.getAddress().getState()
							+ " " + data.getAddress().getCountry() + "  " + data.getAddress().getContinent());
		}

		System.out.println("--------------------------------------------------");
		Collections.sort(list, new ComparisonById());
		System.out.println("Sorted List of Indians by Id");
		itr = list.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(
					data.getId() + "  " + data.getName() + "  " + data.getSalary() + "  " + data.getAddress().getState()
							+ " " + data.getAddress().getCountry() + "  " + data.getAddress().getContinent());
		}

		System.out.println("--------------------------------------------------");
		list2.clear();
		list.clear();
		list.addAll(temporaryList);
		for (Person person : temporaryList) {
			if (!(person.getAddress().getContinent().equalsIgnoreCase("Asia"))) {
				list2.add(person);
			}

		}
		list.removeAll(list2);
		Collections.sort(list2, new ComparisonById());
		System.out.println("--------------------------------------------------");
		System.out.println("Sorted List of People living in other continents than Asia");
		itr = list2.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(
					data.getId() + "  " + data.getName() + "  " + data.getSalary() + "  " + data.getAddress().getState()
							+ " " + data.getAddress().getCountry() + "  " + data.getAddress().getContinent());
		}

		System.out.println("--------------------------------------------------");
		Collections.sort(list, new ComparisonById());
		System.out.println("Sorted List of People living in Asia");
		itr = list.iterator();
		while (itr.hasNext()) {
			data = itr.next();
			System.out.println(
					data.getId() + "  " + data.getName() + "  " + data.getSalary() + "  " + data.getAddress().getState()
							+ " " + data.getAddress().getCountry() + "  " + data.getAddress().getContinent());
		}

		System.out.println("--------------------------------------------------");

	}

}
