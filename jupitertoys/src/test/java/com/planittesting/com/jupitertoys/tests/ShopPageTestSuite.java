package com.planittesting.com.jupitertoys.tests;

import org.junit.Test;


import com.planittesting.com.jupitertoys.models.pages.HomePage;
import com.planittesting.com.jupitertoys.models.pages.ShopPage;
import com.planittesting.com.jupitertoys.models.products.CompareStrategyByPrice;
import com.planittesting.com.jupitertoys.models.products.CompareStrategyByTitle;
import com.planittesting.com.jupitertoys.models.products.Product;

public class ShopPageTestSuite extends BaseTestSuite{
	
	@Test 
	public void shopTeddyBear() throws Exception{
		HomePage homepage= new HomePage(driver);
		homepage.clickShopMenu();
		
		ShopPage shoppage = new ShopPage(driver);
		Product productfound = shoppage.getProduct(new CompareStrategyByTitle("Teddy Bear"));
		productfound.clickBuyButton();
		
		productfound = shoppage.getProduct(new CompareStrategyByPrice(10.99));
		productfound.clickBuyButton();
	}

}
