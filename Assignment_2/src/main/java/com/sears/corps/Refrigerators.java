/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public class Refrigerators extends HomeAppliances {

	private ProductData productData;

	Refrigerators(ProductData productData) {
		this.productData = productData;

	}

	public ProductData displayProductInformation() {
		return productData;
	}
}
