package com.planittesting.com.jupitertoys.models.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.planittesting.com.jupitertoys.models.data.ContactData;

public class ContactPage extends BasePage {
	
	public ContactPage(WebDriver driver){
		super(driver);
	}
	
	public ContactPage(WebDriver driver, ContactData data) {
		super(driver);
		if (data.getForename()!=null) {
			this.setForename(data.getForename());
		}
		if (data.getSurname()!=null) {
			this.setSurname(data.getSurname());
		}
		if (data.getEmail()!=null) {
			this.setemail(data.getEmail());
		}
		if (data.getTelephone()!=null) {
			this.setTelephone(data.getTelephone());
		}
		if (data.getMessage()!=null) {
			this.setMessage(data.getMessage());
		}
	}
	
	public void clickSubmitButton() {
		driver.findElement(By.className("btn-contact")).click();
	}
	
	private String getErrorElementText(By locator) { 
		List<WebElement> elements = driver.findElements(locator);
		if (!elements.isEmpty()) {
			return elements.get(0).getText();
		}else{
			return "";
		}
	}
	
	public String getForenameError() {		
		return getErrorElementText(By.id("forename-err"));		
	}
	
	public String getEmailError() {
		return getErrorElementText(By.id("email-err"));
	}
	
	public String getErrorMessage(){
		return getErrorElementText(By.id("message-err"));
	}
	
	public void setForename(String name) {
		driver.findElement(By.id("forename")).sendKeys(name);
		
	}
	
	public void setemail(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	
	}
	
	public void setSurname(String Surname) {
		driver.findElement(By.id("surname")).sendKeys(Surname);
	}
	
	public void setTelephone(String Telephone) {
		driver.findElement(By.id("telephone")).sendKeys(Telephone);
	}
	
	public void setMessage(String Message) {
		driver.findElement(By.id("message")).sendKeys(Message);
	}
	
	public String getSuccessMessage(){
		
		return (new WebDriverWait(driver, 60)
				.until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success")))
				.getText());
		
	}
		
}
