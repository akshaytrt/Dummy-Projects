/**
 * 
 */
package com.sears.corps;

import java.util.Comparator;

/**
 * @author athora0
 *
 */
public class ComparisonByBrand implements Comparator<Products> {
	public int compare(Products product1, Products product2) {
		return (product1.getBrand().compareTo(product2.getBrand()));
	}
}
