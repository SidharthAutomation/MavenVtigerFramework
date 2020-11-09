package com.vtiger.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepositary.CreateNewProductPageMembers;
import com.vtiger.objectRepositary.HomePageMembers;
import com.vtiger.objectRepositary.ProductInformationPageMembers;
import com.vtiger.objectRepositary.ProductPageMembers;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
public class CreateNewProductTest extends BaseClass{

	@Test
	public void createNewProduct() throws IOException, Exception
	{
		HomePageMembers hp = PageFactory.initElements(driver, HomePageMembers.class);
		hp.getProductLink().click();
		
		ProductPageMembers pp = PageFactory.initElements(driver, ProductPageMembers.class);
		pp.getCreateProductPlusIcon().click();
		
		CreateNewProductPageMembers cnpp = PageFactory.initElements(driver, CreateNewProductPageMembers.class);
		cnpp.getProductNameTF().sendKeys(picker.getDataFromExcel("TestCaseData", 5, 2));
		cnpp.getSaveBtn().click();
		
		ProductInformationPageMembers pip = PageFactory.initElements(driver, ProductInformationPageMembers.class);
		String actualResult = pip.getProductSuccessMsg().getText();
		
		Assert.assertTrue(actualResult.contains(picker.getDataFromExcel("TestCaseData", 6, 2)));
		Reporter.log("Product Created Successfully" , true);
		
	}
}













