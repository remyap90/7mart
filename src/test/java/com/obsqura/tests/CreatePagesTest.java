package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePagesTest extends BaseTest {
	


	@Test(groups="Smoke")
	public void createPages() throws IOException {
		lp.Login();
		hp.navigateToAddPage();
		String creationAlert = page.validatePageIsCreated();
		Assert.assertEquals(creationAlert, "Page Created Successfully");
	}
}
