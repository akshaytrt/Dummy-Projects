/**
 * 
 */
package com.sears.corps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author athora0
 *
 */
public class TaxCalculatorAPI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		int choice1;
		List<Products> listOfItems = new ArrayList<Products>();
		do {
			System.out.println("-------------Sales Tax Calculator-------------");
			System.out.println("1.Add item");
			System.out.println("2.Calculate Bill");
			System.out.println("Enter your choice");
			choice1 = input.nextInt();
			switch (choice1) {
			case 1:
				Products productsObj = new Products();
				/*
				 * First we will add the prducts details
				 * 
				 */
				System.out.println("Enter product name");
				productsObj.setProductName(input2.nextLine());
				System.out.println("Enter quantity");
				productsObj.setQuantity(input.nextInt());
				System.out.println("Enter category");
				productsObj.setCategory(input.next());
				;
				System.out.println("Enter price");
				productsObj.setPrice(input.nextDouble());
				System.out.println("Is product imported(Y/N)");
				if (input.next().equalsIgnoreCase(ApplicationConstants.YES))
					productsObj.setImport(true);
				else
					productsObj.setImport(false);
				listOfItems.add(productsObj);

				break;

			case 2:
				
				InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
				System.out.println(invoiceGenerator.printReciept(listOfItems));
				listOfItems.clear();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice1 < 3);

	}
}
