/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public abstract class Electronics implements Products {
	private OffersDetails productOffers = new ProductsOffers();

	public OffersDetails getProductOffer() {
		return productOffers;
	}

	public void setProductOffer(OffersDetails productOffer) {
		this.productOffers = productOffer;
	}
}
