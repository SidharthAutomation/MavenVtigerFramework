package com.vtiger.objectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInormationPageMembers {

	@FindBy(css = "span[class='dvHeaderText']")
	private WebElement contactSuccessMsg;
	
	public WebElement getContactSuccessMsg()
	{
		return contactSuccessMsg;
	}
}
