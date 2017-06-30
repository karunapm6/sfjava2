package com.planittesting.com.jupitertoys.tests;

import org.junit.Test;

import com.planittesting.com.jupitertoys.models.dialogue.LoginDialogue;
import com.planittesting.com.jupitertoys.models.pages.HomePage;

public class LoginPageTestSuite  extends BaseTestSuite{
	
	@Test
	public void UserLogin(){
		
		HomePage homepage= new HomePage(driver);
		homepage.clickLoginMenu();
		
		LoginDialogue dialogue = new LoginDialogue(driver);
		dialogue.setUsername("kpanuganti");
		dialogue.setPassword("letmein");
		dialogue.clickLogin();
		
	}

}
