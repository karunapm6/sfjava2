package com.planittesting.com.jupitertoys.tests;

import org.junit.Assert;
import org.junit.Test;

import com.planittesting.com.jupitertoys.models.data.ContactData;
import com.planittesting.com.jupitertoys.models.pages.ContactPage;
import com.planittesting.com.jupitertoys.models.pages.HomePage;

public class ContactPageTestSuite extends BaseTestSuite {
	
	@Test
	public void validateErrorMessages(){
		
		HomePage homepage= new HomePage(driver);
		homepage.clickContactMenu();
		
		ContactPage contactPager = new ContactPage(driver);
		contactPager.clickSubmitButton();
		
		Assert.assertEquals("Forename is required", contactPager.getForenameError());
		Assert.assertEquals("Email is required", contactPager.getEmailError());
		Assert.assertEquals("Message is required", contactPager.getErrorMessage());
		
		contactPager.setForename("Karuna");
		contactPager.setemail("kpanuganti@planittesting.com");
		contactPager.setMessage("Hello");
		
		Assert.assertEquals("", contactPager.getForenameError());
		Assert.assertEquals("", contactPager.getEmailError());
		Assert.assertEquals("", contactPager.getErrorMessage());
	}
	
	@Test 
	public void successMessageValidation(){
		
		HomePage homepage= new HomePage(driver);
		homepage.clickContactMenu();
		
		ContactData data = new ContactData()
				.withForename("Karuna")
				.withSurname("Panuganti")
				.withEmail("kpanuganti@planittesting.com")
				.withTelephone("1234567899")
				.withMessage("Hello");
		
		/*
		ContactPage contactPager = new ContactPage(driver);
		contactPager.setForename("Karuna");
		contactPager.setemail("kpanuganti@planittesting.com");
		contactPager.setMessage("Hello");*/
		ContactPage contactPager = new ContactPage(driver, data);
		contactPager.clickSubmitButton();
		
		Assert.assertEquals("Thanks"+data.getForename()+", we appreciate your feedback.", contactPager.getSuccessMessage());
		
	}
	
	
	
	


}
