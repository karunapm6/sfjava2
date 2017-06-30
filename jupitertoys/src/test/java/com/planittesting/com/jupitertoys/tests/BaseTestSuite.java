package com.planittesting.com.jupitertoys.tests;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTestSuite {
	
	protected static WebDriver  driver;
	
	@BeforeClass
	public static void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		
	}
	
	@Before
	public void testsetup() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://jupiter.cloud.planittesting.com");
	}
	
	@AfterClass
	public static void cleanup() {
		driver.quit();
	}


}
