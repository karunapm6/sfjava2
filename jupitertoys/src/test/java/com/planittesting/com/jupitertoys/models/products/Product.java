package com.planittesting.com.jupitertoys.models.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product {
	
	private WebElement element;
	public Product (WebElement element){
		this.element = element;		
	}
	
	public String getTitle() {
		return element.findElement(By.className("product-title")).getText();
	}
	
	public double getPrice() {
		return Double.parseDouble(element.findElement(By.className("product-price")).getText().replace("$", ""));
	}
	
	public void clickBuyButton() {
		element.findElement(By.className("btn-success"));
	}

}
 