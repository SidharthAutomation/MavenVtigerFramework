package com.vtiger.objectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericLib.BaseClass;

public class CreateNewProductPageMembers {
	
	@FindBy(name = "productname")
	private WebElement productName_tf;
	
	@FindBy(css = "input[value='  Save  ']")
	private WebElement saveBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Handling Dynamic Xpath Through Framework
	
	private WebElement orgName;
	
	public WebElement getOrgName(String organizaionName)
	{
		orgName = BaseClass.driver.findElement(By.xpath
													("//a[text()='" + organizaionName + "']"));
		
		return orgName;
	}
	
	
	
	
	
	
	
	
	
	
	public WebElement getProductNameTF()
	{
		return productName_tf;
	}
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
	
}
