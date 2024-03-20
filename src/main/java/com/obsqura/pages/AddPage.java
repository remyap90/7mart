package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utils.PageActions;
import com.obsqura.utils.UniqueGenerator;

public class AddPage extends PageActions {

	WebDriver driver;
	
	public AddPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#title")
	private WebElement titleInput;
	
	@FindBy(xpath="//div[@class=\"note-editable card-block\"]")
	private WebElement descriptionInput;
	
	@FindBy(css="#page")
	private WebElement pageInput;
	
	@FindBy(name="create")
	private WebElement saveBtn;
	
	public String  validatePageIsCreated() {
		String title = "Remya"+UniqueGenerator.getCurrentDateTime();
		String description = "hello how are you";
		String page = "mypage"+UniqueGenerator.getCurrentDateTime();
		clickElement(newBtn);
		setTextBox(titleInput, title);
		setTextBox(descriptionInput, description);
		setTextBox(pageInput, page);
		clickElement(saveBtn);
		String alertText=alertMsg.getText();
		return getSplitStringText(alertText);
	
	}

	


}