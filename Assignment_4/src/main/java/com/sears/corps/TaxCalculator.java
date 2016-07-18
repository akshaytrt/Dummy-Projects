/**
 * 
 */
package com.sears.corps;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author athora0 This class is used for tax calculation purpose
 */
public class TaxCalculator {
	public List<String> exemptedList;

	public List<String> getExemptedList() {
		exemptedList = new ArrayList<String>();
		exemptedList.add(ApplicationConstants.BOOK);
		exemptedList.add(ApplicationConstants.FOOD);
		exemptedList.add(ApplicationConstants.MEDICAL);
		return exemptedList;
	}

	public double calculateTax(Products product) {
		double salesTax = 0;
		/*
		 * Check whether product is imported or not
		 */
		if (product.isImport()) {
			/*
			 * check whether product is from taxable or non-taxable category
			 */
			if (!getExemptedList().contains(product.getCategory())) {
				salesTax = ((product.getPrice() * product.getQuantity()
						* (ApplicationConstants.IMPORT_TAX + ApplicationConstants.SALES_TAX)) / 100);
			} else {
				salesTax = ((product.getPrice() * product.getQuantity() * ApplicationConstants.IMPORT_TAX) / 100);
			}

		} else {
			/*
			 * check whether product is from taxable or non-taxable category
			 */
			if (!getExemptedList().contains(product.getCategory())) {
				salesTax = ((product.getPrice() * product.getQuantity() * ApplicationConstants.SALES_TAX) / 100);
			} else {
				salesTax = 0;
			}

		}
		salesTax = Math.ceil(salesTax * 20) / 20; // Round off to nearest 0.05
		salesTax = Double.parseDouble(new DecimalFormat("##.####").format(salesTax));
		return salesTax;

	}

	public double getPriceWithTax(Products products) {
		double tax = 0;
		tax = calculateTax(products) + products.getPrice() * products.getQuantity();
		tax = Double.parseDouble(new DecimalFormat("##.####").format(tax)); //parsing the result 
		return tax;

	}
}
