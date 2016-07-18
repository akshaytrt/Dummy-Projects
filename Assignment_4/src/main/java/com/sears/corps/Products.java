/**
 * 
 */
package com.sears.corps;

/**
 * @author athora0
 *This class contains the information about products
 */
public class Products {
	private double price;
	private int quantity;
	private String productName;
	private String category;
	private boolean isImport;

	public Products(double price, String productName, boolean isImport, int quantity) {
		super();
		this.price = price;
		this.productName = productName;
		this.isImport = isImport;
		this.quantity = quantity;
	}

	public Products() {
		this.price = 0;
		this.productName = null;
		this.isImport = false;
		this.quantity = 0;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isImport() {
		return isImport;
	}

	public void setImport(boolean isImport) {
		this.isImport = isImport;
	}

}