package com.planittesting.com.jupitertoys.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	protected WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickContactMenu() {
		driver.findElement(By.cssSelector("#nav-contact a")).click();
	}
	
	public void clickHomeMenu() {
		driver.findElement(By.cssSelector("#nav-home a")).click();
	}
	
	public void clickLoginMenu() {
		driver.findElement(By.cssSelector("#nav-login a")).click();
	}
	
	public void clickShopMenu() {
		driver.findElement(By.cssSelector("#nav-shop a")).click();
	}

}
