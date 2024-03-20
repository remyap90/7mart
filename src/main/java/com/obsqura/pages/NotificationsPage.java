package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationsPage {

	WebDriver driver;
	
	public NotificationsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@class='form-control'][1]")
	private WebElement title;
	
	@FindBy(xpath="//input[@class='form-control'][2]")
	private WebElement description;
	
	@FindBy(xpath="//*[@id=\"form\"]/div[2]/button")
	private WebElement sendBtn;
	
	
	public String verifyUserIsSendNotifications() {
		title.sendKeys("admin");	
		description.sendKeys("admin");
		sendBtn.click();
		return verifyUserIsSendNotifications();
		
	}




	
}