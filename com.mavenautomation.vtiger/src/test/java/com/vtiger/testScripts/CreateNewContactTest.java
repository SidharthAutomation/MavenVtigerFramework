package com.vtiger.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepositary.ContactInormationPageMembers;
import com.vtiger.objectRepositary.ContactPageMembers;
import com.vtiger.objectRepositary.CreateNewContactPageMembers;
import com.vtiger.objectRepositary.HomePageMembers;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
public class CreateNewContactTest extends BaseClass{

	@Test
	public void createNewContact() throws IOException, Exception
	{
		HomePageMembers hp = PageFactory.initElements(driver, HomePageMembers.class);
		hp.getContactLink().click();
				
		ContactPageMembers cp = PageFactory.initElements(driver, ContactPageMembers.class);
		cp.getCreateContactPlusIcon().click();
		
		CreateNewContactPageMembers cncp = PageFactory.initElements(driver, CreateNewContactPageMembers.class);
		cncp.getLastNameTF().sendKeys(picker.getDataFromExcel("TestCaseData", 8, 2));
		cncp.getSaveBtn().click();
		
		ContactInormationPageMembers cip = PageFactory.initElements(driver, ContactInormationPageMembers.class);
		String actualResult = cip.getContactSuccessMsg().getText();
		
		// Hard Assert for TestCase Validation
		Assert.assertTrue(actualResult.contains(picker.getDataFromExcel("TestCaseData", 9, 2)));
		Reporter.log("Contact Created Successfully" , true);
		
	}
}








