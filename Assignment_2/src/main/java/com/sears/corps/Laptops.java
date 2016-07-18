/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public class Laptops extends Electronics {
	
	private ProductData productData;

	Laptops(ProductData productData) {
		this.productData = productData;
	}

	public ProductData displayProductInformation() {
		return productData;
	}
}
