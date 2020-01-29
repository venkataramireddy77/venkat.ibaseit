package com.ibaseit.learning.supermarketoperations;

import com.ibaseit.learning.operations.BankAccount;

public class ProductDetails {
	private String productId;
	private String productName;
	private double prodPrice;

	public ProductDetails(String productId, String productName, double prodPrice) {
		super();
		this.prodPrice = prodPrice;
		this.productName = productName;
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public double getProdPrice() {
		return prodPrice;

	}

	public String getProductName() {
		return productName;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		// it checks if the argument is of the type Customer by comparing the classes
		// of the passed argument and this object.
		// if(!(obj instanceof Customer)) return false; ---> avoid.
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		// type casting of the argument.
		ProductDetails pd = (ProductDetails) obj;
		if (pd.getProductId().equals(this.productId) && pd.getProdPrice() == this.prodPrice)
			return true;

		return false;
	}

	@Override
	public String toString() {
		return " [productId=" + productId + ", productName=" + productName + ", prodPrice=" + prodPrice + "]";
		
	}

}
