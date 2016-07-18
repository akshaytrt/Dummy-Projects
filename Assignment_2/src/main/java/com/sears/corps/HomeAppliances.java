/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *
 */
public abstract class HomeAppliances implements Products {
	private OffersDetails productOffers = new ProductsOffers();

	  public OffersDetails getProductOffer() {
	    return productOffers;
	  }

	  public void setProductOffer(OffersDetails productOffers) {
	    this.productOffers = productOffers;
	  }
}
