package com.sears.corps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandelling {
	public static final String RECORDS_FILE = "C:/Users/athora0/Projects/my-intern-training-project/Assignment_6/src/main/java/com/sears/corps/records.csv";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			List<Products> productList = new ArrayList<Products>();
			BufferedReader reader = new BufferedReader(new FileReader(RECORDS_FILE));
			FileReadOperation fileRead = new FileReadOperation();
			int ch = 0;

			productList = fileRead.readFile(reader, productList);

			ch = getChoice(input, productList, ch);
			reader.close();

		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (NumberFormatException numberFormatException) {
			numberFormatException.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			input.close();

		}

	}

	/*
	 * In this method we are accepting the choice from user
	 */
	private static int getChoice(Scanner input, List<Products> productList, int ch) {
		if (null == input) {
			input = new Scanner(System.in);
		} else {
			while (ch != 5) {
				System.out.println("--------------------------");
				System.out.println("1.Sort according to product id");
				System.out.println("2.Sort according to product name");
				System.out.println("3.Sort according to brand");
				System.out.println("4.Sort according to price");
				System.out.println("Enter your choice");
				ch = input.nextInt();

				switch (ch) {
				case 1:
					System.out.println("--------------------------");
					System.out.println("Sorted according to id");
					System.out.println("--------------------------");
					Collections.sort(productList, new ComparisonById());
					generateResult(productList);

					break;

				case 2:
					System.out.println("--------------------------");
					System.out.println("Sorted according to name");
					System.out.println("--------------------------");
					Collections.sort(productList, new ComparisonByName());
					generateResult(productList);

					break;
				case 3:
					System.out.println("--------------------------");
					System.out.println("Sorted according to brand");
					System.out.println("--------------------------");
					Collections.sort(productList, new ComparisonByBrand());
					generateResult(productList);

					break;
				case 4:
					System.out.println("--------------------------");
					System.out.println("Sorted according to price");
					System.out.println("--------------------------");
					Collections.sort(productList, new ComparisonByPrice());
					generateResult(productList);

				}
			}
		}
		return ch;
	}
	
	/*
	 * In this method we are generating the result
	 */
	private static void generateResult(List<Products> productList) {
	
		Iterator<Products> iterator = productList.iterator();
		while (iterator.hasNext()) {
			Products productData = (Products) iterator.next();
			System.out.println(productData.getId() + "   \t" + productData.getName() + "   \t" + productData.getBrand()
					+ "    \t$" + productData.getPrice());
		}
	}

}
