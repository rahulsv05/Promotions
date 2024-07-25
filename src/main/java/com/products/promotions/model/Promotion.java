package com.products.promotions.model;

public class Promotion {
	private String id;
	private int quantity;

	public Promotion(String id, int quantity) {
		this.id=id;
		this.quantity=quantity;
	}
	// getters and setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

