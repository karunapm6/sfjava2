package com.planittesting.com.jupitertoys.models.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.planittesting.com.jupitertoys.models.products.CompareStrategy;
import com.planittesting.com.jupitertoys.models.products.Product;

public class ShopPage extends BasePage{
	
	public ShopPage(WebDriver driver) {
		super(driver);
	}
	
	public Product getProduct(CompareStrategy strategy) throws Exception {
		List<WebElement> productElements = driver.findElements(By.className("product"));
		for (WebElement element : productElements) {
			Product product = new Product(element);
			if (strategy.compareProduct(product)) {
				return product;
			}
		}
		throw new Exception ("Product not found");
	}

	
}
