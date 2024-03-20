package com.obsqura.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;
import com.obsqura.utils.UniqueGenerator;

public class SliderPage extends PageActions{

	private WebDriver driver;
	
	public SliderPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@type='file']")
	private WebElement chooseFile;
	
	@FindBy(xpath="//*[@id='link']")
	private WebElement link;
	
	
	public String validateSliderIsCreated(String filePath) throws AWTException {
		clickElement(newBtn);
		ShortWait();
		uploadFile(chooseFile, filePath);
		
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		return getSplitStringText(alertText);
		
	}

	
}