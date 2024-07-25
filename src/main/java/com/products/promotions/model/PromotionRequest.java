package com.products.promotions.model;

import java.util.List;

public class PromotionRequest {
	private String clientType;
	private List<Product> products;
	// getters and setters

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

