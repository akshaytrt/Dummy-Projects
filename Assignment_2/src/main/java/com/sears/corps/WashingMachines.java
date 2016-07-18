/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public class WashingMachines extends HomeAppliances {

	private ProductData productData;

	WashingMachines(ProductData productData) {
		this.productData = productData;

	}

	public ProductData displayProductInformation() {
		return productData;
	}
}
