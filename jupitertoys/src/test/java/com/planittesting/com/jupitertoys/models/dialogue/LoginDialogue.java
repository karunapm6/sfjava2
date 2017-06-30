package com.planittesting.com.jupitertoys.models.dialogue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDialogue {
	
	private WebElement element;
	
	public LoginDialogue(WebDriver driver) {
		element = driver.findElement(By.className("popup"));
		
	}
	public void setUsername (String Username){
		this.element.findElement(By.id("loginUserName")).sendKeys(Username);
	}
	public void setPassword (String Password){
		this.element.findElement(By.id("loginPassword")).sendKeys(Password);
	}
	public void clickLogin(){
		this.element.findElement(By.className("btn-primary")).click();
	}
	
}
