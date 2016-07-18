/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public class Mobiles extends Electronics {

	private ProductData productData;

	Mobiles(ProductData productData) {
		this.productData = productData;

	}

	public ProductData displayProductInformation() {
		return productData;
	}
}
