/**
 * 
 */
package com.sears.corps;

import java.text.DecimalFormat;
import java.util.List;

/**
 * @author athora0
 *This class is used for generating bills(invoice)
 */
public class InvoiceGenerator {
	public String printReciept(List<Products> listOfProducts) {
		String receipt = "";
		double totalTax = 0;
		double totalAmount = 0;
		TaxCalculator taxcalculator = new TaxCalculator();
		for (Products product : listOfProducts) {
				receipt += product.getQuantity() + "  " + product.getProductName() + " at " + product.getPrice()
						+ " : " + taxcalculator.getPriceWithTax(product) + "\n";

			totalTax = totalTax + taxcalculator.calculateTax(product);
			totalAmount = totalAmount + (taxcalculator.getPriceWithTax(product));
		}
		totalTax = Double.parseDouble(new DecimalFormat("##.####").format(totalTax));
		totalAmount = Double.parseDouble(new DecimalFormat("##.####").format(totalAmount));
		return (receipt + "\nTotal tax :" + totalTax + "\nTotal amount :" + totalAmount);

	}
}
