package com.obsqura.tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Context.Constants;

public class CreateSliderTest extends BaseTest{
	
	
	@Test(groups="Smoke")
public void createSlide() throws IOException, AWTException {
		
		lp.Login();
		hp.navigateToSlidePage();
		String creationAlert=slider.validateSliderIsCreated(Constants.fileToUpload);
		Assert.assertEquals(creationAlert, "Slider Created Successfully");
		
		
	}
}