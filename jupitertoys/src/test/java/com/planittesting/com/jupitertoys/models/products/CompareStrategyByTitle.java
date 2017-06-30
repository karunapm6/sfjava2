package com.planittesting.com.jupitertoys.models.products;

public class CompareStrategyByTitle implements CompareStrategy {
	
	private String title;
	
	public CompareStrategyByTitle(String title) {
		this.title = title;
	}

	public boolean compareProduct(Product product) {
		return product.getTitle().equals(this.title);
	}
	

}
