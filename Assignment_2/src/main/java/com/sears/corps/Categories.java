/**
 * 
 */
package com.sears.corps;

import java.util.List;

/**
 * @author athora0
 *
 */
public class Categories {
	private List<? extends Products> productList;

	private OffersDetails categoriesOffer = new CategoriesOffers();

	public List<? extends Products> getProductList() {
		return productList;
	}

	public void setProductList(List<? extends Products> productList) {
		this.productList = productList;
	}

	public OffersDetails getCategoriesOffer() {
		return categoriesOffer;
	}

	public void setCategoriesOffer(OffersDetails categoriesOffer) {
		this.categoriesOffer = categoriesOffer;
	}

}
