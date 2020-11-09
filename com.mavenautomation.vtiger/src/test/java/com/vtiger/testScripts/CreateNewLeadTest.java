package com.vtiger.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.DataStorage;
import com.vtiger.objectRepositary.CreateNewLeadPageMembers;
import com.vtiger.objectRepositary.HomePageMembers;
import com.vtiger.objectRepositary.LeadInformationPageMembers;
import com.vtiger.objectRepositary.LeadsPageMembers;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
public class CreateNewLeadTest extends BaseClass{

	@Test
	public void createLead() throws IOException, Exception {
		HomePageMembers hp = PageFactory.initElements(driver, HomePageMembers.class);
		hp.getLeadsLink().click();
		
		LeadsPageMembers lp = PageFactory.initElements(driver, LeadsPageMembers.class);
		lp.getCreateLeadPlusIcon().click();
		
		CreateNewLeadPageMembers cnlp = PageFactory.initElements(driver, CreateNewLeadPageMembers.class);
		cnlp.getLastNameTF().sendKeys(picker.getDataFromExcel("TestCaseData", 1, 2));
		cnlp.getCompanyNameTF().sendKeys(picker.getDataFromExcel("TestCaseData", 2, 2));
		cnlp.getSaveBtn().click();
		
		LeadInformationPageMembers lip = PageFactory.initElements(driver, LeadInformationPageMembers.class);
		String actualResult = lip.getLeadSuccessMsg().getText();
		
		Assert.assertTrue(actualResult.contains(picker.getDataFromExcel("TestCaseData", 3, 2)));
		Reporter.log("Leads Created Successfully" , true);
	}
}











