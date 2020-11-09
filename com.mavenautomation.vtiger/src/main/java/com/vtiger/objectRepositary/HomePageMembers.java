package com.vtiger.objectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.vtiger.genericLib.BaseClass;

public class HomePageMembers {

	@FindBy(xpath = "//span[text()=' Administrator']/../following-sibling::td[1]")
	private WebElement signOutDD;
	
	@FindBys(@FindBy(xpath = "//a"))
	private List<WebElement> demo;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Products")
	private WebElement productsLink;
	
	public WebElement getSignOutDD()
	{
		return signOutDD;
	}
	public WebElement getSignOutLink()
	{
		return signOutLink;
	}
	public WebElement getLeadsLink()
	{
		return leadsLink;
	}
	public WebElement getContactLink()
	{
		return contactsLink;
	}
	public WebElement getProductLink()
	{
		return productsLink;
	}
	public void logoutFromApp()
	{
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(signOutDD).perform();
		signOutLink.click();
	}
}


















