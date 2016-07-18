/**
 * 
 */
package com.sears.corps;

import java.util.Comparator;

/**
 * @author athora0
 *
 */
public class ComparisonById implements Comparator<Products> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public int compare(Products product1, Products product2) {
		return ((product1.getId() < product2.getId()) ? -1 : (product1.getId() > product2.getId()) ? 1 : 0);
	}
}
