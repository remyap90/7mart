package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;

public class NotificationTest extends BaseTest {

	@Test
	public void verifyUserIsSendNotifications() {
		
	  
		lp.Login();
		hp.navigateToPushNotifications();
		
		String creationAlert=not.verifyUserIsSendNotifications();
		Assert.assertEquals(creationAlert, "notification send Successfully");
		
	
		
		
	}
	
}