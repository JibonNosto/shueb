package com.crm.bit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.TestBase;

public class LoginPage extends TestBase 

{
	
	
	//PageFactory 
	
	@FindBy(name="username")
	
	WebElement username;
	
	
   @FindBy(name="password")
	
	WebElement password;

   @FindBy( xpath ="//input[@value='Login']")

     WebElement loginButton;
   
   @FindBy(xpath="//div[@class='navbar-header'] ")
   
   WebElement crmLogo;
    
   //Initializing the page objects:
    public LoginPage() {
	
	PageFactory.initElements(dr, this);
}
   
    //Actions
	public String validatePageTitle() {
	     
		return dr.getTitle();

}

	public boolean validateCrmLogo() {
		
		 return crmLogo.isDisplayed();
	}

	public HomePage logIn(String un, String pwd) {
		
		username.sendKeys("un");
		password.sendKeys("pwd");
		loginButton.click();
		
		return new HomePage();
	}
	
}
