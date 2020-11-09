package com.vtiger.objectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageMembers {

	@FindBy(name = "user_name")
	private WebElement username_tf;
	
	@FindBy(name = "user_password")
	private WebElement password_tf;
	
	@FindBy(id = "submitButton")
	private WebElement login_Btn;
	
	@FindBy(xpath = "//div[contains(text(),'You must specify')]")
	private WebElement error_msg;
	
	public WebElement getUsernameField()
	{
		return username_tf;
	}
	public WebElement getPasswordField()
	{
		return password_tf;
	}
	public WebElement getLoginBtn()
	{
		return login_Btn;
	}
	
	public WebElement getErrorMsg()
	{
		return error_msg;
	}
	public void loginToApp(String username , String password)
	{
		username_tf.sendKeys(username);
		password_tf.sendKeys(password);
		login_Btn.click();
	}
}
















