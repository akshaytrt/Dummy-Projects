/**
 * 
 */
package com.sears.corps;

import java.util.Comparator;

/**
 * @author athora0
 *
 */
public class ComparisonByPrice implements Comparator<Products> {
	public int compare(Products product1, Products product2) {
		return ((product1.getPrice() < product2.getPrice()) ? -1 : (product1.getPrice() > product2.getPrice()) ? 1 : 0);
	}
}
