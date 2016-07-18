/**
 * 
 */
package com.sears.corps;

import java.util.ArrayList;
import java.util.List;

/**
 * @author athora0
 *
 */
public class ProductDisplayAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Products> productList = new ArrayList<Products>();

		OffersDetails electronicsOffer = new ProductsOffers();
		electronicsOffer.setPercentDiscount(10);

		OffersDetails categoriesOffer = new CategoriesOffers();
		categoriesOffer.setPercentDiscount(50);

		ProductData motoPhoneData = generateProductData("#11001", "Motorola", 20000);
		Products motoPhone = new Mobiles(motoPhoneData);
		motoPhone.setProductOffer(electronicsOffer);

		ProductData sonyPhoneData = generateProductData("#11002", "Sony", 13000);
		Products sonyPhone = new Mobiles(sonyPhoneData);
		sonyPhone.setProductOffer(electronicsOffer);

		ProductData asusPhoneData = generateProductData("#11003", "Asus", 9999);
		Products asusPhone = new Mobiles(asusPhoneData);
		asusPhone.setProductOffer(electronicsOffer);

		ProductData lenovoLaptopData = generateProductData("#12001", "Lenovo", 30000);
		Products lenovoLaptop = new Laptops(lenovoLaptopData);
		lenovoLaptop.setProductOffer(electronicsOffer);

		productList.add(motoPhone);
		productList.add(sonyPhone);
		productList.add(asusPhone);
		productList.add(lenovoLaptop);

		for (Products product : productList) {
			System.out.println("-----------------------------------------");
			ProductData productData = product.displayProductInformation();
			System.out.println("Product Id: " + productData.getProductId());
			System.out.println("Product Name :" + productData.getProductName());
			System.out.println("Price of the product :" + productData.getProductPrice());
			System.out.println("Discount according to category :" + categoriesOffer.getPercentDiscount());
			System.out.println("Discount according to product :" + product.getProductOffer().getPercentDiscount());
		}

	}

	private static ProductData generateProductData(String productId, String productName, double price) {
		ProductData productData = new ProductData();
		productData.setProductId(productId);
		productData.setProductName(productName);
		productData.setProductPrice(price);
		return productData;
	}

}
