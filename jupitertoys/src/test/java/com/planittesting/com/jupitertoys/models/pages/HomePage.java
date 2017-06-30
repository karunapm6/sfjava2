package com.planittesting.com.jupitertoys.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	public void clickStartShoppingButton() {
		driver.findElement(By.className("btn-success")).click();
	}

}
