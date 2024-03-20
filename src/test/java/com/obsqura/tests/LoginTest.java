package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifyUserIsAbleToLogin() {
		
	  
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		HomePage hp = new HomePage(driver);
		String actualHeader=hp.getBrandHeader();
		
		Assert.assertEquals(actualHeader, "7rmart supermarket");
		
		
		
		
		
		
		
		
	}
	
}