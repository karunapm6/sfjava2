package com.planittesting.com.jupitertoys.models.products;

public class CompareStrategyByPrice implements CompareStrategy {
	
	private double price;
	
	public CompareStrategyByPrice(double price) {
		this.price = price;
	}
	
	public boolean compareProduct(Product product) {
		return product.getPrice() == this.price;
	}
	
}
